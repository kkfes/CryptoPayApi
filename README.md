# Crypto Pay Java Library

Эта библиотека позволяет интегрировать Crypto Pay API в Java-приложения. В ней реализованы методы для работы с инвойсами, переводами, чеками, балансом, обменными курсами, списком валют и статистикой. Кроме того, библиотека предоставляет возможность работы с Webhook‑обновлениями.

## Особенности

- **Выбор сервера:** Возможность переключения между тестовым и продакшн-серверами.
- **Методы API:** 
  - **Authentication:** `getMe()`
  - **Invoices:** `createInvoice()`, `getInvoices()`, `deleteInvoice()`
  - **Transfers:** `transfer()`, `getTransfers()`
  - **Checks:** `createCheck()`, `deleteCheck()`, `getChecks()`
  - **Balance:** `getBalance()`
  - **Exchange Rates:** `getExchangeRates()`
  - **Currencies:** `getCurrencies()`
  - **Stats:** `getStats()`
- **Webhook-обновления:** Встроенные утилиты для проверки подписи и обработки входящих Webhook‑запросов (поддержка интеграции в существующее [Spark Java](http://sparkjava.com/) приложение).

## Установка

Подключите библиотеку к своему проекту (например, через Maven или Gradle). Не забудьте добавить зависимость от [Jackson Databind](https://github.com/FasterXML/jackson-databind).

Пример для Maven:
```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.14.0</version>
</dependency>
```

## Быстрый старт
### Инициализация клиента
Вы можете создать клиент для работы с API, выбрав тестовый или продакшн сервер:

```java
// Использование тестового сервера
CryptoPayClient client = new CryptoPayClient("YOUR_CRYPTO_PAY_API_TOKEN", true);

// Или, если нужен продакшн сервер (по умолчанию)
CryptoPayClient client = new CryptoPayClient("YOUR_CRYPTO_PAY_API_TOKEN");
```
### Проверка токена
Метод getMe() позволяет проверить токен и получить базовую информацию об приложении:

```java
try {
    CryptoPayResponse meResponse = client.getMe();
    System.out.println("getMe -> ok: " + meResponse.isOk());
    System.out.println("getMe -> result: " + meResponse.getResult());
} catch (Exception e) {
    e.printStackTrace();
}
```
## Работа с инвойсами
### Создание инвойса
```java
CreateInvoiceRequest createInvoiceRequest = new CreateInvoiceRequest("TON", 12.34);
try {
    CreateInvoiceResponse invoiceResponse = client.createInvoice(createInvoiceRequest);
    if (invoiceResponse.isOk()) {
        Invoice createdInvoice = invoiceResponse.getResult();
        System.out.println("Создан инвойс, ID = " + createdInvoice.getInvoiceId());
    } else {
        System.err.println("Ошибка при создании инвойса!");
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Получение инвойсов
```java
import java.util.Collections;

GetInvoicesRequest getInvoicesRequest = new GetInvoicesRequest(
    Collections.singletonList(createdInvoice.getInvoiceId()),
    null,  // статус (если null, параметр не отправляется)
    null,  // offset
    null   // limit
);
try {
    GetInvoicesResponse invoicesResponse = client.getInvoices(getInvoicesRequest);
    if (invoicesResponse.isOk() && invoicesResponse.getResult() != null) {
        Invoice invoiceData = invoicesResponse.getResult().getItems().get(0);
        System.out.println("Инвойс получен, ID = " + invoiceData.getInvoiceId());
    } else {
        System.out.println("Инвойс не найден или API вернул пустой результат.");
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Удаление инвойса
```java
try {
    DeleteInvoiceResponse deleteResp = client.deleteInvoice(createdInvoice.getInvoiceId());
    if (deleteResp.isOk() && deleteResp.isResult()) {
        System.out.println("Инвойс успешно удалён!");
    } else {
        System.out.println("Не удалось удалить инвойс.");
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
## Работа с переводами
### Отправка перевода
```java
TransferRequest transferRequest = new TransferRequest(123456789L, "TON", 10.0, "unique-spend-id-001");
try {
    TransferResponse transferResponse = client.transfer(transferRequest);
    if (transferResponse.isOk()) {
        System.out.println("Перевод отправлен, ID = " + transferResponse.getResult().getTransferId());
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Получение переводов
```java
GetTransfersRequest getTransfersRequest = new GetTransfersRequest();
getTransfersRequest.setAsset("TON");
// Можно также установить transfer_ids, spend_id, offset и count
try {
    GetTransfersResponse transfersResponse = client.getTransfers(getTransfersRequest);
    if (transfersResponse.isOk()) {
        for (Transfer transfer : transfersResponse.getResult()) {
            System.out.println("Transfer ID: " + transfer.getTransferId() + ", Status: " + transfer.getStatus());
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
## Работа с чеками
### Создание чека
```java
CreateCheckRequest checkRequest = new CreateCheckRequest();
checkRequest.setAsset("USDT");
checkRequest.setAmount("125.50");
// Опционально:
checkRequest.setPinToUserId(987654321L);
checkRequest.setPinToUsername("someusername");

try {
    CreateCheckResponse checkResponse = client.createCheck(checkRequest);
    if (checkResponse.isOk()) {
        System.out.println("Чек создан, ID = " + checkResponse.getResult().getCheckId());
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Удаление чека
```java
try {
    DeleteCheckResponse deleteCheckResp = client.deleteCheck(checkResponse.getResult().getCheckId());
    if (deleteCheckResp.isOk() && deleteCheckResp.isResult()) {
        System.out.println("Чек успешно удалён.");
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Получение чеков
```java
GetChecksRequest getChecksRequest = new GetChecksRequest();
getChecksRequest.setAsset("USDT");
getChecksRequest.setStatus("active");
// Можно также установить check_ids, offset, count
try {
    GetChecksResponse checksResponse = client.getChecks(getChecksRequest);
    if (checksResponse.isOk()) {
        for (Check check : checksResponse.getResult()) {
            System.out.println("Check ID: " + check.getCheckId() + ", Status: " + check.getStatus());
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
## Получение баланса, обменных курсов, валют и статистики
### Баланс
```java
try {
    GetBalanceResponse balanceResponse = client.getBalance();
    if (balanceResponse.isOk()) {
        for (Balance balance : balanceResponse.getResult()) {
            System.out.println("Валюта: " + balance.getCurrencyCode() +
                    ", Доступно: " + balance.getAvailable() +
                    ", На удержании: " + balance.getOnhold());
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Обменные курсы
```java
try {
    GetExchangeRatesResponse ratesResponse = client.getExchangeRates();
    if (ratesResponse.isOk()) {
        for (ExchangeRate rate : ratesResponse.getResult()) {
            System.out.println(rate.getSource() + " -> " + rate.getTarget() + " = " + rate.getRate());
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Валюты
```java
try {
    GetCurrenciesResponse currenciesResponse = client.getCurrencies();
    if (currenciesResponse.isOk()) {
        System.out.println("Поддерживаемые валюты: " + currenciesResponse.getResult());
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
### Статистика
```java
GetStatsRequest statsRequest = new GetStatsRequest();
statsRequest.setStartAt("2023-09-01T00:00:00Z"); // пример ISO 8601
statsRequest.setEndAt("2023-09-02T00:00:00Z");
try {
    GetStatsResponse statsResponse = client.getStats(statsRequest);
    if (statsResponse.isOk()) {
        AppStats stats = statsResponse.getResult();
        System.out.println("Общий объем: " + stats.getVolume());
        System.out.println("Конверсия: " + stats.getConversion());
        System.out.println("Уникальных пользователей: " + stats.getUniqueUsersCount());
    }
} catch (Exception e) {
    e.printStackTrace();
}
```
## Настройка Webhook
1. Настройка на стороне Crypto Pay
Откройте @CryptoBot (или @CryptoTestnetBot для тестнета).
Перейдите в Crypto Pay → My Apps, выберите нужное приложение, затем выберите Webhooks….
Нажмите Enable Webhooks и укажите HTTPS URL для получения обновлений. Рекомендуется использовать секретный путь (например, https://yourdomain.com/<your_app_token>).
2. Интеграция с вашим Spark‑приложением
Если у вас уже есть Spark‑приложение, импортируйте класс WebhookHandler и зарегистрируйте маршрут:

``` java
import static spark.Spark.*;
import com.example.cryptopay.WebhookHandler;
import com.example.cryptopay.WebhookUpdate;

public class MySparkApp {
    public static void main(String[] args) {
        port(4567);
        final String appToken = "YOUR_APP_TOKEN";
        WebhookHandler webhookHandler = new WebhookHandler(appToken);
        
        post("/webhook/" + appToken, (request, response) -> {
            WebhookUpdate update = webhookHandler.handle(request, response);
            if (update != null) {
                System.out.println("Webhook update received. Update ID: " + update.getUpdateId());
                // Дополнительная логика обработки обновления
            }
            return response.body();
        });
    }
}
```
3. Проверка подписи
Метод WebhookHandler использует утилиту WebhookUtils для проверки заголовка crypto-pay-api-signature. Если подпись не совпадает, сервер вернет статус 403.

Заключение
Эта библиотека обеспечивает простой и гибкий способ интеграции с Crypto Pay API, позволяя управлять инвойсами, переводами, чеками и получать актуальную статистику и курсы обмена. Кроме того, встроенная поддержка Webhook‑обновлений позволяет получать уведомления прямо в ваше приложение.

Для дополнительной информации и примеров смотрите исходный код в репозитории.

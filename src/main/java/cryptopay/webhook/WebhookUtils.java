package cryptopay.webhook;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WebhookUtils {

    public static boolean checkSignature(String token, String requestBody, String headerSignature) throws Exception {
        MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");
        byte[] secret = sha256Digest.digest(token.getBytes(StandardCharsets.UTF_8));
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(secret, "HmacSHA256");
        mac.init(keySpec);
        byte[] hmacBytes = mac.doFinal(requestBody.getBytes(StandardCharsets.UTF_8));
        String computedSignature = bytesToHex(hmacBytes);
        return computedSignature.equalsIgnoreCase(headerSignature);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
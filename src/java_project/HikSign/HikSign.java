/**
 * @author: 一只羊驼
 * @date: 2024/2/23
 */

package java_project.HikSign;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

public class HikSign {
    public static void main(String args[]) {
        String method = "POST";
        String appkey = "23815717";
        String secret = "nyiOWlMxlj2irxo0w5b1";
        String path = "/artemis/api/resource/v1/org/advance/orgList";

        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "*/*");
        headers.put("Content-Type", "application/json");
        headers.put("x-ca-key", appkey);
        headers.put("x-ca-nonce", UUID.randomUUID().toString());
        headers.put("x-ca-timestamp", String.valueOf((new Date()).getTime()));

        String signStr = sign(secret, method, path, headers);
        headers.put("x-ca-signature-headers", "x-ca-key,x-ca-nonce,x-ca-timestamp");
        headers.put("x-ca-signature", signStr);
        System.out.println(signStr);
    }

    public static String sign(String secret, String method, String path, Map<String, String> headers) {
        try {
            Mac hmacSha256 = Mac.getInstance("HmacSHA256");
            byte[] keyBytes = secret.getBytes("UTF-8");
            hmacSha256.init(new SecretKeySpec(keyBytes, 0, keyBytes.length, "HmacSHA256"));

            return Base64.getUrlEncoder().encodeToString(hmacSha256.doFinal(buildStringToSign(method, path, headers).getBytes("UTF-8")));
        } catch (Exception var9) {
            throw new RuntimeException(var9);
        }
    }

    private static String buildStringToSign(String method, String path, Map<String, String> headers) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.toUpperCase()).append("\n");
        if (null != headers) {
            if (null != headers.get("Accept")) {
                sb.append(headers.get("Accept"));
                sb.append("\n");
            }
            if (null != headers.get("Content-Type")) {
                String contentType = headers.get("Content-Type");
                sb.append(contentType);
                sb.append("\n");
            }

            if (null != headers.get("x-ca-key")) {
                sb.append("x-ca-key:");
                sb.append(headers.get("x-ca-key"));
                sb.append("\n");
            }
            if (null != headers.get("x-ca-nonce")) {
                sb.append("x-ca-nonce:");
                sb.append(headers.get("x-ca-nonce"));
                sb.append("\n");
            }
            if (null != headers.get("x-ca-timestamp")) {
                sb.append("x-ca-timestamp:");
                sb.append(headers.get("x-ca-timestamp"));
                sb.append("\n");
            }
            sb.append(path);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}

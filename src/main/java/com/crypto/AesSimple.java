package com.crypto;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


/**
 * Java解析来自js的aes密文
 *
 * @copy-right: (AES算法实现Java和JS互通加解密)[https://www.jianshu.com/p/34c15b8d025a]
 * **/
public class AesSimple {

    static String key = "1024ABCDDCBA1024";  //16位
    static String iv = "ABCD10244201ABCD";  //16位

    public static void main(String args[]) throws Exception {
        System.out.println("解密结果："+decryptAES(
                "1ZoxhZGDDl9Op3yg/AjyxzI6Ix9qs8aGTa28rV6LZ8fvc0g/M2Z6bZ8ek7VMBaLC2PdMGNRZFcv0pCoL7D9tHcTLgLB5Ii7M0flUvGvaaio="
                ));
    }

    public static String decryptAES(String data) throws Exception {
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] encrypted1 = decoder.decode(data);

            Cipher cipher = Cipher.getInstance("AES/CBC/NOPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);

            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

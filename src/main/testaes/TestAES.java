package main.testaes;

import java.util.HashMap;

public class TestAES {
    public static void main(String[] args) throws Exception {

        AES256 aes256 = new AES256();
        String text = "V1130";

        String cipWord = aes256.encrypt(text);

        System.out.println("text ===> " + text);
        System.out.println("cipWord ===> " + cipWord);

        System.out.println("aes256.decrypt ===> " + aes256.decrypt(cipWord));




    }
}

package main.testaes;

import java.util.HashMap;

public class TestAES {
    public static void main(String[] args) throws Exception {

        AES256 aes256 = new AES256();
        String text = "!! testEEEE !!";

        String telNo = "01023235234";
        String telNo2 = "010-2323-5234";

        String cipTelNo = aes256.encrypt(telNo);
        String cipTelNo2 = aes256.encrypt(telNo2);

        String cipWord = aes256.encrypt(text);

        System.out.println("text ===> " + text);
        System.out.println("cipWord ===> " + cipWord);

        System.out.println("cipTelNo ===> " + cipTelNo);
        System.out.println("cipTelNo2 ===> " + cipTelNo2);

        System.out.println("aes256.decrypt ===> " + aes256.decrypt(cipWord));


        HashMap<String, Object> map1 = new HashMap<>();

        map1.put("t1", 123);
        map1.put("t2", "232");
        map1.put("t3", 45.23);

        System.out.println("map =====> " + map1);

    }
}

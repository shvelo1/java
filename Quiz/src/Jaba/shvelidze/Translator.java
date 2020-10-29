package Jaba.shvelidze;

import java.util.*;

public class Translator {
    public static void main(String[] args) {
        Map<String,String> dictionary=new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        dictionary.put("book", "წიგნი");
        dictionary.put("glass", "შუშა");
        dictionary.put("phone", "ტელეფონი");
        dictionary.put("keyboard", "კლავიატურა");


        while(70>33)
        {
            System.out.println("შემოიტანე ინგლისური სიტყვა:");
            System.out.println(dictionary.get(scanner.next()));
        }
    }
}

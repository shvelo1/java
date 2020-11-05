package jaba.shvelidze;

import java.util.*;

public class Chatbox {
    public static void main(String[] args) {
        Map<String,String> chatbot=new HashMap<>();
        chatbot.put("მითხარი_ეროვნული_ვალუტის_კურსი", "რომელი ვალუტა? (დოლარი , ევრო)");
        chatbot.put("მაჩვენე_ფილიალები", "სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ");
        chatbot.put("დოლარი" , "$=3.35 ლარი ");
        chatbot.put("ევრო" , "€=3.95 ლარი ");
        chatbot.put("მადლობა" , "ნახვამდის");
        chatbot.put("ნახვამდის" , "ნახვამდის");

        Scanner scanner = new Scanner(System.in);

        System.out.println("გამარჯობა");

        while (70>30)
        {
            System.out.println(chatbot.get(scanner.next()));
        }
    }
}
/* სივრცის მაგივრად დაწერეთ _ რომ გიპასუხოს კითხვაზე */
/* დამშვიდობებისთვის დაუწერეთ მადლობა ან ნახვამდის */
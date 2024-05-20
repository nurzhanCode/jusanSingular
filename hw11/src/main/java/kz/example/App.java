package kz.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        String[] words = {
                "apple", "banana", "apple", "cherry", "banana",
                "apple", "mango", "elderberry", "mango", "grape",
                "cherry", "mango", "banana", "grape", "apple",
                "lemon", "kiwi", "lemon", "mango", "kiwi"
        };

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(" unique words: " + uniqueWords);

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.print(" word " + entry.getKey() + "' meets " + entry.getValue());
        }



        Phonebook phoneBook = new Phonebook();
        phoneBook.add("Azamat", "7077171010");
        phoneBook.add("Saken", "7476666666");
        phoneBook.add("Ayazhan", "7776665544");
        phoneBook.add("Nurzhan", "7774422222");
        phoneBook.add("Alibek", "7083333333");


        System.out.println("Azamat phone Number: " +phoneBook.get("Azamat"));
        System.out.println("Saken phone Number: " +phoneBook.get("Saken"));
        System.out.println("Ayazhan phone Number: " +phoneBook.get("Ayazhan"));
        System.out.println("Nurzhan phone Number: " +phoneBook.get("Nurzhan"));
        System.out.println("Alibek phone Number: " +phoneBook.get("Alibek"));
    }
}

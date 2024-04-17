package kz.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "WELCOME GAME guessTheNumber" );
        gameGuessNumber();
        System.out.println( "GAME FINISHED" );
        System.out.println( "WELCOME GAME guessTheWords");
        gameGuessWords();
        System.out.println( "GAME FINISHED" );
    }

    public static void gameGuessNumber() {
        do {
            int k = 0;
            int random = (int)(Math.random() * 10);
            for (int i = 0; i < 3; i++) {
                int val = printNumber();
                if (val == random) {
                    System.out.println("you Win!" + " random number: " + val);
                    break;
                }else{
                    k++;
                }
            }
            if(k == 3)System.out.println("you Lose!" + " random number: " + random);

        }while (playAgain());
    }

    public static int printNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }
    public static boolean playAgain () {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play again? (yes on write 1 / no on write 0)");
            int val = scanner.nextInt();
            if (val == 1) {
                return true;
            } else {
                return false;
            }
    }

    public static void gameGuessWords() {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                            "potato"};

        String randomWord = words[(int)(Math.random() * words.length)];
        System.out.println(randomWord);
        String resultWord = "";
        do{
            String writeWord = writeWords();
            resultWord =  compareWords(writeWord, randomWord);
            if(resultWord.equals(randomWord)) {
                System.out.println("You Win!" + " random word: " + randomWord);
            }else{
                System.out.println(resultWord);
            }

        }while (checkWord(resultWord));

    }

    public static String writeWords(){
        System.out.println(" Please write words: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String compareWords(String word1, String word2){
                String compareWords = "";
                if(word1.length() < word2.length()) {
                    for (int i = 0; i < word1.length(); i++) {
                        if (word1.charAt(i) == word2.charAt(i)) {
                            compareWords += word1.charAt(i);
                        } else {
                            compareWords += "#";
                        }
                    }
                }else{
                    for (int i = 0; i < word2.length(); i++) {
                        if (word1.charAt(i) == word2.charAt(i)) {
                            compareWords += word1.charAt(i);
                        } else {
                            compareWords += "#";
                        }
                    }
                }
                  if(compareWords.equals("#") || (word1.length() < word2.length())) {
                      for (int i = compareWords.length(); i < 15; i++) {
                          compareWords += "#";
                      }
                  }
                  return compareWords;
    }

    public static Boolean checkWord(String word){
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '#'){
                return true;
            }
        }
        return false;
    }


}

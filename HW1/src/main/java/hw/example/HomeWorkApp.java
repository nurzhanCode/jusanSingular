package hw.example;


import java.util.Scanner;

public class HomeWorkApp {
    public static void main( String[] args ) {
        printTreeWords();
        checkSumSing();
        printColor();
        compareNumbers();

    }

    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("первое значение");
        int a = scanner.nextInt();
        System.out.println("второе значение");
        int b = scanner.nextInt();

        if(a+b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int value = scanner.nextInt();

        if(value <= 0){
            System.out.println("Красный");
        }else if(0 < value && value <= 100){
            System.out.println("Зеленый");
        }else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();

        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }

    }
}

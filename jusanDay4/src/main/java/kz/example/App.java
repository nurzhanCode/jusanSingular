package kz.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static char[][] map;
    static final int SIZE = 3;
    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = '0';
    static final char DOT_EMPTY = '*';

    static final Scanner sc = new Scanner(System.in);

    static final Random random = new Random();

    public static void main(String[] args) {
        prepareMap();
        showMap();
        while (true) {
            playerTurn();
            showMap();

            if(isWinner()) {
                System.out.println("Победил игрок");
                break;
            }

            if(isDraw()) {
                System.out.println("Ничья");
                break;
            }

            botTurn();
            showMap();
            if(isWinner()) {
                System.out.println("Победил БОТ");
                break;
            }

            if(isDraw()) {
                System.out.println("Ничья");
                break;
            }

        }


    }

    public static boolean isWinner() {
        if (checkHorizontal() || checkVertical() || checkDiagonalL() || checkDiagonalR()) {
            return true;
        }
        return false;
    }




    public static boolean checkHorizontal() {

        for (int row = 0; row < SIZE; row++) {
            int horizontal = 0;
            for (int col = 1; col < map[row].length; col++) {
                if(map[row][col] == map[row][col - 1] && map[row][col] != DOT_EMPTY) {
                    horizontal++;
                }
            }

            if (horizontal == SIZE-1)
                return true;
        }
        return false;
    }

    public static boolean checkVertical() {

        for (int col = 0; col < SIZE; col++) {
            int vertical = 0;
            for (int row = 1; row < map[col].length; row++) {
                if(map[row][col] == map[row- 1][col] && map[row][col] != DOT_EMPTY) {
                    vertical++;
                }
            }

            if (vertical == SIZE-1)
                return true;
        }
        return false;
    }


    public static boolean checkDiagonalL() {

        int diagonal = 0;
        for (int j = 1; j < SIZE; j++) {
            if(map[j][j] == map[j- 1][j - 1] && map[j][j] != DOT_EMPTY) {
                diagonal++;
            }
        }

        if (diagonal == SIZE-1) {
            return true;
        } else
            return false;
    }


    public static boolean checkDiagonalR() {

        int diagonal = 0;

        for (int j = SIZE - 1; j > 0; j--) {
            if(map[j][j] == map[j- 1][j - 1] && map[j][j] != DOT_EMPTY) {
                diagonal++;
            }
        }

        if (diagonal == SIZE-1) {
            return true;
        } else
            return false;
    }


    public static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void botTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_AI;
        System.out.printf("Ход ИИ: [%d, %d]\n", (x + 1), (y + 1));
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_PLAYER;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void showMap(){
        for(int i = 0; i<= SIZE; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void prepareMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


}

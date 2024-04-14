package jusanSingular.example;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {

        System.out.println("task1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swapArrayValue(arr1);

        System.out.println("task2");
        int[] arr2 = new int[8];
        fillArray(arr2);

        System.out.println("task3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        updateElementsBelowSix(arr3);

        System.out.println("task4");
        int[][] arr4 = new int[5][5];
        changeDiagonallyElements(arr4);

        System.out.println("task5");
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMinMax(arr5);

        System.out.println("task6");
        int[] arr61 = {2, 2, 2, 1, 2, 2, 10, 1};
        checkBalance(arr61);

        int[] arr62 = {1, 1, 1, 2, 1};
        checkBalance(arr62);

        System.out.println("task7");
        int[] arr7 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        shiftArray(arr7, 2);
    }
        //method for task1
        public static void swapArrayValue(int[] arr) {
            for(int i=0; i<arr.length; i++){
                if(arr[i] == 0){
                    arr[i] = 1;
                }else{
                    arr[i] = 0;
                }
            }

            System.out.println(Arrays.toString(arr));
        }

        //method for task2
        public static void fillArray(int[] arr) {
            for(int i=0; i<arr.length; i++){
                arr[i] = i * 3;
            }
            System.out.println(Arrays.toString(arr));
        }

        //method for task3
        public static void updateElementsBelowSix(int[] arr) {
            for(int i=0; i<arr.length; i++){
                    if(arr[i] < 6){
                        arr[i] = arr[i] * 2;
                    }
            }
            System.out.println(Arrays.toString(arr));
        }

        //method for task4
        public static void changeDiagonallyElements(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i == j) {
                    arr[i][j] = 1;
                } else if(j + i == (arr.length - 1)){
                        arr[i][j] = 1;
                }
            }
        }
            System.out.println(Arrays.deepToString(arr));
        }

        //method for task5
        public static void findMinMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                } else if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        //method for task6
        public static void checkBalance(int[] arr) {
        int tempStart = 0;
        for(int i = 0; i < arr.length; i++){
             tempStart = tempStart + arr[i];
            int tempEnd = 0;
            for(int j = arr.length - 1; j > i; j--){
                tempEnd = tempEnd + arr[j];

            }
            if(tempStart == tempEnd){
                System.out.println("true");
                break;
            }
        }
        }

        //method for task7
        public static void shiftArray(int[] arr, int n) {
            System.out.println(Arrays.toString(arr));
            System.out.println(n);
                if(n < 0){
                    n = n + arr.length;
                }
                n = n % arr.length;
                for(int i = 0; i < n; i++){
                    int endElement = arr[arr.length -1];
                    for(int j = arr.length - 1; j > 0; j--){
                        arr[j] = arr[j-1];
                    }
                    arr[0] = endElement;
                }

                System.out.println(Arrays.toString(arr));
        }


}

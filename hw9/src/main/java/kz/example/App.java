package kz.example;


public class App {
    public static void main( String[] args ) {

        String[][] array1 = new String[][]{
                {"1", "2", "3","5"},
                {"4", "5", "6","4"},
                {"7", "8", "9","6"},
                {"8", "9", "10","ss"}
        };

        MyArraySizeException(array1);
        MyArrayDataException(array1);
        try{
            int sum = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    sum += Integer.parseInt(array1[i][j]);
                }
            }
            System.out.println(sum);
        }catch (MyArraySizeException e){
             System.out.println(e);
        }catch (MyArrayDataException e){
            System.out.println(e);
        }




    }
    public static void MyArraySizeException(String[][] array) {
        if(array.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] row : array) {
        if(row.length != 4) {
            throw new MyArraySizeException();
        }
        }
    }

    public static void MyArrayDataException ( String[][] array ) {
       for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++) {
                if(chekIsNumeric(array[i][j])){
                    throw new MyArrayDataException(array[i][j], i, j);
                }
            }
       }

   }
    public static boolean chekIsNumeric(String strNum) {
        if (strNum == null) {
            return true;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }
}

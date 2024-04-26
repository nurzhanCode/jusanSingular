package kz.example;


public class App {
    public static void main( String[] args ) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Shaden Nurzha", "devoloper","nnn@gmail.com",
                "8 777 777 77 77",900_000, 26);
        persArray[1] = new Person("Berdaylet Alibek","actor","alibek@gmail.com",
                "8 708 444 55 66",200_000, 20);
        persArray[2] = new Person("Saken Askar", "Doctor", "askar70@gmail.com",
                "8 701 555 55 55", 1_000_000, 70);
        persArray[3] = new Person("Daulet Zhandosuly","Model","daulet@gmail.com",
                "8 747 000 00 00",800_000, 18);
        persArray[4] = new Person("Serik Batyrkhan","Pilot","pilot@gmail.com",
                "8 999 999 99 99",10_000_000, 31);


        for( int i = 0; i < persArray.length; i++ ) {
            persArray[i].printInfo();
        }
    }
}

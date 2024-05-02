package kz.example;


public class App {
    public static void main( String[] args ) {
        Plate plate = new Plate(100);
        plate.info();
        plate.fillMax();
        plate.info();
        Cat[] cats = new Cat[7];
        cats[0] = new Cat("Pompea");
        cats[1] = new Cat("Barsik");
        cats[2] = new Cat("Bob");
        cats[3] = new Cat("Milka");
        cats[4] = new Cat("Maki");
        cats[5] = new Cat("Murka");
        cats[6] = new Cat("Lisa");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].isHungry());
        }
        plate.fillPlate(25);
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHungry()) {
                cats[i].eat(plate);
                System.out.println(cats[i].isHungry());
            }
        }
    }
}

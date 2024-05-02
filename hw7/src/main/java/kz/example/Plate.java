package kz.example;

public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void fillMax(){
        food = capacity;
    }

    public int getFood() {
        return food;
    }
    public void fillPlate(int fill){
        if(fill + food > capacity){
            food = capacity;
            System.out.println("Plate filling to max");
            return;
        }
        food += fill;
        System.out.println("Plate filling to " + fill);
    }
    public void decreseFood(int amount){
        food -= amount;
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }
}

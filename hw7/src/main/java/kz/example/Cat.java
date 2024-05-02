package kz.example;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.appetite = 15;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if(p.getFood() > appetite) {
            p.decreseFood(appetite);
            hungry = false;
            System.out.println(this.name + " is eating");
            return;
        }
        System.out.println(this.name + " don`t eating");
    }

    public boolean isHungry() {
        return hungry;
    }
}

package kz.example;

public class Wall extends Obstacles {

    int rangAround;

    public Wall(int rangAround) {
        this.rangAround = rangAround;
    }

    public int getRangAround() {
        return rangAround;
    }

    @Override
    public  boolean getAround (Actions actions) {
       return actions.jump(rangAround);
    }
}

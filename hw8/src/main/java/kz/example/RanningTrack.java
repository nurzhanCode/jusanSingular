package kz.example;

public class RanningTrack extends Obstacles {
    int rangAround;

    public RanningTrack(int rangAround) {
        this.rangAround = rangAround;
    }

    public int getRangAround() {
        return rangAround;
    }

    @Override
    public boolean getAround(Actions actions) {
        return actions.run(rangAround);
    }
}

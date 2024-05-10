package kz.example;


public class App {
    public static void main( String[] args ) {

        Actions [] array = new Actions[] {new Cat("Milka",40, 20), new Human("Asik",15, 4), new Robot("Dark", 5)};
        Obstacles [] obstacle = {new Wall(4), new Wall(6), new RanningTrack(14), new RanningTrack(30)};

        boolean win;
        for (Actions action : array) {
            win = false;
            for (Obstacles o : obstacle) {
                o.getAround(action);
                if(o.getAround(action)){
                    win = true;
                }else{
                    System.out.println("GAME OVER");
                    break;
                }
            }
            if(win){
                System.out.println("WIN");
            }
            System.out.println("----------");
        }

    }
}

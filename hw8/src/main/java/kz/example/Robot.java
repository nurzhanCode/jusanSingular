package kz.example;

public class Robot implements Actions {
    String name;
    int runSpeed;
    int jumpheight;

    public Robot(String name, int runSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.jumpheight = 0;
    }


    @Override
    public boolean run(int speed) {
        if(runSpeed > speed){
            System.out.println("Robot running");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if(jumpheight > height) {
            System.out.println("Robot  jump");
            return true;
        }
        return false;
    }

}

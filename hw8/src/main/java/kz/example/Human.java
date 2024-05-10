package kz.example;

public class Human implements Actions{
    String name;
    int runSpeed;
    int jumpheight;

    public Human(String name, int runSpeed, int jumpheight) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.jumpheight = jumpheight;
    }

    @Override
    public boolean run(int speed) {
        if(runSpeed > speed){
            System.out.println("Human running");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if(jumpheight > height) {
            System.out.println("Human  jump");
            return true;
        }
        return false;
    }

}

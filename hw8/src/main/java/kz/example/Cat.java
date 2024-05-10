package kz.example;

public class Cat implements Actions{
    String name;
    int runSpeed;
    int jumpheight;

    public Cat(String name, int runSpeed, int jumpheight) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.jumpheight = jumpheight;
    }


    @Override
    public boolean run(int speed) {
        if(runSpeed > speed){
            System.out.println("Cat running");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if(jumpheight > height) {
            System.out.println("Cat  jump");
            return true;
        }
        return false;
    }

}

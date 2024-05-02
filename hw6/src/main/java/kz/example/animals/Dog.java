package kz.example.animals;

public class Dog extends Animals {
    public Dog(int jumpSpeed, int runSpeed, int swimSpeed) {
        super(jumpSpeed, runSpeed, swimSpeed);
    }

    @Override
    public void jump(int jump) {
        if(jump < jumpSpeed) {
            System.out.println("Dog jumps " + jump);
            return;
        }
        System.out.println("Dog don`t jump limit " + jumpSpeed);
    }

    @Override
    public void swim(int swim) {
        if(swim < swimSpeed) {
            System.out.println("Dog swims " + swim);
            return;
        }
        System.out.println("Dog don`t swims speed limit " + swimSpeed);
    }

    @Override
    public void run(int run) {
        if(run < runSpeed) {
            System.out.println("Dog runs " + run);
            return;
        }
        System.out.println("Dog don`t run speed limit " + runSpeed);
    }
}

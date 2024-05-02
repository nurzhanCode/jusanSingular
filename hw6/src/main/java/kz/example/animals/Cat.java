package kz.example.animals;

public class Cat extends Animals {
    public Cat(int jumpSpeed, int runSpeed) {
        super(jumpSpeed, runSpeed);
    }

    @Override
    public void run(int run) {
        if(run < runSpeed) {
            System.out.println("Cat run " + run);
            return;
        }
        System.out.println("Cat don`t run speed limit " + runSpeed);
    }

    @Override
    public void jump(int jump) {
            if(jump < jumpSpeed) {
                System.out.println("Cat jump " + jump);
                return;
            }
            System.out.println("Cat don`t jump limit " + jumpSpeed);
    }

    @Override
    public void swim(int swim) {
            System.out.println("Cat Don`t swim ");
    }
}

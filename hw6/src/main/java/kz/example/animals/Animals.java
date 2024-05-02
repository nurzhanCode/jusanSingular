package kz.example.animals;

public abstract class Animals {

    int jumpSpeed;
    int runSpeed;
    int swimSpeed;

    public Animals(int jumpSpeed, int runSpeed, int swimSpead) {
        this.jumpSpeed = jumpSpeed;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpead;
    }

    public Animals(int jumpSpeed, int runSpeed) {
        this.jumpSpeed = jumpSpeed;
        this.runSpeed = runSpeed;
        this.swimSpeed = 0;
    }

    public abstract  void jump(int jumpSpeed);
    public abstract  void swim(int swimSpead);
    public abstract void run(int runSpeed);
}

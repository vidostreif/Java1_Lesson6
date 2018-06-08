package vido.geekbrains;

public class Dog extends Animal {

    public Dog() {
        setTypeAanimal("Собака");
        setMinHeightJump(1);
        setMaxHeightJump(2);
        setMinRunningDistance(400);
        setMaxRunningDistance(600);
        setMinSwimmingDistance(8);
        setMaxSwimmingDistance(12);

        SetRandomParameters();
    }

}

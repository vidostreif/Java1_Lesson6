package vido.geekbrains.Animal;

import vido.geekbrains.Animal.Animal;

public class Cat extends Animal {

    public Cat() {
        setTypeAnimal("Кошка");
        setMinHeightJump(2);
        setMaxHeightJump(3);
        setMinRunningDistance(200);
        setMaxRunningDistance(300);
        setMinSwimmingDistance(0);
        setMaxSwimmingDistance(0);

        SetRandomParameters();
    }

}

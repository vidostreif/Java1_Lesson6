//Крыгин СС Урок 6
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

//Возможно быстрое добавление новых типов животных для соревнования.

package vido.geekbrains;

import vido.geekbrains.Animal.Animal;
import vido.geekbrains.Animal.Cat;
import vido.geekbrains.Animal.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.Info();
        cat.Info();

        Animal[] animals = {dog, cat};

        Scanner in = new Scanner(System.in);
        int runningDistance;
        int swimmingDistance;
        int heightJump;

        System.out.println("Устроим соревнавания?");
        System.out.println("Какое растояние животные должны пробежать?");

        runningDistance = in.nextInt();
        for (Animal animal : animals) {
            if (animal.Run(runningDistance)) {
                System.out.println(animal.getTypeAnimal() + " смолга пробежать это расстояние!)");
                animal.increaseScore();
            } else {
                System.out.println(animal.getTypeAnimal() + " не смолга пробежать это расстояние!(");
            }
        }

        System.out.println("Какое растояние животные должны проплыть?");

        swimmingDistance = in.nextInt();
        for (Animal animal : animals) {
            if (animal.Swim(swimmingDistance)) {
                System.out.println(animal.getTypeAnimal() + " смолга проплыть это расстояние!)");
                animal.increaseScore();
            } else {
                System.out.println(animal.getTypeAnimal() + " не смолга проплыть это расстояние!(");
            }
        }

        System.out.println("Препятствие какой высоты они должны перепрыгнуть?");

        heightJump = in.nextInt();
        for (Animal animal : animals) {
            if (animal.Jump(heightJump)) {
                System.out.println(animal.getTypeAnimal() + " смолга перепрыгнуть это препятствие!)");
                animal.increaseScore();
            } else {
                System.out.println(animal.getTypeAnimal() + " не смолга перепрыгнуть это препятствие!(");
            }
        }

        int maxScore = 0;
        for (Animal animal : animals) {
            if (animal.getScore() > maxScore) {
                maxScore = animal.getScore();
            }
        }

        System.out.println("Победителями нашего соревнования стали:");
        for (Animal animal : animals) {
            if (animal.getScore() == maxScore) {
                System.out.println(animal.getTypeAnimal());
            }
        }
    }
}

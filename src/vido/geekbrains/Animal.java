package vido.geekbrains;

import java.util.Random;

public class Animal {
    private String typeAnimal;
    private int score;

    private int minRunningDistance;
    private int minSwimmingDistance;
    private int minHeightJump;

    private int maxRunningDistance;
    private int maxSwimmingDistance;
    private int maxHeightJump;

    private int runningDistance;
    private int swimmingDistance;
    private int heightJump;

    protected Animal() {
    }

    public boolean Run(int distance) {
        if (distance <= this.runningDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Jump(int height) {
        if (height <= this.heightJump) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Swim(int distance) {
        if (distance <= this.swimmingDistance) {
            return true;
        } else {
            return false;
        }
    }

    protected void SetRandomParameters() {
        Random rand = new Random();
        this.runningDistance = minRunningDistance + rand.nextInt(maxRunningDistance - minRunningDistance + 1);
        this.swimmingDistance = minSwimmingDistance + rand.nextInt(maxSwimmingDistance - minSwimmingDistance + 1);
        this.heightJump = minHeightJump + rand.nextInt(maxHeightJump - minHeightJump + 1);
    }

    public void Info() {
        System.out.println("Эта " + this.typeAnimal + " может бегать на расстоянии " + this.runningDistance + " м., плавать на расстоянии " + this.swimmingDistance + " м., и прыгать на высоту " + this.heightJump + " м..");
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        this.score++;
    }

    public void decreaseScore() {
        this.score--;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public void setMaxRunningDistance(int maxRunningDistance) {
        if (maxRunningDistance >= 0) {
            this.maxRunningDistance = maxRunningDistance;
        } else {
            System.out.println("Максимальная дистанция для бега должна быть не отрицательной!");
        }
    }

    public void setMaxSwimmingDistance(int maxSwimmingDistance) {
        if (maxSwimmingDistance >= 0) {
            this.maxSwimmingDistance = maxSwimmingDistance;
        } else {
            System.out.println("Максимальная дистанция для плавания должна быть не отрицательной!");
        }
    }

    public void setMaxHeightJump(int maxHeightJump) {
        if (maxHeightJump >= 0) {
            this.maxHeightJump = maxHeightJump;
        } else {
            System.out.println("Максимальная высота прыжка должна быть не отрицательной!");
        }
    }

    public void setMinRunningDistance(int minRunningDistance) {
        if (minRunningDistance >= 0) {
            this.minRunningDistance = minRunningDistance;
        } else {
            System.out.println("Минимальная дистанция для бега должна быть не отрицательной!");
        }
    }

    public void setMinSwimmingDistance(int minSwimmingDistance) {
        if (minSwimmingDistance >= 0) {
            this.minSwimmingDistance = minSwimmingDistance;
        } else {
            System.out.println("Минимальная дистанция для плавания должна быть не отрицательной!");
        }
    }

    public void setMinHeightJump(int minHeightJump) {
        if (minHeightJump >= 0) {
            this.minHeightJump = minHeightJump;
        } else {
            System.out.println("Минимальная высота прыжка должна быть не отрицательной!");
        }
    }

    public int getRunningDistance() {
        return runningDistance;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }

    public int getHeightJump() {
        return heightJump;
    }
}

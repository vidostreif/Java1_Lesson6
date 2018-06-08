package vido.geekbrains;

public class Animal {
    private int maxRunningDistance;
    private int maxSwimmingDistance;
    private int maxHeightJump;

    public Animal(int maxRunningDistance, int maxSwimmingDistance, int maxHeightJump) {
        this.setMaxRunningDistance(maxRunningDistance);
        this.setMaxSwimmingDistance(maxSwimmingDistance);
        this.setMaxHeightJump(maxHeightJump);
    }

    public boolean Run(int distance) {
        if (distance <= this.maxRunningDistance) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Jump(int height) {
        if (height <= this.maxHeightJump) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Swim(int distance) {
        if (distance <= this.maxSwimmingDistance) {
            return true;
        } else {
            return false;
        }
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public void setMaxRunningDistance(int maxRunningDistance) {
        if (maxRunningDistance >= 0) {
            this.maxRunningDistance = maxRunningDistance;
        } else {
            System.out.println("Дистанция для бега должна быть не отрицательной!");
        }

    }

    public int getMaxSwimmingDistance() {
        return maxSwimmingDistance;
    }

    public void setMaxSwimmingDistance(int maxSwimmingDistance) {
        if (maxSwimmingDistance >= 0) {
            this.maxSwimmingDistance = maxSwimmingDistance;
        } else {
            System.out.println("Дистанция для плавания должна быть не отрицательной!");
        }

    }

    public int getMaxHeightJump() {
        return maxHeightJump;
    }

    public void setMaxHeightJump(int maxHeightJump) {
        if (maxHeightJump >= 0) {
            this.maxHeightJump = maxHeightJump;
        } else {
            System.out.println("Высота прыжка должна быть не отрицательной!");
        }

    }
}

package com.ct.may12;

class Clerk extends Employee {
    private int speed;
    private int accuracy;

    public Clerk() {
    }

    public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
        super(name, employeeId, salary);
        this.speed = speed;
        this.accuracy = accuracy;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;

    }

}
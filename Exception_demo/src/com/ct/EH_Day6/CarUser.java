package com.ct.EH_Day6;

// Custom Exception Class 1
class CarStoppedException extends Exception {
    public CarStoppedException(String message) {
        super(message);
    }
}

// Custom Exception Class 2
class CarPunctureException extends Exception {
    public CarPunctureException(String message) {
        super(message);
    }
}

// Custom Exception Class 3
class CarHeatException extends Exception {
    public CarHeatException(String message) {
        super(message);
    }
}

// CarTest Class with static methods
class CarTest {
    public static void stop(String status) throws CarStoppedException {
        if (status.equalsIgnoreCase("stop")) {
            throw new CarStoppedException("Car stopped for some reason.");
        } else {
            System.out.println("Car not stalled.");
        }
    }

    public static void puncture(String status) throws CarPunctureException {
        if (status.equalsIgnoreCase("puncture")) {
            throw new CarPunctureException("Car is punctured.");
        } else {
            System.out.println("Car not punctured.");
        }
    }

    public static void carHeat(int temperature) throws CarHeatException {
        if (temperature > 50) {
            throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
        } else {
            System.out.println("Car temperature normal.");
        }
    }
}

// Public Main Class (File name: CarUser.java)
public class CarUser {
    public static void main(String[] args) {
        try {
            CarTest.stop("stop");
        } catch (CarStoppedException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            CarTest.stop("go");
        } catch (CarStoppedException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            CarTest.puncture("puncture");
        } catch (CarPunctureException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            CarTest.puncture("move");
        } catch (CarPunctureException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            CarTest.carHeat(60);
        } catch (CarHeatException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            CarTest.carHeat(40);
        } catch (CarHeatException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

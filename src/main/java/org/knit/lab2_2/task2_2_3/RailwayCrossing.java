package org.knit.lab2_2.task2_2_3;

public class RailwayCrossing {
    private static final Object block = new Object();
    private static boolean trainPassing = false;

    public static void main(String[] args) {
        Thread train = new Thread(new Train());
        train.start();

        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i)).start();
        }
    }
}

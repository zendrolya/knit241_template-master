package org.knit.lab2_2.task2_2_3;

public class Task2_2_3 {
    private static Object block = new Object();
    private static boolean trainPassing = false;

    public static void Run() {
        Thread train = new Thread(new Train(trainPassing, block));
        train.start();

        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i, trainPassing, block)).start();
        }
    }
}

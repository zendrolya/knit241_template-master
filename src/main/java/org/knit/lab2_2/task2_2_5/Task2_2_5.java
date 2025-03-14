package org.knit.lab2_2.task2_2_5;

public class Task2_2_5 {
    public static void Run() {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(trafficLight), "Машина " + i).start();
        }
    }
}

package org.knit.lab2_2.task2_2_5;

public class TrafficLight {
    private boolean isGreen = false;

    public synchronized void waitLight() throws InterruptedException {
        while (isGreen) {
            wait();
        }
    }

    public synchronized void redLight() {
        isGreen = false;
        System.out.println("Красный свет");
    }

    public synchronized void greenLight() {
        isGreen = true;
        System.out.println("Зеленый свет");
        notifyAll();
    }
}

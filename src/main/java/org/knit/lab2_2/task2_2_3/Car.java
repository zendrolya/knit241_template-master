package org.knit.lab2_2.task2_2_3;

class Car implements Runnable {
    private final int carId;

    public Car(int id) {
        this.carId = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (block) {
                    while (trainPassing) {
                        System.out.println("🚗 Машина " + carId + " ждет, поезд едет...");
                        block.wait();
                    }
                    System.out.println("🚗 Машина " + carId + " проезжает переезд.");
                }
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
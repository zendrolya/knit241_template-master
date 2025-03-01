package org.knit.lab2_2.task2_2_3;

public class Train implements Runnable {
    private Object block = new Object();
    private boolean trainPassing = false;

    public void Train(boolean trainPassing, Object block) {
        this.trainPassing = trainPassing;
        this.block = block;
    }
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                synchronized(block) {
                    trainPassing = true;
                    System.out.println("🚆 Поезд приближается! Машины должны остановиться.");
                }

                Thread.sleep(5000);
                synchronized(block) {
                    trainPassing = false;
                    System.out.println("✅ Поезд проехал. Машины могут ехать.");
                    block.notifyAll();
                }

                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
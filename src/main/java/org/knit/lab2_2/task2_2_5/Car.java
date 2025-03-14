package org.knit.lab2_2.task2_2_5;

import org.knit.lab2_2.task2_2_3.RailwayCrossing;

class Car implements Runnable {
    private final TrafficLight tl;

    public Car(TrafficLight tl) {
        this.tl = tl;
    }

    @Override
    public void run() {
        try {
            while (true) {
                tl.greenLight();
                tl.waitLight();
                System.out.println(Thread.currentThread().getName() + " едет на зеленый");
                Thread.sleep(5000);
                tl.redLight();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
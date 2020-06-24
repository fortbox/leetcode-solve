/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1117;

import java.util.concurrent.Semaphore;

public class H2O {
    Semaphore latch = new Semaphore(0);
    Semaphore semaphore = new Semaphore(2);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        semaphore.acquire();
        latch.release();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        latch.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        semaphore.release(2);
    }
}

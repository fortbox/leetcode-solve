/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1226;

import java.util.concurrent.Semaphore;

class DiningPhilosophers {
    Semaphore[] lock;

    public DiningPhilosophers() {
        lock = new Semaphore[]{
                new Semaphore(1),
                new Semaphore(0),
                new Semaphore(0),
                new Semaphore(0),
                new Semaphore(0)
        };
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        lock[philosopher].acquire();
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        lock[(philosopher + 1) % 5].release();
    }
}

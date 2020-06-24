/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1116;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    Semaphore zeroLock = new Semaphore(1);
    Semaphore evenLock = new Semaphore(0);
    Semaphore oddLock = new Semaphore(0);
    boolean isReverse = false;
    int x = 0;
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            zeroLock.acquire();
            System.out.println("x = " + x);
            printNumber.accept(0);
            if (!isReverse) {
                isReverse = true;
                oddLock.release();
            } else {
                isReverse = false;
                evenLock.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            evenLock.acquire();
            printNumber.accept(++x);
            zeroLock.release();
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            oddLock.acquire();
            printNumber.accept(++x);
            zeroLock.release();
        }
    }
}
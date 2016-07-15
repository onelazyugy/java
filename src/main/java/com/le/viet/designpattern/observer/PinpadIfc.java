package com.le.viet.designpattern.observer;

/**
 * Created by vietle on 7/14/16.
 */
public interface PinpadIfc {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}

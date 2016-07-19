package com.le.viet.designpattern.observer;

/**
 * Created by vietle on 7/14/16.
 */
public interface PinpadIfc {
    void registerObserver(ObserverIfc o);
    void removeObserver(ObserverIfc o);
    void notifyObserver();
}

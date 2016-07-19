package com.le.viet.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vietle on 7/14/16.
 */
public class CardData implements PinpadIfc{
    private List<ObserverIfc> observersList;

    public CardData(){
        observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverIfc o) {
        observersList.add(o);
        notifyObserver();
    }

    @Override
    public void removeObserver(ObserverIfc o) {
        int i = observersList.indexOf(o);
        if(i >= 0){
            observersList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i<observersList.size(); i++){
            ObserverIfc observer = (ObserverIfc) observersList.get(i);
            observer.update(getCardData());
        }
    }

    private CardInfo getCardData(){
        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardNumber("401254879851236");
        cardInfo.setCardType("VI");
        cardInfo.setExpDate("07/18");
        return cardInfo;
    }
}

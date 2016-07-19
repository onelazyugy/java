package com.le.viet.designpattern.observer;


/**
 * Created by vietle on 7/14/16.
 */
public class CardDataObserver implements ObserverIfc {
    private PinpadIfc cardData;
    private CardInfo cardInfo;

    public CardDataObserver(PinpadIfc cardData){
        this.cardData = cardData;
        cardData.registerObserver(this);
    }

    @Override
    public void update(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String showCardData(){
        System.out.println("update method got called with cardInfo as: " + cardInfo.toString());
        return cardInfo.toString();
    }
}

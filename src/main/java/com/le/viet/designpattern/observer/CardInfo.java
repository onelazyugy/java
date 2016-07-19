package com.le.viet.designpattern.observer;

/**
 * Created by vietle on 7/18/16.
 */
public class CardInfo {
    private String cardNumber = "405163498746511";
    private String cardType = "VI";
    private String expDate = "07/18";

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "CardInfo{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}

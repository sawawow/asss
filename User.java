package com.company;

public class User {
    private Card moneyCard;//карта которая принадлежит user

    public User(){}

    public User (Card card){
        this.moneyCard = card;
    }

    public Card giveCard(){
        return this.moneyCard;
    }

    public void TakeNewCard(Card newCard){
        this.moneyCard = newCard;
    }

}

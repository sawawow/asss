package com.company;
//пользователь вставить карточку
//ввести пинкод
//снять наличку
//банкомат.пользователь.карточка .банк
public class Main2 {
    public static void main(String[] args){
        Card visaCard = new Card("visa","124534264");
        User vasya = new User(visaCard);

        Bank belarusbank = new Bank();
        ATM  atmING = new ATM(belarusbank);

        ///

        atmING.insertCard(vasya.giveCard());
        try {
            atmING.showEnterPinCodeMenu();
        } catch (UnsupportedCardException | BlockCardException e) {
            System.out.println(e.getMessage());
            return;
        }
        atmING.withDraw();

    }
}

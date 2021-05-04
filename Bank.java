package com.company;

public class Bank {

    private static final int maxTriesCount = 3;
    private class CardInfo{
        private String cardID;
        private int pinCode;
        private int money;
        private int triesCount;

        public CardInfo(String cardID,int pinCode,int money){
            this.cardID =cardID;
            this.pinCode = pinCode;
            this.money=money;
        }
    }
    private CardInfo[] dataBase;


    public Bank(){


        this.dataBase = new CardInfo[]{
                new CardInfo("124534264",1451,264754),
                new CardInfo("134563454",1234,0),
                new CardInfo("1248753264",5678,8764),
        };
    }
    public void signIn(String cardId,int pinCode) throws UnsupportedCardException,BlockCardException,IncorrectPinExeption{
        CardInfo card = getCardById(cardId);


        if (card == null){
            throw new UnsupportedCardException();
        }

        if (card.pinCode == pinCode){
            card.triesCount =0;
            return;
        }


        card.triesCount++;
        if (card.triesCount == maxTriesCount){
            throw new BlockCardException();
            }
            throw new IncorrectPinExeption(maxTriesCount - card.triesCount);



}

    private CardInfo getCardById(String cardId){
        for (CardInfo cardInfo : this.dataBase){
            if (cardInfo.cardID.equals(cardId)){
                return cardInfo;
            }
        }

        return null;
    }
    public int withdrawMoney(String cardId ,int m) throws NotMoneyException {
        //ищем карточку по Id
        CardInfo card = getCardById(cardId);
        if (m > card.money){
            throw new NotMoneyException();
        }
        return  card.money -=m;
    }
    public int getMoney(String cardId){
        CardInfo card  = getCardById(cardId);
        return card.money;
    }
}

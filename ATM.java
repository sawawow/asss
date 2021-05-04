package com.company;

import java.util.Scanner;

public class ATM {
    private String cardId;
    private Bank bank;

    public ATM (Bank bank){
        this.bank = bank;
    }

    public void insertCard(Card card){
        this.cardId = card.getId();
    }
    public void extractCard(){
        this.cardId="";
    }
    public void showEnterPinCodeMenu() throws UnsupportedCardException,BlockCardException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пин код");
            int pinCode = sc.nextInt();
            try {
                bank.signIn(this.cardId, pinCode);
            } catch (IncorrectPinExeption e) {
                System.out.println(e.getMessage());
                System.out.println("осталось попыток");
                System.out.println(e.getTriesCount());
                continue;
            }
            break;
        }
    }
        public void withDraw(){
            Scanner sn = new Scanner(System.in);
            int money = 0;
            while(money!= -1){
            System.out.println("введите сумму для снятия");
            System.out.println("для завершения введите -1");
            money = sn.nextInt();
                try {
                    this.bank.withdrawMoney(this.cardId,money);
                } catch (NotMoneyException e) {
                    System.out.println(e.getMessage());;
                }

                System.out.print("остаток денег:");
                System.out.println(this.bank.getMoney(this.cardId));
            }
        }
    }


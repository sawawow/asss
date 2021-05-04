package com.company;

public class UnsupportedCardException extends Exception {
    public UnsupportedCardException(){
        super("ваша карта не поддерживается");
    }
}

package com.company;

public class IncorrectPinExeption extends Exception{
    private int triesCount;

    public IncorrectPinExeption(int triesCount){
        super("Введен неверный pin");
        this.triesCount = triesCount;
    }

    public int getTriesCount() {
        return triesCount;
    }



}

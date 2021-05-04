package com.company;

public class BlockCardException extends Exception {
    public BlockCardException(){
        super("Ваша карта заблокированна");
    }
}

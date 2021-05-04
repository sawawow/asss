package com.company;

public class NotMoneyException extends Exception {
    public NotMoneyException(){
        super("на вашем счету нема грошай");
    }
}

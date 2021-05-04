package com.company;

public class Card {
    private String type;
    private String id;

    public Card(String type, String id){
        this.id = id;
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

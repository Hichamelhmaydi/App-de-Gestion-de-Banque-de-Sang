package com.bloodbank.model.entities;

public enum BloodGroup {
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-");
    
    private final String symbol;
    
    BloodGroup(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public static BloodGroup fromString(String text) {
        for (BloodGroup group : BloodGroup.values()) {
            if (group.symbol.equals(text)) {
                return group;
            }
        }
        return null;
    }
}
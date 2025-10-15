package com.bloodbank.model.enums;

public enum Gender {
    MALE("Masculin"),
    FEMALE("Féminin");
    
    private final String label;
    
    Gender(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
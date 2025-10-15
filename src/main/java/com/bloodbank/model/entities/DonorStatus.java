package com.bloodbank.model.entities;

public enum DonorStatus {
    DISPONIBLE("Disponible"),
    NON_DISPONIBLE("Non disponible"),
    NON_ELIGIBLE("Non éligible");
    
    private final String label;
    
    DonorStatus(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
package com.bloodbank.model.enums;

public enum MedicalStatus {
    HEALTHY("En bonne santé"),
    HEPATITIS_B("Hépatite B"),
    HEPATITIS_C("Hépatite C"),
    HIV("VIH"),
    INSULIN_DIABETES("Diabète insulinodépendant"),
    PREGNANT("Enceinte"),
    BREASTFEEDING("Allaitement");
    
    private final String label;
    
    MedicalStatus(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}

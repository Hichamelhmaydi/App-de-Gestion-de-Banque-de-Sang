package com.bloodbank.model.entities;

public enum ReceiverPriority {
    CRITIQUE("Critique", 4),
    URGENT("Urgent", 3),
    NORMAL("Normal", 1);
    
    private final String label;
    private final int requiredBags;
    
    ReceiverPriority(String label, int requiredBags) {
        this.label = label;
        this.requiredBags = requiredBags;
    }
    
    public String getLabel() {
        return label;
    }
    
    public int getRequiredBags() {
        return requiredBags;
    }
}
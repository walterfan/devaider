package com.github.walterfan.devaider.domain;

public enum Priority {
    //P1(Must have) / P2(Should have) / P3(Could have) / P4(Won't have)
    P1(1, "Must have"),
    P2(2, "Should have"),
    P3(3, "Could have"),
    P4(4, "Won't have");
    
    private int priority;
    private String description;
    
    private Priority(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }
    
    public int getPriority() {
        return priority;
    }
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return this.priority + ". " + description;
    }
}

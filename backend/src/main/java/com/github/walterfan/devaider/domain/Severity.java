package com.github.walterfan.devaider.domain;

import lombok.Getter;

/**
 * @author walter
 */

@Getter
public enum Severity implements Comparable<Severity> {
    S1(1, "blocker"),
    S2(2, "critical"),
    S3(3, "major"),
    S4(4, "minor"),
    S5(5, "trivia");
    
    private final int value;
    private final String description;
    
    private Severity(int value, String description) {
        this.value = value;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return name() + ": " + value + ". " + description;
    }

    public static void main(String[] args) {
        for(Severity severity : Severity.values()) {
            System.out.println(severity.toString());
        }
    }
    
    
    
    
    

}

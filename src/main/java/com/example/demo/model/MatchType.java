package com.example.demo.model;

public enum MatchType{
    EXACT,
    CONTAINS,
    REGEX;

    public String toUpperCase() {
        throw new UnsupportedOperationException("Unimplemented method 'toUpperCase'");
    }
}
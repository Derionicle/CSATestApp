package com.example.nathan.csatestapp;


public class School {
    String name;
    int rank;
    boolean outofState;
    public School(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public School(String name) {
        this.name = name;
    }
    public School(String name, int rank, boolean outofState) {
        this.name = name;
        this.rank = rank;
        this.outofState = outofState;
    }
}

package com.practice.design.bookingsystem.view;

public class UserInput {

    public UserInput() {

    }

    public String chooseEitherTheatreOrMovie() {
        final StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Please choose the below option\n");
        stringBuilder.append("Enter 1 for Movie\n");
        stringBuilder.append("Enter 2 for Theatre\n");
        return stringBuilder.toString();
    }




}

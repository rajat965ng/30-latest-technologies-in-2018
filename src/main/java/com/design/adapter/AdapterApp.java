package com.design.adapter;

public class AdapterApp {

    public static void main(String args[]){
        NewBackEnd newBackEnd = new NewBackEnd();
        newBackEnd.setName("Thomas Cook");
        NewToOldAdapter newToOldAdapter = new NewToOldAdapter(newBackEnd);
        System.out.println(newToOldAdapter.getFirstName());
        System.out.println(newToOldAdapter.getLastName());
    }

}

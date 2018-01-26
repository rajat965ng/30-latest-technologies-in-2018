package com.design.mediator;

public class MediatorApp {

    public static void main(String args[]){
        ChatMediator mediator = new ChatMediator(new ChatRoom());
        User abc = new User("abc",mediator);
        User xyz = new User("xyz",mediator);

        abc.sendMessage("Hello World !!");
        xyz.sendMessage("Kaboom !");
        abc.sendMessage("asl plz !!");
        xyz.sendMessage("Get Lost !!");
    }

}
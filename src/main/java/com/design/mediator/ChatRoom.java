package com.design.mediator;

public class ChatRoom implements IChatRoom{

    @Override
    public void showMessage(Message message) {
        System.out.println(message.getUser().getName()+": "+message.getMessage());
    }
}

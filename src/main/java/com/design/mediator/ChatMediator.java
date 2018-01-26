package com.design.mediator;

public class ChatMediator {

    private IChatRoom chatRoom;

    public ChatMediator(IChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void sendMessage(User user, String message){
        chatRoom.showMessage(new Message(user,message));
    }

}

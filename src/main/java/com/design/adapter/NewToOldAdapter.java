package com.design.adapter;

public class NewToOldAdapter {

    private OldBackEnd oldBackEnd;

    private NewBackEnd newBackEnd;

    public NewToOldAdapter(NewBackEnd newBackEnd) {
        this.newBackEnd = newBackEnd;
        oldBackEnd = new OldBackEnd();
        oldBackEnd.setFirstName(this.newBackEnd.getName().split(" ")[0]);
        oldBackEnd.setLastName(this.newBackEnd.getName().split(" ")[1]);
    }

    public String getFirstName(){
        return oldBackEnd.getFirstName();
    }

    public String getLastName(){
        return oldBackEnd.getLastName();
    }


}

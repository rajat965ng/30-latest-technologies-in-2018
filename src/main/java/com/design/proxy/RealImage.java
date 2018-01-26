package com.design.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile();
    }

    @Override
    public void display() {
        System.out.println("Displaying:"+fileName);
    }

    public void loadFile(){
        System.out.println("loading "+fileName+" from Disk !!");
    }
}

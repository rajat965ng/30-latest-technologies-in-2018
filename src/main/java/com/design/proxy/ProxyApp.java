package com.design.proxy;

public class ProxyApp {

    public static void main(String args[]){
        Image image = new ProxyImage("MyPic.jpg");
        image.display();
        System.out.println(" Re-display, already loaded image");
        image.display();
    }

}

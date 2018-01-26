package com.design.command;

public class CommandApp{

    public static void main(String args[]){

        Stock fruits = new Stock("Fruits",10);
        Stock veggies = new Stock("Vegetables",7);

        BuyStock buyStock = new BuyStock(fruits);
        SellStock sellStock = new SellStock(veggies);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();


    }

}

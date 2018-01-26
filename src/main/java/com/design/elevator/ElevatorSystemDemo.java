package com.design.elevator;

import java.util.Scanner;

public class ElevatorSystemDemo {

    public static void main(String args[]){
        Elevator elevator = new Elevator();

        IElevatorState elevatorState = new ParkState();
        elevatorState.execute(elevator);

        String input = "";
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("current state of elevator: "+elevator.getCurrent());
            System.out.println("Enter your choice:");
            input = sc.nextLine();
            switch (input){
                case "open":
                    elevatorState = new OpenState();
                    elevatorState.execute(elevator);
                break;
                case "close":
                    elevatorState = new CloseState();
                    elevatorState.execute(elevator);
                    break;
                case "up":
                    System.out.println("Enter the floor no.");
                    input = sc.nextLine();
                    elevatorState = new UpState(Integer.parseInt(input));
                    elevatorState.execute(elevator);
                    break;
                case "down":
                    System.out.println("Enter the floor no.");
                    input = sc.nextLine();
                    elevatorState = new DownState(Integer.parseInt(input));
                    elevatorState.execute(elevator);

            }
        }

    }

}

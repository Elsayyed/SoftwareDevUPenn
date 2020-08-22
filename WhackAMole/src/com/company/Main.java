package com.company;

import java.util.*;

public class Main{
    public static void main(String[] args) {
	// write your code here

        WhackAMole GameBoard = new WhackAMole(50,10);

        for (int i = 0; i < 10; i++) {
            GameBoard.place((int) (Math.random()*10-1),(int) (Math.random()*10-1));
        }

        System.out.println("You only have a maximum of "+ GameBoard.attemptsLeft +" to get all the moles.");
        System.out.println("Enter the X Y coordinates: ");
        while (GameBoard.attemptsLeft != 0 && GameBoard.molesLeft != 0  ){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == -1 && y == -1){
                break;
            }
            else{
                GameBoard.whack(x,y);
                GameBoard.printGridToUser();
            }
        }
        GameBoard.printGrid();
    }
}


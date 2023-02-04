package com.split;

import java.util.Random;

public class Games_Q4 {

	 public static void main(String[] args) {
         Random rand = new Random();
         int no_of_players = rand.nextInt(6);
         System.out.println("Number of players each team has :" + no_of_players);
         int enemy = 0;
         int player = 0;
         for(int i = 0 ; i < no_of_players; i++){
                 int num1 = rand.nextInt(6);
                 int num2 = rand.nextInt(6);
                 System.out.println("Number 1: " + num1);
                 System.out.println("Number 2: " + num2);

                 if(num1 == num2){
                         
                         System.out.println("Enemy Got hit by ur team");
                         player++;
                 }else{
                         System.out.println("You got hit by enemy");
                         enemy++;
                 }
         }
         if(player > enemy){
                 System.out.println("You won");
         }else if(player < enemy){
                 System.out.println("Enemy won");
         }else{
                 System.out.println("draw");
         }

 }

}

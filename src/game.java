/*
   @my name: Chase Goodman
   @started: 1/24/2015
   @version: ALPHA .12
 */

import java.util.*;

public class game {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean tOver = false;
        boolean tOver2 = false;
        int p1Round = 0;
        int p1Total = 0;
        int p2Round = 0;
        int p2Total = 0;

        System.out.println("---Enter player names---");
        System.out.print("Player 1's name: ");
        String name = s.nextLine();
        System.out.print("Player 2's name: ");
        String name2 = s.nextLine();
        System.out.println("");

        System.out.println("<----Welcome to the Game of Pig---->");

        do{//While no one has over the set points

            System.out.println("\n" + "---" + name + "'s turn---");//Makes it clear that it is now player 1's turn

            do{//While player 1's turn = false
                tOver = false;
                int dice = (int)(Math.random()*6) + 1;//Chooses a random number between 1 and 6
                if(dice == 1){//If you rolled and it was a 1
                    p1Round = 0;
                    System.out.println("You rolled a: 1");
                    System.out.println("You hand the dice over. Your point total is " + p1Total + ".");
                    tOver = true;
                    break;
                }else if(dice != 1){//If you rolled and it wasn't a 1
                    p1Round+=dice;
                    System.out.println("You rolled a: " + dice + ", your round total is: " + p1Round + ".");
                    System.out.println("Your point total is " + p1Total + ".");
                    System.out.print("Do you want to roll(r) or hold(h)?: ");
                    String rollOrHold = s.nextLine();
                    System.out.println("");
                    if(rollOrHold.equalsIgnoreCase("R")){//If you type r, then you roll again

                    }else if(rollOrHold.equalsIgnoreCase("H")){//If you type h, then you hold and get your round points
                        p1Total+=p1Round; //Adds player 1 round to the player 1 total
                        System.out.println("You hand the dice over. Your point total is " + p1Total + ".");
                        p1Round=0; //Sets the round score back to 0 after a hold
                        tOver=true;
                    }else{//Error catcher
                        System.out.println("**Please enter either r or h. Default choice is r." + "\n");

                    }
                }
            }while(tOver == false);//Player 1's turn

            System.out.println("\n" + "---" + name2 + "'s turn---");//Makes it clear that it is now player 2's turn

            do{//While player 2's turn = false
                tOver2 = false;
                int dice = (int)(Math.random()*6) + 1;//Chooses a random number between 1 and 6
                if(dice == 1){//If you rolled and it was a 1
                    p2Round = 0;
                    System.out.println("You rolled a: 1");
                    System.out.println("You hand the dice over. Your point total is " + p2Total + ".");
                    tOver = true;
                    break;
                }else if(dice != 1){//If you rolled and it wasn't a one
                    p2Round+=dice;
                    System.out.println("You rolled a: " + dice + ", your round total is: " + p2Round + ".");
                    System.out.println("Your point total is " + p2Total + ".");
                    System.out.print("Do you want to roll(r) or hold(h)? ");
                    String rollOrHold = s.nextLine();
                    System.out.println("");
                    if(rollOrHold.equalsIgnoreCase("R")){//If you type r, then you roll again

                    }else if(rollOrHold.equalsIgnoreCase("H")){//If you type h, then you hold and you get your round points
                        p2Total+=p2Round;//Adds player 2 round to the player 2 total
                        System.out.println("You hand the dice over. Your point total is " + p2Total + ".");
                        p2Round=0; //Sets the round score back to 0 after a hold
                        tOver2=true;
                    }else{//Error catcher
                        System.out.println("**Please enter either r or h. Default choice is r." + "\n");

                    }
                }
            }while(tOver2 == false);//Player 2's turn

            if(p1Total >= 100 && p1Total > p2Total){//Declares player 1 as the winner
                System.out.println("\n" + "Congrats " + name + ", you won the game with " + p1Total + " points!");
                break;
            }else if(p2Total >= 100 && p2Total > p1Total){//Declares player 2 as the winner
                System.out.println("\n" + "Congrats " + name2 + ", you won the game with " + p2Total + " points!");
                break;
            }

        }while(p1Total <= 100 | p2Total <= 100);//Finishes the game when a player reaches over 100 points

        s.close();

    }

}
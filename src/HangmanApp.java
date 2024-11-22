/*
 *  Created by: Tiffany Washington
 *  Created on: 11/18/2024
 *  Updated on: 
 *  Purpose: Create hangman game
*/


import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            //Display hangman figure near the title
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aranda_7_guessing_game;

import java.util.Random;
import java.util.Scanner;

public class Aranda_7_guessing_game {

    static String username;
    static int yourguess;
    static int magicnumber;
    static Random EvanArandasRandom;
    private static int userguess;
    private static boolean playagain;

    public static void main(String[] args) {
        System.out.println("What's your name?");
        something();
    }    
    

    static void something() {
        Scanner name = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);
        System.out.println("Hello, would you like to pick a number?");
        username = name.nextLine();
        System.out.println("Hello " + username + " please pick a number between 1 and 9000");
        userguess = guess.nextInt();
        EvanArandasRandom = new Random();
        magicnumber = EvanArandasRandom.nextInt(9000) + 1;
        //       Scanner inputnumbers = new Scanner(System.in);
        //       userguess = userinputnumbers.nextInt();
        System.out.println(magicnumber);
        if (magicnumber == userguess) {
            System.out.println("You win");
            playagain = false;
        } else if (magicnumber < userguess) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Too low! Try again.");
        }

    }

    private static void again() {
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Pick a number");
        userguess = userinputnumbers.nextInt();
        if (magicnumber == userguess) {
            System.out.println("You win");
            playagain = true;
        } else if (magicnumber > userguess) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        if (playagain == false) {
            tryAgain();
        }
    }

    private static void tryAgain() {
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("Pick a number");
        userguess = userinputnumbers.nextInt();
        if (magicnumber == userguess) {
            System.out.println("You win!");
            playagain = true;
        } else if (magicnumber > userguess) {
            System.out.println("Too low! Try again.");
            tryAgain();
        } else {
            System.out.println("Too high! Try again.");
            tryAgain();
        }
    }
}

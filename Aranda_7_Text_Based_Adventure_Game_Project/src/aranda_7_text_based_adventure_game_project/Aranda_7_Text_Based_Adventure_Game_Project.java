/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aranda_7_text_based_adventure_game_project;

import java.util.Scanner;
public class Aranda_7_Text_Based_Adventure_Game_Project {
  

static String chickenfilay;
static String username;
static String BurgerPrince;
static String Mcdolands;
static String PandaSlow;
static String Soobwhey;
    public static void main(String[] args) {
        System.out.println("Welcome to the food court. May we please have your name for the restaurants to know who you is?");
        something();
    }    

        
        
    

    static void something() {
        Scanner name = new Scanner(System.in);
        System.out.println("");
        username = name.nextLine();
        System.out.println("Hello " + username + "." ); 
            System.out.println(" You have many food options. Your options are:");
            System.out.println("");
            System.out.println("chicken-fil-ay(Creator of everything with chicken, not creator of chicken)");
            System.out.println("");
            System.out.println("Mcdolands(Creator of diabetes and every possible health disorder caused by greasy food)");
            System.out.println("");
            System.out.println("Burger Prince(Successor to his father the king, this place has the best burgers in the kingdom)");
            System.out.println("");
            System.out.println("Panda slow(Founded by pandas, no one knows as to why they are obsessed with bamboo, this place has asian food)");
            System.out.println("");
            System.out.println("Soobwhey(The creator of the footlong soobwhey sandwich, this place has every type of soobwhey sandwich)");
            System.out.println("");
            
            System.out.println(username + " " + "please pick a restaurant to dine at.");
            System.out.println("chickenfilay, Mcdolands, BurgerPrince, PandaSlow or Soobwhey. ");
            Scanner chicken = new Scanner(System.in);
            chickenfilay = chicken.nextLine();
         
         
            System.out.println("Thankyou for picking"); System.out.println(chickenfilay);
       if (chickenfilay.contains("chickenfilay")){
           
       }
           
        
        

    

    
        
    }



        
      
    }
    


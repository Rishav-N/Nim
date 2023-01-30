/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
import java.util.Scanner;

public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim! The rules are simple. There will be a given amount of pieces that you can take from, and you and the other player will alternate turns. You can not take more than half of the pieces at the time and you can't take 0 pieces. Whoever takes the last piece loses. If you violate the rules, then one piece will be added to the number of pieces.  Let the game begin. Good luck!");
    
    Game nim = new Game(); 
    nim.play();
    
  }
}
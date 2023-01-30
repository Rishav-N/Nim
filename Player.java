// player class to manage data about players
import java.util.Scanner;


public class Player 
{
  private String playerName;
  private int playerScore;

  public Player()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello, what is your name?: ");
    String user = sc.nextLine();
    
    playerName = user;
    System.out.println("Hello  " + getPlayerName());
    playerScore = 0; }

  public Player(String input)
  {
    playerName = input;
    System.out.println("Hello " + playerName);
    playerScore = 0;
  }
    
  public String getPlayerName()
  {
    return playerName;
  }
  
  public void setName(String input)
  {
    playerName = input;
  }
  
  public int getScore()
  {
    return playerScore;
  }
  
  public void addScore(int num)
  {
    playerScore += num;
  }

}
  
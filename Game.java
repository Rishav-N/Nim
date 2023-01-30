// Game class to manage main game functions
import java.util.Random;
import java.util.Scanner;



// Game class manages main functions such as playing the game using the logic. It includes methods of how the random player is picked and then how the game is started, along with the play again feature. As well as that, there is logic to deny the user if they try to break the rules of the game. This class is the main functionality of the program. 
public class Game {
  
  Random random = new Random();
  Player player1 = new Player();
  Player player2 = new Player();
  Board board = new Board(random.nextInt(30) + 15); 
  String player1Name = player1.getPlayerName();
  String player2Name = player2.getPlayerName();
  int randomNum = random.nextInt(1) + 1;
  Boolean activeGame = true; 
  public String activePlayer;


  public void play()
  {
    Scanner user = new Scanner(System.in);
    while (activeGame) {
      if (randomNum % 2 == 0) {
        activePlayer = player1Name; }
      else {
        activePlayer = player2Name; }
      System.out.println("There are " + board.getNumOfPieces() + " pieces left on the board. How many pieces do you want to take " + activePlayer + " ?");
      int pieceNum = user.nextInt();
      // need a way to add score 
      while ((pieceNum == 0) || ((pieceNum > (((int)(board.getNumOfPieces())/2)))&& (pieceNum !=1))) {
        board.addPieces(1);
        System.out.println("Pick a different number, remember the rules of the game! There are now " + board.getNumOfPieces() + " pieces left because of the violation");
        pieceNum = user.nextInt(); }
      board.takePieces(pieceNum);
    
      if (board.getNumOfPieces() == 0) {
        System.out.println("You took the last piece, " + activePlayer + " , You lost!");
        break; }
      randomNum += 1; 
      
    }

    // Play Again Method 
    System.out.println("Type Y or N if you want to play again ");
    String input = user.nextLine();
    if (input.equals("Y")) {
      play();
    }
    if (input.equals("N")) {
      System.out.println("Game over");
    }
    
  }
} 
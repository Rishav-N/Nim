

// Board class to manage board
import java.util.Random;

// Board class manages number of pieces and also the takepieces method
public class Board {
  private static int numOfPieces;

  public Board(int x) {
    numOfPieces = x;
  }

  public void addPieces(int y) {
    numOfPieces += y;
  }

  public void setNumOfPieces(int x) {
    numOfPieces = x;
  }

  public int getNumOfPieces() {
    return numOfPieces;
  }
  

  public void takePieces(int x) {
    numOfPieces -= x; 
    System.out.println("You just took " + x + " pieces from the board");
  }
}
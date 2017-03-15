import org.junit.*;
import static org.junit.Assert.*;

public class testRPS{



  @Test
  public void calculateWhoWins_AllTie(){
    RPS testRPS = new RPS();
    String expectedOutput1 = "Tie";
    assertEquals(expectedOutput1, testRPS.calculate("1","1"));
    assertEquals(expectedOutput1, testRPS.calculate("2","2"));
    assertEquals(expectedOutput1, testRPS.calculate("3","3"));
  }
  @Test
  public void calculateWhoWins_RockOverScissors(){
    RPS testRPS = new RPS();
    String expectedOutput1 = "Paper Wins";
    String expectedOutput2 = "Scissors Wins";
    String expectedOutput3 = "Rock Wins";
    assertEquals(expectedOutput1, testRPS.calculate("2","1"));
    assertEquals(expectedOutput2, testRPS.calculate("2","3"));
    assertEquals(expectedOutput3, testRPS.calculate("1","3"));
  }
}

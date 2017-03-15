public class RPS{

  public String calculate(String p1, String p2){
    String concatDigits = p1 + p2;
    String paperWin = "1221";
    String scissorWin = "2332";
    String rockWin = "1331";
    String output = "";

    //Nasty ass procedural shit
    if(p1 == p2){
      output = "Tie";
    }else if (paperWin.contains(concatDigits)){
      output = "Paper Wins";
    }else if(scissorWin.contains(concatDigits)){
      output = "Scissors Wins";
    }else if(rockWin.contains(concatDigits)){
      output = "Rock Wins";
    }
    return output;
  }//End of Calculate
}//End of RPS

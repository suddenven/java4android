import javax.swing.JOptionPane;

public class Scorekeeper {

  public static void main(String[] args) {
    int score = 50000;
    int points = 1000;
    score = addPoints(score, points);
    JOptionPane.showMessageDialog(null, score,
        "New Score", JOptionPane.INFORMATION_MESSAGE);
  }

  static int addPoints(int score, int points) {
    return score + points;
  }

}

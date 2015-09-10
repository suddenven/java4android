import javax.swing.JOptionPane;

public class Scorekeeper {

  public static void main(String[] args) {
    int score = 50000;
    int points = 1000;
    addPoints(score, points);
    JOptionPane.showMessageDialog(null, score,
        "New Score", JOptionPane.INFORMATION_MESSAGE);
  }

  static void addPoints(int score, int points) {
    score += points;
  }

}

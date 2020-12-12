import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ScoreCalc {
  private ArrayList<Difficulty> scoreBoard = new ArrayList();
  private double easyCon;
  private double heroicCon;
  private double hardcoreCon;
  private static final int CHALLENGECOL = 2;
  private static final int SCORECOL = 3;
  private static final int COINCOL = 4;
  private static final int TIMECOL = 5;
  private static final int LIVESCOL = 6;
  private static final int TOTALDIFFICULTY = 3;

/**
 * Constructor.
 */
  public ScoreCalc() {
  }

/**
 * Constructor.
 * @param filename - filename
 */
  public ScoreCalc(String filename) {
    openFile(filename);
  }

/**
 * Gets score for the given player id.
 * @param playerID - player id
 * @return (double) - the score of the player
 */
  public double getScore(String playerID) {
    for (Difficulty temp : scoreBoard) {
      if (temp.getPlayerID().equals(playerID)) {
        return temp.getLeaderBoardScore();
      }
    }
    return 0;
  }

/**
 * Produces a string of all the players and their scores.
 * @return (String) - all of the players and their scores
 */
  public String toString() {
    String str = "";
    int once = 0;

    for (Difficulty temp : scoreBoard) {
      if (once != 0) {
        str = str + "\n";
      }
      str = str + temp.toString();
      once++;
    }
    return str;
  }

/**
 * Opens file and extracts information.
 * @param filename - filename
 */
  public void openFile(String filename) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = reader.readLine()) != null) {
        String[] part = line.split(",");
        if (part.length == TOTALDIFFICULTY) {
          setConstants(part);
        } else if (part[1].equals("E")) {
          scoreBoard.add(setupEasy(part));
        } else if (part[1].equals("H")) {
          scoreBoard.add(setupHeroic(part));
        } else if (part[1].equals("C")) {
          scoreBoard.add(setupHardCore(part));
        }
      }
      reader.close();
    } catch (Exception e) {
    }
  }

/**
 * Sets the difficulty constant.
 * @param part - parts of the line
 */
  public void setConstants(String[] part) {
    easyCon = Double.parseDouble(part[0]);
    heroicCon = Double.parseDouble(part[1]);
    hardcoreCon = Double.parseDouble(part[2]);
  }

/**
 * Sets up an Easy object with the values in part.
 * @param part - information for the object
 * @return (Easy) - Easy object
 */
  public Easy setupEasy(String[] part) {
    int challenge = Integer.parseInt(part[CHALLENGECOL]);
    double score = Double.parseDouble(part[SCORECOL]);
    int coin = Integer.parseInt(part[COINCOL]);
    double time = Double.parseDouble(part[TIMECOL]);
    int lives = Integer.parseInt(part[LIVESCOL]);
    Easy easy = new Easy(easyCon, part[0], challenge, score, coin, time, lives);
    return easy;
  }

/**
 * Sets up an Heroic object with the values in part.
 * @param part - information for the object
 * @return (Heroic) - Heroic object
 */
  public Heroic setupHeroic(String[] part) {
    int challenge = Integer.parseInt(part[CHALLENGECOL]);
    double score = Double.parseDouble(part[SCORECOL]);
    int coin = Integer.parseInt(part[COINCOL]);
    double time = Double.parseDouble(part[TIMECOL]);
    int lives = Integer.parseInt(part[LIVESCOL]);
    Heroic heroic = new Heroic(heroicCon, part[0], challenge, score, coin, time, lives);
    return heroic;
  }

/**
 * Sets up an HardCore object with the values in part.
 * @param part - information for the object
 * @return (HardCore) - HardCore object
 */
  public HardCore setupHardCore(String[] part) {
    double score = Double.parseDouble(part[SCORECOL]);
    int coin = Integer.parseInt(part[COINCOL]);
    double time = Double.parseDouble(part[TIMECOL]);
    int lives = Integer.parseInt(part[LIVESCOL]);
    HardCore hardcore = new HardCore(hardcoreCon, part[0], score, coin, time, lives);
    return hardcore;
  }
}

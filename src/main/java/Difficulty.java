public abstract class Difficulty {
  private double difficultyConstant;
  private double baseScore;
  private int coinsFound;
  private double timeTaken;
  private int livesLost;
  private String playerID;

/**
 * Constructor.
 */
  public Difficulty() {
  }

/**
 * Calculates the Score.
 * @return (double) the score
 */
  public abstract double getLeaderBoardScore();

/**
 * Creates a String with the player ID and score.
 * @return (String) of the player ID and score
 */
  public abstract String toString();

/**
 * Sets the difficulty constant.
 * @param val - difficulty constant
 */
  public void setDifficultyConstant(double val) {
    difficultyConstant = val;
  }

/**
 * Gets the difficulty constant.
 * @return (double) - difficulty constant
 */
  public double getDifficultyConstant() {
    return difficultyConstant;
  }

/**
 * Sets the base score.
 * @param score - base score
 */
  public void setBaseScore(double score) {
    baseScore = score;
  }

/**
 * Gets the base score.
 * @return (double) - base score
 */
  public double getBaseScore() {
    return baseScore;
  }

/**
 * Sets the coins found.
 * @param coins - coins found
 */
  public void setCoinsFound(int coins) {
    coinsFound = coins;
  }

/**
 * Gets the coins found.
 * @return (int) - coins found
 */
  public int getCoinsFound() {
    return coinsFound;
  }

/**
 * Sets the time taken.
 * @param time - time taken
 */
  public void setTimeTaken(double time) {
    timeTaken = time;
  }

/**
 * Gets the time taken.
 * @return (double) - time taken
 */
  public double getTimeTaken() {
    return timeTaken;
  }

/**
 * Sets the lives lost.
 * @param lives - lives lost
 */
  public void setLivesLost(int lives) {
    livesLost = lives;
  }

/**
 * Gets the lives lost.
 * @return (int) - lives lost
 */
  public int getLivesLost() {
    return livesLost;
  }

/**
 * Sets the player id.
 * @param id - player id
 */
  public void setPlayerID(String id) {
    playerID = id;
  }

/**
 * Gets the player id.
 * @return (String) - player id
 */
  public String getPlayerID() {
    return playerID;
  }
}

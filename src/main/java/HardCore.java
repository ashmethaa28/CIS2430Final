public class HardCore extends Difficulty {

/**
 * Constructor.
 */
  public HardCore() {
  }

/**
 * Constructor.
 * @param constant - difficulty constant
 * @param id - player id
 * @param score - base score
 * @param coins - coins found
 * @param time - time taken
 * @param lives - lives lost
 */
  public HardCore(double constant, String id, double score, int coins, double time, int lives) {
    setDifficultyConstant(constant);
    setPlayerID(id);
    setBaseScore(score);
    setCoinsFound(coins);
    setTimeBeforeDeath(time);
    setLivesLost(lives);
  }

/**
 * Sets time before death.
 * @param gameMinutes - time before death
 */
  public void setTimeBeforeDeath(double gameMinutes) {
    setTimeTaken(gameMinutes);
  }

  @Override
  public double getLeaderBoardScore() {
    return (getBaseScore() + getCoinsFound()) - getTimeTaken() * getDifficultyConstant();
  }

  @Override
  public String toString() {
    if ((getLeaderBoardScore() - getLeaderBoardScore()) == 0) {
      return getPlayerID() + "," + (int) getLeaderBoardScore();
    } else {
      return getPlayerID() + "," + getLeaderBoardScore();
    }
  }
}

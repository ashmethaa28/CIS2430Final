public class Easy extends Difficulty implements Challenge {
  private int challenges;

/**
 * Constructor.
 */
  public Easy() {
  }

/**
 * Constructor.
 * @param constant - difficulty constant
 * @param id - player id
 * @param numChallenges - number of challeges completed
 * @param score - base score
 * @param coins - coins found
 * @param time - time taken
 * @param lives - lives lost
 */
  public Easy(double constant, String id, int numChallenges, double score, int coins, double time, int lives) {
    setDifficultyConstant(constant);
    setPlayerID(id);
    setNumChallengesComplete(numChallenges);
    setBaseScore(score);
    setCoinsFound(coins);
    setTimeTaken(time);
    setLivesLost(lives);
  }

  @Override
  public void setNumChallengesComplete(int numChallenges) {
    challenges = numChallenges;
  }

  @Override
  public int getNumChallengesComplete() {
    return challenges;
  }

  @Override
  public double getBonusScore() {
    return getNumChallengesComplete() * getDifficultyConstant();
  }

  @Override
  public double getLeaderBoardScore() {
    double baseCoin = getBaseScore() + getCoinsFound();
    double timeConstant = getTimeTaken() * getDifficultyConstant();
    return getBonusScore() + baseCoin - timeConstant - getLivesLost() * getDifficultyConstant();
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

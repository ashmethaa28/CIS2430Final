public interface Challenge {
/**
 * Sets the number of completed challenges.
 * @param numChallenges - number of completed challenges
 */
  void setNumChallengesComplete(int numChallenges);

/**
 * Gets the number of completed challenges.
 * @return (int) - number of completed challenges
 */
  int getNumChallengesComplete();

/**
 * Calculates the bonus core.
 * @return (double) the bonus score
 */
  double getBonusScore();
}

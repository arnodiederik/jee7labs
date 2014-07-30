package lab01.beans;

import javax.inject.Named;

@Named
public class GuessingBean {
	private int secretNumber = 7;
	private int guess;
	
	public String compareWithSecretNumber() {
		if (guess == secretNumber) {
			return "success";
		} else {
			return null;
		}
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}
	
}

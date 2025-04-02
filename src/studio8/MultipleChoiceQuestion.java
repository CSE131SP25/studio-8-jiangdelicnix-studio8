package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
		;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		int n = choices.length;
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". " + choices[i-1]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] choices = {"1", "2", "3", "4"};
		MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("How many sides does a rectangle have?", "4", 10, choices);
	}
}

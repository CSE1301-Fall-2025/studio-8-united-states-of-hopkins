package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println((i + 1) + ". " + choices[i]);
		}
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] choices = {"1","2","3","4"};
		Question q1 = new MultipleChoiceQuestion("What is 1 + 1? ", "2", 1, choices);
	}
}

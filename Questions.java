
public class Questions {
	
	String[] questions = 	{
							"Which company created Java?",
							"Which year was Java created?",
							"What was Java originally called?",
							"Who is credited with creating Java?"
							};

	String[][] options = 	{
							{"Sun Microsystems", "Starbucks", "Microsoft", "Alphabet"},
							{"1989","1996","1972","1492"},
							{"Apple","Latte","Oak","Koffing"},
							{"Steve Jobs","Bill Gates","James Gosling","Mark Zuckerberg"}
							};
	
	char[] answers =        {
							'A',
							'B',
							'C',
							'C'
							};	
	
	public Questions() {
	}
	
	public String[] getQuestions() {
		return this.questions;
	}
	public String[][] getOptions() {
		return this.options;
	}
	public char[] getAnswers() {
		return this.answers;
	}
}

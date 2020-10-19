import acm.program.ConsoleProgram;

public class DoubleLetter extends ConsoleProgram {
	
	public void run(){
		while(true) {
			println(removeDoubledLetters(readLine("Enter a word with double letters:")));	
		}
	}
	
	private String removeDoubledLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 || ch != str.charAt(i - 1)) {
			result += ch;
			}
		}
		return result;
	}
}

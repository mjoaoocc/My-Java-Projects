public class frontBack{
	public static void main(String[] args) {
	
	String word = "Maria Joao";

	if(args.length > 0){
		word = args[0];
	}

	char  firstChar = word.charAt(0);
	char lastChar = word.charAt(word.length()-1);
	String newWord = lastChar + word.substring(1, word.length()-1) + firstChar;

		System.out.println(newWord);
}
}


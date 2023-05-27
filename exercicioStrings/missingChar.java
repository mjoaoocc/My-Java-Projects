class missingChar{
public static void main(String[] args) {

  String word = "Robocop";
  int characterIndex = 3;
 
  if(args.length >= 2){
    word = args[0];
    characterIndex = Integer.parseInt(args[1]);
  }

  StringBuilder  newWord = new StringBuilder(word);
	  newWord.deleteCharAt(characterIndex);

  System.out.println(newWord);
  }
}


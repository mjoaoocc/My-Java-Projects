public class String4{
	public static void main(String [] args){

		String str = "http://www.academiadecodigo.org";

		String domain = ""; //www.academiadecodigo.org
		String name = ""; //< Academia de Codigo_ >
				  
		String[] message = str.split("//");
		domain = message[1];

		String[] message2 = str.split(".");
		name = message2[1];

		


		System.out.println("I am a Code Cadet at " + name + ", " + domain);
	}

}

// I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org
//
// I want to print this message using the strings above

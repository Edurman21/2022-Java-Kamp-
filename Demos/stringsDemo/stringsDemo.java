
public class stringsDemo {

	
	public static void main(String[] args) {
		
		String message = "Have a nice day";
		System.out.println(message);
		

		String newMessage = (message.replace(' ', '-'));
		System.out.println(newMessage);
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,4));

		for(String word: message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}
}

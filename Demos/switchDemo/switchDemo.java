
public class switchDemo {

	
	public static void main(String[] args) {
	
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("passed");
				break;
			case 'B':
				System.out.println("passed");
				break;	
			case 'C':
				System.out.println("passed");
				break;	
			case 'D':
				System.out.println("passed");
				break;	
			case 'F':
				System.out.println("failed");
				break;	
			default:
				System.out.println("Invalid");
		}
	}
}


public class arraysDemo {

	
	public static void main(String[] args) {
		
		String [] students = new String[4];
		students[0] = "Emre";
		students[1] = "Eren";
		students[2] = "Aysel";
		students[3] = "Durman";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student:students) {
			System.out.println(student);

		}
	}
}

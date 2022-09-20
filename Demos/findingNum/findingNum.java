
public class findingNum {
	
	
	public static void main(String[] args) {
	
		int [] arr = {1,2,5,7,9,0};
		int num = 5;
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("found at index "+ i);
			}
		}
		
	}
}

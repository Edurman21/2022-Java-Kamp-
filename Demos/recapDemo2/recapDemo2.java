
public class recapDemo2 {

	
	public static void main(String[] args) {
		
		double [] list = {1.2, 1.3, 4.3, 5.6};
		double total = 0;
		
		double max = list[0];
		
		for(double num: list) {
			if(max < num) {
				max = num;
			}
			total += num;
			System.out.println(num);
		}
		System.out.println("total "+total);
		System.out.println("max "+max);

	}
}

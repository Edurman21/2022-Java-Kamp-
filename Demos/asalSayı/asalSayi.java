
public class asalSayi {

	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		if(count > 0) {
			System.out.println("Asal değil");
		}else {
			System.out.println("Asal");
		}
		
	}

}


public class cokBoyutluDizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] cities = new String[3][3];
		
		cities[0][0] = "İzmir";
		cities[0][1] = "İstanbul";
		cities[0][2] = "Muğla";
		cities[1][0] = "Adana";
		cities[1][1] = "Bolu";
		cities[1][2] = "Bursa";
		cities[2][0] = "Elazığ";
		cities[2][1] = "Kayseri";
		cities[2][2] = "Mersin";
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("-----------------");
			for(int j = 0; j <=2; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}
	
}

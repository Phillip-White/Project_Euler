package euler3;

public class Main {

	public static void main(String[] args) {
		double factor = 600851475143.0;
		while(factor != 1){
			for(int i = 2; i <= factor; i++) {
				if(factor%i == 0) {
					if(factor/i == 1) {
						System.out.print(factor);
					}
					factor /= i;
				}
			}
		}
	}

}

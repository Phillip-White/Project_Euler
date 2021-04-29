package euler2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Integer> fib = new ArrayList<Integer>();
		int temp;
		int fib1 = 1;
		int fib2 = 2;
		fib.add(fib1);
		fib.add(fib2);
		while(fib1 + fib2 < 4000000) {
			temp = fib1 + fib2;
			fib.add(temp);
			fib1 = fib2;
			fib2 = temp;
		}
		int sum = 0;
		for(int i = 1; i < fib.size(); i++) {
			if(fib.get(i)%2 == 0) {
				sum += fib.get(i);
			}
		}
		System.out.print(sum);
	}

}

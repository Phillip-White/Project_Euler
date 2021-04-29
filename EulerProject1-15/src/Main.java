import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Which problem would you like to answer?");
		int question = scan.nextInt();
		Main quest = new Main();
		switch(question){
		case 1:
			quest.EulerCode1();
			break;
		case 2:
			quest.EulerCode2();
			break;
		case 3:
			quest.EulerCode3();
			break;
/*		case 4:
			quest.EulerCode4();
			break;
		case 5:
			quest.EulerCode5();
			break;
		case 6:
			quest.EulerCode6();
			break;
		case 7:
			quest.EulerCode7();
			break;
		case 8:
			quest.EulerCode8();
			break;
		case 9:
			quest.EulerCode9();
			break;
		case 10:
			quest.EulerCode10();
			break;
		case 11:
			quest.EulerCode11();
			break;
		case 12:
			quest.EulerCode12();
			break;
		case 13:
			quest.EulerCode13();
			break;
		case 14:
			quest.EulerCode14();
			break;
		case 15:
			quest.EulerCode15();
			break;*/
		}
	}



	public void EulerCode1() {
		int sum = 0;
		for(int i = 1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);	
	}
	
	public void EulerCode2() {
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
	
	public void EulerCode3() {
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

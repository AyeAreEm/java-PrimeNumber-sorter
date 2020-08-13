import java.util.Scanner;

public class PrimeSorter {
	
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		
		if (num == 2 || num == 3) {
			return true;
		}
		
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		
		for (int i = 3; i < Math.sqrt(num); i += 2) {
			if (num % i == 0 || num % Math.sqrt(num) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Low: ");
		String low = input.nextLine();
		
		System.out.print("High: ");
		String high = input.nextLine();
		
		System.out.println("Prime numbers between " + low + " and " + high + " are: ");
		Thread.sleep(1000);
		
		for (int i = Integer.parseInt(low); i <= Integer.parseInt(high); i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}

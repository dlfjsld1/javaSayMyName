package say.it;
import java.util.Scanner;

public class SayWhoiAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 이름은: ");
		String name = scanner.nextLine();
		
		System.out.print("당신의 나이는: ");
		int age = scanner.nextInt();
		
		System.out.println("당신은 " + name + "이며,");
		System.out.println("나이는 " + age + "세다.");
		
		scanner.close();
	}

}

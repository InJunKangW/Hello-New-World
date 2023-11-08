import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 10 && number > 1) {
			
			int[] result = Gugudan.calculate(number);
			Gugudan.print(result);
}
	
    else{ 	
    		System.out.println("구구단을 출력할 수 없습니다.");
    	}
}
}
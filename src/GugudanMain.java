import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		System.out.println("곱하고 싶은 숫자를 고르세요 (2 이상, 9 이하.)");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 100 && number > 1) {
			
			System.out.println("그 수에 곱할 숫자를 고르세요(1, 2, 3 ... n까지 곱한 모든 숫자가 표시됩니다.)");
			int[] result = Gugudan.calculate(number);
			Gugudan.print(result);
			
}
	
    else{ 	
    		System.out.println("잘못된 숫자를 입력했습니다.");
    	}
}
}
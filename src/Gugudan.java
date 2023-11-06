 import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		
		/*int result = 4;
		System.out.println(result * 2);
		int resulT = result * 2;
		System.out.println(resulT * 2);*/
		
		System.out.println("계산할 값은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "에 곱하고 싶은 숫자는? ");
        Scanner asdf = new Scanner(System.in);
        int qwer = asdf.nextInt();
        
        System.out.println(number * qwer);

        int result = number * 1;                
        System.out.println("* 1 :" + number * 1 );
        System.out.println("* 2 :" + number * 2 );
        System.out.println("* 3 :" + number * 3 );
        System.out.println("* 4 :" + number * 4 );
        System.out.println("* 5 :" + number * 5 );
        System.out.println("* 6 :" + number * 6 );
        System.out.println("* 7 :" + number * 7 );
        System.out.println("* 8 :" + number * 8 );
        System.out.println("* 9 :" + number * 9 );
        // 구구단 출력하는 예제 구현      
        
        int value = 1;
        while (value < 10) {
        	System.out.println(6 * value);
        	value = value + 1;
        }
        for(int Value = 1; Value < 10; Value++) {
        System.out.println(7 * Value);
        }
	}
}


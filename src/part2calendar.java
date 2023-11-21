import java.util.Scanner;
public class part2calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;
		//a = scanner.nextInt();
		//b = scanner.nextInt();
		String s1, s2;
		s1 = scanner.next(); //next만 적으면 String 형식으로 저장. (한 단어만)
		s2 = scanner.next();
		//nextLine으로 적으면 문장/한 라인 전체를 입력받음. 단 그럴 경우 int 값으로 바꾸기 위해서는 string을 나눠놔야 하는 듯
		
		a = Integer.parseInt(s1);
		// s1을 int 값으로 변경하고 a에 저장
		
		b = Integer.parseInt(s2);
		// s2를 int 값으로 변경하고 b에 저장.
		System.out.println("a + b의 값은?");
		
		System.out.println("두 수의 합은 " + a+b + "입니다.");
		// 이 경우 a, b 도 문자열처럼 그냥 이어쓰기로 표현.
		
		System.out.println("두 수의 합은 " + (a+b) + "입니다.");
		// 이렇게 a, b를 괄호로 묶어야 숫자 더하기로 처리.
		
		System.out.printf("두 수의 합은 %d입니다%n", a+b);
		// %n을 해줘야 줄바꿈이 된다.
		System.out.printf("%d와 %d의 %s은 %d입니다",a, b, "합", a+b);
		//%d는 정수값을 받는단거고, %s는 문자값을 받는단 의미. 형식 다르면 오류 발생.
		
		scanner.close();
		//scanner를 닫아주는 습관을 가지랜다.
		
		
		
	}
}
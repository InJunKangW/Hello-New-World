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
		a = Integer.parseInt(s1); // s1을 int 값으로 변경하고 a에 저장
		b = Integer.parseInt(s2); // s2를 int 값으로 변경하고 b에 저장.
		System.out.println("a + b의 값은?");
		System.out.println(a+b +"입니다.");
		
	}
}
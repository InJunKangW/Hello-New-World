import java.util.Scanner;
public class PracticeMainPage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int errorCondition = scanner.nextInt();
		if(errorCondition < 10) {
			PracticeMain prac = new PracticeMain();
			//외부 클래스 매소드를 호출하기 위해서는 "호출할 매소드가 위치하는 클래스 이름" "새로운 변수" = new "호출할 매소드가 위치하는 클래스 이름" 을 거쳐야 함.
			prac.error();
			//이후 "새로운 변수"."호출할 매소드" 를 적으면 해당 매소드가 호출됨.
		}
		scanner.close();
		//22
}
}
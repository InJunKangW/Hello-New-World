import java.util.Scanner;
public class PracticeMain {
	void error(){
		System.out.println("오류가 발생했습니다. 페이지를 새로고침하세요.");
	}
	int[] number(){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] result = new int[number];
		for(int i=0; i<number; i++) {
			result[i] = i * i;
			System.out.println(result[i]);
		}
		scanner.close();
		return result;
	}
	
}
		
	
	



// 무슨 프로그램을 만들까... 

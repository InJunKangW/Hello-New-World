import java.util.Scanner;
public class calendar {
	public static void main(String[] args) {
		int chance = 3;
		System.out.println("최대 날짜를 알고 싶은 달을 지정해주세요." + chance + "번의 기회가 있습니다.");
		int[] maxDays= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean sim = true;
		while(sim) {
			
			Scanner scanner = new Scanner(System.in);
			int month = scanner.nextInt();
			if (month < 13) {
				System.out.println( month + "월은 " + maxDays[month - 1] + "일 까지 있습니다.");
				//배열의 처음 값은 1번째가 아니라, 0번째 값이므로 입력받은 month 값에서 1을 빼줘야 함.
				
				break;
			}
			
			else {
				chance --; 
				System.out.println("잘못된 숫자를 입력했습니다. 1부터 12까지의 숫자를 입력해주세요 " + (chance) + "번의 기회가 남았습니다" );	
				if (chance == 0) {
					System.out.println("잘못된 숫자를 3회 지정했습니다. 10분 뒤에 이용해주세요.");
					break;
				}
			}
			
			}
			
			
			
		}
		
}

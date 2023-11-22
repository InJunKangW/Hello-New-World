import java.util.Scanner;
public class calendar {
	public static void main(String[] args) {
		System.out.println("반복 횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int chance = scanner.nextInt();
		
		System.out.println("최대 날짜를 알고 싶은 달을 지정해주세요." + chance + "번 입력할 수 있습니다.");
		int[] maxDays= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month = new int[chance];
		boolean sim = true;
		
		while(sim) {
			for (int day = 0; day < (chance) ; day++) {
				month[day] = scanner.nextInt();
				int[] result = new int[11];
				result[month[day]] = maxDays[month[day] - 1];
				if(month[day] < 13) {
					result[month[day]] = maxDays[month[day] - 1];
				}
				else {
					day--;
					System.out.println("잘못된 숫자를 입력했습니다. 1부터 12까지의 숫자를 입력하세요.");		
				}
				System.out.println(month[day] + "월의 최대 날짜는" + result[month[day]] + "일 입니다.");
			}
			
			scanner.close();
			break;
		}		
		System.out.println( "감사합니다.");
			/*if (chance > 0) {
				System.out.println("최대 날짜를 알고 싶은 달을 지정해주세요." + chance + "번 입력할 수 있습니다.");
				chance --;
				//Scanner scanner = new Scanner(System.in);
				int month1 = scanner.nextInt();
				int month2 = scanner.nextInt();
				int month3 = scanner.nextInt();
					if (month1 < 13 && month2 < 13 && month3 < 13) {
						System.out.println( month1 + "월은 " + maxDays[month1 - 1] + "일 까지 있습니다.");
						System.out.println( month2 + "월은 " + maxDays[month2 - 1] + "일 까지 있습니다.");
						System.out.println( month3 + "월은 " + maxDays[month3 - 1] + "일 까지 있습니다.");
						//배열의 처음 값은 1번째가 아니라, 0번째 값이므로 입력받은 month 값에서 1을 빼줘야 함.
						continue;
				}
			}
				else {
					
					System.out.println("감사합니다.");
					break;
				}*/
		
		}
			
			/*else {
				chance --; 
				System.out.println("잘못된 숫자를 입력했습니다. 1부터 12까지의 숫자를 입력해주세요 " + (chance) + "번의 기회가 남았습니다" );	
				if (chance == 0) {
					System.out.println("잘못된 숫자를 3회 지정했습니다. 10분 뒤에 이용해주세요.");
					break;*/
			
		
			
		
	}
		


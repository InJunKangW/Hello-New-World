 import java.util.Scanner;
public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[0]; //일단은 배열의 길이를 0으로 지정.
		boolean thirty = true; //while 문을 무한반복하기 위함.
		while(thirty){			
			
			Scanner scanner = new Scanner(System.in);
			int second = scanner.nextInt();
			if(second < 30) {
				result = new int[second];
				// 4번 없이 여기서 새로 int[]result를 지정하면, 오류가 남.
				// 배열의 길이를 새로 지정하는 방법임.
				for(int i=0; i < second; i++){
					result[i] = times * (i+1); 
					}
				break;
				//scanner 값이 30 미만이면 스캐너 값을 입력받고 다시 조건을 따지는 것을 멈추고 while문을 탈출
			}
			else {
				System.out.println("잘못된 값을 지정했습니다. 30 미만의 숫자를 적어주세요.");
			}//break가 없으므로 이후 다시 while문의 처음으로 돌아가 실행함.
					}
		return result;
		/*if(second <30) {
			int[] result = new int[second];
		for(int i=0; i < second; i++){
		result[i] = times * (i+1);
		}
		return result;
		}
		else {
			System.out.println("잘못된 값을 지정했습니다. 30 미만의 숫자를 적어주세요.");
			
			int[] result = new int[0];
			return result;
			
		}
		*/
	}
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	
	}
	
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 10 && number > 1) {
			
			int[] result = calculate(number);
			print(result);
			
        	/*int[] result = new int[9];
    		for(int i=0; i < result.length; i++) {
               result[i] = number * (i + 1); // 앞 단계 실습을 참고해 반복문을 활용해 result 배열에 결과 값을 담고 출력
               System.out.println(result[i]);*/
      //  	}	
        
       // else{
        	
       // 		System.out.println("구구단을 출력할 수 없습니다.");
     //   	}
		
		
		
		
		/*int[] result = calculate(2);
		print(result);
		
		int[] times3 = calculate(3);
		print(times3);*/
		
		/*for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);*/
		}
//		System.out.println(result[4]);
		
		/*int result = 4;
		System.out.println(result * 2);
		int resulT = result * 2;
		System.out.println(result * 2);*/
		
		/*System.out.println("구구단 중 출력할 값은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 10 && number > 1) {
        	for(int back = 1; back < 10; back++) {
        		System.out.println(number * back);
        	}	
        }
        else{
        	
        		System.out.println("구구단을 출력할 수 없습니다.");
        	}
	
        */
        
        
        /*System.out.println(number + "에 곱하고 싶은 숫자는? ");
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
        System.out.println("* 9 :" + number * 9 );*/
        // 구구단 출력하는 예제 구현      
        
        /*int value = 1;
        while (value < 10) {
        	System.out.println(6 * value);
        	value = value + 1;
        }
        for(int Value = 1; Value < 10; Value++) {
        System.out.println(7 * Value);
        }*/
		/*Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
		
        if(number < 10 && number > 1) {
        	int[] result = new int[9];
    		for(int i=0; i < result.length; i++) {
               result[i] = number * (i + 1); // 앞 단계 실습을 참고해 반복문을 활용해 result 배열에 결과 값을 담고 출력
               System.out.println(result[i]);
        	}	
        }
        else{
        	
        		System.out.println("구구단을 출력할 수 없습니다.");
        	}
		
		}*/
		
	//}


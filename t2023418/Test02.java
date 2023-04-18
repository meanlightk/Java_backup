// 입력한 달의 계절 표시

package t2023418;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
	do {
					int month;          //월 저장
		do {
			System.out.println("몇 월입니까?: ");
			month = stdIn.nextInt();
		} while (month < 1 || month > 12);
		
		if(month >=3 && month <=5)
			System.out.println("봄입니다.");
		
		if(month >=6 && month <=8)
			System.out.println("여름입니다.");
		
		if(month >=9 && month <=11)
			System.out.println("가을입니다.");
		
		if(month == 12 || month == 1 || month ==2)
			System.out.println("여름입니다.");
		
		System.out.println("다시 하겠습니까? 1_Yes / 0_No: ");
		retry = stdIn.nextInt();
	} while(retry == 1); 

	}
}

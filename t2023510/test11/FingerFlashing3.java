package t2023510.test11;

// 3인 가위바위보
import java.util.Scanner;

import t2023508.test03.ComputerPlayer;
import t2023508.test03.HumanPlayer;

public class FingerFlashing3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();

		String[] hands = { "가위", "바위", "보" };
		int retry;		// 다시 한 번?

		do {
			// 컴퓨터의 손 생성
			int comp1 = cp1.nextHand();
			int comp2 = cp2.nextHand();

			// 사람의 손 생성(읽기)
			int user = hp.nextHand();

			// 양쪽 손 표시
			System.out.println(
					"컴퓨터1은 " + hands[comp1] + "이고, " + "컴퓨터2는 " + hands[comp2] + "이며, " + "당신은" + hands[user] + "입니다.");

			// 판정
			int r1 = (user - comp1 + 3) % 3;	// user대 cpm1
			int r2 = (user - comp2 + 3) % 3;	// user대 cpm2

			if (r1 == 2 && r2 == 2)				// user의 승리
				System.out.println("당신이 이겼습니다.");

			else if (r1 == 1 && r2 == 0)		// com1의 승리
				System.out.println("컴퓨터1이 이겼습니다.");

			else if (r1 == 1 && r2 == 1)		// com2의 승리
				System.out.println("컴퓨터2가 이겼습니다.");
			else if (r1 == 1 && r2 == 1)		// user와 com1의 승리		
				System.out.println("당신과 컴퓨터1이 이겼습니다.");

			else if (r1 == 2 && r2 == 0)		// user와 com2의 승리	
				System.out.println("당신과 컴퓨터2가 이겼습니다.");

			else if (r1 == 1 && r2 == 1)		// com1과 com1의 승리	
				System.out.println("컴퓨터1과 컴퓨터2의 승리입니다.");
			else								// 비김
				System.out.println("비겼습니다.");
			// 다시 한 번 할지 확인

			do {
				System.out.print("다시 한 번? ( 0) 아니오 (1)네:");

				retry = stdIn.nextInt();

			} while (retry != 0 && retry != 1);

		} while (retry == 1);
	}
}
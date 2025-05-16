package mission.View;

import java.util.Scanner;
import mission.Model.Member;

public class InputView {
    private static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        return scanner.nextLine();
    }

    private static String getNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호를 입력하세요.");
        return scanner.nextLine();
    }

    private static String getID(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호 뒤 네자리를 입력하세요");
        return scanner.nextLine();
    }
}

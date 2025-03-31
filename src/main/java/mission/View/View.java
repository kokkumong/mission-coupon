package mission.View;

import java.util.Scanner;



public class View {
    Scanner scanner = new Scanner(System.in);

    public void Menu(){
        System.out.println("쿠폰 적립 시스템입니다. 사용할 기능을 선택해주세요.");
        System.out.println("1) 회원 등록, 2) 쿠폰 검색, 3) 쿠폰 적립, 4) 쿠폰 사용 5) 프로그램 종료");
        int menuNum = scanner.nextInt();
    }

    public void showMessage(String message){
        System.out.println(message);
    }
    public void memberRegister(){
        System.out.print("회원정보가 등록되었습니다.");
    }

    public void notFound(){
        System.out.print("회원정보를 찾을 수 없습니다.");
    }

    public void searchNum(){
        System.out.println("전화번호 뒤 네자리를 입력해주세요.");
    }

    public void confirmMember(String name){
        System.out.println(name + "님이 맞으신가요?(Y/N)");
    }

    public void earnCoupon(){
        System.out.print("쿠폰이 적립되었습니다.");
    }
    public void useCoupon(){
        System.out.print("쿠폰이 사용되었습니다.");
    }
    public void notEnoughCoupon(){
        System.out.print("쿠폰이 부족합니다.");
    }
    public void nowCoupon(int count){
        System.out.print("현재 적립된 쿠폰 : " + count + "개");
    }

    public void registerMember(){
        System.out.println("회원 정보가 등록되었습니다.");
    }
}

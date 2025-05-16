package mission.Model;

import mission.View.InputView;

public class Member {
    //이름, 전화번호, 쿠폰 선언
    private String name;
    private String phoneNumber;
    private int coupons;

    public Member(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.coupons = 0;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getCoupons() {
        return coupons;
    }

    public void addCoupon(int count){
        if(count <= 0){
            throw new IllegalArgumentException("[ERROR] 적립할 쿠폰은 1개 이상이어야 합니다.");
        }
        this.coupons += count;
    }

    public void useCoupon(int count){
        if (count <= 0) {
            throw new IllegalArgumentException("[ERROR] 사용할 쿠폰 수는 1개 이상이어야 합니다.");
        }
        if (this.coupons < count * 10) {
            throw new IllegalStateException("[ERROR] 사용 가능한 쿠폰이 부족합니다.");
        }
        this.coupons -= count * 10;
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("^010-\\d{4}-\\d{4}$")) {
            throw new IllegalArgumentException("[ERROR] 전화번호 입력 양식에 맞지 않습니다. (예: 010-1234-5678)");
        }
    }

    public String getPhoneSuffix() {
        return phoneNumber.substring(phoneNumber.length() - 4);
    }
}

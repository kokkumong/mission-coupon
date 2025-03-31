package mission.Model;

public class Member {
    //이름, 전화번호, 쿠폰 선언
    private String name;
    private String phoneNumber;
    private int coupon;

    public Member(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.coupon = 0;
    }

    public String getName(){return name;}
    public String getPhoneNumber(){return phoneNumber;}
    public int getCoupon(){return coupon;}

    public void addCoupon(int count){
        this.coupon += count;
    }

    public void useCoupon(int count){
        if(this.coupon >= count) {
            this.coupon -= count;
        }
        else{
            System.out.println("쿠폰이 부족합니다.");
        }
    }
}

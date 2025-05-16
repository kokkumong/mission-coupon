package mission.Controller;

public class CouponController {
    private mission.View.InputView CouponView;
    private mission.View.InputView InputView;
    private MemberController memberController;

    public CouponController(MemberController memberController, mission.View.InputView couponView, mission.View.InputView inputView){
        this.memberController = memberController;
        this.CouponView = couponView;
        this.InputView = inputView;
    }
}

package mission.Controller;

import mission.Model.Member;
import mission.View.View;
import java.util.List;

public class CouponController {
    private View CouponView;
    private View InputView;
    private MemberController memberController;

    public CouponController(MemberController memberController, View couponView, View inputView){
        this.memberController = memberController;
        this.CouponView = couponView;
        this.InputView = inputView;
    }
}

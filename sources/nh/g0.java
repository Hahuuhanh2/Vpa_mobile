package nh;

import android.content.Intent;
import com.vpa.daugia.module.home.data.model.Action;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.ui.MainActivity;
import j7.a;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21658b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f21657a = i10;
        this.f21658b = obj;
    }

    public final void run() {
        switch (this.f21657a) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) this.f21658b;
                j.f(homeFragment, "this$0");
                Intent intent = new Intent(homeFragment.d0(), PaymentActivity.class);
                intent.putExtra("DATA_CART", homeFragment.f19682p0);
                homeFragment.h0(intent);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f21658b;
                j.f(profileActivity, "this$0");
                Intent intent2 = new Intent(profileActivity, MainActivity.class);
                intent2.setFlags(335544320);
                profileActivity.startActivity(intent2);
                profileActivity.finish();
                return;
            default:
                MainActivity mainActivity = (MainActivity) this.f21658b;
                int i10 = MainActivity.Z;
                j.f(mainActivity, "this$0");
                a.d(mainActivity, new Action(mainActivity.getIntent().getStringExtra("click_action"), mainActivity.getIntent().getStringExtra("value")), false);
                return;
        }
    }
}

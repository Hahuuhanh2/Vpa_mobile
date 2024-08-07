package gi;

import android.content.Intent;
import android.os.Bundle;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.data.model.LastNotification;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import com.vpa.daugia.ui.MainActivity;
import com.vpa.daugia.ui.WelcomeActivity;
import com.vpa.daugia.ui.splash.SplashActivity;
import lg.b;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f20350b;

    public /* synthetic */ b0(BaseActivity baseActivity, int i10) {
        this.f20349a = i10;
        this.f20350b = baseActivity;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        switch (this.f20349a) {
            case 0:
                OrganizationProfileActivity organizationProfileActivity = (OrganizationProfileActivity) this.f20350b;
                j.f(organizationProfileActivity, "this$0");
                organizationProfileActivity.finish();
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f20350b;
                j.f(profileActivity, "this$0");
                profileActivity.finish();
                return;
            case 2:
                ListAwaitAuctionActivity listAwaitAuctionActivity = (ListAwaitAuctionActivity) this.f20350b;
                j.f(listAwaitAuctionActivity, "this$0");
                Intent intent = new Intent(listAwaitAuctionActivity, PaymentActivity.class);
                intent.putExtra("DATA_CART", listAwaitAuctionActivity.U);
                listAwaitAuctionActivity.startActivity(intent);
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f20350b;
                int i10 = SplashActivity.T;
                j.f(splashActivity, "this$0");
                b bVar = splashActivity.S;
                if (bVar == null) {
                    j.l("sharedPrefsHelper");
                    throw null;
                } else if (!bVar.f20850a.getBoolean("PREF_KEY_FIRST", false)) {
                    splashActivity.startActivity(new Intent(splashActivity, WelcomeActivity.class));
                    splashActivity.finish();
                    return;
                } else {
                    Bundle extras = splashActivity.getIntent().getExtras();
                    if (extras != null) {
                        str = extras.getString("topic");
                    } else {
                        str = null;
                    }
                    Bundle extras2 = splashActivity.getIntent().getExtras();
                    if (extras2 != null) {
                        str2 = extras2.getString("value");
                    } else {
                        str2 = null;
                    }
                    Bundle extras3 = splashActivity.getIntent().getExtras();
                    if (extras3 != null) {
                        str3 = extras3.getString("title");
                    } else {
                        str3 = null;
                    }
                    Bundle extras4 = splashActivity.getIntent().getExtras();
                    if (extras4 != null) {
                        str4 = extras4.getString("body");
                    } else {
                        str4 = null;
                    }
                    LastNotification lastNotification = new LastNotification(str, str2, str3, str4);
                    b bVar2 = splashActivity.S;
                    if (bVar2 != null) {
                        bVar2.j(lastNotification, "LAST_NOTIFICATION");
                        splashActivity.startActivity(new Intent(splashActivity, MainActivity.class));
                        return;
                    }
                    j.l("sharedPrefsHelper");
                    throw null;
                }
        }
    }
}

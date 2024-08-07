package nh;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21643a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21644b;

    public /* synthetic */ b0(HomeFragment homeFragment, int i10) {
        this.f21643a = i10;
        this.f21644b = homeFragment;
    }

    public final void onClick(View view) {
        switch (this.f21643a) {
            case 0:
                HomeFragment homeFragment = this.f21644b;
                int i10 = HomeFragment.f19678z0;
                j.f(homeFragment, "this$0");
                homeFragment.f19687u0.a(new Intent(homeFragment.d0(), NotificationManagerActivity.class));
                return;
            default:
                HomeFragment homeFragment2 = this.f21644b;
                int i11 = HomeFragment.f19678z0;
                j.f(homeFragment2, "this$0");
                Intent intent = new Intent(homeFragment2.d0(), AnnouncementListActivity.class);
                intent.putExtra("AUTO_SEARCH", true);
                homeFragment2.h0(intent);
                return;
        }
    }
}

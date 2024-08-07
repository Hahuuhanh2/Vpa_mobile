package nh;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.home.ui.HomeFragment;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21636b;

    public /* synthetic */ a0(HomeFragment homeFragment, int i10) {
        this.f21635a = i10;
        this.f21636b = homeFragment;
    }

    public final void onClick(View view) {
        switch (this.f21635a) {
            case 0:
                HomeFragment homeFragment = this.f21636b;
                int i10 = HomeFragment.f19678z0;
                j.f(homeFragment, "this$0");
                Intent intent = new Intent(homeFragment.d0(), AnnouncementListActivity.class);
                intent.putExtra("title", "Danh sách biển số");
                homeFragment.h0(intent);
                return;
            default:
                HomeFragment homeFragment2 = this.f21636b;
                int i11 = HomeFragment.f19678z0;
                j.f(homeFragment2, "this$0");
                homeFragment2.h0(new Intent(homeFragment2.d0(), CartManagerActivity.class));
                return;
        }
    }
}

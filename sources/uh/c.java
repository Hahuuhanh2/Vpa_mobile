package uh;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuFragment f23060b;

    public /* synthetic */ c(MenuFragment menuFragment, int i10) {
        this.f23059a = i10;
        this.f23060b = menuFragment;
    }

    public final void onClick(View view) {
        switch (this.f23059a) {
            case 0:
                MenuFragment menuFragment = this.f23060b;
                int i10 = MenuFragment.f19755o0;
                j.f(menuFragment, "this$0");
                menuFragment.h0(new Intent(menuFragment.d0(), SettingActivity.class));
                return;
            default:
                MenuFragment menuFragment2 = this.f23060b;
                int i11 = MenuFragment.f19755o0;
                j.f(menuFragment2, "this$0");
                User e10 = menuFragment2.m0().e();
                boolean z10 = false;
                if (e10 != null) {
                    Integer accountType = e10.getAccountType();
                    int value = AccountType.PERSON.getValue();
                    if (accountType != null && accountType.intValue() == value) {
                        z10 = true;
                    }
                }
                if (z10) {
                    menuFragment2.h0(new Intent(menuFragment2.d0(), ProfileActivity.class));
                    return;
                } else {
                    menuFragment2.h0(new Intent(menuFragment2.d0(), OrganizationProfileActivity.class));
                    return;
                }
        }
    }
}

package uh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuFragment f23058b;

    public /* synthetic */ b(MenuFragment menuFragment, int i10) {
        this.f23057a = i10;
        this.f23058b = menuFragment;
    }

    public final void onClick(View view) {
        switch (this.f23057a) {
            case 0:
                MenuFragment menuFragment = this.f23058b;
                int i10 = MenuFragment.f19755o0;
                j.f(menuFragment, "this$0");
                Intent intent = new Intent(menuFragment.d0(), ChangePasswordActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("KEY_FLOW", "CHANGE_PASSWORD");
                intent.putExtras(bundle);
                menuFragment.h0(intent);
                return;
            default:
                MenuFragment menuFragment2 = this.f23058b;
                int i11 = MenuFragment.f19755o0;
                j.f(menuFragment2, "this$0");
                menuFragment2.h0(new Intent(menuFragment2.d0(), MyDocumentActivity.class));
                return;
        }
    }
}

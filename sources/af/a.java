package af;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.snackbar.Snackbar;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import kf.e;
import mg.x0;
import pi.b;
import sk.j;
import sk.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f181b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f182c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f180a = i10;
        this.f181b = obj;
        this.f182c = obj2;
    }

    public final void onClick(View view) {
        switch (this.f180a) {
            case 0:
                rk.a aVar = (rk.a) this.f181b;
                Snackbar snackbar = (Snackbar) this.f182c;
                j.f(aVar, "$cancelFun");
                j.f(snackbar, "$snackbar");
                aVar.invoke();
                snackbar.b(3);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f181b;
                q qVar = (q) this.f182c;
                int i10 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                j.f(qVar, "$isShowInfo");
                LinearLayout linearLayout = ((x0) profileActivity.M()).f21432d0;
                j.e(linearLayout, "lnInfo");
                e.j(linearLayout);
                if (qVar.f22930a) {
                    ((x0) profileActivity.M()).C.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_file_minus, 0, (int) C0531R$drawable.ic_direction_down, 0);
                } else {
                    ((x0) profileActivity.M()).C.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_file_minus, 0, (int) C0531R$drawable.ic_direction_up, 0);
                }
                qVar.f22930a = !qVar.f22930a;
                return;
            default:
                b bVar = (b) this.f181b;
                gf.b bVar2 = (gf.b) this.f182c;
                j.f(bVar, "this$0");
                j.f(bVar2, "$model");
                bVar.f22657p.invoke(bVar2);
                return;
        }
    }
}

package zg;

import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import n1.e;
import sk.j;
import w1.q;
import w1.w0;
import x5.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements q, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23615a;

    public /* synthetic */ a0(int i10) {
        this.f23615a = i10;
    }

    public final w0 g(View view, w0 w0Var) {
        switch (this.f23615a) {
            case 0:
                String str = RegisterAccountActivity.T;
                j.f(view, "v");
                e a10 = w0Var.a(7);
                j.e(a10, "getInsets(...)");
                view.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            case 1:
                int i10 = CartManagerActivity.W;
                j.f(view, "v");
                e a11 = w0Var.a(7);
                j.e(a11, "getInsets(...)");
                view.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
            case 2:
                int i11 = MyDocumentActivity.V;
                j.f(view, "v");
                e a12 = w0Var.a(7);
                j.e(a12, "getInsets(...)");
                view.setPadding(a12.f13427a, a12.f13428b, a12.f13429c, a12.f13430d);
                return w0Var;
            case 4:
                int i12 = AnnouncementListActivity.Z;
                j.f(view, "v");
                e a13 = w0Var.a(7);
                j.e(a13, "getInsets(...)");
                view.setPadding(a13.f13427a, a13.f13428b, a13.f13429c, a13.f13430d);
                return w0Var;
            default:
                int i13 = InstructVerifyActivity.P;
                j.f(view, "v");
                e a14 = w0Var.a(7);
                j.e(a14, "getInsets(...)");
                view.setPadding(a14.f13427a, a14.f13428b, a14.f13429c, a14.f13430d);
                return w0Var;
        }
    }
}

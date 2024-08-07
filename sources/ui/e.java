package ui;

import android.view.View;
import com.ots.core.utils.customview.textview.AppTextView;
import ek.i;
import mg.u6;
import rk.l;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: FAQAdapter.kt */
public final class e extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u6 f23074a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23075b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u6 f23076c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(u6 u6Var, q qVar, u6 u6Var2) {
        super(1);
        this.f23074a = u6Var;
        this.f23075b = qVar;
        this.f23076c = u6Var2;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        AppTextView appTextView = this.f23074a.f21388y;
        j.e(appTextView, "tvAnswer");
        kf.e.j(appTextView);
        if (this.f23075b.f22930a) {
            this.f23076c.f21387x.setRotation(0.0f);
        } else {
            this.f23076c.f21387x.setRotation(180.0f);
        }
        q qVar = this.f23075b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}

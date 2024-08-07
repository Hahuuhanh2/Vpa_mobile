package ui;

import android.view.View;
import com.ots.core.utils.customview.textview.AppTextView;
import ek.i;
import kf.e;
import mg.u6;
import rk.l;
import sk.j;
import sk.k;
import sk.q;

/* compiled from: FAQAdapter.kt */
public final class f extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u6 f23077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f23078b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u6 f23079c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(u6 u6Var, q qVar, u6 u6Var2) {
        super(1);
        this.f23077a = u6Var;
        this.f23078b = qVar;
        this.f23079c = u6Var2;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        AppTextView appTextView = this.f23077a.f21388y;
        j.e(appTextView, "tvAnswer");
        e.j(appTextView);
        if (this.f23078b.f22930a) {
            this.f23079c.f21387x.setRotation(0.0f);
        } else {
            this.f23079c.f21387x.setRotation(180.0f);
        }
        q qVar = this.f23078b;
        qVar.f22930a = !qVar.f22930a;
        return i.f20112a;
    }
}

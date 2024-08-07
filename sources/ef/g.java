package ef;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ots.core.R$layout;
import d2.e;
import d2.f;
import d2.l;
import kf.h;
import lf.g;
import sk.j;
import sk.k;

/* compiled from: BaseFragment.kt */
public abstract class g<DB extends l> extends Fragment implements lf.g {

    /* renamed from: e0  reason: collision with root package name */
    public DB f9458e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ek.g f9459f0 = j7.a.b0(a.f9461a);

    /* renamed from: g0  reason: collision with root package name */
    public final ek.g f9460g0 = j7.a.b0(new b(this));

    /* compiled from: BaseFragment.kt */
    public static final class a extends k implements rk.a<kf.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9461a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new kf.a();
        }
    }

    /* compiled from: BaseFragment.kt */
    public static final class b extends k implements rk.a<Dialog> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g<DB> f9462a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g<DB> gVar) {
            super(0);
            this.f9462a = gVar;
        }

        public final Object invoke() {
            Context d02 = this.f9462a.d0();
            try {
                Dialog dialog = new Dialog(d02);
                dialog.setContentView(LayoutInflater.from(d02).inflate(R$layout.widget_progress_dialog, (ViewGroup) null));
                dialog.setCancelable(false);
                Window window = dialog.getWindow();
                if (window == null) {
                    return dialog;
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                return dialog;
            } catch (Exception e10) {
                h.a(e10);
                return new Dialog(d02);
            }
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        DB c10 = f.c(layoutInflater, j0(), viewGroup, false, (e) null);
        j.e(c10, "inflate(...)");
        this.f9458e0 = c10;
        super.L(layoutInflater, viewGroup, bundle);
        View view = i0().f8554e;
        j.e(view, "getRoot(...)");
        return view;
    }

    public final DB i0() {
        DB db2 = this.f9458e0;
        if (db2 != null) {
            return db2;
        }
        j.l("binding");
        throw null;
    }

    public abstract int j0();

    public final Dialog k0() {
        return (Dialog) this.f9460g0.getValue();
    }

    public final boolean p(Runnable runnable, long j10) {
        lf.g.f12998l.getClass();
        return g.a.f13000b.postAtTime(runnable, this, j10);
    }
}

package ee;

import android.os.SystemClock;
import android.view.View;
import com.luck.picture.lib.widget.TitleBar;

/* compiled from: PictureSelectorFragment */
public final class h extends TitleBar.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9393a;

    public h(c cVar) {
        this.f9393a = cVar;
    }

    public final void a() {
        if (this.f9393a.B0.isShowing()) {
            this.f9393a.B0.dismiss();
        } else {
            this.f9393a.C0();
        }
    }

    public final void b(View view) {
        this.f9393a.B0.showAsDropDown(view);
    }

    public final void c() {
        c cVar = this.f9393a;
        String str = c.C0;
        if (cVar.f11878i0.K) {
            long uptimeMillis = SystemClock.uptimeMillis();
            c cVar2 = this.f9393a;
            if (uptimeMillis - cVar2.f9377u0 >= ((long) 500) || cVar2.A0.c() <= 0) {
                this.f9393a.f9377u0 = SystemClock.uptimeMillis();
                return;
            }
            this.f9393a.f9371o0.k0(0);
        }
    }
}

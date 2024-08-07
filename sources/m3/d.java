package m3;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import r2.l;

/* compiled from: FragmentStateAdapter */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f13113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f13114b;

    public d(Handler handler, c cVar) {
        this.f13113a = handler;
        this.f13114b = cVar;
    }

    public final void q(l lVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            this.f13113a.removeCallbacks(this.f13114b);
            lVar.B().c(this);
        }
    }
}

package w6;

import com.google.android.gms.internal.base.zau;
import w6.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class x implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16672a;

    public x(d dVar) {
        this.f16672a = dVar;
    }

    public final void a(boolean z10) {
        zau zau = this.f16672a.f16582n;
        zau.sendMessage(zau.obtainMessage(1, Boolean.valueOf(z10)));
    }
}

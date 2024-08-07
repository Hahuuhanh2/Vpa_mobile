package c0;

import al.g0;
import android.view.Surface;
import c0.d1;
import i0.c;
import i0.f;
import java.util.concurrent.CancellationException;
import v8.a;
import z0.b;

/* compiled from: SurfaceRequest */
public final class c1 implements c<Surface> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4200a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f4201b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4202c;

    public c1(a aVar, b.a aVar2, String str) {
        this.f4200a = aVar;
        this.f4201b = aVar2;
        this.f4202c = str;
    }

    public final void a(Throwable th2) {
        if (th2 instanceof CancellationException) {
            g0.E((String) null, this.f4201b.b(new d1.b(android.support.v4.media.a.o(new StringBuilder(), this.f4202c, " cancelled."), th2)));
        } else {
            this.f4201b.a(null);
        }
    }

    public final void onSuccess(Object obj) {
        Surface surface = (Surface) obj;
        f.e(true, this.f4200a, this.f4201b, j7.a.x());
    }
}

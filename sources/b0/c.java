package b0;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.r;
import h0.g;
import java.util.concurrent.Executor;
import u.a;
import v.k;
import v.o;
import z0.b;

/* compiled from: Camera2CameraControl */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3862a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3863b = false;

    /* renamed from: c  reason: collision with root package name */
    public final o f3864c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f3865d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3866e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public a.C0199a f3867f = new a.C0199a();

    /* renamed from: g  reason: collision with root package name */
    public b.a<Void> f3868g;

    /* renamed from: h  reason: collision with root package name */
    public final b f3869h = new b(this);

    public c(o oVar, g gVar) {
        this.f3864c = oVar;
        this.f3865d = gVar;
    }

    public final a a() {
        a aVar;
        synchronized (this.f3866e) {
            b.a<Void> aVar2 = this.f3868g;
            if (aVar2 != null) {
                this.f3867f.f15025a.O(a.L, Integer.valueOf(aVar2.hashCode()));
            }
            a.C0199a aVar3 = this.f3867f;
            aVar3.getClass();
            aVar = new a(r.K(aVar3.f15025a));
        }
        return aVar;
    }

    public final void b(b.a<Void> aVar) {
        this.f3863b = true;
        b.a<Void> aVar2 = this.f3868g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f3868g = aVar;
        if (this.f3862a) {
            o oVar = this.f3864c;
            oVar.f15757c.execute(new k(oVar, 1));
            this.f3863b = false;
        }
        if (aVar2 != null) {
            aVar2.b(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}

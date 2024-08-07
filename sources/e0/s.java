package e0;

import al.g0;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.d;
import c0.v0;
import f0.d0;
import f0.k;
import f0.u0;
import j0.b;
import java.util.concurrent.Executor;
import p0.f;

/* compiled from: NoMetadataImageReader */
public final class s implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f9036a;

    /* renamed from: b  reason: collision with root package name */
    public w f9037b;

    public s(d0 d0Var) {
        this.f9036a = d0Var;
    }

    public final v0 a(d dVar) {
        boolean z10;
        if (dVar == null) {
            return null;
        }
        if (this.f9037b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Pending request should not be null", z10);
        w wVar = this.f9037b;
        Pair pair = new Pair(wVar.f9056f, wVar.f9057g.get(0));
        u0 u0Var = u0.f9604b;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        u0 u0Var2 = new u0(arrayMap);
        this.f9037b = null;
        return new v0(dVar, new Size(dVar.c(), dVar.b()), new b(new f((k) null, u0Var2, dVar.f0().c())));
    }

    public final int b() {
        return this.f9036a.b();
    }

    public final int c() {
        return this.f9036a.c();
    }

    public final void close() {
        this.f9036a.close();
    }

    public final d d() {
        return a(this.f9036a.d());
    }

    public final int e() {
        return this.f9036a.e();
    }

    public final void f() {
        this.f9036a.f();
    }

    public final void g(d0.a aVar, Executor executor) {
        this.f9036a.g(new r(this, aVar), executor);
    }

    public final Surface getSurface() {
        return this.f9036a.getSurface();
    }

    public final int h() {
        return this.f9036a.h();
    }

    public final d i() {
        return a(this.f9036a.i());
    }
}

package p0;

import android.hardware.camera2.CaptureResult;
import android.support.v4.media.a;
import f0.h;
import f0.i;
import f0.j;
import f0.k;
import f0.u0;
import g0.g;

/* compiled from: VirtualCameraCaptureResult */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final k f13898a;

    /* renamed from: b  reason: collision with root package name */
    public final u0 f13899b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13900c;

    public f(k kVar, u0 u0Var, long j10) {
        this.f13898a = kVar;
        this.f13899b = u0Var;
        this.f13900c = j10;
    }

    public final u0 a() {
        return this.f13899b;
    }

    public final /* synthetic */ void b(g.a aVar) {
        a.b(this, aVar);
    }

    public final long c() {
        k kVar = this.f13898a;
        if (kVar != null) {
            return kVar.c();
        }
        long j10 = this.f13900c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public final j d() {
        k kVar = this.f13898a;
        if (kVar != null) {
            return kVar.d();
        }
        return j.UNKNOWN;
    }

    public final int e() {
        k kVar = this.f13898a;
        if (kVar != null) {
            return kVar.e();
        }
        return 1;
    }

    public final h f() {
        k kVar = this.f13898a;
        if (kVar != null) {
            return kVar.f();
        }
        return h.UNKNOWN;
    }

    public final CaptureResult g() {
        return a.a();
    }

    public final i h() {
        k kVar = this.f13898a;
        if (kVar != null) {
            return kVar.h();
        }
        return i.UNKNOWN;
    }
}

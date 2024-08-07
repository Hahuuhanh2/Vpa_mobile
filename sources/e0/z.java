package e0;

import c0.k0;
import f0.u0;
import g0.g;

/* compiled from: RgbaImageProxy */
public final class z implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9071b;

    public z(long j10, int i10) {
        this.f9070a = j10;
        this.f9071b = i10;
    }

    public final u0 a() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    public final void b(g.a aVar) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }

    public final long c() {
        return this.f9070a;
    }

    public final int d() {
        return this.f9071b;
    }
}

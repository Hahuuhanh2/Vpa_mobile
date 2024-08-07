package f0;

import android.util.Size;

/* compiled from: SurfaceConfig */
public abstract class s0 {

    /* compiled from: SurfaceConfig */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f9593a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f9593a = i10;
        }
    }

    public static d a(int i10, a aVar) {
        return new d(i10, aVar, 0);
    }

    public static d e(int i10, int i11, Size size, e eVar) {
        int i12;
        if (i11 == 35) {
            i12 = 2;
        } else if (i11 == 256) {
            i12 = 3;
        } else if (i11 == 32) {
            i12 = 4;
        } else {
            i12 = 1;
        }
        a aVar = a.NOT_SUPPORT;
        Size size2 = m0.a.f13036a;
        int height = size.getHeight() * size.getWidth();
        if (i10 == 1) {
            if (height <= m0.a.a(eVar.f9525b.get(Integer.valueOf(i11)))) {
                aVar = a.s720p;
            } else if (height <= m0.a.a(eVar.f9527d.get(Integer.valueOf(i11)))) {
                aVar = a.s1440p;
            }
        } else if (height <= m0.a.a(eVar.f9524a)) {
            aVar = a.VGA;
        } else if (height <= m0.a.a(eVar.f9526c)) {
            aVar = a.PREVIEW;
        } else if (height <= m0.a.a(eVar.f9528e)) {
            aVar = a.RECORD;
        } else if (height <= m0.a.a(eVar.b().get(Integer.valueOf(i11)))) {
            aVar = a.MAXIMUM;
        } else {
            Size size3 = eVar.f9530g.get(Integer.valueOf(i11));
            if (size3 != null) {
                if (height <= size3.getHeight() * size3.getWidth()) {
                    aVar = a.ULTRA_MAXIMUM;
                }
            }
        }
        return a(i12, aVar);
    }

    public abstract a b();

    public abstract int c();

    public abstract long d();
}

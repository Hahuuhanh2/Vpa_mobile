package l4;

import g4.b;
import m4.c;
import v.v;

/* compiled from: DocumentDataParser */
public final class g implements c0<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12661a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f12662b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public final Object b(c cVar, float f10) {
        cVar.h();
        int i10 = 3;
        String str = null;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z10 = true;
        while (cVar.v()) {
            switch (cVar.N(f12662b)) {
                case 0:
                    str = cVar.E();
                    break;
                case 1:
                    str2 = cVar.E();
                    break;
                case 2:
                    f11 = (float) cVar.z();
                    break;
                case 3:
                    int B = cVar.B();
                    if (B <= 2 && B >= 0) {
                        i10 = v.k(3)[B];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                case 4:
                    i11 = cVar.B();
                    break;
                case 5:
                    f12 = (float) cVar.z();
                    break;
                case 6:
                    f13 = (float) cVar.z();
                    break;
                case 7:
                    i12 = m.a(cVar);
                    break;
                case 8:
                    i13 = m.a(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.z();
                    break;
                case 10:
                    z10 = cVar.x();
                    break;
                default:
                    cVar.R();
                    cVar.S();
                    break;
            }
        }
        c cVar2 = cVar;
        cVar.q();
        return new b(str, str2, f11, i10, i11, f12, f13, i12, i13, f14, z10);
    }
}

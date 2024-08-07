package nd;

import p3.l0;
import rl.a;
import rl.b;
import rl.d;
import rl.f;

/* compiled from: CurrentParsingState */
public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public int f13574a;

    /* renamed from: b  reason: collision with root package name */
    public int f13575b;

    public /* synthetic */ k() {
        this.f13574a = 0;
        this.f13575b = 1;
    }

    public d i(d dVar) {
        int i10;
        int i11;
        int k10 = dVar.k(a.DAY_OF_WEEK);
        int i12 = this.f13574a;
        if (i12 < 2 && k10 == this.f13575b) {
            return dVar;
        }
        if ((i12 & 1) == 0) {
            int i13 = k10 - this.f13575b;
            if (i13 >= 0) {
                i11 = 7 - i13;
            } else {
                i11 = -i13;
            }
            return dVar.j((long) i11, b.DAYS);
        }
        int i14 = this.f13575b - k10;
        if (i14 >= 0) {
            i10 = 7 - i14;
        } else {
            i10 = -i14;
        }
        return dVar.p((long) i10, b.DAYS);
    }

    public /* synthetic */ k(int i10, nl.b bVar) {
        l0.y0(bVar, "dayOfWeek");
        this.f13574a = i10;
        this.f13575b = bVar.s();
    }
}

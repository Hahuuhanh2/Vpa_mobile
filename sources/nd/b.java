package nd;

import cd.a;

/* compiled from: AI01320xDecoder */
public final class b extends f {
    public b(a aVar) {
        super(aVar);
    }

    public final void d(int i10, StringBuilder sb2) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    public final int e(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}

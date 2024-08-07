package j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.f  reason: case insensitive filesystem */
final class C0352f implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private final C0353g[] f18145a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18146b;

    C0352f(ArrayList arrayList, boolean z10) {
        this((C0353g[]) arrayList.toArray(new C0353g[arrayList.size()]), z10);
    }

    C0352f(C0353g[] gVarArr, boolean z10) {
        this.f18145a = gVarArr;
        this.f18146b = z10;
    }

    public final C0352f a() {
        return !this.f18146b ? this : new C0352f(this.f18145a, false);
    }

    public final boolean m(A a10, StringBuilder sb2) {
        int length = sb2.length();
        if (this.f18146b) {
            a10.g();
        }
        try {
            for (C0353g m10 : this.f18145a) {
                if (!m10.m(a10, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (this.f18146b) {
                a10.a();
            }
            return true;
        } finally {
            if (this.f18146b) {
                a10.a();
            }
        }
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        if (this.f18146b) {
            xVar.r();
            int i11 = i10;
            for (C0353g n10 : this.f18145a) {
                i11 = n10.n(xVar, charSequence, i11);
                if (i11 < 0) {
                    xVar.f(false);
                    return i10;
                }
            }
            xVar.f(true);
            return i11;
        }
        for (C0353g n11 : this.f18145a) {
            i10 = n11.n(xVar, charSequence, i10);
            if (i10 < 0) {
                break;
            }
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f18145a != null) {
            sb2.append(this.f18146b ? "[" : "(");
            for (C0353g append : this.f18145a) {
                sb2.append(append);
            }
            sb2.append(this.f18146b ? "]" : ")");
        }
        return sb2.toString();
    }
}

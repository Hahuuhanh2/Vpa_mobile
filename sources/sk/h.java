package sk;

import n0.l;
import wk.a;
import wk.c;

/* compiled from: FunctionReference */
public class h extends b implements g, c {

    /* renamed from: n  reason: collision with root package name */
    public final int f22926n;

    /* renamed from: o  reason: collision with root package name */
    public final int f22927o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L_0x0007
            r7 = r1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r7 = r0
        L_0x0009:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f22926n = r9
            int r9 = r14 >> 1
            r8.f22927o = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.h.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final a a() {
        s.f22932a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!this.f22919d.equals(hVar.f22919d) || !this.f22920e.equals(hVar.f22920e) || this.f22927o != hVar.f22927o || this.f22926n != hVar.f22926n || !j.a(this.f22917b, hVar.f22917b) || !j.a(b(), hVar.b())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof c)) {
            return false;
        } else {
            a aVar = this.f22916a;
            if (aVar == null) {
                a();
                this.f22916a = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int getArity() {
        return this.f22926n;
    }

    public final int hashCode() {
        int i10;
        if (b() == null) {
            i10 = 0;
        } else {
            i10 = b().hashCode() * 31;
        }
        return this.f22920e.hashCode() + l.f(this.f22919d, i10, 31);
    }

    public final String toString() {
        a aVar = this.f22916a;
        if (aVar == null) {
            a();
            this.f22916a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        if ("<init>".equals(this.f22919d)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return android.support.v4.media.a.o(android.support.v4.media.a.q("function "), this.f22919d, " (Kotlin reflection is not available)");
    }
}

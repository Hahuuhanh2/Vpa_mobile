package n3;

import androidx.window.core.WindowStrictModeException;
import kotlin.NoWhenBranchMatchedException;
import rk.l;
import sk.j;
import v.v;

/* compiled from: SpecificationComputer.kt */
public final class b<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13481a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13482b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13483c;

    /* renamed from: d  reason: collision with root package name */
    public final c f13484d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13485e;

    /* renamed from: f  reason: collision with root package name */
    public final WindowStrictModeException f13486f;

    /* JADX WARNING: type inference failed for: r6v0, types: [int, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(T r2, java.lang.String r3, java.lang.String r4, n3.c r5, java.lang.Object r6) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            sk.j.f(r2, r0)
            java.lang.String r0 = "tag"
            sk.j.f(r3, r0)
            java.lang.String r0 = "logger"
            sk.j.f(r5, r0)
            java.lang.String r0 = "verificationMode"
            n0.l.o(r6, r0)
            r1.<init>()
            r1.f13481a = r2
            r1.f13482b = r3
            r1.f13483c = r4
            r1.f13484d = r5
            r1.f13485e = r6
            androidx.window.core.WindowStrictModeException r3 = new androidx.window.core.WindowStrictModeException
            java.lang.String r2 = n3.d.b(r2, r4)
            r3.<init>(r2)
            java.lang.StackTraceElement[] r2 = r3.getStackTrace()
            java.lang.String r4 = "stackTrace"
            sk.j.e(r2, r4)
            int r4 = r2.length
            int r4 = r4 + -2
            r5 = 0
            if (r4 >= 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            java.util.List r2 = fk.h.w0(r4, r2)
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r5]
            java.lang.Object[] r2 = r2.toArray(r4)
            if (r2 == 0) goto L_0x004e
            java.lang.StackTraceElement[] r2 = (java.lang.StackTraceElement[]) r2
            r3.setStackTrace(r2)
            r1.f13486f = r3
            return
        L_0x004e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.b.<init>(java.lang.Object, java.lang.String, java.lang.String, n3.c, int):void");
    }

    public final T a() {
        int g2 = v.g(this.f13485e);
        if (g2 == 0) {
            throw this.f13486f;
        } else if (g2 == 1) {
            this.f13484d.a(this.f13482b, d.b(this.f13481a, this.f13483c));
            return null;
        } else if (g2 == 2) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final d<T> c(String str, l<? super T, Boolean> lVar) {
        j.f(lVar, "condition");
        return this;
    }
}

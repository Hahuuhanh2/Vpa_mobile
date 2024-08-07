package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter */
public final class k0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public StringBuilder f2660a = new StringBuilder(128);

    public final void close() {
        d();
    }

    public final void d() {
        if (this.f2660a.length() > 0) {
            this.f2660a.toString();
            StringBuilder sb2 = this.f2660a;
            sb2.delete(0, sb2.length());
        }
    }

    public final void flush() {
        d();
    }

    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                d();
            } else {
                this.f2660a.append(c10);
            }
        }
    }
}

package ll;

import java.io.OutputStream;
import sk.j;

/* compiled from: Buffer.kt */
public final class g extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f20881a;

    public g(f fVar) {
        this.f20881a = fVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f20881a + ".outputStream()";
    }

    public final void write(int i10) {
        this.f20881a.g0(i10);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        j.f(bArr, "data");
        this.f20881a.write(bArr, i10, i11);
    }
}

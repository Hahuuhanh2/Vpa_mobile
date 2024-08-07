package o5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: ExceptionPassthroughInputStream */
public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayDeque f13737c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f13738a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f13739b;

    static {
        char[] cArr = l.f13754a;
    }

    public final int available() {
        return this.f13738a.available();
    }

    public final void close() {
        this.f13738a.close();
    }

    public final void mark(int i10) {
        this.f13738a.mark(i10);
    }

    public final boolean markSupported() {
        return this.f13738a.markSupported();
    }

    public final int read() {
        try {
            return this.f13738a.read();
        } catch (IOException e10) {
            this.f13739b = e10;
            throw e10;
        }
    }

    public final synchronized void reset() {
        this.f13738a.reset();
    }

    public final long skip(long j10) {
        try {
            return this.f13738a.skip(j10);
        } catch (IOException e10) {
            this.f13739b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f13738a.read(bArr);
        } catch (IOException e10) {
            this.f13739b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f13738a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f13739b = e10;
            throw e10;
        }
    }
}

package o5;

import java.io.FilterInputStream;

/* compiled from: MarkEnforcingInputStream */
public final class j extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f13750a = Integer.MIN_VALUE;

    public j(d dVar) {
        super(dVar);
    }

    public final int available() {
        int i10 = this.f13750a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final long d(long j10) {
        int i10 = this.f13750a;
        if (i10 == 0) {
            return -1;
        }
        if (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) {
            return j10;
        }
        return (long) i10;
    }

    public final void h(long j10) {
        int i10 = this.f13750a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f13750a = (int) (((long) i10) - j10);
        }
    }

    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f13750a = i10;
    }

    public final int read() {
        if (d(1) == -1) {
            return -1;
        }
        int read = super.read();
        h(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f13750a = Integer.MIN_VALUE;
    }

    public final long skip(long j10) {
        long d10 = d(j10);
        if (d10 == -1) {
            return 0;
        }
        long skip = super.skip(d10);
        h(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        int d10 = (int) d((long) i11);
        if (d10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, d10);
        h((long) read);
        return read;
    }
}

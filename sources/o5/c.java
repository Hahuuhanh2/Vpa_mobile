package o5;

import android.support.v4.media.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream */
public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f13735a;

    /* renamed from: b  reason: collision with root package name */
    public int f13736b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f13735a = j10;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f13735a - ((long) this.f13736b), (long) this.in.available());
    }

    public final void d(int i10) {
        if (i10 >= 0) {
            this.f13736b += i10;
        } else if (this.f13735a - ((long) this.f13736b) > 0) {
            StringBuilder q10 = a.q("Failed to read all expected data, expected: ");
            q10.append(this.f13735a);
            q10.append(", but read: ");
            q10.append(this.f13736b);
            throw new IOException(q10.toString());
        }
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        d(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        d(read);
        return read;
    }
}

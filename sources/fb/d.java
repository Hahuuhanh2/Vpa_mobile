package fb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: ByteStreams */
public final class d {
    public static byte[] a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(a aVar) {
        int i10;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = aVar.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return a(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j10 = (long) min;
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            long j11 = j10 * ((long) i10);
            if (j11 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j11 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j11;
            }
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams */
    public static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        public long f10123a = 1048577;

        /* renamed from: b  reason: collision with root package name */
        public long f10124b = -1;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int available() {
            return (int) Math.min((long) this.in.available(), this.f10123a);
        }

        public final synchronized void mark(int i10) {
            this.in.mark(i10);
            this.f10124b = this.f10123a;
        }

        public final int read() {
            if (this.f10123a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f10123a--;
            }
            return read;
        }

        public final synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f10124b != -1) {
                this.in.reset();
                this.f10123a = this.f10124b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j10) {
            long skip = this.in.skip(Math.min(j10, this.f10123a));
            this.f10123a -= skip;
            return skip;
        }

        public final int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f10123a;
            if (j10 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j10));
            if (read != -1) {
                this.f10123a -= (long) read;
            }
            return read;
        }
    }
}

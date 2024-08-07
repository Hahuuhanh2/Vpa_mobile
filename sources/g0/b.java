package g0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: ByteOrderedDataOutputStream */
public final class b extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f10220a;

    /* renamed from: b  reason: collision with root package name */
    public ByteOrder f10221b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f10220a = outputStream;
        this.f10221b = byteOrder;
    }

    public final void d(int i10) {
        ByteOrder byteOrder = this.f10221b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f10220a.write((i10 >>> 0) & 255);
            this.f10220a.write((i10 >>> 8) & 255);
            this.f10220a.write((i10 >>> 16) & 255);
            this.f10220a.write((i10 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f10220a.write((i10 >>> 24) & 255);
            this.f10220a.write((i10 >>> 16) & 255);
            this.f10220a.write((i10 >>> 8) & 255);
            this.f10220a.write((i10 >>> 0) & 255);
        }
    }

    public final void h(short s10) {
        ByteOrder byteOrder = this.f10221b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f10220a.write((s10 >>> 0) & 255);
            this.f10220a.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f10220a.write((s10 >>> 8) & 255);
            this.f10220a.write((s10 >>> 0) & 255);
        }
    }

    public final void write(byte[] bArr) {
        this.f10220a.write(bArr);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        this.f10220a.write(bArr, i10, i11);
    }
}

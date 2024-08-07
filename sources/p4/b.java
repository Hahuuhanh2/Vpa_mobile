package p4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f14067a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f14068b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f14069c;

    /* renamed from: d  reason: collision with root package name */
    public int f14070d;

    /* renamed from: e  reason: collision with root package name */
    public int f14071e;

    /* compiled from: StrictLineReader */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        public final String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, b.this.f14068b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f14073a)) {
            this.f14067a = fileInputStream;
            this.f14068b = charset;
            this.f14069c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.f14067a) {
            if (this.f14069c != null) {
                this.f14069c = null;
                this.f14067a.close();
            }
        }
    }

    public final String d() {
        int i10;
        synchronized (this.f14067a) {
            byte[] bArr = this.f14069c;
            if (bArr != null) {
                if (this.f14070d >= this.f14071e) {
                    int read = this.f14067a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f14070d = 0;
                        this.f14071e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f14070d; i11 != this.f14071e; i11++) {
                    byte[] bArr2 = this.f14069c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f14070d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f14068b.name());
                                this.f14070d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f14068b.name());
                        this.f14070d = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f14071e - this.f14070d) + 80);
                while (true) {
                    byte[] bArr3 = this.f14069c;
                    int i13 = this.f14070d;
                    aVar.write(bArr3, i13, this.f14071e - i13);
                    this.f14071e = -1;
                    InputStream inputStream = this.f14067a;
                    byte[] bArr4 = this.f14069c;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f14070d = 0;
                        this.f14071e = read2;
                        int i14 = 0;
                        while (true) {
                            if (i14 != this.f14071e) {
                                byte[] bArr5 = this.f14069c;
                                if (bArr5[i14] == 10) {
                                    int i15 = this.f14070d;
                                    if (i14 != i15) {
                                        aVar.write(bArr5, i15, i14 - i15);
                                    }
                                    this.f14070d = i14 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i14++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }
}

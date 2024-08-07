package j9;

import androidx.fragment.app.o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.i0;
import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import v.v;

/* compiled from: ByteString */
public abstract class c implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final f f11735b = new f(p.f7416b);

    /* renamed from: c  reason: collision with root package name */
    public static final d f11736c;

    /* renamed from: a  reason: collision with root package name */
    public int f11737a = 0;

    /* compiled from: ByteString */
    public static abstract class a implements Iterator, j$.util.Iterator {
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Object next() {
            b bVar = (b) this;
            int i10 = bVar.f11729a;
            if (i10 < bVar.f11730b) {
                bVar.f11729a = i10 + 1;
                return Byte.valueOf(bVar.f11731c.n(i10));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    public static final class b implements d {
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* renamed from: j9.c$c  reason: collision with other inner class name */
    /* compiled from: ByteString */
    public static final class C0129c extends f {

        /* renamed from: e  reason: collision with root package name */
        public final int f11738e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11739f;

        public C0129c(byte[] bArr, int i10, int i11) {
            super(bArr);
            c.i(i10, i10 + i11, bArr.length);
            this.f11738e = i10;
            this.f11739f = i11;
        }

        public final byte g(int i10) {
            int i11 = this.f11739f;
            if (((i11 - (i10 + 1)) | i10) >= 0) {
                return this.f11740d[this.f11738e + i10];
            }
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.m("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(b0.p("Index > length: ", i10, ", ", i11));
        }

        public final void m(byte[] bArr, int i10) {
            System.arraycopy(this.f11740d, this.f11738e + 0, bArr, 0, i10);
        }

        public final byte n(int i10) {
            return this.f11740d[this.f11738e + i10];
        }

        public final int size() {
            return this.f11739f;
        }

        public final int v() {
            return this.f11738e;
        }
    }

    /* compiled from: ByteString */
    public interface d {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString */
    public static abstract class e extends c {
        public final java.util.Iterator iterator() {
            return new b(this);
        }
    }

    /* compiled from: ByteString */
    public static class f extends e {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f11740d;

        public f(byte[] bArr) {
            bArr.getClass();
            this.f11740d = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c) || size() != ((c) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i10 = this.f11737a;
            int i11 = fVar.f11737a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= fVar.size()) {
                byte[] bArr = this.f11740d;
                byte[] bArr2 = fVar.f11740d;
                int v2 = v() + size;
                int v10 = v();
                int v11 = fVar.v() + 0;
                while (v10 < v2) {
                    if (bArr[v10] != bArr2[v11]) {
                        return false;
                    }
                    v10++;
                    v11++;
                }
                return true;
            } else {
                StringBuilder u10 = b0.u("Ran off end of other: ", 0, ", ", size, ", ");
                u10.append(fVar.size());
                throw new IllegalArgumentException(u10.toString());
            }
        }

        public byte g(int i10) {
            return this.f11740d[i10];
        }

        public void m(byte[] bArr, int i10) {
            System.arraycopy(this.f11740d, 0, bArr, 0, i10);
        }

        public byte n(int i10) {
            return this.f11740d[i10];
        }

        public final boolean o() {
            int v2 = v();
            return i0.e(this.f11740d, v2, size() + v2);
        }

        public final f.a p() {
            byte[] bArr = this.f11740d;
            int v2 = v();
            int size = size();
            f.a aVar = new f.a(bArr, v2, size, true);
            try {
                aVar.g(size);
                return aVar;
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        public final int q(int i10, int i11) {
            byte[] bArr = this.f11740d;
            int v2 = v() + 0;
            Charset charset = p.f7415a;
            for (int i12 = v2; i12 < v2 + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        public final f r(int i10) {
            int i11 = c.i(0, i10, size());
            if (i11 == 0) {
                return c.f11735b;
            }
            return new C0129c(this.f11740d, v() + 0, i11);
        }

        public int size() {
            return this.f11740d.length;
        }

        public final String t(Charset charset) {
            return new String(this.f11740d, v(), size(), charset);
        }

        public final void u(o oVar) {
            oVar.I(this.f11740d, v(), size());
        }

        public int v() {
            return 0;
        }
    }

    /* compiled from: ByteString */
    public static final class g implements d {
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        d dVar;
        if (a.a()) {
            dVar = new g();
        } else {
            dVar = new b();
        }
        f11736c = dVar;
    }

    public static int i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(v.d("Beginning index: ", i10, " < 0"));
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(b0.p("Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(b0.p("End index: ", i11, " >= ", i12));
        }
    }

    public static f l(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new f(f11736c.a(bArr, i10, i11));
    }

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int i10 = this.f11737a;
        if (i10 == 0) {
            int size = size();
            i10 = q(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11737a = i10;
        }
        return i10;
    }

    public java.util.Iterator iterator() {
        return new b(this);
    }

    public abstract void m(byte[] bArr, int i10);

    public abstract byte n(int i10);

    public abstract boolean o();

    public abstract f.a p();

    public abstract int q(int i10, int i11);

    public abstract f r(int i10);

    public final byte[] s() {
        int size = size();
        if (size == 0) {
            return p.f7416b;
        }
        byte[] bArr = new byte[size];
        m(bArr, size);
        return bArr;
    }

    public abstract int size();

    public abstract String t(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = m9.b.w(this);
        } else {
            str = m9.b.w(r(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract void u(o oVar);
}

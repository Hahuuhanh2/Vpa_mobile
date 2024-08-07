package j2;

import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.p;
import androidx.fragment.app.o;
import f0.b0;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v.v;

/* compiled from: ByteString */
public abstract class c implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final e f11484b = new e(p.f2319b);

    /* renamed from: c  reason: collision with root package name */
    public static final C0127c f11485c;

    /* renamed from: a  reason: collision with root package name */
    public int f11486a = 0;

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
            int i10 = bVar.f11481a;
            if (i10 < bVar.f11482b) {
                bVar.f11481a = i10 + 1;
                return Byte.valueOf(bVar.f11483c.m(i10));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    public static final class b implements C0127c {
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* renamed from: j2.c$c  reason: collision with other inner class name */
    /* compiled from: ByteString */
    public interface C0127c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* compiled from: ByteString */
    public static abstract class d extends c {
        public final java.util.Iterator iterator() {
            return new b(this);
        }
    }

    /* compiled from: ByteString */
    public static class e extends d {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f11487d;

        public e(byte[] bArr) {
            bArr.getClass();
            this.f11487d = bArr;
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
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i10 = this.f11486a;
            int i11 = eVar.f11486a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= eVar.size()) {
                byte[] bArr = this.f11487d;
                byte[] bArr2 = eVar.f11487d;
                int r10 = r() + size;
                int r11 = r();
                int r12 = eVar.r() + 0;
                while (r11 < r10) {
                    if (bArr[r11] != bArr2[r12]) {
                        return false;
                    }
                    r11++;
                    r12++;
                }
                return true;
            } else {
                StringBuilder u10 = b0.u("Ran off end of other: ", 0, ", ", size, ", ");
                u10.append(eVar.size());
                throw new IllegalArgumentException(u10.toString());
            }
        }

        public byte g(int i10) {
            return this.f11487d[i10];
        }

        public byte m(int i10) {
            return this.f11487d[i10];
        }

        public final boolean n() {
            int r10 = r();
            if (l0.f2303a.c(this.f11487d, r10, size() + r10) == 0) {
                return true;
            }
            return false;
        }

        public final int o(int i10, int i11) {
            byte[] bArr = this.f11487d;
            int r10 = r() + 0;
            Charset charset = p.f2318a;
            for (int i12 = r10; i12 < r10 + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        public final String p(Charset charset) {
            return new String(this.f11487d, r(), size(), charset);
        }

        public final void q(o oVar) {
            oVar.I(this.f11487d, r(), size());
        }

        public int r() {
            return 0;
        }

        public int size() {
            return this.f11487d.length;
        }
    }

    /* compiled from: ByteString */
    public static final class f implements C0127c {
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        C0127c cVar;
        if (a.a()) {
            cVar = new f();
        } else {
            cVar = new b();
        }
        f11485c = cVar;
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

    public static e l(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new e(f11485c.a(bArr, i10, i11));
    }

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int i10 = this.f11486a;
        if (i10 == 0) {
            int size = size();
            i10 = o(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11486a = i10;
        }
        return i10;
    }

    public java.util.Iterator iterator() {
        return new b(this);
    }

    public abstract byte m(int i10);

    public abstract boolean n();

    public abstract int o(int i10, int i11);

    public abstract String p(Charset charset);

    public abstract void q(o oVar);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}

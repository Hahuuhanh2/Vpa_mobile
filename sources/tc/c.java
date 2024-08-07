package tc;

import androidx.fragment.app.o;
import com.google.protobuf.e0;
import com.google.protobuf.k;
import f0.b0;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import v.v;

/* compiled from: ByteString */
public abstract class c implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final e f14960b = new e(k.f7918b);

    /* renamed from: a  reason: collision with root package name */
    public int f14961a = 0;

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
            int i10 = bVar.f14949a;
            if (i10 < bVar.f14950b) {
                bVar.f14949a = i10 + 1;
                return Byte.valueOf(bVar.f14951c.l(i10));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString */
    public static final class b {
    }

    /* renamed from: tc.c$c  reason: collision with other inner class name */
    /* compiled from: ByteString */
    public static final class C0198c extends e {

        /* renamed from: d  reason: collision with root package name */
        public final int f14962d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14963e;

        public C0198c(byte[] bArr, int i10, int i11) {
            super(bArr);
            c.i(i10, i10 + i11, bArr.length);
            this.f14962d = i10;
            this.f14963e = i11;
        }

        public final byte g(int i10) {
            int i11 = this.f14963e;
            if (((i11 - (i10 + 1)) | i10) >= 0) {
                return this.f14964c[this.f14962d + i10];
            }
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.m("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(b0.p("Index > length: ", i10, ", ", i11));
        }

        public final byte l(int i10) {
            return this.f14964c[this.f14962d + i10];
        }

        public final int r() {
            return this.f14962d;
        }

        public final int size() {
            return this.f14963e;
        }
    }

    /* compiled from: ByteString */
    public static abstract class d extends c {
        public final java.util.Iterator iterator() {
            return new b(this);
        }
    }

    /* compiled from: ByteString */
    public static class e extends d {

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f14964c;

        public e(byte[] bArr) {
            bArr.getClass();
            this.f14964c = bArr;
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
            int i10 = this.f14961a;
            int i11 = eVar.f14961a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= eVar.size()) {
                byte[] bArr = this.f14964c;
                byte[] bArr2 = eVar.f14964c;
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
            return this.f14964c[i10];
        }

        public byte l(int i10) {
            return this.f14964c[i10];
        }

        public final boolean m() {
            int r10 = r();
            if (e0.f7900a.b(this.f14964c, r10, size() + r10) == 0) {
                return true;
            }
            return false;
        }

        public final int n(int i10, int i11) {
            byte[] bArr = this.f14964c;
            int r10 = r() + 0;
            Charset charset = k.f7917a;
            for (int i12 = r10; i12 < r10 + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        public final e o(int i10) {
            int i11 = c.i(0, i10, size());
            if (i11 == 0) {
                return c.f14960b;
            }
            return new C0198c(this.f14964c, r() + 0, i11);
        }

        public final String p(Charset charset) {
            return new String(this.f14964c, r(), size(), charset);
        }

        public final void q(o oVar) {
            oVar.I(this.f14964c, r(), size());
        }

        public int r() {
            return 0;
        }

        public int size() {
            return this.f14964c.length;
        }
    }

    /* compiled from: ByteString */
    public static final class f {
    }

    static {
        if (a.a()) {
            new f();
        } else {
            new b();
        }
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

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int i10 = this.f14961a;
        if (i10 == 0) {
            int size = size();
            i10 = n(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f14961a = i10;
        }
        return i10;
    }

    public java.util.Iterator iterator() {
        return new b(this);
    }

    public abstract byte l(int i10);

    public abstract boolean m();

    public abstract int n(int i10, int i11);

    public abstract e o(int i10);

    public abstract String p(Charset charset);

    public abstract void q(o oVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = j7.a.C(this);
        } else {
            str = j7.a.C(o(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}

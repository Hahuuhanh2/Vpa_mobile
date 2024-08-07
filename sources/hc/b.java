package hc;

import android.support.v4.media.a;
import f0.b0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter */
public class b implements Closeable, Flushable {

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f10726q = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f10727r = new String[128];

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f10728s;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f10729a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f10730b;

    /* renamed from: c  reason: collision with root package name */
    public int f10731c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f10732d;

    /* renamed from: e  reason: collision with root package name */
    public String f10733e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10734f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10735n;

    /* renamed from: o  reason: collision with root package name */
    public String f10736o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10737p;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f10727r[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f10727r;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f10728s = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f10730b = iArr;
        if (iArr.length == 0) {
            this.f10730b = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f10730b;
        int i10 = this.f10731c;
        this.f10731c = i10 + 1;
        iArr2[i10] = 6;
        this.f10733e = ":";
        this.f10737p = true;
        Objects.requireNonNull(writer, "out == null");
        this.f10729a = writer;
    }

    public b B() {
        if (this.f10736o != null) {
            if (this.f10737p) {
                a0();
            } else {
                this.f10736o = null;
                return this;
            }
        }
        d();
        this.f10729a.write("null");
        return this;
    }

    public final int E() {
        int i10 = this.f10731c;
        if (i10 != 0) {
            return this.f10730b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void K(String str) {
        String[] strArr;
        String str2;
        if (this.f10735n) {
            strArr = f10728s;
        } else {
            strArr = f10727r;
        }
        this.f10729a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f10729a.write(str, i10, i11 - i10);
            }
            this.f10729a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f10729a.write(str, i10, length - i10);
        }
        this.f10729a.write(34);
    }

    public void L(double d10) {
        a0();
        if (this.f10734f || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            d();
            this.f10729a.append(Double.toString(d10));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public void N(long j10) {
        a0();
        d();
        this.f10729a.write(Long.toString(j10));
    }

    public void R(Boolean bool) {
        String str;
        if (bool == null) {
            B();
            return;
        }
        a0();
        d();
        Writer writer = this.f10729a;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public void S(Number number) {
        boolean z10;
        if (number == null) {
            B();
            return;
        }
        a0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !f10726q.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f10734f) {
            throw new IllegalArgumentException(b0.r("Numeric values must be finite, but was ", obj));
        }
        d();
        this.f10729a.append(obj);
    }

    public void U(String str) {
        if (str == null) {
            B();
            return;
        }
        a0();
        d();
        K(str);
    }

    public void W(boolean z10) {
        String str;
        a0();
        d();
        Writer writer = this.f10729a;
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public final void a0() {
        if (this.f10736o != null) {
            int E = E();
            if (E == 5) {
                this.f10729a.write(44);
            } else if (E != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            z();
            this.f10730b[this.f10731c - 1] = 4;
            K(this.f10736o);
            this.f10736o = null;
        }
    }

    public void close() {
        this.f10729a.close();
        int i10 = this.f10731c;
        if (i10 > 1 || (i10 == 1 && this.f10730b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10731c = 0;
    }

    public final void d() {
        int E = E();
        if (E == 1) {
            this.f10730b[this.f10731c - 1] = 2;
            z();
        } else if (E == 2) {
            this.f10729a.append(',');
            z();
        } else if (E != 4) {
            if (E != 6) {
                if (E != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f10734f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f10730b[this.f10731c - 1] = 7;
        } else {
            this.f10729a.append(this.f10733e);
            this.f10730b[this.f10731c - 1] = 5;
        }
    }

    public void flush() {
        if (this.f10731c != 0) {
            this.f10729a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void h() {
        a0();
        d();
        int i10 = this.f10731c;
        int[] iArr = this.f10730b;
        if (i10 == iArr.length) {
            this.f10730b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f10730b;
        int i11 = this.f10731c;
        this.f10731c = i11 + 1;
        iArr2[i11] = 1;
        this.f10729a.write(91);
    }

    public void i() {
        a0();
        d();
        int i10 = this.f10731c;
        int[] iArr = this.f10730b;
        if (i10 == iArr.length) {
            this.f10730b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f10730b;
        int i11 = this.f10731c;
        this.f10731c = i11 + 1;
        iArr2[i11] = 3;
        this.f10729a.write(123);
    }

    public final void q(int i10, int i11, char c10) {
        int E = E();
        if (E != i11 && E != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f10736o == null) {
            this.f10731c--;
            if (E == i11) {
                z();
            }
            this.f10729a.write(c10);
        } else {
            StringBuilder q10 = a.q("Dangling name: ");
            q10.append(this.f10736o);
            throw new IllegalStateException(q10.toString());
        }
    }

    public void s() {
        q(1, 2, ']');
    }

    public void v() {
        q(3, 5, '}');
    }

    public void x(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f10736o != null) {
            throw new IllegalStateException();
        } else if (this.f10731c != 0) {
            this.f10736o = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void z() {
        if (this.f10732d != null) {
            this.f10729a.write(10);
            int i10 = this.f10731c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f10729a.write(this.f10732d);
            }
        }
    }
}

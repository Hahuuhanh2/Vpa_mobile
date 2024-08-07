package m4;

import f0.b0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import ll.f;
import ll.j;
import ll.s;

/* compiled from: JsonReader */
public abstract class c implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f13119e = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public int f13120a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f13121b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public String[] f13122c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    public int[] f13123d = new int[32];

    /* compiled from: JsonReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f13124a;

        /* renamed from: b  reason: collision with root package name */
        public final s f13125b;

        public a(String[] strArr, s sVar) {
            this.f13124a = strArr;
            this.f13125b = sVar;
        }

        public static a a(String... strArr) {
            String str;
            try {
                j[] jVarArr = new j[strArr.length];
                f fVar = new f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str2 = strArr[i10];
                    String[] strArr2 = c.f13119e;
                    fVar.g0(34);
                    int length = str2.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        char charAt = str2.charAt(i12);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                            fVar.v0(i11, i12, str2);
                        }
                        fVar.w0(str);
                        i11 = i12 + 1;
                    }
                    if (i11 < length) {
                        fVar.v0(i11, length, str2);
                    }
                    fVar.g0(34);
                    fVar.readByte();
                    jVarArr[i10] = fVar.N();
                }
                return new a((String[]) strArr.clone(), s.a.b(jVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f13119e[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f13119e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int B();

    public abstract String E();

    public abstract int K();

    public final void L(int i10) {
        int i11 = this.f13120a;
        int[] iArr = this.f13121b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f13121b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f13122c;
                this.f13122c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f13123d;
                this.f13123d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Nesting too deep at ");
                q10.append(s());
                throw new a(q10.toString());
            }
        }
        int[] iArr3 = this.f13121b;
        int i12 = this.f13120a;
        this.f13120a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int N(a aVar);

    public abstract void R();

    public abstract void S();

    public final void U(String str) {
        StringBuilder v2 = b0.v(str, " at path ");
        v2.append(s());
        throw new b(v2.toString());
    }

    public abstract void d();

    public abstract void h();

    public abstract void i();

    public abstract void q();

    public final String s() {
        int i10 = this.f13120a;
        int[] iArr = this.f13121b;
        String[] strArr = this.f13122c;
        int[] iArr2 = this.f13123d;
        StringBuilder p10 = android.support.v4.media.a.p('$');
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                p10.append('[');
                p10.append(iArr2[i11]);
                p10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                p10.append('.');
                String str = strArr[i11];
                if (str != null) {
                    p10.append(str);
                }
            }
        }
        return p10.toString();
    }

    public abstract boolean v();

    public abstract boolean x();

    public abstract double z();
}

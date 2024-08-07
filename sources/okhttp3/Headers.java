package okhttp3;

import al.g0;
import ek.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import okhttp3.internal.Util;
import sk.a;
import sk.j;
import yk.h;
import yk.l;

/* compiled from: Headers.kt */
public final class Headers implements Iterable<e<? extends String, ? extends String>> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22002b = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final String[] f22003a;

    /* compiled from: Headers.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f22004a = new ArrayList(20);

        public final void a(String str, String str2) {
            j.f(str, "name");
            j.f(str2, "value");
            Headers.f22002b.getClass();
            Companion.a(str);
            Companion.b(str2, str);
            c(str, str2);
        }

        public final void b(String str) {
            j.f(str, "line");
            int R0 = l.R0(str, ':', 1, false, 4);
            if (R0 != -1) {
                String substring = str.substring(0, R0);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(R0 + 1);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                j.e(substring3, "this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", str);
            }
        }

        public final void c(String str, String str2) {
            j.f(str, "name");
            j.f(str2, "value");
            this.f22004a.add(str);
            this.f22004a.add(l.k1(str2).toString());
        }

        public final Headers d() {
            return new Headers((String[]) this.f22004a.toArray(new String[0]));
        }

        public final void e(String str) {
            j.f(str, "name");
            int i10 = 0;
            while (i10 < this.f22004a.size()) {
                if (h.G0(str, (String) this.f22004a.get(i10))) {
                    this.f22004a.remove(i10);
                    this.f22004a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    /* compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static void a(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    char charAt = str.charAt(i10);
                    if ('!' > charAt || charAt >= 127) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        i10++;
                    } else {
                        throw new IllegalArgumentException(Util.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[LOOP:0: B:1:0x0006->B:20:0x0064, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0024 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void b(java.lang.String r6, java.lang.String r7) {
            /*
                int r0 = r6.length()
                r1 = 0
                r2 = r1
            L_0x0006:
                if (r2 >= r0) goto L_0x0067
                char r3 = r6.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L_0x0021
                r4 = 32
                if (r4 > r3) goto L_0x001b
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L_0x001b
                r4 = r5
                goto L_0x001c
            L_0x001b:
                r4 = r1
            L_0x001c:
                if (r4 == 0) goto L_0x001f
                goto L_0x0021
            L_0x001f:
                r4 = r1
                goto L_0x0022
            L_0x0021:
                r4 = r5
            L_0x0022:
                if (r4 != 0) goto L_0x0064
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r4[r5] = r1
                r1 = 2
                r4[r1] = r7
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = okhttp3.internal.Util.h(r1, r4)
                r0.append(r1)
                boolean r7 = okhttp3.internal.Util.p(r7)
                if (r7 == 0) goto L_0x004d
                java.lang.String r6 = ""
                goto L_0x0053
            L_0x004d:
                java.lang.String r7 = ": "
                java.lang.String r6 = f0.b0.r(r7, r6)
            L_0x0053:
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            L_0x0064:
                int r2 = r2 + 1
                goto L_0x0006
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.b(java.lang.String, java.lang.String):void");
        }

        public static Headers c(String... strArr) {
            boolean z10;
            boolean z11;
            int i10 = 0;
            if (strArr.length % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    String str = strArr2[i11];
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        strArr2[i11] = l.k1(str).toString();
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int a02 = g0.a0(0, strArr2.length - 1, 2);
                if (a02 >= 0) {
                    while (true) {
                        String str2 = strArr2[i10];
                        String str3 = strArr2[i10 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i10 == a02) {
                            break;
                        }
                        i10 += 2;
                    }
                }
                return new Headers(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public Headers(String[] strArr) {
        this.f22003a = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Headers) || !Arrays.equals(this.f22003a, ((Headers) obj).f22003a)) {
            return false;
        }
        return true;
    }

    public final String g(String str) {
        j.f(str, "name");
        Companion companion = f22002b;
        String[] strArr = this.f22003a;
        companion.getClass();
        int length = strArr.length - 2;
        int a02 = g0.a0(length, 0, -2);
        if (a02 <= length) {
            while (!h.G0(str, strArr[length])) {
                if (length != a02) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22003a);
    }

    public final String i(int i10) {
        return this.f22003a[i10 * 2];
    }

    public final Iterator<e<String, String>> iterator() {
        int length = this.f22003a.length / 2;
        e[] eVarArr = new e[length];
        for (int i10 = 0; i10 < length; i10++) {
            eVarArr[i10] = new e(i(i10), m(i10));
        }
        return new a(eVarArr);
    }

    public final Builder l() {
        Builder builder = new Builder();
        ArrayList arrayList = builder.f22004a;
        String[] strArr = this.f22003a;
        j.f(arrayList, "<this>");
        j.f(strArr, "elements");
        arrayList.addAll(fk.h.l0(strArr));
        return builder;
    }

    public final String m(int i10) {
        return this.f22003a[(i10 * 2) + 1];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f22003a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            String i11 = i(i10);
            String m10 = m(i10);
            sb2.append(i11);
            sb2.append(": ");
            if (Util.p(i11)) {
                m10 = "██";
            }
            sb2.append(m10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

package okhttp3.internal;

import al.g0;
import fk.p;
import j$.util.DesugarTimeZone;
import j7.a;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ll.c0;
import ll.f;
import ll.i;
import ll.j;
import ll.s;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;
import yk.c;
import yk.h;
import yk.l;

/* compiled from: Util.kt */
public final class Util {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f22171a;

    /* renamed from: b  reason: collision with root package name */
    public static final Headers f22172b = Headers.Companion.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f22173c;

    /* renamed from: d  reason: collision with root package name */
    public static final s f22174d = s.a.b(j.a.a("efbbbf"), j.a.a("feff"), j.a.a("fffe"), j.a.a("0000ffff"), j.a.a("ffff0000"));

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f22175e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f22176f = new c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f22177g;

    static {
        byte[] bArr = new byte[0];
        f22171a = bArr;
        Headers.f22002b.getClass();
        ResponseBody.f22151b.getClass();
        f fVar = new f();
        fVar.write(bArr);
        long j10 = (long) 0;
        f22173c = new ResponseBody$Companion$asResponseBody$1((MediaType) null, j10, fVar);
        RequestBody.f22115a.getClass();
        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        new RequestBody$Companion$toRequestBody$2((MediaType) null, bArr, 0, 0);
        j jVar = j.f20882d;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        sk.j.c(timeZone);
        f22175e = timeZone;
        Class<OkHttpClient> cls = OkHttpClient.class;
        String b12 = l.b1("okhttp3.", OkHttpClient.class.getName());
        if (h.F0(b12, "Client")) {
            b12 = b12.substring(0, b12.length() - "Client".length());
            sk.j.e(b12, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        f22177g = b12;
    }

    public static final void A(IOException iOException, List list) {
        sk.j.f(iOException, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0.s(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        sk.j.f(httpUrl, "<this>");
        sk.j.f(httpUrl2, "other");
        if (!sk.j.a(httpUrl.f22010d, httpUrl2.f22010d) || httpUrl.f22011e != httpUrl2.f22011e || !sk.j.a(httpUrl.f22007a, httpUrl2.f22007a)) {
            return false;
        }
        return true;
    }

    public static final int b(long j10, TimeUnit timeUnit) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        boolean z13 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (timeUnit != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= 2147483647L) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (millis == 0 && i10 > 0) {
                        z13 = false;
                    }
                    if (z13) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException("timeout too small.".toString());
                }
                throw new IllegalArgumentException("timeout too large.".toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException("timeout < 0".toString());
    }

    public static final void c(Closeable closeable) {
        sk.j.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!sk.j.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c10, int i10, int i11) {
        sk.j.f(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, String str2) {
        sk.j.f(str, "<this>");
        while (i10 < i11) {
            boolean z10 = false;
            if (l.R0(str2, str.charAt(i10), 0, false, 2) >= 0) {
                z10 = true;
            }
            if (z10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean g(c0 c0Var, TimeUnit timeUnit) {
        sk.j.f(c0Var, "<this>");
        sk.j.f(timeUnit, "timeUnit");
        try {
            return u(c0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        sk.j.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        sk.j.e(format, "format(locale, format, *args)");
        return format;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean i(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator<? super java.lang.String> r9) {
        /*
            java.lang.String r0 = "<this>"
            sk.j.f(r7, r0)
            java.lang.String r0 = "comparator"
            sk.j.f(r9, r0)
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0049
            if (r8 == 0) goto L_0x0049
            int r0 = r8.length
            if (r0 != 0) goto L_0x001b
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            goto L_0x0049
        L_0x001f:
            int r0 = r7.length
            r3 = r1
        L_0x0021:
            if (r3 >= r0) goto L_0x0049
            r4 = r7[r3]
            r5 = r1
        L_0x0026:
            int r6 = r8.length
            if (r5 >= r6) goto L_0x002b
            r6 = r2
            goto L_0x002c
        L_0x002b:
            r6 = r1
        L_0x002c:
            if (r6 == 0) goto L_0x0046
            int r6 = r5 + 1
            r5 = r8[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
            int r5 = r9.compare(r4, r5)
            if (r5 != 0) goto L_0x0039
            return r2
        L_0x0039:
            r5 = r6
            goto L_0x0026
        L_0x003b:
            r7 = move-exception
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            throw r8
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.i(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    public static final long j(Response response) {
        String g2 = response.f22129f.g("Content-Length");
        if (g2 != null) {
            try {
                return Long.parseLong(g2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        sk.j.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(a.d0(Arrays.copyOf(objArr, objArr.length)));
        sk.j.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (sk.j.h(charAt, 31) <= 0 || sk.j.h(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        sk.j.f(str, "<this>");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            boolean z13 = false;
            if (charAt == 9 || charAt == 10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && charAt != 12) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && charAt != 13) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12 || charAt == ' ') {
                z13 = true;
            }
            if (!z13) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        sk.j.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                boolean z13 = false;
                if (charAt == 9 || charAt == 10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && charAt != 12) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 && charAt != 13) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 || charAt == ' ') {
                    z13 = true;
                }
                if (z13) {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        sk.j.f(strArr2, "other");
        sk.j.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        sk.j.f(str, "name");
        if (h.G0(str, "Authorization") || h.G0(str, "Cookie") || h.G0(str, "Proxy-Authorization") || h.G0(str, "Set-Cookie")) {
            return true;
        }
        return false;
    }

    public static final int q(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset r(i iVar, Charset charset) {
        Charset charset2;
        sk.j.f(iVar, "<this>");
        sk.j.f(charset, "default");
        int u02 = iVar.u0(f22174d);
        if (u02 == -1) {
            return charset;
        }
        if (u02 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            sk.j.e(charset3, "UTF_8");
            return charset3;
        } else if (u02 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            sk.j.e(charset4, "UTF_16BE");
            return charset4;
        } else if (u02 != 2) {
            if (u02 == 3) {
                yk.a.f23581a.getClass();
                charset2 = yk.a.f23584d;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    sk.j.e(charset2, "forName(\"UTF-32BE\")");
                    yk.a.f23584d = charset2;
                }
            } else if (u02 == 4) {
                yk.a.f23581a.getClass();
                charset2 = yk.a.f23583c;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    sk.j.e(charset2, "forName(\"UTF-32LE\")");
                    yk.a.f23583c = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            sk.j.e(charset5, "UTF_16LE");
            return charset5;
        }
    }

    public static final int s(i iVar) {
        sk.j.f(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final int t(f fVar) {
        int i10 = 0;
        while (!fVar.A() && fVar.B(0) == 61) {
            i10++;
            fVar.readByte();
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.f().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.f().d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean u(ll.c0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "<this>"
            sk.j.f(r11, r0)
            java.lang.String r0 = "timeUnit"
            sk.j.f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            ll.d0 r2 = r11.f()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            ll.d0 r2 = r11.f()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            ll.d0 r2 = r11.f()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            ll.f r12 = new ll.f     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.J0(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.q()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            ll.d0 r11 = r11.f()
            r11.a()
            goto L_0x0080
        L_0x005b:
            ll.d0 r11 = r11.f()
            long r0 = r0 + r5
            r11.d(r0)
            goto L_0x0080
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            ll.d0 r11 = r11.f()
            r11.a()
            goto L_0x0079
        L_0x0071:
            ll.d0 r11 = r11.f()
            long r0 = r0 + r5
            r11.d(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0080:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.u(ll.c0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final Headers v(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.c(next.f22376a.q(), next.f22377b.q());
        }
        return builder.d();
    }

    public static final String w(HttpUrl httpUrl, boolean z10) {
        String str;
        sk.j.f(httpUrl, "<this>");
        if (l.N0(httpUrl.f22010d, ":")) {
            str = n0.l.k(android.support.v4.media.a.p('['), httpUrl.f22010d, ']');
        } else {
            str = httpUrl.f22010d;
        }
        if (!z10) {
            int i10 = httpUrl.f22011e;
            HttpUrl.Companion companion = HttpUrl.f22005k;
            String str2 = httpUrl.f22007a;
            companion.getClass();
            if (i10 == HttpUrl.Companion.b(str2)) {
                return str;
            }
        }
        return str + ':' + httpUrl.f22011e;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        sk.j.f(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(p.b1(list));
        sk.j.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String z(int i10, int i11, String str) {
        int m10 = m(i10, i11, str);
        String substring = str.substring(m10, n(m10, i11, str));
        sk.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}

package ul;

import f0.b0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import ul.a;

/* compiled from: ParameterHandler */
public abstract class u<T> {

    /* compiled from: ParameterHandler */
    public static final class a<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23152a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23153b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, RequestBody> f23154c;

        public a(Method method, int i10, f<T, RequestBody> fVar) {
            this.f23152a = method;
            this.f23153b = i10;
            this.f23154c = fVar;
        }

        public final void a(w wVar, T t10) {
            if (t10 != null) {
                try {
                    wVar.f23207k = this.f23154c.a(t10);
                } catch (IOException e10) {
                    Method method = this.f23152a;
                    int i10 = this.f23153b;
                    throw d0.l(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw d0.k(this.f23152a, this.f23153b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class b<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f23155a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f23156b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23157c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f23090a;
            Objects.requireNonNull(str, "name == null");
            this.f23155a = str;
            this.f23156b = dVar;
            this.f23157c = z10;
        }

        public final void a(w wVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f23156b.a(t10)) != null) {
                wVar.a(this.f23155a, a10, this.f23157c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class c<T> extends u<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23158a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23159b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23160c;

        public c(Method method, int i10, boolean z10) {
            this.f23158a = method;
            this.f23159b = i10;
            this.f23160c = z10;
        }

        public final void a(w wVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wVar.a(str, obj2, this.f23160c);
                            } else {
                                Method method = this.f23158a;
                                int i10 = this.f23159b;
                                throw d0.k(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw d0.k(this.f23158a, this.f23159b, b0.s("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d0.k(this.f23158a, this.f23159b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d0.k(this.f23158a, this.f23159b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class d<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f23161a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f23162b;

        public d(String str) {
            a.d dVar = a.d.f23090a;
            Objects.requireNonNull(str, "name == null");
            this.f23161a = str;
            this.f23162b = dVar;
        }

        public final void a(w wVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f23162b.a(t10)) != null) {
                wVar.b(this.f23161a, a10);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class e<T> extends u<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23163a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23164b;

        public e(Method method, int i10) {
            this.f23163a = method;
            this.f23164b = i10;
        }

        public final void a(w wVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wVar.b(str, value.toString());
                        } else {
                            throw d0.k(this.f23163a, this.f23164b, b0.s("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d0.k(this.f23163a, this.f23164b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d0.k(this.f23163a, this.f23164b, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class f extends u<Headers> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23165a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23166b;

        public f(int i10, Method method) {
            this.f23165a = method;
            this.f23166b = i10;
        }

        public final void a(w wVar, Object obj) {
            Headers headers = (Headers) obj;
            if (headers != null) {
                Headers.Builder builder = wVar.f23202f;
                builder.getClass();
                int length = headers.f22003a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    builder.c(headers.i(i10), headers.m(i10));
                }
                return;
            }
            throw d0.k(this.f23165a, this.f23166b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class g<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23167a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23168b;

        /* renamed from: c  reason: collision with root package name */
        public final Headers f23169c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, RequestBody> f23170d;

        public g(Method method, int i10, Headers headers, f<T, RequestBody> fVar) {
            this.f23167a = method;
            this.f23168b = i10;
            this.f23169c = headers;
            this.f23170d = fVar;
        }

        public final void a(w wVar, T t10) {
            if (t10 != null) {
                try {
                    RequestBody a10 = this.f23170d.a(t10);
                    Headers headers = this.f23169c;
                    MultipartBody.Builder builder = wVar.f23205i;
                    builder.getClass();
                    sk.j.f(a10, "body");
                    MultipartBody.Part.f22046c.getClass();
                    builder.f22045c.add(MultipartBody.Part.Companion.a(headers, a10));
                } catch (IOException e10) {
                    Method method = this.f23167a;
                    int i10 = this.f23168b;
                    throw d0.k(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class h<T> extends u<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23171a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23172b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, RequestBody> f23173c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23174d;

        public h(Method method, int i10, f<T, RequestBody> fVar, String str) {
            this.f23171a = method;
            this.f23172b = i10;
            this.f23173c = fVar;
            this.f23174d = str;
        }

        public final void a(w wVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String[] strArr = {"Content-Disposition", b0.s("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f23174d};
                            Headers.f22002b.getClass();
                            Headers c10 = Headers.Companion.c(strArr);
                            RequestBody a10 = this.f23173c.a(value);
                            MultipartBody.Builder builder = wVar.f23205i;
                            builder.getClass();
                            sk.j.f(a10, "body");
                            MultipartBody.Part.f22046c.getClass();
                            builder.f22045c.add(MultipartBody.Part.Companion.a(c10, a10));
                        } else {
                            throw d0.k(this.f23171a, this.f23172b, b0.s("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d0.k(this.f23171a, this.f23172b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d0.k(this.f23171a, this.f23172b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class i<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23175a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23176b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23177c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, String> f23178d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f23179e;

        public i(Method method, int i10, String str, boolean z10) {
            a.d dVar = a.d.f23090a;
            this.f23175a = method;
            this.f23176b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f23177c = str;
            this.f23178d = dVar;
            this.f23179e = z10;
        }

        public final void a(w wVar, T t10) {
            String str;
            int i10;
            int i11;
            w wVar2 = wVar;
            T t11 = t10;
            if (t11 != null) {
                String str2 = this.f23177c;
                String a10 = this.f23178d.a(t11);
                boolean z10 = this.f23179e;
                if (wVar2.f23199c != null) {
                    int length = a10.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            str = a10;
                            break;
                        }
                        int codePointAt = a10.codePointAt(i12);
                        i10 = -1;
                        i11 = 127;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                            ll.f fVar = new ll.f();
                            fVar.v0(0, i12, a10);
                            ll.f fVar2 = null;
                        } else {
                            i12 += Character.charCount(codePointAt);
                        }
                    }
                    ll.f fVar3 = new ll.f();
                    fVar3.v0(0, i12, a10);
                    ll.f fVar22 = null;
                    while (i12 < length) {
                        int codePointAt2 = a10.codePointAt(i12);
                        if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= i11 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i10 || (!z10 && (codePointAt2 == 47 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new ll.f();
                                }
                                fVar22.A0(codePointAt2);
                                while (!fVar22.A()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.g0(37);
                                    char[] cArr = w.f23195l;
                                    fVar3.g0(cArr[(readByte >> 4) & 15]);
                                    fVar3.g0(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.A0(codePointAt2);
                            }
                        }
                        i12 += Character.charCount(codePointAt2);
                        i10 = -1;
                        i11 = 127;
                    }
                    str = fVar3.U();
                    String replace = wVar2.f23199c.replace("{" + str2 + "}", str);
                    if (!w.f23196m.matcher(replace).matches()) {
                        wVar2.f23199c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(b0.r("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a10));
                }
                throw new AssertionError();
            }
            throw d0.k(this.f23175a, this.f23176b, android.support.v4.media.a.o(android.support.v4.media.a.q("Path parameter \""), this.f23177c, "\" value must not be null."), new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class j<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f23180a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f23181b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23182c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f23090a;
            Objects.requireNonNull(str, "name == null");
            this.f23180a = str;
            this.f23181b = dVar;
            this.f23182c = z10;
        }

        public final void a(w wVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f23181b.a(t10)) != null) {
                wVar.c(this.f23180a, a10, this.f23182c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class k<T> extends u<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23183a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23184b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f23185c;

        public k(Method method, int i10, boolean z10) {
            this.f23183a = method;
            this.f23184b = i10;
            this.f23185c = z10;
        }

        public final void a(w wVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wVar.c(str, obj2, this.f23185c);
                            } else {
                                Method method = this.f23183a;
                                int i10 = this.f23184b;
                                throw d0.k(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw d0.k(this.f23183a, this.f23184b, b0.s("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d0.k(this.f23183a, this.f23184b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d0.k(this.f23183a, this.f23184b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class l<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f23186a;

        public l(boolean z10) {
            this.f23186a = z10;
        }

        public final void a(w wVar, T t10) {
            if (t10 != null) {
                wVar.c(t10.toString(), (String) null, this.f23186a);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class m extends u<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f23187a = new m();

        public final void a(w wVar, Object obj) {
            MultipartBody.Part part = (MultipartBody.Part) obj;
            if (part != null) {
                MultipartBody.Builder builder = wVar.f23205i;
                builder.getClass();
                builder.f22045c.add(part);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class n extends u<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f23188a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23189b;

        public n(int i10, Method method) {
            this.f23188a = method;
            this.f23189b = i10;
        }

        public final void a(w wVar, Object obj) {
            if (obj != null) {
                wVar.f23199c = obj.toString();
                return;
            }
            throw d0.k(this.f23188a, this.f23189b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class o<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f23190a;

        public o(Class<T> cls) {
            this.f23190a = cls;
        }

        public final void a(w wVar, T t10) {
            wVar.f23201e.d(this.f23190a, t10);
        }
    }

    public abstract void a(w wVar, T t10);
}

package ul;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* compiled from: RequestFactory */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Method f23210a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f23211b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23212c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23213d;

    /* renamed from: e  reason: collision with root package name */
    public final Headers f23214e;

    /* renamed from: f  reason: collision with root package name */
    public final MediaType f23215f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23216g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23217h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23218i;

    /* renamed from: j  reason: collision with root package name */
    public final u<?>[] f23219j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f23220k;

    /* compiled from: RequestFactory */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f23221x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f23222y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final z f23223a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f23224b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f23225c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f23226d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f23227e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23228f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f23229g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23230h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f23231i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f23232j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f23233k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f23234l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f23235m;

        /* renamed from: n  reason: collision with root package name */
        public String f23236n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f23237o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f23238p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f23239q;

        /* renamed from: r  reason: collision with root package name */
        public String f23240r;

        /* renamed from: s  reason: collision with root package name */
        public Headers f23241s;

        /* renamed from: t  reason: collision with root package name */
        public MediaType f23242t;

        /* renamed from: u  reason: collision with root package name */
        public LinkedHashSet f23243u;

        /* renamed from: v  reason: collision with root package name */
        public u<?>[] f23244v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f23245w;

        public a(z zVar, Method method) {
            this.f23223a = zVar;
            this.f23224b = method;
            this.f23225c = method.getAnnotations();
            this.f23227e = method.getGenericParameterTypes();
            this.f23226d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f23236n;
            if (str3 == null) {
                this.f23236n = str;
                this.f23237o = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f23221x.matcher(substring).find()) {
                            throw d0.j(this.f23224b, (Exception) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f23240r = str2;
                    Matcher matcher = f23221x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f23243u = linkedHashSet;
                    return;
                }
                return;
            }
            throw d0.j(this.f23224b, (Exception) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (d0.h(type)) {
                throw d0.k(this.f23224b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public x(a aVar) {
        this.f23210a = aVar.f23224b;
        this.f23211b = aVar.f23223a.f23251c;
        this.f23212c = aVar.f23236n;
        this.f23213d = aVar.f23240r;
        this.f23214e = aVar.f23241s;
        this.f23215f = aVar.f23242t;
        this.f23216g = aVar.f23237o;
        this.f23217h = aVar.f23238p;
        this.f23218i = aVar.f23239q;
        this.f23219j = aVar.f23244v;
        this.f23220k = aVar.f23245w;
    }
}

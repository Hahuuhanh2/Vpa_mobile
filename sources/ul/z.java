package ul;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ul.c;
import ul.f;

/* compiled from: Retrofit */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f23249a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Call.Factory f23250b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpUrl f23251c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f23252d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f23253e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23254f;

    /* compiled from: Retrofit */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final v f23255a = v.f23191c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f23256b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f23257c;

        public a(Class cls) {
            this.f23257c = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z10;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f23256b;
            }
            if (!this.f23255a.f23192a || !method.isDefault()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return this.f23255a.b(method, this.f23257c, obj, objArr);
            }
            return z.this.c(method).a(objArr);
        }
    }

    public z(Call.Factory factory, HttpUrl httpUrl, List list, List list2) {
        this.f23250b = factory;
        this.f23251c = httpUrl;
        this.f23252d = list;
        this.f23253e = list2;
        this.f23254f = false;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f23253e.indexOf((Object) null) + 1;
        int size = this.f23253e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f23253e.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f23253e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f23253e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        boolean z10;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f23254f) {
                v vVar = v.f23191c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!vVar.f23192a || !method.isDefault()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final a0<?> c(Method method) {
        a0<?> a0Var;
        a0<?> a0Var2 = (a0) this.f23249a.get(method);
        if (a0Var2 != null) {
            return a0Var2;
        }
        synchronized (this.f23249a) {
            a0Var = (a0) this.f23249a.get(method);
            if (a0Var == null) {
                a0Var = a0.b(this, method);
                this.f23249a.put(method, a0Var);
            }
        }
        return a0Var;
    }

    public final <T> f<T, RequestBody> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f23252d.indexOf((Object) null) + 1;
        int size = this.f23252d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, RequestBody> a10 = this.f23252d.get(i10).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f23252d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f23252d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<ResponseBody, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f23252d.indexOf((Object) null) + 1;
        int size = this.f23252d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<ResponseBody, ?> b10 = this.f23252d.get(i10).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f23252d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f23252d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f23252d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23252d.get(i10).getClass();
        }
    }
}

package ul;

import c0.s0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import ul.c;
import w.o;

/* compiled from: DefaultCallAdapterFactory */
public final class h extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f23109a;

    /* compiled from: DefaultCallAdapterFactory */
    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f23110a;

        /* renamed from: b  reason: collision with root package name */
        public final b<T> f23111b;

        /* renamed from: ul.h$a$a  reason: collision with other inner class name */
        /* compiled from: DefaultCallAdapterFactory */
        public class C0310a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f23112a;

            public C0310a(d dVar) {
                this.f23112a = dVar;
            }

            public final void a(b<T> bVar, y<T> yVar) {
                a.this.f23110a.execute(new s0(10, this, this.f23112a, yVar));
            }

            public final void c(b<T> bVar, Throwable th2) {
                a.this.f23110a.execute(new o(10, this, this.f23112a, th2));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f23110a = executor;
            this.f23111b = bVar;
        }

        public final void cancel() {
            this.f23111b.cancel();
        }

        public final y<T> d() {
            return this.f23111b.d();
        }

        public final boolean h() {
            return this.f23111b.h();
        }

        public final Request i() {
            return this.f23111b.i();
        }

        public final void k0(d<T> dVar) {
            this.f23111b.k0(new C0310a(dVar));
        }

        public final b<T> clone() {
            return new a(this.f23110a, this.f23111b.clone());
        }
    }

    public h(Executor executor) {
        this.f23109a = executor;
    }

    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (d0.f(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = d0.e(0, (ParameterizedType) type);
            if (!d0.i(annotationArr, b0.class)) {
                executor = this.f23109a;
            }
            return new g(e10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}

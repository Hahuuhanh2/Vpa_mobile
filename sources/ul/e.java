package ul;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;
import ul.c;

@IgnoreJRERequirement
/* compiled from: CompletableFutureCallAdapterFactory */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f23101a = new e();

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f23102a;

        @IgnoreJRERequirement
        /* renamed from: ul.e$a$a  reason: collision with other inner class name */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C0309a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f23103a;

            public C0309a(b bVar) {
                this.f23103a = bVar;
            }

            public final void a(b<R> bVar, y<R> yVar) {
                if (yVar.f23246a.i()) {
                    this.f23103a.complete(yVar.f23247b);
                } else {
                    this.f23103a.completeExceptionally(new HttpException(yVar));
                }
            }

            public final void c(b<R> bVar, Throwable th2) {
                this.f23103a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f23102a = type;
        }

        public final Type a() {
            return this.f23102a;
        }

        public final Object b(q qVar) {
            b bVar = new b(qVar);
            qVar.k0(new C0309a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f23104a;

        public b(q qVar) {
            this.f23104a = qVar;
        }

        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f23104a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class c<R> implements c<R, CompletableFuture<y<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f23105a;

        @IgnoreJRERequirement
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<y<R>> f23106a;

            public a(b bVar) {
                this.f23106a = bVar;
            }

            public final void a(b<R> bVar, y<R> yVar) {
                this.f23106a.complete(yVar);
            }

            public final void c(b<R> bVar, Throwable th2) {
                this.f23106a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f23105a = type;
        }

        public final Type a() {
            return this.f23105a;
        }

        public final Object b(q qVar) {
            b bVar = new b(qVar);
            qVar.k0(new a(bVar));
            return bVar;
        }
    }

    public final c a(Type type, Annotation[] annotationArr) {
        if (d0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = d0.e(0, (ParameterizedType) type);
            if (d0.f(e10) != y.class) {
                return new a(e10);
            }
            if (e10 instanceof ParameterizedType) {
                return new c(d0.e(0, (ParameterizedType) e10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}

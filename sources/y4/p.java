package y4;

import java.util.HashMap;
import java.util.List;
import p5.a;

/* compiled from: ModelLoaderRegistry */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f17488a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17489b = new a();

    /* compiled from: ModelLoaderRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f17490a = new HashMap();

        /* renamed from: y4.p$a$a  reason: collision with other inner class name */
        /* compiled from: ModelLoaderRegistry */
        public static class C0233a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f17491a;

            public C0233a(List<n<Model, ?>> list) {
                this.f17491a = list;
            }
        }

        public final <Model> void a(Class<Model> cls, List<n<Model, ?>> list) {
            if (((C0233a) this.f17490a.put(cls, new C0233a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(a.c cVar) {
        r rVar = new r(cVar);
        this.f17488a = rVar;
    }
}

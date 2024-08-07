package y4;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import s4.h;
import y4.n;

/* compiled from: UnitModelLoader */
public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f17517a = new u<>();

    /* compiled from: UnitModelLoader */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f17518a = new a<>();

        public final n<Model, Model> a(r rVar) {
            return u.f17517a;
        }

        public final void b() {
        }
    }

    /* compiled from: UnitModelLoader */
    public static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f17519a;

        public b(Model model) {
            this.f17519a = model;
        }

        public final Class<Model> a() {
            return this.f17519a.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final s4.a d() {
            return s4.a.LOCAL;
        }

        public final void e(j jVar, d.a<? super Model> aVar) {
            aVar.f(this.f17519a);
        }
    }

    public final boolean a(Model model) {
        return true;
    }

    public final n.a<Model> b(Model model, int i10, int i11, h hVar) {
        return new n.a<>(new n5.d(model), new b(model));
    }
}

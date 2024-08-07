package y4;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s4.e;
import s4.h;
import v1.d;
import y4.n;

/* compiled from: MultiModelLoader */
public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f17492a;

    /* renamed from: b  reason: collision with root package name */
    public final d<List<Throwable>> f17493b;

    /* compiled from: MultiModelLoader */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f17494a;

        /* renamed from: b  reason: collision with root package name */
        public final v1.d<List<Throwable>> f17495b;

        /* renamed from: c  reason: collision with root package name */
        public int f17496c;

        /* renamed from: d  reason: collision with root package name */
        public j f17497d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f17498e;

        /* renamed from: f  reason: collision with root package name */
        public List<Throwable> f17499f;

        /* renamed from: n  reason: collision with root package name */
        public boolean f17500n;

        public a(ArrayList arrayList, v1.d dVar) {
            this.f17495b = dVar;
            if (!arrayList.isEmpty()) {
                this.f17494a = arrayList;
                this.f17496c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f17494a.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.f17499f;
            if (list != null) {
                this.f17495b.a(list);
            }
            this.f17499f = null;
            for (com.bumptech.glide.load.data.d<Data> b10 : this.f17494a) {
                b10.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.f17499f;
            j7.a.r(list);
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.f17500n = true;
            for (com.bumptech.glide.load.data.d<Data> cancel : this.f17494a) {
                cancel.cancel();
            }
        }

        public final s4.a d() {
            return this.f17494a.get(0).d();
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            this.f17497d = jVar;
            this.f17498e = aVar;
            this.f17499f = this.f17495b.b();
            this.f17494a.get(this.f17496c).e(jVar, this);
            if (this.f17500n) {
                cancel();
            }
        }

        public final void f(Data data) {
            if (data != null) {
                this.f17498e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (!this.f17500n) {
                if (this.f17496c < this.f17494a.size() - 1) {
                    this.f17496c++;
                    e(this.f17497d, this.f17498e);
                    return;
                }
                j7.a.r(this.f17499f);
                this.f17498e.c(new GlideException("Fetch failed", new ArrayList(this.f17499f)));
            }
        }
    }

    public q(ArrayList arrayList, v1.d dVar) {
        this.f17492a = arrayList;
        this.f17493b = dVar;
    }

    public final boolean a(Model model) {
        for (n<Model, Data> a10 : this.f17492a) {
            if (a10.a(model)) {
                return true;
            }
        }
        return false;
    }

    public final n.a<Data> b(Model model, int i10, int i11, h hVar) {
        n.a b10;
        int size = this.f17492a.size();
        ArrayList arrayList = new ArrayList(size);
        e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = this.f17492a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, hVar)) != null) {
                eVar = b10.f17485a;
                arrayList.add(b10.f17487c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f17493b));
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MultiModelLoader{modelLoaders=");
        q10.append(Arrays.toString(this.f17492a.toArray()));
        q10.append('}');
        return q10.toString();
    }
}

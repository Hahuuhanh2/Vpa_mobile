package y4;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p5.a;
import s4.h;
import v1.d;
import y4.n;

/* compiled from: MultiModelLoaderFactory */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f17501e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f17502f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17503a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f17504b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f17505c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f17506d;

    /* compiled from: MultiModelLoaderFactory */
    public static class a implements n<Object, Object> {
        public final boolean a(Object obj) {
            return false;
        }

        public final n.a<Object> b(Object obj, int i10, int i11, h hVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f17507a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f17508b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f17509c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f17507a = cls;
            this.f17508b = cls2;
            this.f17509c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f17501e;
        this.f17506d = cVar;
        this.f17504b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f17503a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f17505c.contains(bVar)) {
                    if (bVar.f17507a.isAssignableFrom(cls)) {
                        this.f17505c.add(bVar);
                        n<? extends Model, ? extends Data> a10 = bVar.f17509c.a(this);
                        j7.a.r(a10);
                        arrayList.add(a10);
                        this.f17505c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f17505c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f17503a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (this.f17505c.contains(bVar)) {
                    z11 = true;
                } else {
                    if (!bVar.f17507a.isAssignableFrom(cls) || !bVar.f17508b.isAssignableFrom(cls2)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        this.f17505c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f17505c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f17504b;
                d<List<Throwable>> dVar = this.f17506d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z11) {
                return f17502f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f17505c.clear();
            throw th2;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> a10 = bVar.f17509c.a(this);
        j7.a.r(a10);
        return a10;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17503a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f17508b) && bVar.f17507a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f17508b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        boolean z10;
        Class<f> cls2 = f.class;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator it = this.f17503a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!bVar.f17507a.isAssignableFrom(cls2) || !bVar.f17508b.isAssignableFrom(cls)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    it.remove();
                    arrayList.add(bVar.f17509c);
                }
            }
        }
        return arrayList;
    }
}

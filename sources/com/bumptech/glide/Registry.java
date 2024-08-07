package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import g5.c;
import h4.e;
import j5.a;
import j5.b;
import j5.c;
import j5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p5.a;
import s4.j;
import s4.k;
import y0.h;
import y4.n;
import y4.o;
import y4.p;
import y4.r;

public final class Registry {

    /* renamed from: a  reason: collision with root package name */
    public final p f4904a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4905b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4906c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4907d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4908e;

    /* renamed from: f  reason: collision with root package name */
    public final g5.c f4909f;

    /* renamed from: g  reason: collision with root package name */
    public final e f4910g;

    /* renamed from: h  reason: collision with root package name */
    public final h f4911h = new h(2);

    /* renamed from: i  reason: collision with root package name */
    public final b f4912i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f4913j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        a.c cVar = new a.c(new v1.e(20), new p5.b(), new p5.c());
        this.f4913j = cVar;
        this.f4904a = new p(cVar);
        this.f4905b = new j5.a();
        this.f4906c = new c();
        this.f4907d = new d();
        this.f4908e = new f();
        this.f4909f = new g5.c();
        this.f4910g = new e();
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        c cVar2 = this.f4906c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f11692a);
            cVar2.f11692a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f11692a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f11692a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, o oVar) {
        p pVar = this.f4904a;
        synchronized (pVar) {
            r rVar = pVar.f17488a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f17503a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f17489b.f17490a.clear();
        }
    }

    public final void b(Class cls, k kVar) {
        d dVar = this.f4907d;
        synchronized (dVar) {
            dVar.f11697a.add(new d.a(cls, kVar));
        }
    }

    public final void c(j jVar, Class cls, Class cls2, String str) {
        c cVar = this.f4906c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a(cls, cls2, jVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        e eVar = this.f4910g;
        synchronized (eVar) {
            list = eVar.f10547a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f4904a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0233a aVar = (p.a.C0233a) pVar.f17489b.f17490a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f17491a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f17488a.a(cls));
                pVar.f17489b.a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = list.get(i10);
                if (nVar.a(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> f(X x10) {
        com.bumptech.glide.load.data.e<X> b10;
        f fVar = this.f4908e;
        synchronized (fVar) {
            j7.a.r(x10);
            e.a aVar = (e.a) fVar.f4974a.get(x10.getClass());
            if (aVar == null) {
                Iterator it = fVar.f4974a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(x10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f.f4973b;
            }
            b10 = aVar.b(x10);
        }
        return b10;
    }

    public final void g(e.a aVar) {
        f fVar = this.f4908e;
        synchronized (fVar) {
            fVar.f4974a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, g5.b bVar) {
        g5.c cVar = this.f4909f;
        synchronized (cVar) {
            cVar.f10369a.add(new c.a(cls, cls2, bVar));
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m10, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}

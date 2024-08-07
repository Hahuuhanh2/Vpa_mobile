package com.bumptech.glide.load.data;

import b5.v;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import v4.b;

/* compiled from: InputStreamRewinder */
public final class j implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final v f4985a;

    /* compiled from: InputStreamRewinder */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f4986a;

        public a(b bVar) {
            this.f4986a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new j((InputStream) obj, this.f4986a);
        }
    }

    public j(InputStream inputStream, b bVar) {
        v vVar = new v(inputStream, bVar);
        this.f4985a = vVar;
        vVar.mark(5242880);
    }

    public final Object a() {
        this.f4985a.reset();
        return this.f4985a;
    }

    public final void b() {
        this.f4985a.h();
    }
}

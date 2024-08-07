package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;

/* compiled from: DataRewinderRegistry */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4973b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4974a = new HashMap();

    /* compiled from: DataRewinderRegistry */
    public class a implements e.a<Object> {
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4975a;

        public b(Object obj) {
            this.f4975a = obj;
        }

        public final Object a() {
            return this.f4975a;
        }

        public final void b() {
        }
    }
}

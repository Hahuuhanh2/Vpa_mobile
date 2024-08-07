package sk;

import java.io.Serializable;

/* compiled from: CallableReference */
public abstract class b implements wk.a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient wk.a f22916a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f22917b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f22918c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22919d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22920e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22921f;

    /* compiled from: CallableReference */
    public static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22922a = new a();
    }

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f22917b = obj;
        this.f22918c = cls;
        this.f22919d = str;
        this.f22920e = str2;
        this.f22921f = z10;
    }

    public abstract wk.a a();

    public final c b() {
        Class cls = this.f22918c;
        if (cls == null) {
            return null;
        }
        if (!this.f22921f) {
            return s.a(cls);
        }
        s.f22932a.getClass();
        return new l(cls);
    }
}

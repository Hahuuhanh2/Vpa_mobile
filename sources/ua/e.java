package ua;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import sa.c;
import sa.f;
import ta.b;

/* compiled from: JsonDataEncoderBuilder */
public final class e implements b<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15407e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f15408f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f15409g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f15410h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15411a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15412b;

    /* renamed from: c  reason: collision with root package name */
    public a f15413c = f15407e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15414d = false;

    /* compiled from: JsonDataEncoderBuilder */
    public static final class a implements sa.e<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f15415a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f15415a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public final void encode(Object obj, Object obj2) {
            ((f) obj2).add(f15415a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f15411a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f15412b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f15408f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f15409g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f15410h);
        hashMap.remove(cls3);
    }

    public final b registerEncoder(Class cls, c cVar) {
        this.f15411a.put(cls, cVar);
        this.f15412b.remove(cls);
        return this;
    }
}

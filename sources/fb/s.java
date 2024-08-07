package fb;

import gb.a;
import gb.b;
import java.util.HashMap;
import va.g;
import va.h;

/* compiled from: ProtoEncoderDoNotUse */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final h f10164a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        g gVar = h.a.f16135a;
        Class<s> cls = s.class;
        hashMap.put(cls, c.f10112a);
        hashMap2.remove(cls);
        Class<b> cls2 = b.class;
        hashMap.put(cls2, b.f10100a);
        hashMap2.remove(cls2);
        Class<a> cls3 = a.class;
        hashMap.put(cls3, a.f10079a);
        hashMap2.remove(cls3);
        f10164a = new h(new HashMap(hashMap), new HashMap(hashMap2), gVar);
    }

    public abstract b a();
}

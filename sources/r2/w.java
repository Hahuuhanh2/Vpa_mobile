package r2;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModelStore.kt */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f14500a = new LinkedHashMap();

    public final void a() {
        for (v vVar : this.f14500a.values()) {
            vVar.f14499c = true;
            HashMap hashMap = vVar.f14497a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object a10 : vVar.f14497a.values()) {
                        v.a(a10);
                    }
                }
            }
            LinkedHashSet linkedHashSet = vVar.f14498b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable a11 : vVar.f14498b) {
                        v.a(a11);
                    }
                }
                vVar.f14498b.clear();
            }
            vVar.b();
        }
        this.f14500a.clear();
    }
}

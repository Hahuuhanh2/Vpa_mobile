package androidx.databinding;

import android.view.View;
import d2.d;
import d2.e;
import d2.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f2189a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList f2190b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public CopyOnWriteArrayList f2191c = new CopyOnWriteArrayList();

    public final l b(e eVar, View view, int i10) {
        Iterator it = this.f2190b.iterator();
        while (it.hasNext()) {
            l b10 = ((d) it.next()).b(eVar, view, i10);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(eVar, view, i10);
        }
        return null;
    }

    public final l c(e eVar, View[] viewArr, int i10) {
        Iterator it = this.f2190b.iterator();
        while (it.hasNext()) {
            l c10 = ((d) it.next()).c(eVar, viewArr, i10);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i10);
        }
        return null;
    }

    public final void d(d dVar) {
        if (this.f2189a.add(dVar.getClass())) {
            this.f2190b.add(dVar);
            for (d d10 : dVar.a()) {
                d(d10);
            }
        }
    }

    public final boolean e() {
        Iterator it = this.f2191c.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (d.class.isAssignableFrom(cls)) {
                    d((d) cls.newInstance());
                    this.f2191c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z10;
    }
}

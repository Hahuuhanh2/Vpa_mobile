package androidx.fragment.app;

import android.view.View;
import androidx.transition.d;
import fk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import sk.j;
import v0.b;
import v0.g;

/* compiled from: FragmentTransition.kt */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f2583a = new d0();

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f2584b;

    static {
        h0 h0Var;
        try {
            h0Var = d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            h0Var = null;
        }
        f2584b = h0Var;
    }

    public static final String a(b<String, String> bVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (j.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry key : linkedHashMap.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        return (String) p.N0(arrayList);
    }

    public static final void b(int i10, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}

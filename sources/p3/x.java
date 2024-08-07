package p3;

import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o3.j;
import o3.q;

/* compiled from: WorkContinuationImpl */
public final class x extends o {

    /* renamed from: b  reason: collision with root package name */
    public final j0 f14029b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14030c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14031d;

    /* renamed from: e  reason: collision with root package name */
    public final List<? extends q> f14032e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f14033f;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f14034n;

    /* renamed from: o  reason: collision with root package name */
    public final List<x> f14035o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14036p;

    /* renamed from: q  reason: collision with root package name */
    public o f14037q;

    static {
        j.b("WorkContinuationImpl");
    }

    public x() {
        throw null;
    }

    public x(j0 j0Var, List<? extends q> list) {
        this.f14029b = j0Var;
        this.f14030c = null;
        this.f14031d = 2;
        this.f14032e = list;
        this.f14035o = null;
        this.f14033f = new ArrayList(list.size());
        this.f14034n = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((q) list.get(i10)).f13696a.toString();
            sk.j.e(uuid, "id.toString()");
            this.f14033f.add(uuid);
            this.f14034n.add(uuid);
        }
    }

    public static boolean J(x xVar, HashSet hashSet) {
        hashSet.addAll(xVar.f14033f);
        HashSet K = K(xVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (K.contains((String) it.next())) {
                return true;
            }
        }
        List<x> list = xVar.f14035o;
        if (list != null && !list.isEmpty()) {
            for (x J : list) {
                if (J(J, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(xVar.f14033f);
        return false;
    }

    public static HashSet K(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> list = xVar.f14035o;
        if (list != null && !list.isEmpty()) {
            for (x xVar2 : list) {
                hashSet.addAll(xVar2.f14033f);
            }
        }
        return hashSet;
    }
}

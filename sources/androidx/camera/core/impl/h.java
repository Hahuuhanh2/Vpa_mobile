package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import f0.i0;
import f0.k;
import f0.u0;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: CaptureStage */
public interface h {

    /* compiled from: CaptureStage */
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        public final g f1373a;

        public a() {
            HashSet hashSet = new HashSet();
            q L = q.L();
            Range<Integer> range = v.f1409a;
            ArrayList arrayList = new ArrayList();
            i0 c10 = i0.c();
            ArrayList arrayList2 = new ArrayList(hashSet);
            r K = r.K(L);
            ArrayList arrayList3 = new ArrayList(arrayList);
            u0 u0Var = u0.f9604b;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : c10.b()) {
                arrayMap.put(next, c10.a(next));
            }
            this.f1373a = new g(arrayList2, K, -1, range, arrayList3, false, new u0(arrayMap), (k) null);
        }

        public final g a() {
            return this.f1373a;
        }

        public final void getId() {
        }
    }

    g a();

    void getId();
}

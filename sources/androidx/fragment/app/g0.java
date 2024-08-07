package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: FragmentTransitionImpl */
public final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2642b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2643c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2644d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2645e;

    public g0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2641a = i10;
        this.f2642b = arrayList;
        this.f2643c = arrayList2;
        this.f2644d = arrayList3;
        this.f2645e = arrayList4;
    }

    public final void run() {
        for (int i10 = 0; i10 < this.f2641a; i10++) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.v((View) this.f2642b.get(i10), (String) this.f2643c.get(i10));
            d0.i.v((View) this.f2644d.get(i10), (String) this.f2645e.get(i10));
        }
    }
}

package androidx.fragment.app;

import androidx.fragment.app.l0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0.b f2580a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0.b f2581b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0.b f2582c;

    public /* synthetic */ b(l0.b bVar, l0.b bVar2, boolean z10, v0.b bVar3) {
        this.f2580a = bVar;
        this.f2581b = bVar2;
        this.f2582c = bVar3;
    }

    public final void run() {
        l0.b bVar = this.f2580a;
        l0.b bVar2 = this.f2581b;
        j.f(this.f2582c, "$lastInViews");
        Fragment fragment = bVar.f2671c;
        Fragment fragment2 = bVar2.f2671c;
        d0 d0Var = b0.f2583a;
        j.f(fragment, "inFragment");
        j.f(fragment2, "outFragment");
    }
}

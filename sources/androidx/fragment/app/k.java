package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import f.f;
import java.util.concurrent.atomic.AtomicReference;
import p.a;

/* compiled from: Fragment */
public final class k extends Fragment.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2656b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.a f2657c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.a f2658d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Fragment f2659e;

    public k(Fragment fragment, j jVar, AtomicReference atomicReference, g.a aVar, f.a aVar2) {
        this.f2659e = fragment;
        this.f2655a = jVar;
        this.f2656b = atomicReference;
        this.f2657c = aVar;
        this.f2658d = aVar2;
    }

    public final void a() {
        Fragment fragment = this.f2659e;
        fragment.getClass();
        this.f2656b.set(((f) this.f2655a.apply(null)).c("fragment_" + fragment.f2447e + "_rq#" + fragment.f2441a0.getAndIncrement(), this.f2659e, this.f2657c, this.f2658d));
    }
}

package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import z.d;

/* compiled from: Visibility */
public final class k extends g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3513b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3514c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Visibility f3515d;

    public k(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f3515d = visibility;
        this.f3512a = viewGroup;
        this.f3513b = view;
        this.f3514c = view2;
    }

    public final void a() {
        d dVar = new d(this.f3512a);
        ((ViewGroupOverlay) dVar.f17746a).remove(this.f3513b);
    }

    public final void d(Transition transition) {
        this.f3514c.setTag(R$id.save_overlay_view, (Object) null);
        d dVar = new d(this.f3512a);
        ((ViewGroupOverlay) dVar.f17746a).remove(this.f3513b);
        transition.z(this);
    }

    public final void e() {
        if (this.f3513b.getParent() == null) {
            d dVar = new d(this.f3512a);
            ((ViewGroupOverlay) dVar.f17746a).add(this.f3513b);
            return;
        }
        this.f3515d.cancel();
    }
}

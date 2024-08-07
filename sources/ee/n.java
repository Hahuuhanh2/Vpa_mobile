package ee;

import com.luck.picture.lib.widget.BottomNavBar;

/* compiled from: PictureSelectorPreviewFragment */
public final class n extends BottomNavBar.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f9400a;

    public n(t tVar) {
        this.f9400a = tVar;
    }

    public final void a() {
        this.f9400a.I0();
    }

    public final void b() {
        t tVar = this.f9400a;
        String str = t.O0;
        tVar.f11878i0.getClass();
    }

    public final void c() {
        int currentItem = this.f9400a.f9410q0.getCurrentItem();
        if (this.f9400a.f9408o0.size() > currentItem) {
            this.f9400a.l0(this.f9400a.f9408o0.get(currentItem), false);
        }
    }
}

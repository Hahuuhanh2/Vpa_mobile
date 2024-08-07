package se;

import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.ViewParams;
import ee.p;
import ee.t;
import ge.b;

/* compiled from: MagicalView */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MagicalView f14751a;

    public d(MagicalView magicalView) {
        this.f14751a = magicalView;
    }

    public final void run() {
        int i10;
        b u10;
        TransitionManager.beginDelayedTransition((ViewGroup) this.f14751a.f8115w.getParent(), new TransitionSet().setDuration(250).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
        t tVar = ((p) this.f14751a.D).f9402a;
        if (tVar.f9419z0) {
            i10 = tVar.f9415v0 + 1;
        } else {
            i10 = tVar.f9415v0;
        }
        ViewParams a10 = a.a(i10);
        if (!(a10 == null || (u10 = tVar.f9411r0.u(tVar.f9410q0.getCurrentItem())) == null)) {
            u10.f10459z.getLayoutParams().width = a10.f8124c;
            u10.f10459z.getLayoutParams().height = a10.f8125d;
            u10.f10459z.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.f14751a.f8115w.setTranslationX(0.0f);
        this.f14751a.f8115w.setTranslationY(0.0f);
        MagicalView magicalView = this.f14751a;
        magicalView.f8117y.b((float) magicalView.f8104e);
        MagicalView magicalView2 = this.f14751a;
        magicalView2.f8117y.a((float) magicalView2.f8103d);
        MagicalView magicalView3 = this.f14751a;
        f fVar = magicalView3.f8117y;
        int i11 = magicalView3.f8102c;
        ViewGroup.MarginLayoutParams marginLayoutParams = fVar.f14753a;
        marginLayoutParams.topMargin = i11;
        fVar.f14754b.setLayoutParams(marginLayoutParams);
        MagicalView magicalView4 = this.f14751a;
        f fVar2 = magicalView4.f8117y;
        int i12 = magicalView4.f8101b;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = fVar2.f14753a;
        marginLayoutParams2.leftMargin = i12;
        fVar2.f14754b.setLayoutParams(marginLayoutParams2);
        this.f14751a.b(true);
    }
}

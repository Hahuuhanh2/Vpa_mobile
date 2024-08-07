package se;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.basic.PictureSelectorTransparentActivity;
import com.luck.picture.lib.magical.MagicalView;
import ee.p;
import ee.t;

/* compiled from: MagicalView */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MagicalView f14752a;

    public e(MagicalView magicalView) {
        this.f14752a = magicalView;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        g gVar = this.f14752a.D;
        if (gVar != null) {
            t tVar = ((p) gVar).f9402a;
            if (tVar.A0) {
                if ((tVar.m() instanceof PictureSelectorSupporterActivity) || (tVar.m() instanceof PictureSelectorTransparentActivity)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && tVar.T0()) {
                    tVar.z0();
                    return;
                }
            }
            tVar.v0();
        }
    }
}

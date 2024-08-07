package ee;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.luck.picture.lib.R$anim;

/* compiled from: PictureSelectorPreviewFragment */
public final class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f9437a;

    public z(t tVar) {
        this.f9437a = tVar;
    }

    public final void onClick(View view) {
        t tVar = this.f9437a;
        if (!tVar.A0) {
            t tVar2 = this.f9437a;
            if (tVar2.l0(tVar.f9408o0.get(tVar.f9410q0.getCurrentItem()), tVar2.H0.isSelected()) == 0) {
                this.f9437a.f11878i0.getClass();
                t tVar3 = this.f9437a;
                tVar3.H0.startAnimation(AnimationUtils.loadAnimation(tVar3.r(), R$anim.ps_anim_modal_in));
            }
        } else if (tVar.B0) {
            tVar.f11878i0.getClass();
        }
    }
}

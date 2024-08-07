package w7;

import android.animation.ValueAnimator;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.e;
import com.google.android.material.textfield.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16684a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16685b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16684a = i10;
        this.f16685b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16684a) {
            case 0:
                c cVar = (c) this.f16685b;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f16697j.setAlpha((int) (255.0f * floatValue));
                cVar.f16711x = floatValue;
                return;
            case 1:
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) this.f16685b;
                clippableRoundedCornerLayout.a((float) clippableRoundedCornerLayout.getLeft(), (float) clippableRoundedCornerLayout.getTop(), (float) clippableRoundedCornerLayout.getRight(), (float) clippableRoundedCornerLayout.getBottom(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((e) this.f16685b).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                k kVar = (k) this.f16685b;
                kVar.getClass();
                kVar.f7077d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}

package w5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

/* compiled from: AnimationManager */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public PDFView f16487a;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f16488b;

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f16489c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16490d = false;

    /* renamed from: w5.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationManager */
    public class C0216a implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f16491a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16492b;

        public C0216a(float f10, float f11) {
            this.f16491a = f10;
            this.f16492b = f11;
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            a.this.f16487a.t();
            a aVar = a.this;
            if (aVar.f16487a.getScrollHandle() != null) {
                DefaultScrollHandle defaultScrollHandle = (DefaultScrollHandle) aVar.f16487a.getScrollHandle();
                defaultScrollHandle.f5103n.postDelayed(defaultScrollHandle.f5104o, 1000);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PDFView pDFView = a.this.f16487a;
            PointF pointF = new PointF(this.f16491a, this.f16492b);
            float f10 = floatValue / pDFView.f5056z;
            pDFView.f5056z = floatValue;
            float f11 = pDFView.f5055y * f10;
            float f12 = pointF.x;
            float f13 = (f12 - (f12 * f10)) + (pDFView.f5054x * f10);
            float f14 = pointF.y;
            pDFView.u(f13, (f14 - (f10 * f14)) + f11, true);
        }
    }

    public a(PDFView pDFView) {
        this.f16487a = pDFView;
        this.f16489c = new OverScroller(pDFView.getContext());
    }

    public final void a(float f10, float f11, float f12, float f13) {
        b();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f12, f13});
        this.f16488b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C0216a aVar = new C0216a(f10, f11);
        this.f16488b.addUpdateListener(aVar);
        this.f16488b.addListener(aVar);
        this.f16488b.setDuration(400);
        this.f16488b.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f16488b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16488b = null;
        }
        this.f16490d = false;
        this.f16489c.forceFinished(true);
    }
}

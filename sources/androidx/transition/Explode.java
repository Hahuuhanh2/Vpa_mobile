package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Transition;
import i3.b;
import i3.p;

public class Explode extends Visibility {
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public static final AccelerateInterpolator J = new AccelerateInterpolator();
    public int[] H;

    public Explode() {
        throw null;
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new int[2];
        this.f3449z = new b();
    }

    private void L(p pVar) {
        View view = pVar.f11063b;
        view.getLocationOnScreen(this.H);
        int[] iArr = this.H;
        int i10 = iArr[0];
        int i11 = iArr[1];
        pVar.f11062a.put("android:explode:screenBounds", new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    public final Animator N(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        if (pVar2 == null) {
            return null;
        }
        Rect rect = (Rect) pVar2.f11062a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        P(viewGroup, rect, this.H);
        int[] iArr = this.H;
        return j.a(view, pVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, I, this);
    }

    public final Animator O(ViewGroup viewGroup, View view, p pVar) {
        float f10;
        float f11;
        if (pVar == null) {
            return null;
        }
        Rect rect = (Rect) pVar.f11062a.get("android:explode:screenBounds");
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) pVar.f11063b.getTag(R$id.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f11 = ((float) (i12 - rect.left)) + translationX;
            int i13 = iArr[1];
            f10 = ((float) (i13 - rect.top)) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f11 = translationX;
            f10 = translationY;
        }
        P(viewGroup, rect, this.H);
        int[] iArr2 = this.H;
        return j.a(view, pVar, i10, i11, translationX, translationY, f11 + ((float) iArr2[0]), f10 + ((float) iArr2[1]), J, this);
    }

    public final void P(View view, Rect rect, int[] iArr) {
        Rect rect2;
        int i10;
        int i11;
        view.getLocationOnScreen(this.H);
        int[] iArr2 = this.H;
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        Transition.c cVar = this.A;
        if (cVar == null) {
            rect2 = null;
        } else {
            rect2 = cVar.a();
        }
        if (rect2 == null) {
            i11 = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i12;
            i10 = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i13;
        } else {
            i11 = rect2.centerX();
            i10 = rect2.centerY();
        }
        float centerX = (float) (rect.centerX() - i11);
        float centerY = (float) (rect.centerY() - i10);
        if (centerX == 0.0f && centerY == 0.0f) {
            float random = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerX = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = random;
        }
        float sqrt = (float) Math.sqrt((double) ((centerY * centerY) + (centerX * centerX)));
        int i14 = i11 - i12;
        int i15 = i10 - i13;
        float max = (float) Math.max(i14, view.getWidth() - i14);
        float max2 = (float) Math.max(i15, view.getHeight() - i15);
        float sqrt2 = (float) Math.sqrt((double) ((max2 * max2) + (max * max)));
        iArr[0] = Math.round((centerX / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY / sqrt));
    }

    public final void e(p pVar) {
        L(pVar);
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
        L(pVar);
    }
}

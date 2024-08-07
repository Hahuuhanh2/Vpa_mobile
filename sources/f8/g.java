package f8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.R$dimen;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;

/* compiled from: MaterialMainContainerBackHelper */
public final class g extends a<View> {

    /* renamed from: g  reason: collision with root package name */
    public final float f10056g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10057h;

    /* renamed from: i  reason: collision with root package name */
    public float f10058i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f10059j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f10060k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f10061l;

    public g(ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        super(clippableRoundedCornerLayout);
        Resources resources = clippableRoundedCornerLayout.getResources();
        this.f10056g = resources.getDimension(R$dimen.m3_back_progress_main_container_min_edge_gap);
        this.f10057h = resources.getDimension(R$dimen.m3_back_progress_main_container_max_translation_y);
    }

    public static int c(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public final AnimatorSet a(SearchBar searchBar) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f10041b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f10041b, View.SCALE_Y, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f10041b, View.TRANSLATION_X, new float[]{0.0f}), ObjectAnimator.ofFloat(this.f10041b, View.TRANSLATION_Y, new float[]{0.0f})});
        animatorSet.addListener(new f(searchBar));
        return animatorSet;
    }

    public final int b() {
        boolean z10;
        WindowInsets rootWindowInsets;
        if (this.f10061l == null) {
            int[] iArr = new int[2];
            this.f10041b.getLocationOnScreen(iArr);
            int i10 = 0;
            if (iArr[1] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = this.f10041b.getRootWindowInsets()) != null) {
                i10 = Math.max(Math.max(c(rootWindowInsets, 0), c(rootWindowInsets, 1)), Math.max(c(rootWindowInsets, 3), c(rootWindowInsets, 2)));
            }
            this.f10061l = Integer.valueOf(i10);
        }
        return this.f10061l.intValue();
    }
}

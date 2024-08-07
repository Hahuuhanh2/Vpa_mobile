package o8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import t7.b;

/* compiled from: ElasticTabIndicatorInterpolator */
public final class a extends com.google.android.material.tabs.a {
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        boolean z10;
        float f11;
        float f12;
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a10.left < a11.left) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            double d10 = (((double) f10) * 3.141592653589793d) / 2.0d;
            f12 = (float) (1.0d - Math.cos(d10));
            f11 = (float) Math.sin(d10);
        } else {
            double d11 = (((double) f10) * 3.141592653589793d) / 2.0d;
            f11 = (float) (1.0d - Math.cos(d11));
            f12 = (float) Math.sin(d11);
        }
        drawable.setBounds(b.b(f12, (int) a10.left, (int) a11.left), drawable.getBounds().top, b.b(f11, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}

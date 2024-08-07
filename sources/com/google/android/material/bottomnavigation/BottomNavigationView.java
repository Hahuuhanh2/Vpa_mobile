package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface a extends NavigationBarView.b {
    }

    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final NavigationBarMenuView a(Context context) {
        return new BottomNavigationMenuView(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.S != z10) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomNavigationStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomNavigationView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.R$style.Widget_Design_BottomNavigationView
            r6.<init>(r7, r8, r9, r4)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R$styleable.BottomNavigationView
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            androidx.appcompat.widget.n0 r8 = com.google.android.material.internal.u.e(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            r0 = 1
            boolean r9 = r8.a(r9, r0)
            r6.setItemHorizontalTranslationEnabled(r9)
            int r9 = com.google.android.material.R$styleable.BottomNavigationView_android_minHeight
            boolean r1 = r8.l(r9)
            if (r1 == 0) goto L_0x002d
            int r7 = r8.d(r9, r7)
            r6.setMinimumHeight(r7)
        L_0x002d:
            int r7 = com.google.android.material.R$styleable.BottomNavigationView_compatShadowEnabled
            r8.a(r7, r0)
            r8.n()
            u7.a r7 = new u7.a
            r7.<init>()
            com.google.android.material.internal.x.b(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

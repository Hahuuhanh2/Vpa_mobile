package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] A = {R$attr.snackbarButtonStyle, R$attr.snackbarTextViewStyle};

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f6846z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context, (AttributeSet) null);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f6846z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar i(View view, String str) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z10 = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z10 = false;
            }
            if (z10) {
                i10 = R$layout.mtrl_layout_snackbar_include;
            } else {
                i10 = R$layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i10, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f6818i.getChildAt(0)).getMessageView().setText(str);
            snackbar.f6820k = 0;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void a() {
        b(3);
    }

    public final int h() {
        int i10 = this.f6820k;
        if (i10 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f6846z.getRecommendedTimeoutMillis(i10, 3);
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r7 = this;
            com.google.android.material.snackbar.g r0 = com.google.android.material.snackbar.g.b()
            int r1 = r7.h()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r7.f6829t
            java.lang.Object r3 = r0.f6858a
            monitor-enter(r3)
            boolean r4 = r0.c(r2)     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0023
            com.google.android.material.snackbar.g$c r2 = r0.f6860c     // Catch:{ all -> 0x0074 }
            r2.f6864b = r1     // Catch:{ all -> 0x0074 }
            android.os.Handler r1 = r0.f6859b     // Catch:{ all -> 0x0074 }
            r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.g$c r1 = r0.f6860c     // Catch:{ all -> 0x0074 }
            r0.d(r1)     // Catch:{ all -> 0x0074 }
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0071
        L_0x0023:
            com.google.android.material.snackbar.g$c r4 = r0.f6861d     // Catch:{ all -> 0x0074 }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0035
            java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r4 = r4.f6863a     // Catch:{ all -> 0x0074 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0074 }
            if (r4 != r2) goto L_0x0035
            r4 = r5
            goto L_0x0036
        L_0x0035:
            r4 = r6
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r5 = r6
        L_0x003a:
            if (r5 == 0) goto L_0x0041
            com.google.android.material.snackbar.g$c r2 = r0.f6861d     // Catch:{ all -> 0x0074 }
            r2.f6864b = r1     // Catch:{ all -> 0x0074 }
            goto L_0x0048
        L_0x0041:
            com.google.android.material.snackbar.g$c r4 = new com.google.android.material.snackbar.g$c     // Catch:{ all -> 0x0074 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0074 }
            r0.f6861d = r4     // Catch:{ all -> 0x0074 }
        L_0x0048:
            com.google.android.material.snackbar.g$c r1 = r0.f6860c     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0055
            r2 = 4
            boolean r1 = r0.a(r1, r2)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0055
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0071
        L_0x0055:
            r1 = 0
            r0.f6860c = r1     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.g$c r2 = r0.f6861d     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0070
            r0.f6860c = r2     // Catch:{ all -> 0x0074 }
            r0.f6861d = r1     // Catch:{ all -> 0x0074 }
            java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r2 = r2.f6863a     // Catch:{ all -> 0x0074 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0074 }
            com.google.android.material.snackbar.g$b r2 = (com.google.android.material.snackbar.g.b) r2     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x006e
            r2.b()     // Catch:{ all -> 0x0074 }
            goto L_0x0070
        L_0x006e:
            r0.f6860c = r1     // Catch:{ all -> 0x0074 }
        L_0x0070:
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
        L_0x0071:
            return
        L_0x0072:
            monitor-exit(r3)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.j():void");
    }
}

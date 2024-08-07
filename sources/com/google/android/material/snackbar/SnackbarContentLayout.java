package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import f8.j;
import java.util.WeakHashMap;
import n8.h;
import t7.b;
import w1.d0;
import w1.q0;

public class SnackbarContentLayout extends LinearLayout implements h {

    /* renamed from: a  reason: collision with root package name */
    public TextView f6847a;

    /* renamed from: b  reason: collision with root package name */
    public Button f6848b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f6849c;

    /* renamed from: d  reason: collision with root package name */
    public int f6850d;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6847a.getPaddingTop() == i11 && this.f6847a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f6847a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.g(textView)) {
            d0.e.k(textView, d0.e.f(textView), i11, d0.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f6848b;
    }

    public TextView getMessageView() {
        return this.f6847a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6847a = (TextView) findViewById(R$id.snackbar_text);
        this.f6848b = (Button) findViewById(R$id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (a(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = com.google.android.material.R$dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = com.google.android.material.R$dimen.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f6847a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0030
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0030
            r3 = r1
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f6850d
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f6848b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f6850d
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r4
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f6850d = i10;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6849c = j.d(context, R$attr.motionEasingEmphasizedInterpolator, b.f14886b);
    }
}

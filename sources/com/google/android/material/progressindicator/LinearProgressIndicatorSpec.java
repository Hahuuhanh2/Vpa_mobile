package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import h8.b;

public final class LinearProgressIndicatorSpec extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f6636g;

    /* renamed from: h  reason: collision with root package name */
    public int f6637h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6638i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.linearProgressIndicatorStyle);
    }

    public final void a() {
        if (this.f6636g != 0) {
            return;
        }
        if (this.f10624b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f10625c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinearProgressIndicatorSpec(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.progressindicator.LinearProgressIndicator.f6635u
            r6.<init>(r7, r8, r9, r4)
            int[] r2 = com.google.android.material.R$styleable.LinearProgressIndicator
            int r3 = com.google.android.material.R$attr.linearProgressIndicatorStyle
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r8
            android.content.res.TypedArray r7 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r8 = com.google.android.material.R$styleable.LinearProgressIndicator_indeterminateAnimationType
            r0 = 1
            int r8 = r7.getInt(r8, r0)
            r6.f6636g = r8
            int r8 = com.google.android.material.R$styleable.LinearProgressIndicator_indicatorDirectionLinear
            int r8 = r7.getInt(r8, r9)
            r6.f6637h = r8
            r7.recycle()
            r6.a()
            int r7 = r6.f6637h
            if (r7 != r0) goto L_0x002e
            r9 = r0
        L_0x002e:
            r6.f6638i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.LinearProgressIndicatorSpec.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

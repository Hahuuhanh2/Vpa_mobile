package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import c8.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import java.util.WeakHashMap;
import m9.b;
import w1.d0;
import w1.q0;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: h0  reason: collision with root package name */
    public static final int f6867h0 = R$style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: i0  reason: collision with root package name */
    public static final int[][] f6868i0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: d0  reason: collision with root package name */
    public final a f6869d0;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f6870e0;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f6871f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f6872g0;

    public SwitchMaterial(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f6870e0 == null) {
            int A = b.A(R$attr.colorSurface, this);
            int A2 = b.A(R$attr.colorControlActivated, this);
            float dimension = getResources().getDimension(R$dimen.mtrl_switch_thumb_elevation);
            if (this.f6869d0.f4586a) {
                float f10 = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    f10 += d0.i.i((View) parent);
                }
                dimension += f10;
            }
            int a10 = this.f6869d0.a(A, dimension);
            this.f6870e0 = new ColorStateList(f6868i0, new int[]{b.K(1.0f, A, A2), a10, b.K(0.38f, A, A2), a10});
        }
        return this.f6870e0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f6871f0 == null) {
            int[][] iArr = f6868i0;
            int A = b.A(R$attr.colorSurface, this);
            int A2 = b.A(R$attr.colorControlActivated, this);
            int A3 = b.A(R$attr.colorOnSurface, this);
            this.f6871f0 = new ColorStateList(iArr, new int[]{b.K(0.54f, A, A2), b.K(0.32f, A, A3), b.K(0.12f, A, A2), b.K(0.12f, A, A3)});
        }
        return this.f6871f0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6872g0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f6872g0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f6872g0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f6867h0
            android.content.Context r7 = p8.a.a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            c8.a r7 = new c8.a
            r7.<init>(r0)
            r6.f6869d0 = r7
            int[] r2 = com.google.android.material.R$styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R$styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f6872g0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

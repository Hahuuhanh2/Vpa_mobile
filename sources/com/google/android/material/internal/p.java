package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutBuilderCompat */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f6482a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f6483b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6484c;

    /* renamed from: d  reason: collision with root package name */
    public int f6485d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f6486e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f6487f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f6488g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f6489h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f6490i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6491j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6492k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f6493l = null;

    /* compiled from: StaticLayoutBuilderCompat */
    public static class a extends Exception {
    }

    public p(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f6482a = charSequence;
        this.f6483b = textPaint;
        this.f6484c = i10;
        this.f6485d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f6482a == null) {
            this.f6482a = "";
        }
        int max = Math.max(0, this.f6484c);
        CharSequence charSequence = this.f6482a;
        if (this.f6487f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f6483b, (float) max, this.f6493l);
        }
        int min = Math.min(charSequence.length(), this.f6485d);
        this.f6485d = min;
        if (this.f6492k && this.f6487f == 1) {
            this.f6486e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f6483b, max);
        obtain.setAlignment(this.f6486e);
        obtain.setIncludePad(this.f6491j);
        if (this.f6492k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f6493l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6487f);
        float f10 = this.f6488g;
        if (!(f10 == 0.0f && this.f6489h == 1.0f)) {
            obtain.setLineSpacing(f10, this.f6489h);
        }
        if (this.f6487f > 1) {
            obtain.setHyphenationFrequency(this.f6490i);
        }
        return obtain.build();
    }
}

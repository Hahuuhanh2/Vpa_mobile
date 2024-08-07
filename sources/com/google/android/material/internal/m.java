package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator */
public final class m implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6476a;

    public m(Rect rect) {
        this.f6476a = rect;
    }

    public final Object evaluate(float f10, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i10 = rect.left;
        int i11 = i10 + ((int) (((float) (rect2.left - i10)) * f10));
        int i12 = rect.top;
        int i13 = i12 + ((int) (((float) (rect2.top - i12)) * f10));
        int i14 = rect.right;
        int i15 = rect.bottom;
        int i16 = i15 + ((int) (((float) (rect2.bottom - i15)) * f10));
        this.f6476a.set(i11, i13, i14 + ((int) (((float) (rect2.right - i14)) * f10)), i16);
        return this.f6476a;
    }
}

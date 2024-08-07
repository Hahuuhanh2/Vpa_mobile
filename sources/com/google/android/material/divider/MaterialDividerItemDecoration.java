package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import com.google.android.material.internal.x;
import i8.c;
import o1.a;
import v.v;

public class MaterialDividerItemDecoration extends RecyclerView.l {

    /* renamed from: i  reason: collision with root package name */
    public static final int f6237i = R$style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f6238a;

    /* renamed from: b  reason: collision with root package name */
    public int f6239b;

    /* renamed from: c  reason: collision with root package name */
    public int f6240c;

    /* renamed from: d  reason: collision with root package name */
    public int f6241d;

    /* renamed from: e  reason: collision with root package name */
    public int f6242e;

    /* renamed from: f  reason: collision with root package name */
    public int f6243f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6244g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f6245h = new Rect();

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10) {
        int i11 = R$attr.materialDividerStyle;
        TypedArray d10 = u.d(context, attributeSet, R$styleable.MaterialDivider, i11, f6237i, new int[0]);
        this.f6240c = c.a(context, d10, R$styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f6239b = d10.getDimensionPixelSize(R$styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R$dimen.material_divider_thickness));
        this.f6242e = d10.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetStart, 0);
        this.f6243f = d10.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f6244g = d10.getBoolean(R$styleable.MaterialDivider_lastItemDecorated, true);
        d10.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i12 = this.f6240c;
        this.f6240c = i12;
        this.f6238a = shapeDrawable;
        a.b.g(shapeDrawable, i12);
        if (i10 == 0 || i10 == 1) {
            this.f6241d = i10;
            return;
        }
        throw new IllegalArgumentException(v.d("Invalid orientation: ", i10, ". It should be either HORIZONTAL or VERTICAL"));
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        rect.set(0, 0, 0, 0);
        if (!g(recyclerView, view)) {
            return;
        }
        if (this.f6241d == 1) {
            rect.bottom = this.f6239b;
        } else if (x.g(recyclerView)) {
            rect.left = this.f6239b;
        } else {
            rect.right = this.f6239b;
        }
    }

    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (recyclerView.getLayoutManager() != null) {
            int i18 = 0;
            if (this.f6241d == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i15 = recyclerView.getPaddingLeft();
                    i14 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i15, recyclerView.getPaddingTop(), i14, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i14 = recyclerView.getWidth();
                    i15 = 0;
                }
                boolean g2 = x.g(recyclerView);
                if (g2) {
                    i16 = this.f6243f;
                } else {
                    i16 = this.f6242e;
                }
                int i19 = i15 + i16;
                if (g2) {
                    i17 = this.f6242e;
                } else {
                    i17 = this.f6243f;
                }
                int i20 = i14 - i17;
                int childCount = recyclerView.getChildCount();
                while (i18 < childCount) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (g(recyclerView, childAt)) {
                        recyclerView.getLayoutManager().K(childAt, this.f6245h);
                        int round = Math.round(childAt.getTranslationY()) + this.f6245h.bottom;
                        this.f6238a.setBounds(i19, round - this.f6239b, i20, round);
                        this.f6238a.draw(canvas);
                    }
                    i18++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i11 = recyclerView.getPaddingTop();
                i10 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), i10);
            } else {
                i10 = recyclerView.getHeight();
                i11 = 0;
            }
            int i21 = i11 + this.f6242e;
            int i22 = i10 - this.f6243f;
            boolean g10 = x.g(recyclerView);
            int childCount2 = recyclerView.getChildCount();
            while (i18 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i18);
                if (g(recyclerView, childAt2)) {
                    recyclerView.getLayoutManager().K(childAt2, this.f6245h);
                    int round2 = Math.round(childAt2.getTranslationX());
                    if (g10) {
                        i12 = this.f6245h.left + round2;
                        i13 = this.f6239b + i12;
                    } else {
                        i13 = round2 + this.f6245h.right;
                        i12 = i13 - this.f6239b;
                    }
                    this.f6238a.setBounds(i12, i21, i13, i22);
                    this.f6238a.draw(canvas);
                }
                i18++;
            }
            canvas.restore();
        }
    }

    public final boolean g(RecyclerView recyclerView, View view) {
        boolean z10;
        recyclerView.getClass();
        int M = RecyclerView.M(view);
        RecyclerView.e adapter = recyclerView.getAdapter();
        if (adapter == null || M != adapter.c() - 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (M == -1) {
            return false;
        }
        if (!z10 || this.f6244g) {
            return true;
        }
        return false;
    }
}

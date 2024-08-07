package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import m9.b;

public class CardView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1521f = {16842801};

    /* renamed from: n  reason: collision with root package name */
    public static final b f1522n = new b();

    /* renamed from: a  reason: collision with root package name */
    public boolean f1523a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1524b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1525c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1526d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1527e;

    public class a implements u0.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1528a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1526d.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1525c;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((u0.b) this.f1527e.f1528a).f15033h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1525c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1525c.left;
    }

    public int getContentPaddingRight() {
        return this.f1525c.right;
    }

    public int getContentPaddingTop() {
        return this.f1525c.top;
    }

    public float getMaxCardElevation() {
        return ((u0.b) this.f1527e.f1528a).f15030e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1524b;
    }

    public float getRadius() {
        return ((u0.b) this.f1527e.f1528a).f15026a;
    }

    public boolean getUseCompatPadding() {
        return this.f1523a;
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        a aVar = this.f1527e;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        u0.b bVar = (u0.b) aVar.f1528a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f1525c.set(i10, i11, i12, i13);
        f1522n.e0(this.f1527e);
    }

    public void setMaxCardElevation(float f10) {
        f1522n.V(this.f1527e, f10);
    }

    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1524b) {
            this.f1524b = z10;
            b bVar = f1522n;
            a aVar = this.f1527e;
            bVar.V(aVar, ((u0.b) aVar.f1528a).f15030e);
        }
    }

    public void setRadius(float f10) {
        u0.b bVar = (u0.b) this.f1527e.f1528a;
        if (f10 != bVar.f15026a) {
            bVar.f15026a = f10;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1523a != z10) {
            this.f1523a = z10;
            b bVar = f1522n;
            a aVar = this.f1527e;
            bVar.V(aVar, ((u0.b) aVar.f1528a).f15030e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ColorStateList colorStateList;
        int i11;
        Rect rect = new Rect();
        this.f1525c = rect;
        this.f1526d = new Rect();
        a aVar = new a();
        this.f1527e = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i10, R$style.CardView);
        int i12 = R$styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i12)) {
            colorStateList = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1521f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i11 = getResources().getColor(R$color.cardview_light_background);
            } else {
                i11 = getResources().getColor(R$color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i11);
        }
        float dimension = obtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R$styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R$styleable.CardView_cardMaxElevation, 0.0f);
        this.f1523a = obtainStyledAttributes.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
        this.f1524b = obtainStyledAttributes.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
        obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        b bVar = f1522n;
        u0.b bVar2 = new u0.b(dimension, colorStateList);
        aVar.f1528a = bVar2;
        setBackgroundDrawable(bVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.V(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        u0.b bVar = (u0.b) this.f1527e.f1528a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }
}

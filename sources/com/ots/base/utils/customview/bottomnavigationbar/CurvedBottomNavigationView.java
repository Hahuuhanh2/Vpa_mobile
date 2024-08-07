package com.ots.base.utils.customview.bottomnavigationbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.ots.core.R$color;
import com.ots.core.R$layout;
import kf.e;
import rk.l;
import sk.j;
import sk.k;
import w1.j0;
import xk.d;

/* compiled from: CurvedBottomNavigationView.kt */
public final class CurvedBottomNavigationView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Path f8296a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f8297b;

    /* renamed from: c  reason: collision with root package name */
    public Point f8298c = new Point();

    /* renamed from: d  reason: collision with root package name */
    public Point f8299d = new Point();

    /* renamed from: e  reason: collision with root package name */
    public Point f8300e = new Point();

    /* renamed from: f  reason: collision with root package name */
    public Point f8301f = new Point();

    /* renamed from: n  reason: collision with root package name */
    public Point f8302n = new Point();

    /* renamed from: o  reason: collision with root package name */
    public Point f8303o = new Point();

    /* renamed from: p  reason: collision with root package name */
    public Point f8304p = new Point();

    /* renamed from: q  reason: collision with root package name */
    public Point f8305q = new Point();

    /* renamed from: r  reason: collision with root package name */
    public final int f8306r = 28;

    /* renamed from: s  reason: collision with root package name */
    public final int f8307s = 30;

    /* renamed from: t  reason: collision with root package name */
    public final int f8308t = 30;

    /* renamed from: u  reason: collision with root package name */
    public final float f8309u;

    /* renamed from: v  reason: collision with root package name */
    public int f8310v;

    /* compiled from: _Sequences.kt */
    public static final class a extends k implements l<Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8311a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof BottomNavigationViewItem);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurvedBottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        Context context2 = getContext();
        j.e(context2, "getContext(...)");
        this.f8309u = (float) ((int) TypedValue.applyDimension(1, (float) 28, context2.getResources().getDisplayMetrics()));
        LayoutInflater.from(context).inflate(R$layout.bottom_navigation, this, false);
        setElevation((float) ((int) TypedValue.applyDimension(1, (float) 25, context.getResources().getDisplayMetrics())));
        setBackgroundResource(R$color.white);
        this.f8296a = new Path();
        Paint paint = new Paint(1);
        this.f8297b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.f8297b;
        j.c(paint2);
        paint2.setColor(-1);
        Paint paint3 = this.f8297b;
        j.c(paint3);
        paint3.setShadowLayer(20.0f, 0.0f, 0.0f, k1.a.getColor(getContext(), R$color.shadow_color));
        setBackgroundColor(0);
        setWillNotDraw(false);
        setLayerType(1, this.f8297b);
    }

    public static Path a(RectF rectF, float f10, float f11) {
        Path path = new Path();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        path.moveTo(rectF.left + f10, rectF.top);
        path.lineTo(rectF.right - f11, rectF.top);
        float f12 = rectF.right;
        float f13 = rectF.top;
        path.quadTo(f12, f13, f12, f11 + f13);
        path.lineTo(rectF.right, rectF.bottom - 0.0f);
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        path.quadTo(f14, f15, f14 - 0.0f, f15);
        path.lineTo(rectF.left + 0.0f, rectF.bottom);
        float f16 = rectF.left;
        float f17 = rectF.bottom;
        path.quadTo(f16, f17, f16, f17 - 0.0f);
        path.lineTo(rectF.left, rectF.top + f10);
        float f18 = rectF.left;
        float f19 = rectF.top;
        path.quadTo(f18, f19, f10 + f18, f19);
        path.close();
        return path;
    }

    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        j.f(canvas2, "canvas");
        super.onDraw(canvas);
        Path path = this.f8296a;
        j.c(path);
        path.reset();
        RectF rectF = new RectF(0.0f, 20.0f, (float) this.f8298c.x, (float) getHeight());
        Path path2 = this.f8296a;
        j.c(path2);
        path2.addPath(a(rectF, this.f8309u, 0.0f));
        RectF rectF2 = new RectF((float) this.f8298c.x, 20.0f, (float) this.f8303o.x, (float) getHeight());
        Path path3 = this.f8296a;
        j.c(path3);
        path3.addPath(a(rectF2, 0.0f, 0.0f));
        RectF rectF3 = new RectF((float) this.f8303o.x, 20.0f, (float) getWidth(), (float) getHeight());
        Path path4 = this.f8296a;
        j.c(path4);
        path4.addPath(a(rectF3, 0.0f, this.f8309u));
        Path path5 = this.f8296a;
        j.c(path5);
        path5.lineTo((float) this.f8298c.x, 20.0f);
        Path path6 = this.f8296a;
        j.c(path6);
        Point point = this.f8301f;
        float f10 = (float) point.x;
        float f11 = (float) 20;
        float f12 = ((float) point.y) + f11;
        Point point2 = this.f8300e;
        float f13 = (float) point2.y;
        Point point3 = this.f8299d;
        path6.cubicTo(f10, f12, (float) point2.x, f13, (float) point3.x, (float) point3.y);
        Path path7 = this.f8296a;
        j.c(path7);
        Point point4 = this.f8304p;
        float f14 = (float) point4.x;
        Point point5 = this.f8305q;
        float f15 = ((float) point5.y) + f11;
        Point point6 = this.f8303o;
        path7.cubicTo(f14, (float) point4.y, (float) point5.x, f15, (float) point6.x, ((float) point6.y) + f11);
        Paint paint = this.f8297b;
        if (paint != null) {
            Path path8 = this.f8296a;
            j.c(path8);
            canvas2.drawPath(path8, paint);
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8310v = getWidth();
        getHeight();
        this.f8298c.set((int) (((((double) this.f8310v) / 1.9d) - ((double) (e.f(this.f8306r, this) * 2))) - ((double) e.f(this.f8308t, this))), 0);
        this.f8299d.set(this.f8310v / 2, (e.f(this.f8306r, this) / 2) + (e.f(this.f8306r, this) * 2));
        this.f8302n = this.f8299d;
        this.f8303o.set((int) ((((double) this.f8310v) / 2.1d) + ((double) (e.f(this.f8306r, this) * 2)) + ((double) e.f(this.f8308t, this))), 0);
        this.f8301f.set((e.f(this.f8306r, this) / 4) + e.f(this.f8306r, this) + this.f8298c.x, this.f8298c.y);
        this.f8300e.set((e.f(this.f8306r, this) + (this.f8299d.x - (e.f(this.f8306r, this) * 2))) - e.f(this.f8307s, this), this.f8299d.y);
        this.f8304p.set(e.f(this.f8307s, this) + (((e.f(this.f8306r, this) * 2) + this.f8302n.x) - e.f(this.f8306r, this)), this.f8302n.y);
        this.f8305q.set(this.f8303o.x - ((e.f(this.f8306r, this) / 4) + e.f(this.f8306r, this)), this.f8303o.y);
    }

    public final void setOnBottomNavItemClickedListener(bf.a aVar) {
        j.f(aVar, "listener");
        j0 j0Var = new j0(this);
        a aVar2 = a.f8311a;
        j.f(aVar2, "predicate");
        d.a aVar3 = new d.a(new d(j0Var, aVar2));
        while (aVar3.hasNext()) {
            ((BottomNavigationViewItem) aVar3.next()).setListener(aVar);
        }
    }
}

package q.rorbin.badgeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import p3.l0;

public class QBadgeView extends View implements tl.a {
    public View A;
    public int B;
    public int C;
    public TextPaint D;
    public Paint E;
    public Paint F;
    public ViewGroup G;

    /* renamed from: a  reason: collision with root package name */
    public int f22730a;

    /* renamed from: b  reason: collision with root package name */
    public int f22731b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f22732c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f22733d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22734e;

    /* renamed from: f  reason: collision with root package name */
    public float f22735f;

    /* renamed from: n  reason: collision with root package name */
    public float f22736n;

    /* renamed from: o  reason: collision with root package name */
    public int f22737o;

    /* renamed from: p  reason: collision with root package name */
    public String f22738p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22739q;

    /* renamed from: r  reason: collision with root package name */
    public int f22740r;

    /* renamed from: s  reason: collision with root package name */
    public float f22741s;

    /* renamed from: t  reason: collision with root package name */
    public float f22742t;

    /* renamed from: u  reason: collision with root package name */
    public RectF f22743u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public RectF f22744v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public Paint.FontMetrics f22745w;

    /* renamed from: x  reason: collision with root package name */
    public PointF f22746x;

    /* renamed from: y  reason: collision with root package name */
    public PointF f22747y;

    /* renamed from: z  reason: collision with root package name */
    public PointF f22748z;

    public class a extends ViewGroup {
        public a(Context context) {
            super(context);
        }

        public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
            if (!(getParent() instanceof RelativeLayout)) {
                super.dispatchRestoreInstanceState(sparseArray);
            }
        }

        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public final void onMeasure(int i10, int i11) {
            View view = null;
            View view2 = null;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (!(childAt instanceof QBadgeView)) {
                    view = childAt;
                } else {
                    view2 = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i10, i11);
                return;
            }
            view.measure(i10, i11);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public QBadgeView(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        new Path();
        this.f22746x = new PointF();
        this.f22747y = new PointF();
        this.f22748z = new PointF();
        new PointF();
        new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.D = textPaint;
        textPaint.setAntiAlias(true);
        this.D.setSubpixelText(true);
        this.D.setFakeBoldText(true);
        this.D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        this.E.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.F = paint2;
        paint2.setAntiAlias(true);
        this.F.setStyle(Paint.Style.STROKE);
        this.f22730a = -1552832;
        this.f22731b = -1;
        this.f22735f = (float) l0.E(getContext(), 11.0f);
        this.f22736n = (float) l0.E(getContext(), 5.0f);
        this.f22737o = 0;
        this.f22740r = 8388661;
        this.f22741s = (float) l0.E(getContext(), 1.0f);
        this.f22742t = (float) l0.E(getContext(), 1.0f);
        l0.E(getContext(), 90.0f);
        this.f22739q = true;
        this.f22734e = false;
        setTranslationZ(1000.0f);
    }

    private float getBadgeCircleRadius() {
        float f10;
        float f11;
        if (this.f22738p.isEmpty()) {
            return this.f22736n;
        }
        if (this.f22738p.length() != 1) {
            return this.f22744v.height() / 2.0f;
        }
        if (this.f22743u.height() > this.f22743u.width()) {
            f11 = this.f22743u.height() / 2.0f;
            f10 = this.f22736n;
        } else {
            f11 = this.f22743u.width() / 2.0f;
            f10 = this.f22736n;
        }
        return (f10 * 0.5f) + f11;
    }

    public final void a(View view) {
        if (view != null) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new IllegalStateException("targetView must have a parent");
            }
            this.A = view;
            if (parent instanceof a) {
                ((a) parent).addView(this);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            viewGroup.removeView(view);
            a aVar = new a(getContext());
            if (viewGroup instanceof RelativeLayout) {
                aVar.setId(view.getId());
            }
            viewGroup.addView(aVar, indexOfChild, layoutParams);
            aVar.addView(view);
            aVar.addView(this);
            return;
        }
        throw new IllegalStateException("targetView can not be null");
    }

    public final void b() {
        if (this.f22738p != null && this.f22734e) {
            Bitmap bitmap = this.f22733d;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f22733d.recycle();
            }
            float badgeCircleRadius = getBadgeCircleRadius();
            if (this.f22738p.isEmpty() || this.f22738p.length() == 1) {
                int i10 = ((int) badgeCircleRadius) * 2;
                this.f22733d = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(this.f22733d);
                canvas.drawCircle(((float) canvas.getWidth()) / 2.0f, ((float) canvas.getHeight()) / 2.0f, ((float) canvas.getWidth()) / 2.0f, this.E);
                return;
            }
            this.f22733d = Bitmap.createBitmap((int) ((this.f22736n * 2.0f) + this.f22743u.width()), (int) (this.f22743u.height() + this.f22736n), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(this.f22733d);
            canvas2.drawRoundRect(0.0f, 0.0f, (float) canvas2.getWidth(), (float) canvas2.getHeight(), ((float) canvas2.getHeight()) / 2.0f, ((float) canvas2.getHeight()) / 2.0f, this.E);
        }
    }

    public final void c(Canvas canvas) {
        this.E.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        RectF rectF = this.f22744v;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        if (this.f22734e) {
            i12 = this.f22733d.getWidth() + i10;
            i13 = this.f22733d.getHeight() + i11;
            canvas.saveLayer((float) i10, (float) i11, (float) i12, (float) i13, (Paint) null, 31);
        }
        this.f22732c.setBounds(i10, i11, i12, i13);
        this.f22732c.draw(canvas);
        if (this.f22734e) {
            this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f22733d, (float) i10, (float) i11, this.E);
            canvas.restore();
            this.E.setXfermode((Xfermode) null);
            if (this.f22738p.isEmpty() || this.f22738p.length() == 1) {
                canvas.drawCircle(this.f22744v.centerX(), this.f22744v.centerY(), this.f22744v.width() / 2.0f, this.F);
                return;
            }
            RectF rectF2 = this.f22744v;
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f22744v.height() / 2.0f, this.F);
            return;
        }
        canvas.drawRect(this.f22744v, this.F);
    }

    public final void d(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            d((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.G = (ViewGroup) view;
        }
    }

    public final void e() {
        RectF rectF = this.f22743u;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        if (TextUtils.isEmpty(this.f22738p)) {
            RectF rectF2 = this.f22743u;
            rectF2.right = 0.0f;
            rectF2.bottom = 0.0f;
        } else {
            this.D.setTextSize(this.f22735f);
            this.f22743u.right = this.D.measureText(this.f22738p);
            Paint.FontMetrics fontMetrics = this.D.getFontMetrics();
            this.f22745w = fontMetrics;
            this.f22743u.bottom = fontMetrics.descent - fontMetrics.ascent;
        }
        b();
    }

    public final QBadgeView f(String str) {
        this.f22738p = str;
        this.f22737o = 1;
        e();
        invalidate();
        return this;
    }

    public final QBadgeView g() {
        this.f22741s = 0.0f;
        this.f22742t = -2.0f;
        invalidate();
        return this;
    }

    public Drawable getBadgeBackground() {
        return this.f22732c;
    }

    public int getBadgeBackgroundColor() {
        return this.f22730a;
    }

    public int getBadgeGravity() {
        return this.f22740r;
    }

    public int getBadgeNumber() {
        return this.f22737o;
    }

    public String getBadgeText() {
        return this.f22738p;
    }

    public int getBadgeTextColor() {
        return this.f22731b;
    }

    public PointF getDragCenter() {
        return null;
    }

    public View getTargetView() {
        return this.A;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G == null) {
            View view = this.A;
            ViewGroup viewGroup = (ViewGroup) view.getRootView();
            this.G = viewGroup;
            if (viewGroup == null) {
                d(view);
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f22738p != null) {
            boolean z10 = this.f22739q;
            int E2 = l0.E(getContext(), 1.0f);
            int E3 = l0.E(getContext(), 1.5f);
            Paint paint = this.E;
            if (z10) {
                f10 = (float) l0.E(getContext(), 2.0f);
            } else {
                f10 = 0.0f;
            }
            paint.setShadowLayer(f10, (float) E2, (float) E3, 855638016);
            this.E.setColor(this.f22730a);
            this.F.setColor(0);
            this.F.setStrokeWidth(0.0f);
            this.D.setColor(this.f22731b);
            this.D.setTextAlign(Paint.Align.CENTER);
            float badgeCircleRadius = getBadgeCircleRadius();
            PointF pointF = this.f22748z;
            PointF pointF2 = this.f22747y;
            Math.sqrt(Math.pow((double) (pointF.y - pointF2.y), 2.0d) + Math.pow((double) (pointF.x - pointF2.x), 2.0d));
            if (this.f22743u.height() > this.f22743u.width()) {
                f11 = this.f22743u.height();
            } else {
                f11 = this.f22743u.width();
            }
            switch (this.f22740r) {
                case 17:
                    PointF pointF3 = this.f22746x;
                    pointF3.x = ((float) this.B) / 2.0f;
                    pointF3.y = ((float) this.C) / 2.0f;
                    break;
                case 49:
                    PointF pointF4 = this.f22746x;
                    pointF4.x = ((float) this.B) / 2.0f;
                    pointF4.y = (this.f22743u.height() / 2.0f) + this.f22742t + this.f22736n;
                    break;
                case 81:
                    PointF pointF5 = this.f22746x;
                    pointF5.x = ((float) this.B) / 2.0f;
                    pointF5.y = ((float) this.C) - ((this.f22743u.height() / 2.0f) + (this.f22742t + this.f22736n));
                    break;
                case 8388627:
                    PointF pointF6 = this.f22746x;
                    pointF6.x = (f11 / 2.0f) + this.f22741s + this.f22736n;
                    pointF6.y = ((float) this.C) / 2.0f;
                    break;
                case 8388629:
                    PointF pointF7 = this.f22746x;
                    pointF7.x = ((float) this.B) - ((f11 / 2.0f) + (this.f22741s + this.f22736n));
                    pointF7.y = ((float) this.C) / 2.0f;
                    break;
                case 8388659:
                    PointF pointF8 = this.f22746x;
                    float f12 = this.f22741s;
                    float f13 = this.f22736n;
                    pointF8.x = (f11 / 2.0f) + f12 + f13;
                    pointF8.y = (this.f22743u.height() / 2.0f) + this.f22742t + f13;
                    break;
                case 8388661:
                    PointF pointF9 = this.f22746x;
                    float f14 = this.f22741s;
                    float f15 = this.f22736n;
                    pointF9.x = ((float) this.B) - ((f11 / 2.0f) + (f14 + f15));
                    pointF9.y = (this.f22743u.height() / 2.0f) + this.f22742t + f15;
                    break;
                case 8388691:
                    PointF pointF10 = this.f22746x;
                    float f16 = this.f22741s;
                    float f17 = this.f22736n;
                    pointF10.x = (f11 / 2.0f) + f16 + f17;
                    pointF10.y = ((float) this.C) - ((this.f22743u.height() / 2.0f) + (this.f22742t + f17));
                    break;
                case 8388693:
                    PointF pointF11 = this.f22746x;
                    float f18 = this.f22741s;
                    float f19 = this.f22736n;
                    pointF11.x = ((float) this.B) - ((f11 / 2.0f) + (f18 + f19));
                    pointF11.y = ((float) this.C) - ((this.f22743u.height() / 2.0f) + (this.f22742t + f19));
                    break;
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            PointF pointF12 = this.f22748z;
            PointF pointF13 = this.f22746x;
            pointF12.x = pointF13.x + ((float) iArr[0]);
            pointF12.y = pointF13.y + ((float) iArr[1]);
            if (pointF13.x != -1000.0f || pointF13.y != -1000.0f) {
                if (this.f22738p.isEmpty() || this.f22738p.length() == 1) {
                    RectF rectF = this.f22744v;
                    float f20 = pointF13.x;
                    float f21 = (float) ((int) badgeCircleRadius);
                    rectF.left = f20 - f21;
                    float f22 = pointF13.y;
                    rectF.top = f22 - f21;
                    rectF.right = f20 + f21;
                    rectF.bottom = f21 + f22;
                    if (this.f22732c != null) {
                        c(canvas);
                    } else {
                        canvas.drawCircle(f20, f22, badgeCircleRadius, this.E);
                    }
                } else {
                    this.f22744v.left = pointF13.x - ((this.f22743u.width() / 2.0f) + this.f22736n);
                    this.f22744v.top = pointF13.y - ((this.f22736n * 0.5f) + (this.f22743u.height() / 2.0f));
                    this.f22744v.right = (this.f22743u.width() / 2.0f) + this.f22736n + pointF13.x;
                    this.f22744v.bottom = (this.f22736n * 0.5f) + (this.f22743u.height() / 2.0f) + pointF13.y;
                    float height = this.f22744v.height() / 2.0f;
                    if (this.f22732c != null) {
                        c(canvas);
                    } else {
                        canvas.drawRoundRect(this.f22744v, height, height, this.E);
                    }
                }
                if (!this.f22738p.isEmpty()) {
                    String str = this.f22738p;
                    float f23 = pointF13.x;
                    RectF rectF2 = this.f22744v;
                    float f24 = rectF2.bottom + rectF2.top;
                    Paint.FontMetrics fontMetrics = this.f22745w;
                    canvas.drawText(str, f23, ((f24 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.D);
                }
            }
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.B = i10;
        this.C = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 != 6) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r1) goto L_0x0016
            r2 = 2
            if (r0 == r2) goto L_0x0025
            r2 = 3
            if (r0 == r2) goto L_0x0016
            r2 = 5
            if (r0 == r2) goto L_0x001f
            r2 = 6
            if (r0 == r2) goto L_0x0016
            goto L_0x0025
        L_0x0016:
            int r0 = r4.getActionIndex()
            int r0 = r4.getPointerId(r0)
            goto L_0x0025
        L_0x001f:
            r4.getX()
            r4.getY()
        L_0x0025:
            boolean r4 = super.onTouchEvent(r4)
            if (r4 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.rorbin.badgeview.QBadgeView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

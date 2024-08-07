package com.ortiz.touchview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

public class TouchImageView extends ImageView {
    public static final /* synthetic */ int I = 0;
    public float A;
    public float B;
    public float C;
    public float D;
    public ScaleGestureDetector E;
    public GestureDetector F;
    public GestureDetector.OnDoubleTapListener G;
    public View.OnTouchListener H;

    /* renamed from: a  reason: collision with root package name */
    public float f8163a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f8164b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f8165c;

    /* renamed from: d  reason: collision with root package name */
    public i f8166d;

    /* renamed from: e  reason: collision with root package name */
    public float f8167e;

    /* renamed from: f  reason: collision with root package name */
    public float f8168f;

    /* renamed from: n  reason: collision with root package name */
    public float f8169n;

    /* renamed from: o  reason: collision with root package name */
    public float f8170o;

    /* renamed from: p  reason: collision with root package name */
    public float[] f8171p;

    /* renamed from: q  reason: collision with root package name */
    public Context f8172q;

    /* renamed from: r  reason: collision with root package name */
    public d f8173r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView.ScaleType f8174s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8175t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8176u;

    /* renamed from: v  reason: collision with root package name */
    public j f8177v;

    /* renamed from: w  reason: collision with root package name */
    public int f8178w;

    /* renamed from: x  reason: collision with root package name */
    public int f8179x;

    /* renamed from: y  reason: collision with root package name */
    public int f8180y;

    /* renamed from: z  reason: collision with root package name */
    public int f8181z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8182a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8182a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8182a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ortiz.touchview.TouchImageView.a.<clinit>():void");
        }
    }

    @TargetApi(9)
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public OverScroller f8183a;

        public b(Context context) {
            this.f8183a = new OverScroller(context);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public long f8184a;

        /* renamed from: b  reason: collision with root package name */
        public float f8185b;

        /* renamed from: c  reason: collision with root package name */
        public float f8186c;

        /* renamed from: d  reason: collision with root package name */
        public float f8187d;

        /* renamed from: e  reason: collision with root package name */
        public float f8188e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8189f;

        /* renamed from: n  reason: collision with root package name */
        public AccelerateDecelerateInterpolator f8190n = new AccelerateDecelerateInterpolator();

        /* renamed from: o  reason: collision with root package name */
        public PointF f8191o;

        /* renamed from: p  reason: collision with root package name */
        public PointF f8192p;

        public c(float f10, float f11, float f12, boolean z10) {
            TouchImageView.this.setState(i.ANIMATE_ZOOM);
            this.f8184a = System.currentTimeMillis();
            this.f8185b = TouchImageView.this.f8163a;
            this.f8186c = f10;
            this.f8189f = z10;
            PointF j10 = TouchImageView.this.j(f11, f12, false);
            float f13 = j10.x;
            this.f8187d = f13;
            float f14 = j10.y;
            this.f8188e = f14;
            this.f8191o = TouchImageView.d(TouchImageView.this, f13, f14);
            this.f8192p = new PointF((float) (TouchImageView.this.f8178w / 2), (float) (TouchImageView.this.f8179x / 2));
        }

        public final void run() {
            float interpolation = this.f8190n.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f8184a)) / 500.0f));
            float f10 = this.f8185b;
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.i(((double) android.support.v4.media.a.e(this.f8186c, f10, interpolation, f10)) / ((double) touchImageView.f8163a), this.f8187d, this.f8188e, this.f8189f);
            PointF pointF = this.f8191o;
            float f11 = pointF.x;
            PointF pointF2 = this.f8192p;
            float e10 = android.support.v4.media.a.e(pointF2.x, f11, interpolation, f11);
            float f12 = pointF.y;
            float e11 = android.support.v4.media.a.e(pointF2.y, f12, interpolation, f12);
            PointF d10 = TouchImageView.d(TouchImageView.this, this.f8187d, this.f8188e);
            TouchImageView.this.f8164b.postTranslate(e10 - d10.x, e11 - d10.y);
            TouchImageView.this.f();
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.setImageMatrix(touchImageView2.f8164b);
            TouchImageView.this.getClass();
            if (interpolation < 1.0f) {
                TouchImageView.this.postOnAnimation(this);
            } else {
                TouchImageView.this.setState(i.NONE);
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public b f8194a;

        /* renamed from: b  reason: collision with root package name */
        public int f8195b;

        /* renamed from: c  reason: collision with root package name */
        public int f8196c;

        public d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            TouchImageView.this.setState(i.FLING);
            this.f8194a = new b(TouchImageView.this.f8172q);
            TouchImageView.this.f8164b.getValues(TouchImageView.this.f8171p);
            float[] fArr = TouchImageView.this.f8171p;
            int i16 = (int) fArr[2];
            int i17 = (int) fArr[5];
            float b10 = TouchImageView.this.getImageWidth();
            int i18 = TouchImageView.this.f8178w;
            if (b10 > ((float) i18)) {
                i13 = i18 - ((int) TouchImageView.this.getImageWidth());
                i12 = 0;
            } else {
                i13 = i16;
                i12 = i13;
            }
            float c10 = TouchImageView.this.getImageHeight();
            int i19 = TouchImageView.this.f8179x;
            if (c10 > ((float) i19)) {
                i15 = i19 - ((int) TouchImageView.this.getImageHeight());
                i14 = 0;
            } else {
                i15 = i17;
                i14 = i15;
            }
            this.f8194a.f8183a.fling(i16, i17, i10, i11, i13, i12, i15, i14);
            this.f8195b = i16;
            this.f8196c = i17;
        }

        public final void run() {
            TouchImageView.this.getClass();
            if (this.f8194a.f8183a.isFinished()) {
                this.f8194a = null;
                return;
            }
            b bVar = this.f8194a;
            bVar.f8183a.computeScrollOffset();
            if (bVar.f8183a.computeScrollOffset()) {
                int currX = this.f8194a.f8183a.getCurrX();
                int currY = this.f8194a.f8183a.getCurrY();
                int i10 = currX - this.f8195b;
                int i11 = currY - this.f8196c;
                this.f8195b = currX;
                this.f8196c = currY;
                TouchImageView.this.f8164b.postTranslate((float) i10, (float) i11);
                TouchImageView.this.g();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.f8164b);
                TouchImageView.this.postOnAnimation(this);
            }
        }
    }

    public class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.G;
            if (onDoubleTapListener != null) {
                z10 = onDoubleTapListener.onDoubleTap(motionEvent);
            } else {
                z10 = false;
            }
            TouchImageView touchImageView = TouchImageView.this;
            if (touchImageView.f8166d != i.NONE) {
                return z10;
            }
            float f11 = touchImageView.f8163a;
            float f12 = touchImageView.f8167e;
            if (f11 == f12) {
                f10 = touchImageView.f8168f;
            } else {
                f10 = f12;
            }
            TouchImageView.this.postOnAnimation(new c(f10, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.G;
            if (onDoubleTapListener != null) {
                return onDoubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            d dVar = TouchImageView.this.f8173r;
            if (!(dVar == null || dVar.f8194a == null)) {
                TouchImageView.this.setState(i.NONE);
                dVar.f8194a.f8183a.forceFinished(true);
            }
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.f8173r = new d((int) f10, (int) f11);
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.postOnAnimation(touchImageView2.f8173r);
            return super.onFling(motionEvent, motionEvent2, f10, f11);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            TouchImageView.this.performLongClick();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            TouchImageView touchImageView = TouchImageView.this;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = touchImageView.G;
            if (onDoubleTapListener != null) {
                return onDoubleTapListener.onSingleTapConfirmed(motionEvent);
            }
            return touchImageView.performClick();
        }
    }

    public interface f {
        void a();
    }

    public class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public PointF f8199a = new PointF();

        public g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r2 != 6) goto L_0x00a4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                com.ortiz.touchview.TouchImageView$i r0 = com.ortiz.touchview.TouchImageView.i.DRAG
                com.ortiz.touchview.TouchImageView r1 = com.ortiz.touchview.TouchImageView.this
                android.view.ScaleGestureDetector r1 = r1.E
                r1.onTouchEvent(r9)
                com.ortiz.touchview.TouchImageView r1 = com.ortiz.touchview.TouchImageView.this
                android.view.GestureDetector r1 = r1.F
                r1.onTouchEvent(r9)
                android.graphics.PointF r1 = new android.graphics.PointF
                float r2 = r9.getX()
                float r3 = r9.getY()
                r1.<init>(r2, r3)
                com.ortiz.touchview.TouchImageView r2 = com.ortiz.touchview.TouchImageView.this
                com.ortiz.touchview.TouchImageView$i r2 = r2.f8166d
                com.ortiz.touchview.TouchImageView$i r3 = com.ortiz.touchview.TouchImageView.i.NONE
                r4 = 1
                if (r2 == r3) goto L_0x002c
                if (r2 == r0) goto L_0x002c
                com.ortiz.touchview.TouchImageView$i r5 = com.ortiz.touchview.TouchImageView.i.FLING
                if (r2 != r5) goto L_0x00a4
            L_0x002c:
                int r2 = r9.getAction()
                if (r2 == 0) goto L_0x0084
                if (r2 == r4) goto L_0x007e
                r5 = 2
                if (r2 == r5) goto L_0x003b
                r0 = 6
                if (r2 == r0) goto L_0x007e
                goto L_0x00a4
            L_0x003b:
                com.ortiz.touchview.TouchImageView r2 = com.ortiz.touchview.TouchImageView.this
                com.ortiz.touchview.TouchImageView$i r3 = r2.f8166d
                if (r3 != r0) goto L_0x00a4
                float r0 = r1.x
                android.graphics.PointF r3 = r7.f8199a
                float r5 = r3.x
                float r0 = r0 - r5
                float r5 = r1.y
                float r3 = r3.y
                float r5 = r5 - r3
                int r3 = r2.f8178w
                float r3 = (float) r3
                float r2 = r2.getImageWidth()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                r3 = 0
                if (r2 > 0) goto L_0x005a
                r0 = r3
            L_0x005a:
                com.ortiz.touchview.TouchImageView r2 = com.ortiz.touchview.TouchImageView.this
                int r6 = r2.f8179x
                float r6 = (float) r6
                float r2 = r2.getImageHeight()
                int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r2 > 0) goto L_0x0068
                r5 = r3
            L_0x0068:
                com.ortiz.touchview.TouchImageView r2 = com.ortiz.touchview.TouchImageView.this
                android.graphics.Matrix r2 = r2.f8164b
                r2.postTranslate(r0, r5)
                com.ortiz.touchview.TouchImageView r0 = com.ortiz.touchview.TouchImageView.this
                r0.g()
                android.graphics.PointF r0 = r7.f8199a
                float r2 = r1.x
                float r1 = r1.y
                r0.set(r2, r1)
                goto L_0x00a4
            L_0x007e:
                com.ortiz.touchview.TouchImageView r0 = com.ortiz.touchview.TouchImageView.this
                r0.setState(r3)
                goto L_0x00a4
            L_0x0084:
                android.graphics.PointF r2 = r7.f8199a
                r2.set(r1)
                com.ortiz.touchview.TouchImageView r1 = com.ortiz.touchview.TouchImageView.this
                com.ortiz.touchview.TouchImageView$d r1 = r1.f8173r
                if (r1 == 0) goto L_0x009f
                com.ortiz.touchview.TouchImageView$b r2 = r1.f8194a
                if (r2 == 0) goto L_0x009f
                com.ortiz.touchview.TouchImageView r2 = com.ortiz.touchview.TouchImageView.this
                r2.setState(r3)
                com.ortiz.touchview.TouchImageView$b r1 = r1.f8194a
                android.widget.OverScroller r1 = r1.f8183a
                r1.forceFinished(r4)
            L_0x009f:
                com.ortiz.touchview.TouchImageView r1 = com.ortiz.touchview.TouchImageView.this
                r1.setState(r0)
            L_0x00a4:
                com.ortiz.touchview.TouchImageView r0 = com.ortiz.touchview.TouchImageView.this
                android.graphics.Matrix r1 = r0.f8164b
                r0.setImageMatrix(r1)
                com.ortiz.touchview.TouchImageView r0 = com.ortiz.touchview.TouchImageView.this
                android.view.View$OnTouchListener r0 = r0.H
                if (r0 == 0) goto L_0x00b4
                r0.onTouch(r8, r9)
            L_0x00b4:
                com.ortiz.touchview.TouchImageView r8 = com.ortiz.touchview.TouchImageView.this
                r8.getClass()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ortiz.touchview.TouchImageView.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public class h extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public h() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            int i10 = TouchImageView.I;
            TouchImageView.this.i((double) scaleGestureDetector.getScaleFactor(), focusX, focusY, true);
            TouchImageView.this.getClass();
            return true;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.setState(i.ZOOM);
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(i.NONE);
            TouchImageView touchImageView = TouchImageView.this;
            float f10 = touchImageView.f8163a;
            float f11 = touchImageView.f8168f;
            boolean z10 = true;
            if (f10 <= f11) {
                f11 = touchImageView.f8167e;
                if (f10 >= f11) {
                    z10 = false;
                    f11 = f10;
                }
            }
            if (z10) {
                TouchImageView.this.postOnAnimation(new c(f11, (float) (touchImageView.f8178w / 2), (float) (touchImageView.f8179x / 2), true));
            }
        }
    }

    public enum i {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    public class j {

        /* renamed from: a  reason: collision with root package name */
        public float f8208a;

        /* renamed from: b  reason: collision with root package name */
        public float f8209b;

        /* renamed from: c  reason: collision with root package name */
        public float f8210c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView.ScaleType f8211d;

        public j(float f10, float f11, float f12, ImageView.ScaleType scaleType) {
            this.f8208a = f10;
            this.f8209b = f11;
            this.f8210c = f12;
            this.f8211d = scaleType;
        }
    }

    public TouchImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static PointF d(TouchImageView touchImageView, float f10, float f11) {
        touchImageView.f8164b.getValues(touchImageView.f8171p);
        float intrinsicWidth = f10 / ((float) touchImageView.getDrawable().getIntrinsicWidth());
        float intrinsicHeight = f11 / ((float) touchImageView.getDrawable().getIntrinsicHeight());
        return new PointF((touchImageView.getImageWidth() * intrinsicWidth) + touchImageView.f8171p[2], (touchImageView.getImageHeight() * intrinsicHeight) + touchImageView.f8171p[5]);
    }

    /* access modifiers changed from: private */
    public float getImageHeight() {
        return this.B * this.f8163a;
    }

    /* access modifiers changed from: private */
    public float getImageWidth() {
        return this.A * this.f8163a;
    }

    /* access modifiers changed from: private */
    public void setState(i iVar) {
        this.f8166d = iVar;
    }

    public final boolean canScrollHorizontally(int i10) {
        this.f8164b.getValues(this.f8171p);
        float f10 = this.f8171p[2];
        if (getImageWidth() < ((float) this.f8178w)) {
            return false;
        }
        if (f10 >= -1.0f && i10 < 0) {
            return false;
        }
        if (Math.abs(f10) + ((float) this.f8178w) + 1.0f < getImageWidth() || i10 <= 0) {
            return true;
        }
        return false;
    }

    public final boolean canScrollVertically(int i10) {
        this.f8164b.getValues(this.f8171p);
        float f10 = this.f8171p[5];
        if (getImageHeight() < ((float) this.f8179x)) {
            return false;
        }
        if (f10 >= -1.0f && i10 < 0) {
            return false;
        }
        if (Math.abs(f10) + ((float) this.f8179x) + 1.0f < getImageHeight() || i10 <= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r13 = this;
            android.graphics.drawable.Drawable r0 = r13.getDrawable()
            if (r0 == 0) goto L_0x00fa
            int r1 = r0.getIntrinsicWidth()
            if (r1 == 0) goto L_0x00fa
            int r1 = r0.getIntrinsicHeight()
            if (r1 != 0) goto L_0x0014
            goto L_0x00fa
        L_0x0014:
            android.graphics.Matrix r1 = r13.f8164b
            if (r1 == 0) goto L_0x00fa
            android.graphics.Matrix r1 = r13.f8165c
            if (r1 != 0) goto L_0x001e
            goto L_0x00fa
        L_0x001e:
            int r9 = r0.getIntrinsicWidth()
            int r0 = r0.getIntrinsicHeight()
            int r1 = r13.f8178w
            float r1 = (float) r1
            float r2 = (float) r9
            float r1 = r1 / r2
            int r3 = r13.f8179x
            float r3 = (float) r3
            float r4 = (float) r0
            float r3 = r3 / r4
            int[] r5 = com.ortiz.touchview.TouchImageView.a.f8182a
            android.widget.ImageView$ScaleType r6 = r13.f8174s
            int r6 = r6.ordinal()
            r6 = r5[r6]
            r7 = 1065353216(0x3f800000, float:1.0)
            switch(r6) {
                case 1: goto L_0x0054;
                case 2: goto L_0x004f;
                case 3: goto L_0x0040;
                case 4: goto L_0x0049;
                case 5: goto L_0x0049;
                case 6: goto L_0x0049;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0056
        L_0x0040:
            float r1 = java.lang.Math.min(r1, r3)
            float r1 = java.lang.Math.min(r7, r1)
            r3 = r1
        L_0x0049:
            float r1 = java.lang.Math.min(r1, r3)
        L_0x004d:
            r3 = r1
            goto L_0x0056
        L_0x004f:
            float r1 = java.lang.Math.max(r1, r3)
            goto L_0x004d
        L_0x0054:
            r1 = r7
            goto L_0x004d
        L_0x0056:
            int r6 = r13.f8178w
            float r8 = (float) r6
            float r10 = r1 * r2
            float r8 = r8 - r10
            int r10 = r13.f8179x
            float r11 = (float) r10
            float r12 = r3 * r4
            float r11 = r11 - r12
            float r6 = (float) r6
            float r6 = r6 - r8
            r13.A = r6
            float r6 = (float) r10
            float r6 = r6 - r11
            r13.B = r6
            float r6 = r13.f8163a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r10 = 0
            if (r6 == 0) goto L_0x0073
            r6 = 1
            goto L_0x0074
        L_0x0073:
            r6 = r10
        L_0x0074:
            r12 = 5
            if (r6 != 0) goto L_0x00a6
            boolean r6 = r13.f8175t
            if (r6 != 0) goto L_0x00a6
            android.graphics.Matrix r0 = r13.f8164b
            r0.setScale(r1, r3)
            android.widget.ImageView$ScaleType r0 = r13.f8174s
            int r0 = r0.ordinal()
            r0 = r5[r0]
            if (r0 == r12) goto L_0x009d
            r1 = 6
            if (r0 == r1) goto L_0x0097
            android.graphics.Matrix r0 = r13.f8164b
            r1 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r1
            float r11 = r11 / r1
            r0.postTranslate(r8, r11)
            goto L_0x00a3
        L_0x0097:
            android.graphics.Matrix r0 = r13.f8164b
            r0.postTranslate(r8, r11)
            goto L_0x00a3
        L_0x009d:
            android.graphics.Matrix r0 = r13.f8164b
            r1 = 0
            r0.postTranslate(r1, r1)
        L_0x00a3:
            r13.f8163a = r7
            goto L_0x00f2
        L_0x00a6:
            r13.h()
            android.graphics.Matrix r1 = r13.f8165c
            float[] r3 = r13.f8171p
            r1.getValues(r3)
            float[] r1 = r13.f8171p
            float r3 = r13.A
            float r3 = r3 / r2
            float r2 = r13.f8163a
            float r3 = r3 * r2
            r1[r10] = r3
            r3 = 4
            float r5 = r13.B
            float r5 = r5 / r4
            float r5 = r5 * r2
            r1[r3] = r5
            r3 = 2
            r4 = r1[r3]
            r10 = r1[r12]
            float r1 = r13.C
            float r5 = r1 * r2
            float r6 = r13.getImageWidth()
            int r7 = r13.f8180y
            int r8 = r13.f8178w
            r2 = r13
            r2.k(r3, r4, r5, r6, r7, r8, r9)
            float r1 = r13.D
            float r2 = r13.f8163a
            float r4 = r1 * r2
            float r5 = r13.getImageHeight()
            r2 = 5
            int r6 = r13.f8181z
            int r7 = r13.f8179x
            r1 = r13
            r3 = r10
            r8 = r0
            r1.k(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Matrix r0 = r13.f8164b
            float[] r1 = r13.f8171p
            r0.setValues(r1)
        L_0x00f2:
            r13.g()
            android.graphics.Matrix r0 = r13.f8164b
            r13.setImageMatrix(r0)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ortiz.touchview.TouchImageView.e():void");
    }

    public final void f() {
        g();
        this.f8164b.getValues(this.f8171p);
        float imageWidth = getImageWidth();
        int i10 = this.f8178w;
        if (imageWidth < ((float) i10)) {
            this.f8171p[2] = (((float) i10) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i11 = this.f8179x;
        if (imageHeight < ((float) i11)) {
            this.f8171p[5] = (((float) i11) - getImageHeight()) / 2.0f;
        }
        this.f8164b.setValues(this.f8171p);
    }

    public final void g() {
        float f10;
        float f11;
        float f12;
        float f13;
        this.f8164b.getValues(this.f8171p);
        float[] fArr = this.f8171p;
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = (float) this.f8178w;
        float imageWidth = getImageWidth();
        int i10 = (imageWidth > f16 ? 1 : (imageWidth == f16 ? 0 : -1));
        float f17 = f16 - imageWidth;
        if (i10 <= 0) {
            f10 = f17;
            f17 = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (f14 < f17) {
            f11 = (-f14) + f17;
        } else if (f14 > f10) {
            f11 = (-f14) + f10;
        } else {
            f11 = 0.0f;
        }
        float f18 = (float) this.f8179x;
        float imageHeight = getImageHeight();
        int i11 = (imageHeight > f18 ? 1 : (imageHeight == f18 ? 0 : -1));
        float f19 = f18 - imageHeight;
        if (i11 <= 0) {
            f12 = f19;
            f19 = 0.0f;
        } else {
            f12 = 0.0f;
        }
        if (f15 < f19) {
            f13 = (-f15) + f19;
        } else if (f15 > f12) {
            f13 = (-f15) + f12;
        } else {
            f13 = 0.0f;
        }
        if (f11 != 0.0f || f13 != 0.0f) {
            this.f8164b.postTranslate(f11, f13);
        }
    }

    public float getCurrentZoom() {
        return this.f8163a;
    }

    public float getMaxZoom() {
        return this.f8168f;
    }

    public float getMinZoom() {
        return this.f8167e;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f8174s;
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF j10 = j((float) (this.f8178w / 2), (float) (this.f8179x / 2), true);
        j10.x /= (float) intrinsicWidth;
        j10.y /= (float) intrinsicHeight;
        return j10;
    }

    public RectF getZoomedRect() {
        if (this.f8174s != ImageView.ScaleType.FIT_XY) {
            PointF j10 = j(0.0f, 0.0f, true);
            PointF j11 = j((float) this.f8178w, (float) this.f8179x, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(j10.x / intrinsicWidth, j10.y / intrinsicHeight, j11.x / intrinsicWidth, j11.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public final void h() {
        Matrix matrix = this.f8164b;
        if (matrix != null && this.f8179x != 0 && this.f8178w != 0) {
            matrix.getValues(this.f8171p);
            this.f8165c.setValues(this.f8171p);
            this.D = this.B;
            this.C = this.A;
            this.f8181z = this.f8179x;
            this.f8180y = this.f8178w;
        }
    }

    public final void i(double d10, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        if (z10) {
            f12 = this.f8169n;
            f13 = this.f8170o;
        } else {
            f12 = this.f8167e;
            f13 = this.f8168f;
        }
        float f14 = this.f8163a;
        float f15 = (float) (((double) f14) * d10);
        this.f8163a = f15;
        if (f15 > f13) {
            this.f8163a = f13;
            d10 = (double) (f13 / f14);
        } else if (f15 < f12) {
            this.f8163a = f12;
            d10 = (double) (f12 / f14);
        }
        float f16 = (float) d10;
        this.f8164b.postScale(f16, f16, f10, f11);
        f();
    }

    public final PointF j(float f10, float f11, boolean z10) {
        this.f8164b.getValues(this.f8171p);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f8171p;
        float f12 = fArr[2];
        float f13 = fArr[5];
        float imageWidth = ((f10 - f12) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f11 - f13) * intrinsicHeight) / getImageHeight();
        if (z10) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    public final void k(int i10, float f10, float f11, float f12, int i11, int i12, int i13) {
        float f13 = (float) i12;
        if (f12 < f13) {
            float[] fArr = this.f8171p;
            fArr[i10] = (f13 - (((float) i13) * fArr[0])) * 0.5f;
        } else if (f10 > 0.0f) {
            this.f8171p[i10] = -((f12 - f13) * 0.5f);
        } else {
            this.f8171p[i10] = -(((((((float) i11) * 0.5f) + Math.abs(f10)) / f11) * f12) - (f13 * 0.5f));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    public final void onDraw(Canvas canvas) {
        this.f8176u = true;
        this.f8175t = true;
        j jVar = this.f8177v;
        if (jVar != null) {
            setZoom(jVar.f8208a, jVar.f8209b, jVar.f8210c, jVar.f8211d);
            this.f8177v = null;
        }
        super.onDraw(canvas);
    }

    public final void onMeasure(int i10, int i11) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            intrinsicWidth = Math.min(intrinsicWidth, size);
        } else if (mode != 0) {
            intrinsicWidth = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            intrinsicHeight = Math.min(intrinsicHeight, size2);
        } else if (mode2 != 0) {
            intrinsicHeight = size2;
        }
        this.f8178w = (intrinsicWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (intrinsicHeight - getPaddingTop()) - getPaddingBottom();
        this.f8179x = paddingTop;
        setMeasuredDimension(this.f8178w, paddingTop);
        e();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f8163a = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            this.f8171p = floatArray;
            this.f8165c.setValues(floatArray);
            this.D = bundle.getFloat("matchViewHeight");
            this.C = bundle.getFloat("matchViewWidth");
            this.f8181z = bundle.getInt("viewHeight");
            this.f8180y = bundle.getInt("viewWidth");
            this.f8175t = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f8163a);
        bundle.putFloat("matchViewHeight", this.B);
        bundle.putFloat("matchViewWidth", this.A);
        bundle.putInt("viewWidth", this.f8178w);
        bundle.putInt("viewHeight", this.f8179x);
        this.f8164b.getValues(this.f8171p);
        bundle.putFloatArray("matrix", this.f8171p);
        bundle.putBoolean("imageRendered", this.f8175t);
        return bundle;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f8175t = false;
        super.setImageBitmap(bitmap);
        h();
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f8175t = false;
        super.setImageDrawable(drawable);
        h();
        e();
    }

    public void setImageResource(int i10) {
        this.f8175t = false;
        super.setImageResource(i10);
        h();
        e();
    }

    public void setImageURI(Uri uri) {
        this.f8175t = false;
        super.setImageURI(uri);
        h();
        e();
    }

    public void setMaxZoom(float f10) {
        this.f8168f = f10;
        this.f8170o = f10 * 1.25f;
    }

    public void setMinZoom(float f10) {
        this.f8167e = f10;
        this.f8169n = f10 * 0.75f;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.G = onDoubleTapListener;
    }

    public void setOnTouchImageViewListener(f fVar) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.H = onTouchListener;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.f8174s = scaleType;
        if (this.f8176u) {
            setZoom(this);
        }
    }

    public void setScrollPosition(float f10, float f11) {
        setZoom(this.f8163a, f10, f11);
    }

    public void setZoom(float f10) {
        setZoom(f10, 0.5f, 0.5f);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setZoom(float f10, float f11, float f12) {
        setZoom(f10, f11, f12, this.f8174s);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.G = null;
        this.H = null;
        this.f8172q = context;
        super.setClickable(true);
        this.E = new ScaleGestureDetector(context, new h());
        this.F = new GestureDetector(context, new e());
        this.f8164b = new Matrix();
        this.f8165c = new Matrix();
        this.f8171p = new float[9];
        this.f8163a = 1.0f;
        if (this.f8174s == null) {
            this.f8174s = ImageView.ScaleType.FIT_CENTER;
        }
        this.f8167e = 1.0f;
        this.f8168f = 3.0f;
        this.f8169n = 0.75f;
        this.f8170o = 3.75f;
        setImageMatrix(this.f8164b);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(i.NONE);
        this.f8176u = false;
        super.setOnTouchListener(new g());
    }

    public void setZoom(float f10, float f11, float f12, ImageView.ScaleType scaleType) {
        if (!this.f8176u) {
            this.f8177v = new j(f10, f11, f12, scaleType);
            return;
        }
        if (scaleType != this.f8174s) {
            setScaleType(scaleType);
        }
        this.f8163a = 1.0f;
        e();
        i((double) f10, (float) (this.f8178w / 2), (float) (this.f8179x / 2), true);
        this.f8164b.getValues(this.f8171p);
        this.f8171p[2] = -((f11 * getImageWidth()) - (((float) this.f8178w) * 0.5f));
        this.f8171p[5] = -((f12 * getImageHeight()) - (((float) this.f8179x) * 0.5f));
        this.f8164b.setValues(this.f8171p);
        g();
        setImageMatrix(this.f8164b);
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }
}

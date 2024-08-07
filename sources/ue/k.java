package ue;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* compiled from: PhotoViewAttacher */
public final class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    public int A = 2;
    public int B = 2;
    public boolean C = true;
    public ImageView.ScaleType D = ImageView.ScaleType.FIT_CENTER;
    public final a E;

    /* renamed from: a  reason: collision with root package name */
    public AccelerateDecelerateInterpolator f15538a = new AccelerateDecelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public int f15539b = 200;

    /* renamed from: c  reason: collision with root package name */
    public float f15540c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f15541d = 1.75f;

    /* renamed from: e  reason: collision with root package name */
    public float f15542e = 3.0f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15543f = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15544n = false;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f15545o;

    /* renamed from: p  reason: collision with root package name */
    public GestureDetector f15546p;

    /* renamed from: q  reason: collision with root package name */
    public b f15547q;

    /* renamed from: r  reason: collision with root package name */
    public final Matrix f15548r = new Matrix();

    /* renamed from: s  reason: collision with root package name */
    public final Matrix f15549s = new Matrix();

    /* renamed from: t  reason: collision with root package name */
    public final Matrix f15550t = new Matrix();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f15551u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final float[] f15552v = new float[9];

    /* renamed from: w  reason: collision with root package name */
    public j f15553w;

    /* renamed from: x  reason: collision with root package name */
    public View.OnClickListener f15554x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnLongClickListener f15555y;

    /* renamed from: z  reason: collision with root package name */
    public f f15556z;

    /* compiled from: PhotoViewAttacher */
    public class a implements c {
        public a() {
        }

        public final void a(float f10, float f11, float f12, float f13, float f14) {
            float f15 = k.this.f();
            k kVar = k.this;
            if (f15 < kVar.f15542e || f10 < 1.0f) {
                kVar.getClass();
                k.this.f15550t.postScale(f10, f10, f11, f12);
                k.this.f15550t.postTranslate(f13, f14);
                k.this.a();
            }
        }
    }

    /* compiled from: PhotoViewAttacher */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            k.this.getClass();
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnLongClickListener onLongClickListener = kVar.f15555y;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(kVar.f15545o);
            }
        }
    }

    /* compiled from: PhotoViewAttacher */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float f10 = k.this.f();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                k kVar = k.this;
                float f11 = kVar.f15541d;
                if (f10 < f11) {
                    kVar.g(f11, x10, y10, true);
                } else {
                    if (f10 >= f11) {
                        float f12 = kVar.f15542e;
                        if (f10 < f12) {
                            kVar.g(f12, x10, y10, true);
                        }
                    }
                    kVar.g(kVar.f15540c, x10, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnClickListener onClickListener = kVar.f15554x;
            if (onClickListener != null) {
                onClickListener.onClick(kVar.f15545o);
            }
            RectF c10 = k.this.c();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            j jVar = k.this.f15553w;
            if (jVar != null) {
                jVar.a();
            }
            if (c10 == null) {
                return false;
            }
            if (c10.contains(x10, y10)) {
                c10.width();
                c10.height();
                k.this.getClass();
                return true;
            }
            k.this.getClass();
            return false;
        }
    }

    /* compiled from: PhotoViewAttacher */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15560a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15560a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15560a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15560a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15560a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ue.k.d.<clinit>():void");
        }
    }

    /* compiled from: PhotoViewAttacher */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final float f15561a;

        /* renamed from: b  reason: collision with root package name */
        public final float f15562b;

        /* renamed from: c  reason: collision with root package name */
        public final long f15563c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        public final float f15564d;

        /* renamed from: e  reason: collision with root package name */
        public final float f15565e;

        public e(float f10, float f11, float f12, float f13) {
            this.f15561a = f12;
            this.f15562b = f13;
            this.f15564d = f10;
            this.f15565e = f11;
        }

        public final void run() {
            float interpolation = k.this.f15538a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f15563c)) * 1.0f) / ((float) k.this.f15539b)));
            float f10 = this.f15564d;
            k.this.E.a(android.support.v4.media.a.e(this.f15565e, f10, interpolation, f10) / k.this.f(), this.f15561a, this.f15562b, 0.0f, 0.0f);
            if (interpolation < 1.0f) {
                k.this.f15545o.postOnAnimation(this);
            }
        }
    }

    /* compiled from: PhotoViewAttacher */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final OverScroller f15567a;

        /* renamed from: b  reason: collision with root package name */
        public int f15568b;

        /* renamed from: c  reason: collision with root package name */
        public int f15569c;

        public f(Context context) {
            this.f15567a = new OverScroller(context);
        }

        public final void run() {
            if (!this.f15567a.isFinished() && this.f15567a.computeScrollOffset()) {
                int currX = this.f15567a.getCurrX();
                int currY = this.f15567a.getCurrY();
                k.this.f15550t.postTranslate((float) (this.f15568b - currX), (float) (this.f15569c - currY));
                k.this.a();
                this.f15568b = currX;
                this.f15569c = currY;
                k.this.f15545o.postOnAnimation(this);
            }
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.E = aVar;
        this.f15545o = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f15547q = new b(imageView.getContext(), aVar);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
            this.f15546p = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new c());
        }
    }

    public final void a() {
        if (b()) {
            this.f15545o.setImageMatrix(e());
        }
    }

    public final boolean b() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF d10 = d(e());
        if (d10 == null) {
            return false;
        }
        float height = d10.height();
        float width = d10.width();
        ImageView imageView = this.f15545o;
        float height2 = (float) ((imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
        float f15 = 0.0f;
        if (height <= height2) {
            int i10 = d.f15560a[this.D.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (height2 - height) / 2.0f;
                    f14 = d10.top;
                } else {
                    f13 = height2 - height;
                    f14 = d10.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -d10.top;
            }
            this.B = 2;
        } else {
            float f16 = d10.top;
            if (f16 > 0.0f) {
                this.B = 0;
                f10 = -f16;
            } else {
                float f17 = d10.bottom;
                if (f17 < height2) {
                    this.B = 1;
                    f10 = height2 - f17;
                } else {
                    this.B = -1;
                    f10 = 0.0f;
                }
            }
        }
        ImageView imageView2 = this.f15545o;
        float width2 = (float) ((imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight());
        if (width <= width2) {
            int i11 = d.f15560a[this.D.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (width2 - width) / 2.0f;
                    f12 = d10.left;
                } else {
                    f11 = width2 - width;
                    f12 = d10.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -d10.left;
            }
            this.A = 2;
        } else {
            float f18 = d10.left;
            if (f18 > 0.0f) {
                this.A = 0;
                f15 = -f18;
            } else {
                float f19 = d10.right;
                if (f19 < width2) {
                    f15 = width2 - f19;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.f15550t.postTranslate(f15, f10);
        return true;
    }

    public final RectF c() {
        b();
        return d(e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.f15545o.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f15551u.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f15551u);
        return this.f15551u;
    }

    public final Matrix e() {
        this.f15549s.set(this.f15548r);
        this.f15549s.postConcat(this.f15550t);
        return this.f15549s;
    }

    public final float f() {
        this.f15550t.getValues(this.f15552v);
        this.f15550t.getValues(this.f15552v);
        return (float) Math.sqrt((double) (((float) Math.pow((double) this.f15552v[0], 2.0d)) + ((float) Math.pow((double) this.f15552v[3], 2.0d))));
    }

    public final void g(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f15540c || f10 > this.f15542e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z10) {
            this.f15545o.post(new e(f(), f10, f11, f12));
        } else {
            this.f15550t.setScale(f10, f10, f11, f12);
            a();
        }
    }

    public final void h() {
        if (this.C) {
            i(this.f15545o.getDrawable());
            return;
        }
        this.f15550t.reset();
        this.f15550t.postRotate(0.0f);
        a();
        this.f15545o.setImageMatrix(e());
        b();
    }

    public final void i(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.f15545o;
            float width = (float) ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight());
            ImageView imageView2 = this.f15545o;
            float height = (float) ((imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f15548r.reset();
            float f10 = (float) intrinsicWidth;
            float f11 = width / f10;
            float f12 = (float) intrinsicHeight;
            float f13 = height / f12;
            ImageView.ScaleType scaleType = this.D;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f15548r.postTranslate((width - f10) / 2.0f, (height - f12) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f11, f13);
                this.f15548r.postScale(max, max);
                this.f15548r.postTranslate((width - (f10 * max)) / 2.0f, (height - (f12 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f11, f13));
                this.f15548r.postScale(min, min);
                this.f15548r.postTranslate((width - (f10 * min)) / 2.0f, (height - (f12 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
                RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f12, f10);
                }
                int i10 = d.f15560a[this.D.ordinal()];
                if (i10 == 1) {
                    this.f15548r.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i10 == 2) {
                    this.f15548r.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i10 == 3) {
                    this.f15548r.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i10 == 4) {
                    this.f15548r.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            this.f15550t.reset();
            this.f15550t.postRotate(0.0f);
            a();
            this.f15545o.setImageMatrix(e());
            b();
        }
    }

    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            i(this.f15545o.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.C
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ce
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x00ce
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0073
            if (r0 == r2) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x0020
            goto L_0x0088
        L_0x0020:
            float r0 = r10.f()
            float r3 = r10.f15540c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0088
            ue.k$e r9 = new ue.k$e
            float r5 = r10.f()
            float r6 = r10.f15540c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x0071
        L_0x0049:
            float r0 = r10.f()
            float r3 = r10.f15542e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0088
            ue.k$e r9 = new ue.k$e
            float r5 = r10.f()
            float r6 = r10.f15542e
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x0071:
            r11 = r2
            goto L_0x0089
        L_0x0073:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x007c
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x007c:
            ue.k$f r11 = r10.f15556z
            if (r11 == 0) goto L_0x0088
            android.widget.OverScroller r11 = r11.f15567a
            r11.forceFinished(r2)
            r11 = 0
            r10.f15556z = r11
        L_0x0088:
            r11 = r1
        L_0x0089:
            ue.b r0 = r10.f15547q
            if (r0 == 0) goto L_0x00c2
            android.view.ScaleGestureDetector r11 = r0.f15530c
            boolean r11 = r11.isInProgress()
            ue.b r0 = r10.f15547q
            boolean r3 = r0.f15532e
            android.view.ScaleGestureDetector r4 = r0.f15530c     // Catch:{ IllegalArgumentException -> 0x009f }
            r4.onTouchEvent(r12)     // Catch:{ IllegalArgumentException -> 0x009f }
            r0.a(r12)     // Catch:{ IllegalArgumentException -> 0x009f }
        L_0x009f:
            if (r11 != 0) goto L_0x00ad
            ue.b r11 = r10.f15547q
            android.view.ScaleGestureDetector r11 = r11.f15530c
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto L_0x00ad
            r11 = r2
            goto L_0x00ae
        L_0x00ad:
            r11 = r1
        L_0x00ae:
            if (r3 != 0) goto L_0x00b8
            ue.b r0 = r10.f15547q
            boolean r0 = r0.f15532e
            if (r0 != 0) goto L_0x00b8
            r0 = r2
            goto L_0x00b9
        L_0x00b8:
            r0 = r1
        L_0x00b9:
            if (r11 == 0) goto L_0x00be
            if (r0 == 0) goto L_0x00be
            r1 = r2
        L_0x00be:
            r10.f15544n = r1
            r1 = r2
            goto L_0x00c3
        L_0x00c2:
            r1 = r11
        L_0x00c3:
            android.view.GestureDetector r11 = r10.f15546p
            if (r11 == 0) goto L_0x00ce
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00ce
            r1 = r2
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

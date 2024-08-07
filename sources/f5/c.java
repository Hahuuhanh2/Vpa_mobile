package f5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import f5.f;

/* compiled from: GifDrawable */
public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f9925a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9926b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9927c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9928d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9929e;

    /* renamed from: f  reason: collision with root package name */
    public int f9930f;

    /* renamed from: n  reason: collision with root package name */
    public int f9931n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9932o;

    /* renamed from: p  reason: collision with root package name */
    public Paint f9933p;

    /* renamed from: q  reason: collision with root package name */
    public Rect f9934q;

    /* compiled from: GifDrawable */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f9935a;

        public a(f fVar) {
            this.f9935a = fVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f9929e = true;
        this.f9931n = -1;
        j7.a.r(aVar);
        this.f9925a = aVar;
    }

    public final void a() {
        int i10;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f fVar = this.f9925a.f9935a;
        f.a aVar = fVar.f9945i;
        if (aVar != null) {
            i10 = aVar.f9955e;
        } else {
            i10 = -1;
        }
        if (i10 == fVar.f9937a.d() - 1) {
            this.f9930f++;
        }
        int i11 = this.f9931n;
        if (i11 != -1 && this.f9930f >= i11) {
            stop();
        }
    }

    public final void b() {
        j7.a.m("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f9928d);
        if (this.f9925a.f9935a.f9937a.d() == 1) {
            invalidateSelf();
        } else if (!this.f9926b) {
            this.f9926b = true;
            f fVar = this.f9925a.f9935a;
            if (fVar.f9946j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!fVar.f9939c.contains(this)) {
                boolean isEmpty = fVar.f9939c.isEmpty();
                fVar.f9939c.add(this);
                if (isEmpty && !fVar.f9942f) {
                    fVar.f9942f = true;
                    fVar.f9946j = false;
                    fVar.a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f9928d) {
            if (this.f9932o) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f9934q == null) {
                    this.f9934q = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f9934q);
                this.f9932o = false;
            }
            f fVar = this.f9925a.f9935a;
            f.a aVar = fVar.f9945i;
            if (aVar != null) {
                bitmap = aVar.f9957n;
            } else {
                bitmap = fVar.f9948l;
            }
            if (this.f9934q == null) {
                this.f9934q = new Rect();
            }
            Rect rect = this.f9934q;
            if (this.f9933p == null) {
                this.f9933p = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f9933p);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f9925a;
    }

    public final int getIntrinsicHeight() {
        return this.f9925a.f9935a.f9953q;
    }

    public final int getIntrinsicWidth() {
        return this.f9925a.f9935a.f9952p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f9926b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9932o = true;
    }

    public final void setAlpha(int i10) {
        if (this.f9933p == null) {
            this.f9933p = new Paint(2);
        }
        this.f9933p.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f9933p == null) {
            this.f9933p = new Paint(2);
        }
        this.f9933p.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        j7.a.m("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f9928d);
        this.f9929e = z10;
        if (!z10) {
            this.f9926b = false;
            f fVar = this.f9925a.f9935a;
            fVar.f9939c.remove(this);
            if (fVar.f9939c.isEmpty()) {
                fVar.f9942f = false;
            }
        } else if (this.f9927c) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    public final void start() {
        this.f9927c = true;
        this.f9930f = 0;
        if (this.f9929e) {
            b();
        }
    }

    public final void stop() {
        this.f9927c = false;
        this.f9926b = false;
        f fVar = this.f9925a.f9935a;
        fVar.f9939c.remove(this);
        if (fVar.f9939c.isEmpty()) {
            fVar.f9942f = false;
        }
    }
}

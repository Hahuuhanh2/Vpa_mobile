package ue;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import ue.k;

/* compiled from: CustomGestureDetector */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f15528a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f15529b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ScaleGestureDetector f15530c;

    /* renamed from: d  reason: collision with root package name */
    public VelocityTracker f15531d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15532e;

    /* renamed from: f  reason: collision with root package name */
    public float f15533f;

    /* renamed from: g  reason: collision with root package name */
    public float f15534g;

    /* renamed from: h  reason: collision with root package name */
    public final float f15535h;

    /* renamed from: i  reason: collision with root package name */
    public final float f15536i;

    /* renamed from: j  reason: collision with root package name */
    public c f15537j;

    public b(Context context, k.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15536i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15535h = (float) viewConfiguration.getScaledTouchSlop();
        this.f15537j = aVar;
        this.f15530c = new ScaleGestureDetector(context, new a(this));
    }

    public final void a(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        int i12;
        int i13;
        float f14;
        float f15;
        int i14;
        boolean z10;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        int i15 = 0;
        if (action != 0) {
            int i16 = 1;
            if (action == 1) {
                this.f15528a = -1;
                if (this.f15532e && this.f15531d != null) {
                    try {
                        f12 = motionEvent2.getX(this.f15529b);
                    } catch (Exception unused) {
                        f12 = motionEvent.getX();
                    }
                    this.f15533f = f12;
                    try {
                        f13 = motionEvent2.getY(this.f15529b);
                    } catch (Exception unused2) {
                        f13 = motionEvent.getY();
                    }
                    this.f15534g = f13;
                    this.f15531d.addMovement(motionEvent2);
                    this.f15531d.computeCurrentVelocity(1000);
                    float xVelocity = this.f15531d.getXVelocity();
                    float yVelocity = this.f15531d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f15536i) {
                        k.a aVar = (k.a) this.f15537j;
                        k kVar = k.this;
                        kVar.f15556z = new k.f(kVar.f15545o.getContext());
                        k kVar2 = k.this;
                        k.f fVar = kVar2.f15556z;
                        ImageView imageView = kVar2.f15545o;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        ImageView imageView2 = k.this.f15545o;
                        int height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
                        int i17 = (int) (-xVelocity);
                        int i18 = (int) (-yVelocity);
                        RectF c10 = k.this.c();
                        if (c10 != null) {
                            int round = Math.round(-c10.left);
                            float f16 = (float) width;
                            if (f16 < c10.width()) {
                                i11 = Math.round(c10.width() - f16);
                                i10 = 0;
                            } else {
                                i11 = round;
                                i10 = i11;
                            }
                            int round2 = Math.round(-c10.top);
                            float f17 = (float) height;
                            if (f17 < c10.height()) {
                                i13 = Math.round(c10.height() - f17);
                                i12 = 0;
                            } else {
                                i13 = round2;
                                i12 = i13;
                            }
                            fVar.f15568b = round;
                            fVar.f15569c = round2;
                            if (!(round == i11 && round2 == i13)) {
                                fVar.f15567a.fling(round, round2, i17, i18, i10, i11, i12, i13, 0, 0);
                            }
                        }
                        k kVar3 = k.this;
                        kVar3.f15545o.post(kVar3.f15556z);
                    }
                }
                VelocityTracker velocityTracker = this.f15531d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f15531d = null;
                }
            } else if (action == 2) {
                try {
                    f14 = motionEvent2.getX(this.f15529b);
                } catch (Exception unused3) {
                    f14 = motionEvent.getX();
                }
                try {
                    f15 = motionEvent2.getY(this.f15529b);
                } catch (Exception unused4) {
                    f15 = motionEvent.getY();
                }
                float f18 = f14 - this.f15533f;
                float f19 = f15 - this.f15534g;
                if (!this.f15532e) {
                    if (Math.sqrt((double) ((f19 * f19) + (f18 * f18))) >= ((double) this.f15535h)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f15532e = z10;
                }
                if (this.f15532e) {
                    k.a aVar2 = (k.a) this.f15537j;
                    if (!k.this.f15547q.f15530c.isInProgress()) {
                        k.this.getClass();
                        k.this.f15550t.postTranslate(f18, f19);
                        k.this.a();
                        ViewParent parent = k.this.f15545o.getParent();
                        k kVar4 = k.this;
                        if (kVar4.f15543f && !kVar4.f15547q.f15530c.isInProgress()) {
                            k kVar5 = k.this;
                            if (!kVar5.f15544n) {
                                int i19 = kVar5.A;
                                if ((i19 == 2 || ((i19 == 0 && f18 >= 1.0f) || ((i19 == 1 && f18 <= -1.0f) || (((i14 = kVar5.B) == 0 && f19 >= 1.0f) || (i14 == 1 && f19 <= -1.0f))))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        }
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f15533f = f14;
                    this.f15534g = f15;
                    VelocityTracker velocityTracker2 = this.f15531d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent2);
                    }
                }
            } else if (action == 3) {
                this.f15528a = -1;
                VelocityTracker velocityTracker3 = this.f15531d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f15531d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent2.getPointerId(action2) == this.f15528a) {
                    if (action2 != 0) {
                        i16 = 0;
                    }
                    this.f15528a = motionEvent2.getPointerId(i16);
                    this.f15533f = motionEvent2.getX(i16);
                    this.f15534g = motionEvent2.getY(i16);
                }
            }
        } else {
            this.f15528a = motionEvent2.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f15531d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent2);
            }
            try {
                f10 = motionEvent2.getX(this.f15529b);
            } catch (Exception unused5) {
                f10 = motionEvent.getX();
            }
            this.f15533f = f10;
            try {
                f11 = motionEvent2.getY(this.f15529b);
            } catch (Exception unused6) {
                f11 = motionEvent.getY();
            }
            this.f15534g = f11;
            this.f15532e = false;
        }
        int i20 = this.f15528a;
        if (i20 != -1) {
            i15 = i20;
        }
        this.f15529b = motionEvent2.findPointerIndex(i15);
    }
}

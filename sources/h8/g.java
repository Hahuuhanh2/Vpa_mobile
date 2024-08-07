package h8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.o;
import h8.b;
import k2.a;
import k2.c;
import k2.d;

/* compiled from: DeterminateDrawable */
public final class g<S extends b> extends j {

    /* renamed from: x  reason: collision with root package name */
    public static final a f10648x = new a();

    /* renamed from: s  reason: collision with root package name */
    public k<S> f10649s;

    /* renamed from: t  reason: collision with root package name */
    public final d f10650t;

    /* renamed from: u  reason: collision with root package name */
    public final c f10651u;

    /* renamed from: v  reason: collision with root package name */
    public float f10652v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10653w = false;

    /* compiled from: DeterminateDrawable */
    public class a extends o {
        public a() {
            super(0);
        }

        public final void G(Object obj, float f10) {
            g gVar = (g) obj;
            gVar.f10652v = f10 / 10000.0f;
            gVar.invalidateSelf();
        }

        public final float w(Object obj) {
            return ((g) obj).f10652v * 10000.0f;
        }
    }

    public g(Context context, b bVar, k<S> kVar) {
        super(context, bVar);
        this.f10649s = kVar;
        kVar.f10668b = this;
        d dVar = new d();
        this.f10650t = dVar;
        dVar.f11944b = (double) 1.0f;
        dVar.f11945c = false;
        dVar.f11943a = Math.sqrt((double) 50.0f);
        dVar.f11945c = false;
        c cVar = new c(this);
        this.f10651u = cVar;
        cVar.f11940r = dVar;
        if (this.f10664o != 1.0f) {
            this.f10664o = 1.0f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k<S> kVar = this.f10649s;
            Rect bounds = getBounds();
            float b10 = b();
            kVar.f10667a.a();
            kVar.a(canvas, bounds, b10);
            this.f10649s.c(canvas, this.f10665p);
            Canvas canvas2 = canvas;
            this.f10649s.b(canvas2, this.f10665p, 0.0f, this.f10652v, m9.b.m(this.f10658b.f10625c[0], this.f10666q));
            canvas.restore();
        }
    }

    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        a aVar = this.f10659c;
        ContentResolver contentResolver = this.f10657a.getContentResolver();
        aVar.getClass();
        float f11 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f11 == 0.0f) {
            this.f10653w = true;
        } else {
            this.f10653w = false;
            d dVar = this.f10650t;
            float f12 = 50.0f / f11;
            dVar.getClass();
            if (f12 > 0.0f) {
                dVar.f11943a = Math.sqrt((double) f12);
                dVar.f11945c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return f10;
    }

    public final int getIntrinsicHeight() {
        return this.f10649s.d();
    }

    public final int getIntrinsicWidth() {
        return this.f10649s.e();
    }

    public final void jumpToCurrentState() {
        this.f10651u.c();
        this.f10652v = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i10) {
        if (this.f10653w) {
            this.f10651u.c();
            this.f10652v = ((float) i10) / 10000.0f;
            invalidateSelf();
        } else {
            c cVar = this.f10651u;
            cVar.f11928b = this.f10652v * 10000.0f;
            cVar.f11929c = true;
            float f10 = (float) i10;
            if (cVar.f11932f) {
                cVar.f11941s = f10;
            } else {
                if (cVar.f11940r == null) {
                    cVar.f11940r = new d(f10);
                }
                d dVar = cVar.f11940r;
                double d10 = (double) f10;
                dVar.f11951i = d10;
                double d11 = (double) ((float) d10);
                if (d11 > ((double) Float.MAX_VALUE)) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                } else if (d11 >= ((double) cVar.f11933g)) {
                    double abs = Math.abs((double) (cVar.f11935i * 0.75f));
                    dVar.f11946d = abs;
                    dVar.f11947e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = cVar.f11932f;
                        if (!z10 && !z10) {
                            cVar.f11932f = true;
                            if (!cVar.f11929c) {
                                cVar.f11928b = cVar.f11931e.w(cVar.f11930d);
                            }
                            float f11 = cVar.f11928b;
                            if (f11 > Float.MAX_VALUE || f11 < cVar.f11933g) {
                                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                            }
                            ThreadLocal<k2.a> threadLocal = k2.a.f11909g;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new k2.a());
                            }
                            k2.a aVar = threadLocal.get();
                            if (aVar.f11911b.size() == 0) {
                                if (aVar.f11913d == null) {
                                    aVar.f11913d = new a.d(aVar.f11912c);
                                }
                                a.d dVar2 = aVar.f11913d;
                                dVar2.f11918b.postFrameCallback(dVar2.f11919c);
                            }
                            if (!aVar.f11911b.contains(cVar)) {
                                aVar.f11911b.add(cVar);
                            }
                        }
                    } else {
                        throw new AndroidRuntimeException("Animations may only be started on the main thread");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
            }
        }
        return true;
    }
}

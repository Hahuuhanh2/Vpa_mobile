package h8;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import java.util.ArrayList;
import t7.b;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public abstract class j extends Drawable implements Animatable {

    /* renamed from: r  reason: collision with root package name */
    public static final a f10656r = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10657a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10658b;

    /* renamed from: c  reason: collision with root package name */
    public a f10659c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f10660d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f10661e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f10662f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10663n;

    /* renamed from: o  reason: collision with root package name */
    public float f10664o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f10665p = new Paint();

    /* renamed from: q  reason: collision with root package name */
    public int f10666q;

    /* compiled from: DrawableWithAnimatedVisibilityChange */
    public class a extends Property<j, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((j) obj).b());
        }

        public final void set(Object obj, Object obj2) {
            j jVar = (j) obj;
            float floatValue = ((Float) obj2).floatValue();
            if (jVar.f10664o != floatValue) {
                jVar.f10664o = floatValue;
                jVar.invalidateSelf();
            }
        }
    }

    public j(Context context, b bVar) {
        this.f10657a = context;
        this.f10658b = bVar;
        this.f10659c = new a();
        setAlpha(255);
    }

    public final float b() {
        boolean z10;
        b bVar = this.f10658b;
        boolean z11 = true;
        if (bVar.f10627e != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (bVar.f10628f == 0) {
                z11 = false;
            }
            if (!z11) {
                return 1.0f;
            }
        }
        return this.f10664o;
    }

    public final boolean c() {
        ValueAnimator valueAnimator = this.f10661e;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        ValueAnimator valueAnimator = this.f10660d;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final boolean e(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        a aVar = this.f10659c;
        ContentResolver contentResolver = this.f10657a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (!z12 || f10 <= 0.0f) {
            z13 = false;
        } else {
            z13 = true;
        }
        return f(z10, z11, z13);
    }

    public boolean f(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        boolean z14;
        if (this.f10660d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10656r, new float[]{0.0f, 1.0f});
            this.f10660d = ofFloat;
            ofFloat.setDuration(500);
            this.f10660d.setInterpolator(b.f14886b);
            ValueAnimator valueAnimator3 = this.f10660d;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.f10660d = valueAnimator3;
                valueAnimator3.addListener(new h(this));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.f10661e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10656r, new float[]{1.0f, 0.0f});
            this.f10661e = ofFloat2;
            ofFloat2.setDuration(500);
            this.f10661e.setInterpolator(b.f14886b);
            ValueAnimator valueAnimator4 = this.f10661e;
            if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                this.f10661e = valueAnimator4;
                valueAnimator4.addListener(new i(this));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f10660d;
        } else {
            valueAnimator = this.f10661e;
        }
        if (z10) {
            valueAnimator2 = this.f10661e;
        } else {
            valueAnimator2 = this.f10660d;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                ValueAnimator[] valueAnimatorArr = {valueAnimator2};
                boolean z15 = this.f10663n;
                this.f10663n = true;
                for (int i10 = 0; i10 < 1; i10++) {
                    valueAnimatorArr[i10].cancel();
                }
                this.f10663n = z15;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                ValueAnimator[] valueAnimatorArr2 = {valueAnimator};
                boolean z16 = this.f10663n;
                this.f10663n = true;
                for (int i11 = 0; i11 < 1; i11++) {
                    valueAnimatorArr2[i11].end();
                }
                this.f10663n = z16;
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z10 || super.setVisible(z10, false)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z10 ? this.f10658b.f10628f == 0 : this.f10658b.f10627e == 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z14) {
                ValueAnimator[] valueAnimatorArr3 = {valueAnimator};
                boolean z17 = this.f10663n;
                this.f10663n = true;
                for (int i12 = 0; i12 < 1; i12++) {
                    valueAnimatorArr3[i12].end();
                }
                this.f10663n = z17;
                return z13;
            }
            if (z11 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z13;
        }
    }

    public final void g(BaseProgressIndicator.d dVar) {
        ArrayList arrayList = this.f10662f;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.f10662f.remove(dVar);
            if (this.f10662f.isEmpty()) {
                this.f10662f = null;
            }
        }
    }

    public final int getAlpha() {
        return this.f10666q;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        if (d() || c()) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i10) {
        this.f10666q = i10;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10665p.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        return e(z10, z11, true);
    }

    public final void start() {
        f(true, true, false);
    }

    public final void stop() {
        f(false, true, false);
    }
}

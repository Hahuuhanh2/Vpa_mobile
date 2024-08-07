package e1;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p3.l0;

/* compiled from: ViewOscillator */
public abstract class b extends b1.e {

    /* compiled from: ViewOscillator */
    public static class a extends b {
        public final void e(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* renamed from: e1.b$b  reason: collision with other inner class name */
    /* compiled from: ViewOscillator */
    public static class C0093b extends b {

        /* renamed from: g  reason: collision with root package name */
        public float[] f9075g = new float[1];

        /* renamed from: h  reason: collision with root package name */
        public g1.a f9076h;

        public final void c(g1.a aVar) {
            this.f9076h = aVar;
        }

        public final void e(View view, float f10) {
            this.f9075g[0] = a(f10);
            l0.H0(this.f9076h, view, this.f9075g);
        }
    }

    /* compiled from: ViewOscillator */
    public static class c extends b {
        public final void e(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class d extends b {
        public final void e(View view, float f10) {
        }
    }

    /* compiled from: ViewOscillator */
    public static class e extends b {

        /* renamed from: g  reason: collision with root package name */
        public boolean f9077g = false;

        public final void e(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f9077g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f9077g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f10))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: ViewOscillator */
    public static class f extends b {
        public final void e(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class g extends b {
        public final void e(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class h extends b {
        public final void e(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class i extends b {
        public final void e(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class j extends b {
        public final void e(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class k extends b {
        public final void e(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class l extends b {
        public final void e(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* compiled from: ViewOscillator */
    public static class m extends b {
        public final void e(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void e(View view, float f10);
}

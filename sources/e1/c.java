package e1;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p3.l0;

/* compiled from: ViewSpline */
public abstract class c extends b1.j {

    /* compiled from: ViewSpline */
    public static class a extends c {
        public final void d(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class b extends c {

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<g1.a> f9078f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f9079g;

        public b(String str, SparseArray<g1.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f9078f = sparseArray;
        }

        public final void b(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public final void c(int i10) {
            int size = this.f9078f.size();
            int c10 = this.f9078f.valueAt(0).c();
            double[] dArr = new double[size];
            this.f9079g = new float[c10];
            int[] iArr = new int[2];
            iArr[1] = c10;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = ((double) this.f9078f.keyAt(i11)) * 0.01d;
                this.f9078f.valueAt(i11).b(this.f9079g);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f9079g;
                    if (i12 >= fArr.length) {
                        break;
                    }
                    dArr2[i11][i12] = (double) fArr[i12];
                    i12++;
                }
            }
            this.f3939a = b1.b.a(i10, dArr, dArr2);
        }

        public final void d(View view, float f10) {
            this.f3939a.d((double) f10, this.f9079g);
            l0.H0(this.f9078f.valueAt(0), view, this.f9079g);
        }
    }

    /* renamed from: e1.c$c  reason: collision with other inner class name */
    /* compiled from: ViewSpline */
    public static class C0094c extends c {
        public final void d(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class d extends c {
        public final void d(View view, float f10) {
        }
    }

    /* compiled from: ViewSpline */
    public static class e extends c {
        public final void d(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class f extends c {
        public final void d(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class g extends c {

        /* renamed from: f  reason: collision with root package name */
        public boolean f9080f = false;

        public final void d(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f9080f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f9080f = true;
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

    /* compiled from: ViewSpline */
    public static class h extends c {
        public final void d(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class i extends c {
        public final void d(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class j extends c {
        public final void d(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class k extends c {
        public final void d(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class l extends c {
        public final void d(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class m extends c {
        public final void d(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class n extends c {
        public final void d(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* compiled from: ViewSpline */
    public static class o extends c {
        public final void d(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void d(View view, float f10);
}

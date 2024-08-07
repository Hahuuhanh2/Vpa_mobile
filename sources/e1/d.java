package e1;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import b1.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p3.l0;

/* compiled from: ViewTimeCycle */
public abstract class d extends o {

    /* compiled from: ViewTimeCycle */
    public static class a extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setAlpha(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class b extends d {

        /* renamed from: k  reason: collision with root package name */
        public String f9081k;

        /* renamed from: l  reason: collision with root package name */
        public SparseArray<g1.a> f9082l;

        /* renamed from: m  reason: collision with root package name */
        public SparseArray<float[]> f9083m = new SparseArray<>();

        /* renamed from: n  reason: collision with root package name */
        public float[] f9084n;

        /* renamed from: o  reason: collision with root package name */
        public float[] f9085o;

        public b(String str, SparseArray<g1.a> sparseArray) {
            this.f9081k = str.split(",")[1];
            this.f9082l = sparseArray;
        }

        public final void b(float f10, float f11, float f12, int i10, int i11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public final void c(int i10) {
            int size = this.f9082l.size();
            int c10 = this.f9082l.valueAt(0).c();
            double[] dArr = new double[size];
            int i11 = c10 + 2;
            this.f9084n = new float[i11];
            this.f9085o = new float[c10];
            int[] iArr = new int[2];
            iArr[1] = i11;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.f9082l.keyAt(i12);
                float[] valueAt = this.f9083m.valueAt(i12);
                dArr[i12] = ((double) keyAt) * 0.01d;
                this.f9082l.valueAt(i12).b(this.f9084n);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f9084n;
                    if (i13 >= fArr.length) {
                        break;
                    }
                    dArr2[i12][i13] = (double) fArr[i13];
                    i13++;
                }
                double[] dArr3 = dArr2[i12];
                dArr3[c10] = (double) valueAt[0];
                dArr3[c10 + 1] = (double) valueAt[1];
            }
            this.f3967a = b1.b.a(i10, dArr, dArr2);
        }

        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            boolean z10;
            this.f3967a.d((double) f10, this.f9084n);
            float[] fArr = this.f9084n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f3975i;
            if (Float.isNaN(this.f3976j)) {
                float b10 = bVar.b(this.f9081k, view);
                this.f3976j = b10;
                if (Float.isNaN(b10)) {
                    this.f3976j = 0.0f;
                }
            }
            float f13 = (float) ((((((double) j11) * 1.0E-9d) * ((double) f11)) + ((double) this.f3976j)) % 1.0d);
            this.f3976j = f13;
            this.f3975i = j10;
            float a10 = a(f13);
            this.f3974h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f9085o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f3974h;
                float f14 = this.f9084n[i10];
                if (((double) f14) != 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f3974h = z11 | z10;
                fArr2[i10] = (f14 * a10) + f12;
                i10++;
            }
            l0.H0(this.f9082l.valueAt(0), view, this.f9085o);
            if (f11 != 0.0f) {
                this.f3974h = true;
            }
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class c extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setElevation(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* renamed from: e1.d$d  reason: collision with other inner class name */
    /* compiled from: ViewTimeCycle */
    public static class C0095d extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class e extends d {

        /* renamed from: k  reason: collision with root package name */
        public boolean f9086k = false;

        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f10, j10, view, bVar));
            } else if (this.f9086k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f9086k = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(d(f10, j10, view, bVar))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class f extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setRotation(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class g extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setRotationX(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class h extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setRotationY(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class i extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setScaleX(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class j extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setScaleY(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class k extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setTranslationX(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class l extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setTranslationY(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class m extends d {
        public final boolean e(float f10, long j10, View view, lc.b bVar) {
            view.setTranslationZ(d(f10, j10, view, bVar));
            return this.f3974h;
        }
    }

    public final float d(float f10, long j10, View view, lc.b bVar) {
        long j11 = j10;
        View view2 = view;
        lc.b bVar2 = bVar;
        this.f3967a.d((double) f10, this.f3973g);
        float[] fArr = this.f3973g;
        boolean z10 = true;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f3974h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f3976j)) {
            float b10 = bVar2.b(this.f3972f, view2);
            this.f3976j = b10;
            if (Float.isNaN(b10)) {
                this.f3976j = 0.0f;
            }
        }
        int i11 = i10;
        float f12 = (float) ((((((double) (j11 - this.f3975i)) * 1.0E-9d) * ((double) f11)) + ((double) this.f3976j)) % 1.0d);
        this.f3976j = f12;
        String str = this.f3972f;
        if (!((HashMap) bVar2.f12907b).containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f12});
            ((HashMap) bVar2.f12907b).put(view2, hashMap);
        } else {
            HashMap hashMap2 = (HashMap) ((HashMap) bVar2.f12907b).get(view2);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f12});
                ((HashMap) bVar2.f12907b).put(view2, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f12;
                hashMap2.put(str, fArr2);
            }
        }
        this.f3975i = j11;
        float f13 = this.f3973g[0];
        float a10 = (a(this.f3976j) * f13) + this.f3973g[2];
        if (f13 == 0.0f && i11 == 0) {
            z10 = false;
        }
        this.f3974h = z10;
        return a10;
    }

    public abstract boolean e(float f10, long j10, View view, lc.b bVar);
}

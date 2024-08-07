package k2;

import android.view.View;
import androidx.fragment.app.o;
import h8.g;
import java.util.ArrayList;
import k2.a;
import k2.b;

/* compiled from: DynamicAnimation */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C0134b f11921l = new C0134b();

    /* renamed from: m  reason: collision with root package name */
    public static final c f11922m = new c();

    /* renamed from: n  reason: collision with root package name */
    public static final d f11923n = new d();

    /* renamed from: o  reason: collision with root package name */
    public static final e f11924o = new e();

    /* renamed from: p  reason: collision with root package name */
    public static final f f11925p = new f();

    /* renamed from: q  reason: collision with root package name */
    public static final a f11926q = new a();

    /* renamed from: a  reason: collision with root package name */
    public float f11927a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f11928b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11929c = false;

    /* renamed from: d  reason: collision with root package name */
    public final Object f11930d;

    /* renamed from: e  reason: collision with root package name */
    public final o f11931e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11932f = false;

    /* renamed from: g  reason: collision with root package name */
    public float f11933g = -3.4028235E38f;

    /* renamed from: h  reason: collision with root package name */
    public long f11934h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f11935i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f11936j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<i> f11937k = new ArrayList<>();

    /* compiled from: DynamicAnimation */
    public static class a extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setAlpha(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getAlpha();
        }
    }

    /* renamed from: k2.b$b  reason: collision with other inner class name */
    /* compiled from: DynamicAnimation */
    public static class C0134b extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setScaleX(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getScaleX();
        }
    }

    /* compiled from: DynamicAnimation */
    public static class c extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setScaleY(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getScaleY();
        }
    }

    /* compiled from: DynamicAnimation */
    public static class d extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setRotation(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getRotation();
        }
    }

    /* compiled from: DynamicAnimation */
    public static class e extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setRotationX(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getRotationX();
        }
    }

    /* compiled from: DynamicAnimation */
    public static class f extends j {
        public final void G(Object obj, float f10) {
            ((View) obj).setRotationY(f10);
        }

        public final float w(Object obj) {
            return ((View) obj).getRotationY();
        }
    }

    /* compiled from: DynamicAnimation */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public float f11938a;

        /* renamed from: b  reason: collision with root package name */
        public float f11939b;
    }

    /* compiled from: DynamicAnimation */
    public interface h {
        void a();
    }

    /* compiled from: DynamicAnimation */
    public interface i {
        void a();
    }

    /* compiled from: DynamicAnimation */
    public static abstract class j extends o {
        public j() {
            super(0);
        }
    }

    public b(Object obj) {
        g.a aVar = h8.g.f10648x;
        this.f11930d = obj;
        this.f11931e = aVar;
        if (aVar == f11923n || aVar == f11924o || aVar == f11925p) {
            this.f11935i = 0.1f;
        } else if (aVar == f11926q) {
            this.f11935i = 0.00390625f;
        } else if (aVar == f11921l || aVar == f11922m) {
            this.f11935i = 0.00390625f;
        } else {
            this.f11935i = 1.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long r3 = r0.f11934h
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0015
            r0.f11934h = r1
            float r1 = r0.f11928b
            r0.b(r1)
            return r8
        L_0x0015:
            long r14 = r1 - r3
            r0.f11934h = r1
            r1 = r0
            k2.c r1 = (k2.c) r1
            boolean r2 = r1.f11942t
            r3 = 0
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 1
            if (r2 == 0) goto L_0x003f
            float r2 = r1.f11941s
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0032
            k2.d r9 = r1.f11940r
            double r10 = (double) r2
            r9.f11951i = r10
            r1.f11941s = r4
        L_0x0032:
            k2.d r2 = r1.f11940r
            double r9 = r2.f11951i
            float r2 = (float) r9
            r1.f11928b = r2
            r1.f11927a = r3
            r1.f11942t = r8
            goto L_0x00d4
        L_0x003f:
            float r2 = r1.f11941s
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            k2.d r2 = r1.f11940r
            double r9 = r2.f11951i
            float r9 = r1.f11928b
            double r9 = (double) r9
            float r11 = r1.f11927a
            double r11 = (double) r11
            r16 = 2
            long r23 = r14 / r16
            r16 = r2
            r17 = r9
            r19 = r11
            r21 = r23
            k2.b$g r2 = r16.a(r17, r19, r21)
            k2.d r9 = r1.f11940r
            float r10 = r1.f11941s
            double r10 = (double) r10
            r9.f11951i = r10
            r1.f11941s = r4
            float r10 = r2.f11938a
            double r10 = (double) r10
            float r2 = r2.f11939b
            double r12 = (double) r2
            r18 = r9
            r19 = r10
            r21 = r12
            k2.b$g r2 = r18.a(r19, r21, r23)
            float r9 = r2.f11938a
            r1.f11928b = r9
            float r2 = r2.f11939b
            r1.f11927a = r2
            goto L_0x0095
        L_0x0081:
            k2.d r9 = r1.f11940r
            float r2 = r1.f11928b
            double r10 = (double) r2
            float r2 = r1.f11927a
            double r12 = (double) r2
            k2.b$g r2 = r9.a(r10, r12, r14)
            float r9 = r2.f11938a
            r1.f11928b = r9
            float r2 = r2.f11939b
            r1.f11927a = r2
        L_0x0095:
            float r2 = r1.f11928b
            float r9 = r1.f11933g
            float r2 = java.lang.Math.max(r2, r9)
            r1.f11928b = r2
            float r2 = java.lang.Math.min(r2, r4)
            r1.f11928b = r2
            float r9 = r1.f11927a
            k2.d r10 = r1.f11940r
            r10.getClass()
            float r9 = java.lang.Math.abs(r9)
            double r11 = (double) r9
            double r13 = r10.f11947e
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c8
            double r11 = r10.f11951i
            float r9 = (float) r11
            float r2 = r2 - r9
            float r2 = java.lang.Math.abs(r2)
            double r11 = (double) r2
            double r9 = r10.f11946d
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c8
            r2 = r7
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            if (r2 == 0) goto L_0x00d6
            k2.d r2 = r1.f11940r
            double r9 = r2.f11951i
            float r2 = (float) r9
            r1.f11928b = r2
            r1.f11927a = r3
        L_0x00d4:
            r1 = r7
            goto L_0x00d7
        L_0x00d6:
            r1 = r8
        L_0x00d7:
            float r2 = r0.f11928b
            float r2 = java.lang.Math.min(r2, r4)
            r0.f11928b = r2
            float r3 = r0.f11933g
            float r2 = java.lang.Math.max(r2, r3)
            r0.f11928b = r2
            r0.b(r2)
            if (r1 == 0) goto L_0x014f
            r0.f11932f = r8
            java.lang.ThreadLocal<k2.a> r2 = k2.a.f11909g
            java.lang.Object r3 = r2.get()
            if (r3 != 0) goto L_0x00fe
            k2.a r3 = new k2.a
            r3.<init>()
            r2.set(r3)
        L_0x00fe:
            java.lang.Object r2 = r2.get()
            k2.a r2 = (k2.a) r2
            v0.h<k2.a$b, java.lang.Long> r3 = r2.f11910a
            r3.remove(r0)
            java.util.ArrayList<k2.a$b> r3 = r2.f11911b
            int r3 = r3.indexOf(r0)
            if (r3 < 0) goto L_0x0119
            java.util.ArrayList<k2.a$b> r4 = r2.f11911b
            r9 = 0
            r4.set(r3, r9)
            r2.f11915f = r7
        L_0x0119:
            r0.f11934h = r5
            r0.f11929c = r8
        L_0x011d:
            java.util.ArrayList<k2.b$h> r2 = r0.f11936j
            int r2 = r2.size()
            if (r8 >= r2) goto L_0x013b
            java.util.ArrayList<k2.b$h> r2 = r0.f11936j
            java.lang.Object r2 = r2.get(r8)
            if (r2 == 0) goto L_0x0138
            java.util.ArrayList<k2.b$h> r2 = r0.f11936j
            java.lang.Object r2 = r2.get(r8)
            k2.b$h r2 = (k2.b.h) r2
            r2.a()
        L_0x0138:
            int r8 = r8 + 1
            goto L_0x011d
        L_0x013b:
            java.util.ArrayList<k2.b$h> r2 = r0.f11936j
            int r3 = r2.size()
        L_0x0141:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x014f
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x0141
            r2.remove(r3)
            goto L_0x0141
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b.a(long):boolean");
    }

    public final void b(float f10) {
        this.f11931e.G(this.f11930d, f10);
        for (int i10 = 0; i10 < this.f11937k.size(); i10++) {
            if (this.f11937k.get(i10) != null) {
                this.f11937k.get(i10).a();
            }
        }
        ArrayList<i> arrayList = this.f11937k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}

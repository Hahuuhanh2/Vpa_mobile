package androidx.constraintlayout.widget;

import a1.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c1.d;
import c1.e;
import c1.f;
import c1.h;
import c1.j;
import c1.n;
import d1.b;
import g1.b;
import g1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public static b f1850w;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<View> f1851a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ConstraintHelper> f1852b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public f f1853c = new f();

    /* renamed from: d  reason: collision with root package name */
    public int f1854d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1855e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1856f = Integer.MAX_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public int f1857n = Integer.MAX_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1858o = true;

    /* renamed from: p  reason: collision with root package name */
    public int f1859p = 257;

    /* renamed from: q  reason: collision with root package name */
    public a f1860q = null;

    /* renamed from: r  reason: collision with root package name */
    public b f1861r = null;

    /* renamed from: s  reason: collision with root package name */
    public int f1862s = -1;

    /* renamed from: t  reason: collision with root package name */
    public HashMap<String, Integer> f1863t = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    public SparseArray<e> f1864u = new SparseArray<>();

    /* renamed from: v  reason: collision with root package name */
    public a f1865v = new a(this);

    public class a implements b.C0085b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1910a;

        /* renamed from: b  reason: collision with root package name */
        public int f1911b;

        /* renamed from: c  reason: collision with root package name */
        public int f1912c;

        /* renamed from: d  reason: collision with root package name */
        public int f1913d;

        /* renamed from: e  reason: collision with root package name */
        public int f1914e;

        /* renamed from: f  reason: collision with root package name */
        public int f1915f;

        /* renamed from: g  reason: collision with root package name */
        public int f1916g;

        public a(ConstraintLayout constraintLayout) {
            this.f1910a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c1  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x01ed A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x01ee  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(c1.e r18, d1.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                c1.e$a r3 = c1.e.a.FIXED
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                int r4 = r1.f4438j0
                r5 = 8
                r6 = 0
                if (r4 != r5) goto L_0x001d
                boolean r4 = r1.G
                if (r4 != 0) goto L_0x001d
                r2.f8487e = r6
                r2.f8488f = r6
                r2.f8489g = r6
                return
            L_0x001d:
                c1.e r4 = r1.W
                if (r4 != 0) goto L_0x0022
                return
            L_0x0022:
                c1.e$a r4 = r2.f8483a
                c1.e$a r5 = r2.f8484b
                int r7 = r2.f8485c
                int r8 = r2.f8486d
                int r9 = r0.f1911b
                int r10 = r0.f1912c
                int r9 = r9 + r10
                int r10 = r0.f1913d
                java.lang.Object r11 = r1.f4436i0
                android.view.View r11 = (android.view.View) r11
                int r12 = r4.ordinal()
                r13 = 3
                r14 = 2
                r15 = 1
                if (r12 == 0) goto L_0x00b2
                if (r12 == r15) goto L_0x00a7
                if (r12 == r14) goto L_0x0061
                if (r12 == r13) goto L_0x0048
            L_0x0044:
                r12 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b0
            L_0x0048:
                int r7 = r0.f1915f
                c1.d r12 = r1.K
                if (r12 == 0) goto L_0x0052
                int r12 = r12.f4407g
                int r12 = r12 + r6
                goto L_0x0053
            L_0x0052:
                r12 = r6
            L_0x0053:
                c1.d r6 = r1.M
                if (r6 == 0) goto L_0x005a
                int r6 = r6.f4407g
                int r12 = r12 + r6
            L_0x005a:
                int r10 = r10 + r12
                r6 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r6)
                goto L_0x00b8
            L_0x0061:
                int r6 = r0.f1915f
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r10, r7)
                int r7 = r1.f4455s
                if (r7 != r15) goto L_0x006e
                r7 = r15
                goto L_0x006f
            L_0x006e:
                r7 = 0
            L_0x006f:
                int r10 = r2.f8492j
                if (r10 == r15) goto L_0x0075
                if (r10 != r14) goto L_0x0044
            L_0x0075:
                int r10 = r11.getMeasuredHeight()
                int r12 = r18.o()
                if (r10 != r12) goto L_0x0081
                r10 = r15
                goto L_0x0082
            L_0x0081:
                r10 = 0
            L_0x0082:
                int r12 = r2.f8492j
                if (r12 == r14) goto L_0x0099
                if (r7 == 0) goto L_0x0099
                if (r7 == 0) goto L_0x008c
                if (r10 != 0) goto L_0x0099
            L_0x008c:
                boolean r7 = r11 instanceof androidx.constraintlayout.widget.Placeholder
                if (r7 != 0) goto L_0x0099
                boolean r7 = r18.E()
                if (r7 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r7 = 0
                goto L_0x009a
            L_0x0099:
                r7 = r15
            L_0x009a:
                if (r7 == 0) goto L_0x0044
                int r6 = r18.u()
                r12 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
                goto L_0x00b8
            L_0x00a7:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1915f
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r10, r7)
            L_0x00b0:
                r7 = r6
                goto L_0x00b8
            L_0x00b2:
                r12 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            L_0x00b8:
                int r6 = r5.ordinal()
                if (r6 == 0) goto L_0x0139
                if (r6 == r15) goto L_0x012f
                if (r6 == r14) goto L_0x00e5
                if (r6 == r13) goto L_0x00c7
                r10 = 0
                goto L_0x0140
            L_0x00c7:
                int r6 = r0.f1916g
                c1.d r8 = r1.K
                if (r8 == 0) goto L_0x00d4
                c1.d r8 = r1.L
                int r8 = r8.f4407g
                r10 = 0
                int r8 = r8 + r10
                goto L_0x00d5
            L_0x00d4:
                r8 = 0
            L_0x00d5:
                c1.d r10 = r1.M
                if (r10 == 0) goto L_0x00de
                c1.d r10 = r1.N
                int r10 = r10.f4407g
                int r8 = r8 + r10
            L_0x00de:
                int r9 = r9 + r8
                r8 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r8)
                goto L_0x013f
            L_0x00e5:
                int r6 = r0.f1916g
                r8 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r8)
                int r8 = r1.f4457t
                if (r8 != r15) goto L_0x00f2
                r8 = r15
                goto L_0x00f3
            L_0x00f2:
                r8 = 0
            L_0x00f3:
                int r9 = r2.f8492j
                if (r9 == r15) goto L_0x00fd
                if (r9 != r14) goto L_0x00fa
                goto L_0x00fd
            L_0x00fa:
                r10 = 1073741824(0x40000000, float:2.0)
                goto L_0x013f
            L_0x00fd:
                int r9 = r11.getMeasuredWidth()
                int r10 = r18.u()
                if (r9 != r10) goto L_0x0109
                r9 = r15
                goto L_0x010a
            L_0x0109:
                r9 = 0
            L_0x010a:
                int r10 = r2.f8492j
                if (r10 == r14) goto L_0x0121
                if (r8 == 0) goto L_0x0121
                if (r8 == 0) goto L_0x0114
                if (r9 != 0) goto L_0x0121
            L_0x0114:
                boolean r8 = r11 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x0121
                boolean r8 = r18.F()
                if (r8 == 0) goto L_0x011f
                goto L_0x0121
            L_0x011f:
                r8 = 0
                goto L_0x0122
            L_0x0121:
                r8 = r15
            L_0x0122:
                if (r8 == 0) goto L_0x00fa
                int r6 = r18.o()
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r10)
                goto L_0x013f
            L_0x012f:
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1916g
                r8 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r8)
                goto L_0x013f
            L_0x0139:
                r10 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            L_0x013f:
                r10 = r6
            L_0x0140:
                c1.e r6 = r1.W
                c1.f r6 = (c1.f) r6
                if (r6 == 0) goto L_0x01b6
                androidx.constraintlayout.widget.ConstraintLayout r8 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r8 = r8.f1859p
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = c1.k.b(r8, r9)
                if (r8 == 0) goto L_0x01b6
                int r8 = r11.getMeasuredWidth()
                int r9 = r18.u()
                if (r8 != r9) goto L_0x01b6
                int r8 = r11.getMeasuredWidth()
                int r9 = r6.u()
                if (r8 >= r9) goto L_0x01b6
                int r8 = r11.getMeasuredHeight()
                int r9 = r18.o()
                if (r8 != r9) goto L_0x01b6
                int r8 = r11.getMeasuredHeight()
                int r6 = r6.o()
                if (r8 >= r6) goto L_0x01b6
                int r6 = r11.getBaseline()
                int r8 = r1.f4426d0
                if (r6 != r8) goto L_0x01b6
                boolean r6 = r18.D()
                if (r6 != 0) goto L_0x01b6
                int r6 = r1.I
                int r8 = r18.u()
                boolean r6 = a(r6, r7, r8)
                if (r6 == 0) goto L_0x01a2
                int r6 = r1.J
                int r8 = r18.o()
                boolean r6 = a(r6, r10, r8)
                if (r6 == 0) goto L_0x01a2
                r6 = r15
                goto L_0x01a3
            L_0x01a2:
                r6 = 0
            L_0x01a3:
                if (r6 == 0) goto L_0x01b6
                int r3 = r18.u()
                r2.f8487e = r3
                int r3 = r18.o()
                r2.f8488f = r3
                int r1 = r1.f4426d0
                r2.f8489g = r1
                return
            L_0x01b6:
                c1.e$a r6 = c1.e.a.MATCH_CONSTRAINT
                if (r4 != r6) goto L_0x01bc
                r8 = r15
                goto L_0x01bd
            L_0x01bc:
                r8 = 0
            L_0x01bd:
                if (r5 != r6) goto L_0x01c1
                r6 = r15
                goto L_0x01c2
            L_0x01c1:
                r6 = 0
            L_0x01c2:
                c1.e$a r9 = c1.e.a.MATCH_PARENT
                if (r5 == r9) goto L_0x01cb
                if (r5 != r3) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r5 = 0
                goto L_0x01cc
            L_0x01cb:
                r5 = r15
            L_0x01cc:
                if (r4 == r9) goto L_0x01d3
                if (r4 != r3) goto L_0x01d1
                goto L_0x01d3
            L_0x01d1:
                r3 = 0
                goto L_0x01d4
            L_0x01d3:
                r3 = r15
            L_0x01d4:
                r4 = 0
                if (r8 == 0) goto L_0x01df
                float r9 = r1.Z
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x01df
                r9 = r15
                goto L_0x01e0
            L_0x01df:
                r9 = 0
            L_0x01e0:
                if (r6 == 0) goto L_0x01ea
                float r12 = r1.Z
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x01ea
                r4 = r15
                goto L_0x01eb
            L_0x01ea:
                r4 = 0
            L_0x01eb:
                if (r11 != 0) goto L_0x01ee
                return
            L_0x01ee:
                android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
                int r13 = r2.f8492j
                if (r13 == r15) goto L_0x020e
                if (r13 == r14) goto L_0x020e
                if (r8 == 0) goto L_0x020e
                int r8 = r1.f4455s
                if (r8 != 0) goto L_0x020e
                if (r6 == 0) goto L_0x020e
                int r6 = r1.f4457t
                if (r6 == 0) goto L_0x0207
                goto L_0x020e
            L_0x0207:
                r0 = -1
                r10 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                goto L_0x02b2
            L_0x020e:
                boolean r6 = r11 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r6 == 0) goto L_0x0220
                boolean r6 = r1 instanceof c1.m
                if (r6 == 0) goto L_0x0220
                r6 = r1
                c1.m r6 = (c1.m) r6
                r8 = r11
                androidx.constraintlayout.widget.VirtualLayout r8 = (androidx.constraintlayout.widget.VirtualLayout) r8
                r8.u(r6, r7, r10)
                goto L_0x0223
            L_0x0220:
                r11.measure(r7, r10)
            L_0x0223:
                r1.I = r7
                r1.J = r10
                r6 = 0
                r1.f4431g = r6
                int r6 = r11.getMeasuredWidth()
                int r8 = r11.getMeasuredHeight()
                int r13 = r11.getBaseline()
                int r14 = r1.f4461v
                if (r14 <= 0) goto L_0x023f
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0240
            L_0x023f:
                r14 = r6
            L_0x0240:
                int r15 = r1.f4463w
                if (r15 <= 0) goto L_0x0248
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0248:
                int r15 = r1.f4465y
                if (r15 <= 0) goto L_0x0253
                int r15 = java.lang.Math.max(r15, r8)
                r16 = r7
                goto L_0x0256
            L_0x0253:
                r16 = r7
                r15 = r8
            L_0x0256:
                int r7 = r1.f4466z
                if (r7 <= 0) goto L_0x025e
                int r15 = java.lang.Math.min(r7, r15)
            L_0x025e:
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f1859p
                r0 = 1
                boolean r7 = c1.k.b(r7, r0)
                if (r7 != 0) goto L_0x0280
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r9 == 0) goto L_0x0276
                if (r5 == 0) goto L_0x0276
                float r3 = r1.Z
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r14 = (int) r4
                goto L_0x0280
            L_0x0276:
                if (r4 == 0) goto L_0x0280
                if (r3 == 0) goto L_0x0280
                float r3 = r1.Z
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r15 = (int) r4
            L_0x0280:
                if (r6 != r14) goto L_0x0287
                if (r8 == r15) goto L_0x0285
                goto L_0x0287
            L_0x0285:
                r10 = 0
                goto L_0x02b1
            L_0x0287:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r6 == r14) goto L_0x0290
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x0292
            L_0x0290:
                r7 = r16
            L_0x0292:
                if (r8 == r15) goto L_0x0298
                int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x0298:
                r11.measure(r7, r10)
                r1.I = r7
                r1.J = r10
                r10 = 0
                r1.f4431g = r10
                int r0 = r11.getMeasuredWidth()
                int r3 = r11.getMeasuredHeight()
                int r4 = r11.getBaseline()
                r14 = r0
                r15 = r3
                r13 = r4
            L_0x02b1:
                r0 = -1
            L_0x02b2:
                if (r13 == r0) goto L_0x02b6
                r0 = 1
                goto L_0x02b7
            L_0x02b6:
                r0 = r10
            L_0x02b7:
                int r3 = r2.f8485c
                if (r14 != r3) goto L_0x02c2
                int r3 = r2.f8486d
                if (r15 == r3) goto L_0x02c0
                goto L_0x02c2
            L_0x02c0:
                r6 = r10
                goto L_0x02c3
            L_0x02c2:
                r6 = 1
            L_0x02c3:
                r2.f8491i = r6
                boolean r3 = r12.f1871c0
                if (r3 == 0) goto L_0x02ca
                r0 = 1
            L_0x02ca:
                if (r0 == 0) goto L_0x02d6
                r3 = -1
                if (r13 == r3) goto L_0x02d6
                int r1 = r1.f4426d0
                if (r1 == r13) goto L_0x02d6
                r1 = 1
                r2.f8491i = r1
            L_0x02d6:
                r2.f8487e = r14
                r2.f8488f = r15
                r2.f8490h = r0
                r2.f8489g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.b(c1.e, d1.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        e((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static b getSharedValues() {
        if (f1850w == null) {
            f1850w = new b();
        }
        return f1850w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0305  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r24, android.view.View r25, c1.e r26, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r27, android.util.SparseArray<c1.e> r28) {
        /*
            r23 = this;
            r0 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            c1.e$a r9 = c1.e.a.MATCH_PARENT
            c1.e$a r10 = c1.e.a.WRAP_CONTENT
            c1.e$a r11 = c1.e.a.FIXED
            c1.e$a r12 = c1.e.a.MATCH_CONSTRAINT
            c1.d$a r13 = c1.d.a.RIGHT
            c1.d$a r14 = c1.d.a.LEFT
            c1.d$a r15 = c1.d.a.BOTTOM
            c1.d$a r5 = c1.d.a.TOP
            r27.a()
            int r1 = r25.getVisibility()
            r6.f4438j0 = r1
            boolean r1 = r7.f1877f0
            r4 = 1
            if (r1 == 0) goto L_0x002c
            r6.G = r4
            r1 = 8
            r6.f4438j0 = r1
        L_0x002c:
            r6.f4436i0 = r0
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L_0x003e
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r3 = r23
            c1.f r1 = r3.f1853c
            boolean r1 = r1.B0
            r0.p(r6, r1)
            goto L_0x0040
        L_0x003e:
            r3 = r23
        L_0x0040:
            boolean r0 = r7.f1873d0
            r2 = -1
            if (r0 == 0) goto L_0x0076
            r0 = r6
            c1.h r0 = (c1.h) r0
            int r1 = r7.f1893n0
            int r4 = r7.f1895o0
            float r5 = r7.f1897p0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x005e
            if (r7 <= 0) goto L_0x0370
            r0.f4501w0 = r5
            r0.f4502x0 = r2
            r0.f4503y0 = r2
            goto L_0x0370
        L_0x005e:
            if (r1 == r2) goto L_0x006a
            if (r1 <= r2) goto L_0x0370
            r0.f4501w0 = r6
            r0.f4502x0 = r1
            r0.f4503y0 = r2
            goto L_0x0370
        L_0x006a:
            if (r4 == r2) goto L_0x0370
            if (r4 <= r2) goto L_0x0370
            r0.f4501w0 = r6
            r0.f4502x0 = r2
            r0.f4503y0 = r4
            goto L_0x0370
        L_0x0076:
            int r0 = r7.f1879g0
            int r1 = r7.f1881h0
            int r2 = r7.f1883i0
            r16 = r10
            int r10 = r7.f1885j0
            r17 = r5
            int r5 = r7.f1887k0
            r18 = r11
            int r11 = r7.f1889l0
            r19 = r9
            float r9 = r7.f1891m0
            int r4 = r7.f1896p
            r21 = r5
            r5 = -1
            if (r4 == r5) goto L_0x00bc
            java.lang.Object r0 = r8.get(r4)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x00b3
            float r8 = r7.f1900r
            int r4 = r7.f1898q
            c1.d$a r9 = c1.d.a.CENTER
            r10 = 0
            r0 = r26
            r1 = r9
            r11 = r5
            r3 = r9
            r9 = 1
            r20 = r12
            r12 = 0
            r5 = r10
            r0.z(r1, r2, r3, r4, r5)
            r6.E = r8
            goto L_0x00b8
        L_0x00b3:
            r11 = r5
            r20 = r12
            r9 = 1
            r12 = 0
        L_0x00b8:
            r1 = r6
            r2 = r11
            goto L_0x01d4
        L_0x00bc:
            r20 = r12
            r4 = 1
            r12 = 0
            if (r0 == r5) goto L_0x00e1
            java.lang.Object r0 = r8.get(r0)
            r3 = r0
            c1.e r3 = (c1.e) r3
            if (r3 == 0) goto L_0x00de
            int r1 = r7.leftMargin
            r0 = r26
            r22 = r1
            r1 = r14
            r12 = r2
            r2 = r3
            r3 = r14
            r4 = r22
            r6 = r5
            r5 = r21
            r0.z(r1, r2, r3, r4, r5)
            goto L_0x00f9
        L_0x00de:
            r12 = r2
            r6 = r5
            goto L_0x00f9
        L_0x00e1:
            r12 = r2
            r6 = r5
            if (r1 == r6) goto L_0x00f9
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x00f9
            int r4 = r7.leftMargin
            r0 = r26
            r1 = r14
            r3 = r13
            r5 = r21
            r0.z(r1, r2, r3, r4, r5)
        L_0x00f9:
            if (r12 == r6) goto L_0x010f
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x0124
            int r4 = r7.rightMargin
            r0 = r26
            r1 = r13
            r3 = r14
            r5 = r11
            r0.z(r1, r2, r3, r4, r5)
            goto L_0x0124
        L_0x010f:
            if (r10 == r6) goto L_0x0124
            java.lang.Object r0 = r8.get(r10)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x0124
            int r4 = r7.rightMargin
            r0 = r26
            r1 = r13
            r3 = r13
            r5 = r11
            r0.z(r1, r2, r3, r4, r5)
        L_0x0124:
            int r0 = r7.f1882i
            if (r0 == r6) goto L_0x013f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x0158
            int r4 = r7.topMargin
            int r5 = r7.f1906x
            r0 = r26
            r1 = r17
            r3 = r17
            r0.z(r1, r2, r3, r4, r5)
            goto L_0x0158
        L_0x013f:
            int r0 = r7.f1884j
            if (r0 == r6) goto L_0x0158
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x0158
            int r4 = r7.topMargin
            int r5 = r7.f1906x
            r0 = r26
            r1 = r17
            r3 = r15
            r0.z(r1, r2, r3, r4, r5)
        L_0x0158:
            int r0 = r7.f1886k
            if (r0 == r6) goto L_0x0172
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x018a
            int r4 = r7.bottomMargin
            int r5 = r7.f1908z
            r0 = r26
            r1 = r15
            r3 = r17
            r0.z(r1, r2, r3, r4, r5)
            goto L_0x018a
        L_0x0172:
            int r0 = r7.f1888l
            if (r0 == r6) goto L_0x018a
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            c1.e r2 = (c1.e) r2
            if (r2 == 0) goto L_0x018a
            int r4 = r7.bottomMargin
            int r5 = r7.f1908z
            r0 = r26
            r1 = r15
            r3 = r15
            r0.z(r1, r2, r3, r4, r5)
        L_0x018a:
            int r4 = r7.f1890m
            if (r4 == r6) goto L_0x019c
            c1.d$a r5 = c1.d.a.BASELINE
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = r28
            r0.p(r1, r2, r3, r4, r5)
            goto L_0x01be
        L_0x019c:
            int r4 = r7.f1892n
            if (r4 == r6) goto L_0x01ae
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r17
            r0.p(r1, r2, r3, r4, r5)
            goto L_0x01be
        L_0x01ae:
            int r4 = r7.f1894o
            if (r4 == r6) goto L_0x01be
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r15
            r0.p(r1, r2, r3, r4, r5)
        L_0x01be:
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x01c9
            r1 = r26
            r2 = r6
            r1.f4432g0 = r9
            goto L_0x01cc
        L_0x01c9:
            r1 = r26
            r2 = r6
        L_0x01cc:
            float r3 = r7.F
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x01d4
            r1.f4434h0 = r3
        L_0x01d4:
            if (r24 == 0) goto L_0x01e4
            int r0 = r7.T
            if (r0 != r2) goto L_0x01de
            int r3 = r7.U
            if (r3 == r2) goto L_0x01e4
        L_0x01de:
            int r3 = r7.U
            r1.f4422b0 = r0
            r1.f4424c0 = r3
        L_0x01e4:
            boolean r0 = r7.f1867a0
            r3 = -2
            r4 = 0
            if (r0 != 0) goto L_0x0221
            int r0 = r7.width
            if (r0 != r2) goto L_0x0212
            boolean r0 = r7.W
            if (r0 == 0) goto L_0x01fa
            r0 = r20
            r1.P(r0)
            r5 = r19
            goto L_0x0201
        L_0x01fa:
            r5 = r19
            r0 = r20
            r1.P(r5)
        L_0x0201:
            c1.d r6 = r1.m(r14)
            int r8 = r7.leftMargin
            r6.f4407g = r8
            c1.d r6 = r1.m(r13)
            int r8 = r7.rightMargin
            r6.f4407g = r8
            goto L_0x021c
        L_0x0212:
            r5 = r19
            r0 = r20
            r1.P(r0)
            r1.R(r4)
        L_0x021c:
            r8 = r16
            r6 = r18
            goto L_0x023b
        L_0x0221:
            r6 = r18
            r5 = r19
            r0 = r20
            r1.P(r6)
            int r8 = r7.width
            r1.R(r8)
            int r8 = r7.width
            if (r8 != r3) goto L_0x0239
            r8 = r16
            r1.P(r8)
            goto L_0x023b
        L_0x0239:
            r8 = r16
        L_0x023b:
            boolean r9 = r7.f1869b0
            if (r9 != 0) goto L_0x0268
            int r3 = r7.height
            if (r3 != r2) goto L_0x0261
            boolean r3 = r7.X
            if (r3 == 0) goto L_0x024b
            r1.Q(r0)
            goto L_0x024e
        L_0x024b:
            r1.Q(r5)
        L_0x024e:
            r0 = r17
            c1.d r0 = r1.m(r0)
            int r3 = r7.topMargin
            r0.f4407g = r3
            c1.d r0 = r1.m(r15)
            int r3 = r7.bottomMargin
            r0.f4407g = r3
            goto L_0x0277
        L_0x0261:
            r1.Q(r0)
            r1.O(r4)
            goto L_0x0277
        L_0x0268:
            r1.Q(r6)
            int r0 = r7.height
            r1.O(r0)
            int r0 = r7.height
            if (r0 != r3) goto L_0x0277
            r1.Q(r8)
        L_0x0277:
            java.lang.String r0 = r7.G
            if (r0 == 0) goto L_0x030a
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0283
            goto L_0x030a
        L_0x0283:
            int r3 = r0.length()
            r5 = 44
            int r5 = r0.indexOf(r5)
            if (r5 <= 0) goto L_0x02ad
            int r6 = r3 + -1
            if (r5 >= r6) goto L_0x02ad
            java.lang.String r6 = r0.substring(r4, r5)
            java.lang.String r8 = "W"
            boolean r8 = r6.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x02a1
            r2 = r4
            goto L_0x02aa
        L_0x02a1:
            java.lang.String r8 = "H"
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto L_0x02aa
            r2 = 1
        L_0x02aa:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x02af
        L_0x02ad:
            r6 = 1
            r5 = r4
        L_0x02af:
            r8 = 58
            int r8 = r0.indexOf(r8)
            if (r8 < 0) goto L_0x02ee
            int r3 = r3 - r6
            if (r8 >= r3) goto L_0x02ee
            java.lang.String r3 = r0.substring(r5, r8)
            int r8 = r8 + r6
            java.lang.String r0 = r0.substring(r8)
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x02ff
            int r5 = r0.length()
            if (r5 <= 0) goto L_0x02ff
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x02ff }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02ff }
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ff
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ff
            if (r2 != r6) goto L_0x02e8
            float r0 = r0 / r3
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x02ff }
            goto L_0x02fc
        L_0x02e8:
            float r3 = r3 / r0
            float r0 = java.lang.Math.abs(r3)     // Catch:{ NumberFormatException -> 0x02ff }
            goto L_0x02fc
        L_0x02ee:
            java.lang.String r0 = r0.substring(r5)
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x02ff
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02ff }
        L_0x02fc:
            r5 = r0
            r0 = 0
            goto L_0x0301
        L_0x02ff:
            r0 = 0
            r5 = 0
        L_0x0301:
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x030e
            r1.Z = r5
            r1.f4420a0 = r2
            goto L_0x030e
        L_0x030a:
            r0 = 0
            r6 = 1
            r1.Z = r0
        L_0x030e:
            float r0 = r7.H
            float[] r2 = r1.f4450p0
            r2[r4] = r0
            float r0 = r7.I
            r2[r6] = r0
            int r0 = r7.J
            r1.f4446n0 = r0
            int r0 = r7.K
            r1.f4448o0 = r0
            int r0 = r7.Z
            if (r0 < 0) goto L_0x0329
            r2 = 3
            if (r0 > r2) goto L_0x0329
            r1.f4453r = r0
        L_0x0329:
            int r0 = r7.L
            int r2 = r7.N
            int r3 = r7.P
            float r5 = r7.R
            r1.f4455s = r0
            r1.f4461v = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x033b
            r3 = r4
        L_0x033b:
            r1.f4463w = r3
            r1.f4464x = r5
            r3 = 0
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r3 = 2
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 <= 0) goto L_0x034f
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x034f
            if (r0 != 0) goto L_0x034f
            r1.f4455s = r3
        L_0x034f:
            int r0 = r7.M
            int r5 = r7.O
            int r6 = r7.Q
            float r7 = r7.S
            r1.f4457t = r0
            r1.f4465y = r5
            if (r6 != r2) goto L_0x035e
            goto L_0x035f
        L_0x035e:
            r4 = r6
        L_0x035f:
            r1.f4466z = r4
            r1.A = r7
            r2 = 0
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0370
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0370
            if (r0 != 0) goto L_0x0370
            r1.f4457t = r3
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b(boolean, android.view.View, c1.e, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    public final View c(int i10) {
        return this.f1851a.get(i10);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final e d(View view) {
        if (view == this) {
            return this.f1853c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f1899q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f1899q0;
        }
        return null;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f1852b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1852b.get(i10).r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i10, int i11) {
        f fVar = this.f1853c;
        fVar.f4436i0 = this;
        a aVar = this.f1865v;
        fVar.A0 = aVar;
        fVar.f4473y0.f8500f = aVar;
        this.f1851a.put(getId(), this);
        this.f1860q = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f1854d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1854d);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f1855e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1855e);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1856f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1856f);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1857n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1857n);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1859p = obtainStyledAttributes.getInt(index, this.f1859p);
                } else if (index == R$styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            g(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1861r = null;
                        }
                    }
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        a aVar2 = new a();
                        this.f1860q = aVar2;
                        aVar2.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1860q = null;
                    }
                    this.f1862s = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        f fVar2 = this.f1853c;
        fVar2.J0 = this.f1859p;
        d.f28p = fVar2.Z(512);
    }

    public final boolean f() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public final void forceLayout() {
        this.f1858o = true;
        super.forceLayout();
    }

    public void g(int i10) {
        this.f1861r = new g1.b(getContext(), this, i10);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1857n;
    }

    public int getMaxWidth() {
        return this.f1856f;
    }

    public int getMinHeight() {
        return this.f1855e;
    }

    public int getMinWidth() {
        return this.f1854d;
    }

    public int getOptimizationLevel() {
        return this.f1853c.J0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1853c.f4439k == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1853c.f4439k = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1853c.f4439k = "parent";
            }
        }
        f fVar = this.f1853c;
        if (fVar.f4442l0 == null) {
            fVar.f4442l0 = fVar.f4439k;
            String str = this.f1853c.f4442l0;
        }
        Iterator<e> it = this.f1853c.f4510w0.iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.f4436i0;
            if (view != null) {
                if (next.f4439k == null && (id2 = view.getId()) != -1) {
                    next.f4439k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f4442l0 == null) {
                    next.f4442l0 = next.f4439k;
                }
            }
        }
        this.f1853c.r(sb2);
        return sb2.toString();
    }

    public final void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        a aVar = this.f1865v;
        int i14 = aVar.f1914e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + aVar.f1913d, i10, 0);
        int min = Math.min(this.f1856f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1857n, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:419:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(c1.f r29, int r30, int r31, int r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = android.view.View.MeasureSpec.getMode(r31)
            int r4 = android.view.View.MeasureSpec.getSize(r31)
            int r5 = android.view.View.MeasureSpec.getMode(r32)
            int r6 = android.view.View.MeasureSpec.getSize(r32)
            int r7 = r28.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r28.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r28.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$a r12 = r0.f1865v
            r12.f1911b = r7
            r12.f1912c = r9
            r12.f1913d = r11
            r12.f1914e = r10
            r9 = r31
            r12.f1915f = r9
            r9 = r32
            r12.f1916g = r9
            int r9 = r28.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r12 = r28.getPaddingEnd()
            int r12 = java.lang.Math.max(r8, r12)
            if (r9 > 0) goto L_0x005d
            if (r12 <= 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            int r9 = r28.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0064
        L_0x005d:
            boolean r13 = r28.f()
            if (r13 == 0) goto L_0x0064
            r9 = r12
        L_0x0064:
            int r4 = r4 - r11
            int r6 = r6 - r10
            c1.e$a r10 = c1.e.a.WRAP_CONTENT
            androidx.constraintlayout.widget.ConstraintLayout$a r11 = r0.f1865v
            int r12 = r11.f1914e
            int r11 = r11.f1913d
            c1.e$a r13 = c1.e.a.FIXED
            int r14 = r28.getChildCount()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x009a
            if (r3 == 0) goto L_0x008e
            if (r3 == r8) goto L_0x0081
            r8 = r13
            r15 = 0
            goto L_0x00a7
        L_0x0081:
            int r8 = r0.f1856f
            int r8 = r8 - r11
            int r8 = java.lang.Math.min(r8, r4)
            r32 = r13
            r13 = r15
            r15 = r32
            goto L_0x00b0
        L_0x008e:
            if (r14 != 0) goto L_0x0098
            int r8 = r0.f1854d
            r15 = 0
            int r8 = java.lang.Math.max(r15, r8)
            goto L_0x00a5
        L_0x0098:
            r15 = 0
            goto L_0x00a6
        L_0x009a:
            r15 = 0
            if (r14 != 0) goto L_0x00a4
            int r8 = r0.f1854d
            int r8 = java.lang.Math.max(r15, r8)
            goto L_0x00a5
        L_0x00a4:
            r8 = r4
        L_0x00a5:
            r15 = r8
        L_0x00a6:
            r8 = r10
        L_0x00a7:
            r32 = r13
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = r15
            r15 = r8
            r8 = r27
        L_0x00b0:
            if (r5 == r13) goto L_0x00dd
            if (r5 == 0) goto L_0x00c9
            r13 = 1073741824(0x40000000, float:2.0)
            if (r5 == r13) goto L_0x00bc
            r13 = r32
            r14 = 0
            goto L_0x00da
        L_0x00bc:
            int r13 = r0.f1857n
            int r13 = r13 - r12
            int r13 = java.lang.Math.min(r13, r6)
            r17 = r10
            r14 = r13
            r13 = r32
            goto L_0x00eb
        L_0x00c9:
            if (r14 != 0) goto L_0x00d8
            int r13 = r0.f1855e
            r14 = 0
            int r16 = java.lang.Math.max(r14, r13)
            r13 = r10
            r17 = r13
            r14 = r16
            goto L_0x00eb
        L_0x00d8:
            r14 = 0
            r13 = r10
        L_0x00da:
            r17 = r10
            goto L_0x00eb
        L_0x00dd:
            r13 = 0
            if (r14 != 0) goto L_0x00e7
            int r14 = r0.f1855e
            int r14 = java.lang.Math.max(r13, r14)
            goto L_0x00e8
        L_0x00e7:
            r14 = r6
        L_0x00e8:
            r13 = r10
            r17 = r13
        L_0x00eb:
            int r10 = r29.u()
            r18 = r6
            r6 = 1
            if (r8 != r10) goto L_0x00fa
            int r10 = r29.o()
            if (r14 == r10) goto L_0x00fe
        L_0x00fa:
            d1.e r10 = r1.f4473y0
            r10.f8497c = r6
        L_0x00fe:
            r10 = 0
            r1.f4422b0 = r10
            r1.f4424c0 = r10
            int r6 = r0.f1856f
            int r6 = r6 - r11
            r20 = r4
            int[] r4 = r1.D
            r4[r10] = r6
            int r6 = r0.f1857n
            int r6 = r6 - r12
            r16 = 1
            r4[r16] = r6
            r1.f4428e0 = r10
            r1.f4430f0 = r10
            r1.P(r15)
            r1.R(r8)
            r1.Q(r13)
            r1.O(r14)
            int r4 = r0.f1854d
            int r4 = r4 - r11
            if (r4 >= 0) goto L_0x012c
            r6 = 0
            r1.f4428e0 = r6
            goto L_0x012f
        L_0x012c:
            r6 = 0
            r1.f4428e0 = r4
        L_0x012f:
            int r4 = r0.f1855e
            int r4 = r4 - r12
            if (r4 >= 0) goto L_0x0137
            r1.f4430f0 = r6
            goto L_0x0139
        L_0x0137:
            r1.f4430f0 = r4
        L_0x0139:
            r1.D0 = r9
            r1.E0 = r7
            d1.b r4 = r1.f4472x0
            r4.getClass()
            c1.d$a r6 = c1.d.a.BOTTOM
            c1.d$a r7 = c1.d.a.RIGHT
            c1.e$a r8 = c1.e.a.MATCH_CONSTRAINT
            d1.b$b r9 = r1.A0
            java.util.ArrayList<c1.e> r10 = r1.f4510w0
            int r10 = r10.size()
            int r11 = r29.u()
            int r12 = r29.o()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = c1.k.b(r2, r13)
            r14 = 64
            if (r13 != 0) goto L_0x016b
            boolean r2 = c1.k.b(r2, r14)
            if (r2 == 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r2 = 0
            goto L_0x016c
        L_0x016b:
            r2 = 1
        L_0x016c:
            if (r2 == 0) goto L_0x01cd
            r14 = 0
        L_0x016f:
            if (r14 >= r10) goto L_0x01cd
            java.util.ArrayList<c1.e> r15 = r1.f4510w0
            java.lang.Object r15 = r15.get(r14)
            c1.e r15 = (c1.e) r15
            c1.e$a[] r0 = r15.V
            r22 = r2
            r16 = 0
            r2 = r0[r16]
            if (r2 != r8) goto L_0x0185
            r2 = 1
            goto L_0x0186
        L_0x0185:
            r2 = 0
        L_0x0186:
            r19 = 1
            r0 = r0[r19]
            if (r0 != r8) goto L_0x018e
            r0 = 1
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            if (r2 == 0) goto L_0x019c
            if (r0 == 0) goto L_0x019c
            float r0 = r15.Z
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x019c
            r0 = 1
            goto L_0x019d
        L_0x019c:
            r0 = 0
        L_0x019d:
            boolean r2 = r15.B()
            if (r2 == 0) goto L_0x01a6
            if (r0 == 0) goto L_0x01a6
            goto L_0x01c8
        L_0x01a6:
            boolean r2 = r15.C()
            if (r2 == 0) goto L_0x01af
            if (r0 == 0) goto L_0x01af
            goto L_0x01c8
        L_0x01af:
            boolean r0 = r15 instanceof c1.m
            if (r0 == 0) goto L_0x01b4
            goto L_0x01c8
        L_0x01b4:
            boolean r0 = r15.B()
            if (r0 != 0) goto L_0x01c8
            boolean r0 = r15.C()
            if (r0 == 0) goto L_0x01c1
            goto L_0x01c8
        L_0x01c1:
            int r14 = r14 + 1
            r0 = r28
            r2 = r22
            goto L_0x016f
        L_0x01c8:
            r0 = 1073741824(0x40000000, float:2.0)
            r22 = 0
            goto L_0x01d1
        L_0x01cd:
            r22 = r2
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01d1:
            if (r3 != r0) goto L_0x01d5
            if (r5 == r0) goto L_0x01d7
        L_0x01d5:
            if (r13 == 0) goto L_0x01d9
        L_0x01d7:
            r0 = 1
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            r0 = r22 & r0
            if (r0 == 0) goto L_0x04b8
            int[] r14 = r1.D
            r15 = 0
            r14 = r14[r15]
            r15 = r20
            int r14 = java.lang.Math.min(r14, r15)
            int[] r15 = r1.D
            r2 = 1
            r15 = r15[r2]
            r2 = r18
            int r2 = java.lang.Math.min(r15, r2)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L_0x0209
            int r15 = r29.u()
            if (r15 == r14) goto L_0x0206
            r1.R(r14)
            d1.e r14 = r1.f4473y0
            r15 = 1
            r14.f8496b = r15
        L_0x0206:
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x020a
        L_0x0209:
            r14 = r15
        L_0x020a:
            if (r5 != r14) goto L_0x021b
            int r14 = r29.o()
            if (r14 == r2) goto L_0x021b
            r1.O(r2)
            d1.e r2 = r1.f4473y0
            r14 = 1
            r2.f8496b = r14
            goto L_0x021c
        L_0x021b:
            r14 = 1
        L_0x021c:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 != r2) goto L_0x03ff
            if (r5 != r2) goto L_0x03ff
            d1.e r2 = r1.f4473y0
            c1.e$a r15 = c1.e.a.MATCH_PARENT
            r13 = r13 & r14
            boolean r14 = r2.f8496b
            if (r14 != 0) goto L_0x0234
            boolean r14 = r2.f8497c
            if (r14 == 0) goto L_0x0230
            goto L_0x0234
        L_0x0230:
            r18 = r0
            r14 = 0
            goto L_0x027d
        L_0x0234:
            c1.f r14 = r2.f8495a
            java.util.ArrayList<c1.e> r14 = r14.f4510w0
            java.util.Iterator r14 = r14.iterator()
        L_0x023c:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto L_0x0263
            java.lang.Object r18 = r14.next()
            r22 = r14
            r14 = r18
            c1.e r14 = (c1.e) r14
            r14.l()
            r18 = r0
            r0 = 0
            r14.f4419a = r0
            d1.l r0 = r14.f4425d
            r0.n()
            d1.n r0 = r14.f4427e
            r0.m()
            r0 = r18
            r14 = r22
            goto L_0x023c
        L_0x0263:
            r18 = r0
            c1.f r0 = r2.f8495a
            r0.l()
            c1.f r0 = r2.f8495a
            r14 = 0
            r0.f4419a = r14
            d1.l r0 = r0.f4425d
            r0.n()
            c1.f r0 = r2.f8495a
            d1.n r0 = r0.f4427e
            r0.m()
            r2.f8497c = r14
        L_0x027d:
            c1.f r0 = r2.f8498d
            r2.b(r0)
            c1.f r0 = r2.f8495a
            r0.f4422b0 = r14
            r0.f4424c0 = r14
            c1.e$a r0 = r0.n(r14)
            c1.f r14 = r2.f8495a
            r22 = r6
            r6 = 1
            c1.e$a r14 = r14.n(r6)
            boolean r6 = r2.f8496b
            if (r6 == 0) goto L_0x029c
            r2.c()
        L_0x029c:
            c1.f r6 = r2.f8495a
            int r6 = r6.v()
            r23 = r7
            c1.f r7 = r2.f8495a
            int r7 = r7.w()
            r24 = r9
            c1.f r9 = r2.f8495a
            d1.l r9 = r9.f4425d
            d1.f r9 = r9.f8535h
            r9.d(r6)
            c1.f r9 = r2.f8495a
            d1.n r9 = r9.f4427e
            d1.f r9 = r9.f8535h
            r9.d(r7)
            r2.g()
            r9 = r17
            if (r0 == r9) goto L_0x02d2
            if (r14 != r9) goto L_0x02c8
            goto L_0x02d2
        L_0x02c8:
            r26 = r4
            r25 = r11
            r11 = r32
            r32 = r12
            goto L_0x0341
        L_0x02d2:
            r17 = r13
            if (r13 == 0) goto L_0x02f0
            java.util.ArrayList<d1.p> r13 = r2.f8499e
            java.util.Iterator r13 = r13.iterator()
        L_0x02dc:
            boolean r25 = r13.hasNext()
            if (r25 == 0) goto L_0x02f0
            java.lang.Object r25 = r13.next()
            d1.p r25 = (d1.p) r25
            boolean r25 = r25.k()
            if (r25 != 0) goto L_0x02dc
            r17 = 0
        L_0x02f0:
            if (r17 == 0) goto L_0x0319
            if (r0 != r9) goto L_0x0319
            c1.f r13 = r2.f8495a
            r25 = r11
            r11 = r32
            r13.P(r11)
            c1.f r13 = r2.f8495a
            r26 = r4
            r32 = r12
            r12 = 0
            int r4 = r2.d(r13, r12)
            r13.R(r4)
            c1.f r4 = r2.f8495a
            d1.l r12 = r4.f4425d
            d1.g r12 = r12.f8532e
            int r4 = r4.u()
            r12.d(r4)
            goto L_0x0321
        L_0x0319:
            r26 = r4
            r25 = r11
            r11 = r32
            r32 = r12
        L_0x0321:
            if (r17 == 0) goto L_0x0341
            if (r14 != r9) goto L_0x0341
            c1.f r4 = r2.f8495a
            r4.Q(r11)
            c1.f r4 = r2.f8495a
            r12 = 1
            int r13 = r2.d(r4, r12)
            r4.O(r13)
            c1.f r4 = r2.f8495a
            d1.n r12 = r4.f4427e
            d1.g r12 = r12.f8532e
            int r4 = r4.o()
            r12.d(r4)
        L_0x0341:
            c1.f r4 = r2.f8495a
            c1.e$a[] r12 = r4.V
            r13 = 0
            r12 = r12[r13]
            if (r12 == r11) goto L_0x034f
            if (r12 != r15) goto L_0x034d
            goto L_0x034f
        L_0x034d:
            r4 = 0
            goto L_0x0391
        L_0x034f:
            int r4 = r4.u()
            int r4 = r4 + r6
            c1.f r12 = r2.f8495a
            d1.l r12 = r12.f4425d
            d1.f r12 = r12.f8536i
            r12.d(r4)
            c1.f r12 = r2.f8495a
            d1.l r12 = r12.f4425d
            d1.g r12 = r12.f8532e
            int r4 = r4 - r6
            r12.d(r4)
            r2.g()
            c1.f r4 = r2.f8495a
            c1.e$a[] r6 = r4.V
            r12 = 1
            r6 = r6[r12]
            if (r6 == r11) goto L_0x0375
            if (r6 != r15) goto L_0x038d
        L_0x0375:
            int r4 = r4.o()
            int r4 = r4 + r7
            c1.f r6 = r2.f8495a
            d1.n r6 = r6.f4427e
            d1.f r6 = r6.f8536i
            r6.d(r4)
            c1.f r6 = r2.f8495a
            d1.n r6 = r6.f4427e
            d1.g r6 = r6.f8532e
            int r4 = r4 - r7
            r6.d(r4)
        L_0x038d:
            r2.g()
            r4 = 1
        L_0x0391:
            java.util.ArrayList<d1.p> r6 = r2.f8499e
            java.util.Iterator r6 = r6.iterator()
        L_0x0397:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x03b2
            java.lang.Object r7 = r6.next()
            d1.p r7 = (d1.p) r7
            c1.e r12 = r7.f8529b
            c1.f r13 = r2.f8495a
            if (r12 != r13) goto L_0x03ae
            boolean r12 = r7.f8534g
            if (r12 != 0) goto L_0x03ae
            goto L_0x0397
        L_0x03ae:
            r7.e()
            goto L_0x0397
        L_0x03b2:
            java.util.ArrayList<d1.p> r6 = r2.f8499e
            java.util.Iterator r6 = r6.iterator()
        L_0x03b8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x03ef
            java.lang.Object r7 = r6.next()
            d1.p r7 = (d1.p) r7
            if (r4 != 0) goto L_0x03cd
            c1.e r12 = r7.f8529b
            c1.f r13 = r2.f8495a
            if (r12 != r13) goto L_0x03cd
            goto L_0x03b8
        L_0x03cd:
            d1.f r12 = r7.f8535h
            boolean r12 = r12.f8512j
            if (r12 != 0) goto L_0x03d4
            goto L_0x03ed
        L_0x03d4:
            d1.f r12 = r7.f8536i
            boolean r12 = r12.f8512j
            if (r12 != 0) goto L_0x03df
            boolean r12 = r7 instanceof d1.j
            if (r12 != 0) goto L_0x03df
            goto L_0x03ed
        L_0x03df:
            d1.g r12 = r7.f8532e
            boolean r12 = r12.f8512j
            if (r12 != 0) goto L_0x03b8
            boolean r12 = r7 instanceof d1.c
            if (r12 != 0) goto L_0x03b8
            boolean r7 = r7 instanceof d1.j
            if (r7 != 0) goto L_0x03b8
        L_0x03ed:
            r4 = 0
            goto L_0x03f0
        L_0x03ef:
            r4 = 1
        L_0x03f0:
            c1.f r6 = r2.f8495a
            r6.P(r0)
            c1.f r0 = r2.f8495a
            r0.Q(r14)
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x04a8
        L_0x03ff:
            r18 = r0
            r26 = r4
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r11
            r9 = r17
            r11 = r32
            r32 = r12
            d1.e r0 = r1.f4473y0
            boolean r2 = r0.f8496b
            if (r2 == 0) goto L_0x046e
            c1.f r2 = r0.f8495a
            java.util.ArrayList<c1.e> r2 = r2.f4510w0
            java.util.Iterator r2 = r2.iterator()
        L_0x041f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0448
            java.lang.Object r4 = r2.next()
            c1.e r4 = (c1.e) r4
            r4.l()
            r6 = 0
            r4.f4419a = r6
            d1.l r7 = r4.f4425d
            d1.g r12 = r7.f8532e
            r12.f8512j = r6
            r7.f8534g = r6
            r7.n()
            d1.n r4 = r4.f4427e
            d1.g r7 = r4.f8532e
            r7.f8512j = r6
            r4.f8534g = r6
            r4.m()
            goto L_0x041f
        L_0x0448:
            r6 = 0
            c1.f r2 = r0.f8495a
            r2.l()
            c1.f r2 = r0.f8495a
            r2.f4419a = r6
            d1.l r2 = r2.f4425d
            d1.g r4 = r2.f8532e
            r4.f8512j = r6
            r2.f8534g = r6
            r2.n()
            c1.f r2 = r0.f8495a
            d1.n r2 = r2.f4427e
            d1.g r4 = r2.f8532e
            r4.f8512j = r6
            r2.f8534g = r6
            r2.m()
            r0.c()
            goto L_0x046f
        L_0x046e:
            r6 = 0
        L_0x046f:
            c1.f r2 = r0.f8498d
            r0.b(r2)
            c1.f r2 = r0.f8495a
            r2.f4422b0 = r6
            r2.f4424c0 = r6
            d1.l r2 = r2.f4425d
            d1.f r2 = r2.f8535h
            r2.d(r6)
            c1.f r0 = r0.f8495a
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8535h
            r0.d(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x0499
            boolean r2 = r1.X(r6, r13)
            r4 = 1
            r19 = r2 & 1
            r2 = r4
            r6 = r19
            goto L_0x049c
        L_0x0499:
            r4 = 1
            r6 = r4
            r2 = 0
        L_0x049c:
            if (r5 != r0) goto L_0x04a7
            boolean r7 = r1.X(r4, r13)
            r4 = r7 & r6
            int r2 = r2 + 1
            goto L_0x04a8
        L_0x04a7:
            r4 = r6
        L_0x04a8:
            if (r4 == 0) goto L_0x04cc
            if (r3 != r0) goto L_0x04ae
            r3 = 1
            goto L_0x04af
        L_0x04ae:
            r3 = 0
        L_0x04af:
            if (r5 != r0) goto L_0x04b3
            r0 = 1
            goto L_0x04b4
        L_0x04b3:
            r0 = 0
        L_0x04b4:
            r1.S(r3, r0)
            goto L_0x04cc
        L_0x04b8:
            r18 = r0
            r26 = r4
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r11
            r9 = r17
            r11 = r32
            r32 = r12
            r2 = 0
            r4 = 0
        L_0x04cc:
            if (r4 == 0) goto L_0x04d1
            r0 = 2
            if (r2 == r0) goto L_0x07e2
        L_0x04d1:
            int r0 = r1.J0
            r2 = 8
            if (r10 <= 0) goto L_0x05f1
            java.util.ArrayList<c1.e> r3 = r1.f4510w0
            int r3 = r3.size()
            r4 = 64
            boolean r4 = r1.Z(r4)
            d1.b$b r5 = r1.A0
            r6 = 0
        L_0x04e6:
            if (r6 >= r3) goto L_0x057b
            java.util.ArrayList<c1.e> r7 = r1.f4510w0
            java.lang.Object r7 = r7.get(r6)
            c1.e r7 = (c1.e) r7
            boolean r12 = r7 instanceof c1.h
            if (r12 == 0) goto L_0x04f5
            goto L_0x0515
        L_0x04f5:
            boolean r12 = r7 instanceof c1.a
            if (r12 == 0) goto L_0x04fa
            goto L_0x0515
        L_0x04fa:
            boolean r12 = r7.H
            if (r12 == 0) goto L_0x04ff
            goto L_0x0515
        L_0x04ff:
            if (r4 == 0) goto L_0x0519
            d1.l r12 = r7.f4425d
            if (r12 == 0) goto L_0x0519
            d1.n r13 = r7.f4427e
            if (r13 == 0) goto L_0x0519
            d1.g r12 = r12.f8532e
            boolean r12 = r12.f8512j
            if (r12 == 0) goto L_0x0519
            d1.g r12 = r13.f8532e
            boolean r12 = r12.f8512j
            if (r12 == 0) goto L_0x0519
        L_0x0515:
            r12 = r26
            r13 = 0
            goto L_0x0575
        L_0x0519:
            r12 = 0
            c1.e$a r13 = r7.n(r12)
            r12 = 1
            c1.e$a r14 = r7.n(r12)
            if (r13 != r8) goto L_0x0531
            int r15 = r7.f4455s
            if (r15 == r12) goto L_0x0531
            if (r14 != r8) goto L_0x0531
            int r15 = r7.f4457t
            if (r15 == r12) goto L_0x0531
            r15 = r12
            goto L_0x0532
        L_0x0531:
            r15 = 0
        L_0x0532:
            if (r15 != 0) goto L_0x0569
            boolean r17 = r1.Z(r12)
            if (r17 == 0) goto L_0x0569
            boolean r12 = r7 instanceof c1.m
            if (r12 != 0) goto L_0x0569
            if (r13 != r8) goto L_0x054d
            int r12 = r7.f4455s
            if (r12 != 0) goto L_0x054d
            if (r14 == r8) goto L_0x054d
            boolean r12 = r7.B()
            if (r12 != 0) goto L_0x054d
            r15 = 1
        L_0x054d:
            if (r14 != r8) goto L_0x055c
            int r12 = r7.f4457t
            if (r12 != 0) goto L_0x055c
            if (r13 == r8) goto L_0x055c
            boolean r12 = r7.B()
            if (r12 != 0) goto L_0x055c
            r15 = 1
        L_0x055c:
            if (r13 == r8) goto L_0x0560
            if (r14 != r8) goto L_0x0569
        L_0x0560:
            float r12 = r7.Z
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x056a
            r15 = 1
            goto L_0x056a
        L_0x0569:
            r13 = 0
        L_0x056a:
            if (r15 == 0) goto L_0x056f
            r12 = r26
            goto L_0x0575
        L_0x056f:
            r12 = r26
            r14 = 0
            r12.a(r14, r7, r5)
        L_0x0575:
            int r6 = r6 + 1
            r26 = r12
            goto L_0x04e6
        L_0x057b:
            r12 = r26
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f1910a
            int r3 = r3.getChildCount()
            r15 = 0
        L_0x0586:
            if (r15 >= r3) goto L_0x05d4
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f1910a
            android.view.View r4 = r4.getChildAt(r15)
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.Placeholder
            if (r6 == 0) goto L_0x05d1
            androidx.constraintlayout.widget.Placeholder r4 = (androidx.constraintlayout.widget.Placeholder) r4
            android.view.View r6 = r4.f1930b
            if (r6 != 0) goto L_0x0599
            goto L_0x05d1
        L_0x0599:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6
            android.view.View r4 = r4.f1930b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            c1.e r7 = r4.f1899q0
            r8 = 0
            r7.f4438j0 = r8
            c1.e r13 = r6.f1899q0
            c1.e$a[] r14 = r13.V
            r14 = r14[r8]
            if (r14 == r11) goto L_0x05bb
            int r7 = r7.u()
            r13.R(r7)
        L_0x05bb:
            c1.e r6 = r6.f1899q0
            c1.e$a[] r7 = r6.V
            r8 = 1
            r7 = r7[r8]
            if (r7 == r11) goto L_0x05cd
            c1.e r7 = r4.f1899q0
            int r7 = r7.o()
            r6.O(r7)
        L_0x05cd:
            c1.e r4 = r4.f1899q0
            r4.f4438j0 = r2
        L_0x05d1:
            int r15 = r15 + 1
            goto L_0x0586
        L_0x05d4:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f1910a
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r3 = r3.f1852b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x05f3
            r15 = 0
        L_0x05df:
            if (r15 >= r3) goto L_0x05f3
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f1910a
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r4 = r4.f1852b
            java.lang.Object r4 = r4.get(r15)
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            r4.getClass()
            int r15 = r15 + 1
            goto L_0x05df
        L_0x05f1:
            r12 = r26
        L_0x05f3:
            r12.c(r1)
            java.util.ArrayList<c1.e> r3 = r12.f8480a
            int r3 = r3.size()
            r5 = r32
            r4 = r25
            r15 = 0
            if (r10 <= 0) goto L_0x0606
            r12.b(r1, r15, r4, r5)
        L_0x0606:
            if (r3 <= 0) goto L_0x07d4
            c1.e$a[] r6 = r1.V
            r7 = r6[r15]
            if (r7 != r9) goto L_0x0610
            r7 = 1
            goto L_0x0611
        L_0x0610:
            r7 = r15
        L_0x0611:
            r8 = 1
            r6 = r6[r8]
            if (r6 != r9) goto L_0x0618
            r6 = 1
            goto L_0x0619
        L_0x0618:
            r6 = r15
        L_0x0619:
            int r8 = r29.u()
            c1.f r9 = r12.f8482c
            int r9 = r9.f4428e0
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r29.o()
            c1.f r10 = r12.f8482c
            int r10 = r10.f4430f0
            int r9 = java.lang.Math.max(r9, r10)
            r10 = r15
            r11 = r10
        L_0x0633:
            if (r10 >= r3) goto L_0x06db
            java.util.ArrayList<c1.e> r13 = r12.f8480a
            java.lang.Object r13 = r13.get(r10)
            c1.e r13 = (c1.e) r13
            boolean r14 = r13 instanceof c1.m
            if (r14 != 0) goto L_0x064b
            r17 = r0
            r15 = r22
            r14 = r23
            r2 = r24
            goto L_0x06cc
        L_0x064b:
            int r14 = r13.u()
            int r15 = r13.o()
            r17 = r0
            r2 = r24
            r0 = 1
            boolean r21 = r12.a(r0, r13, r2)
            r0 = r11 | r21
            int r11 = r13.u()
            r31 = r0
            int r0 = r13.o()
            if (r11 == r14) goto L_0x0694
            r13.R(r11)
            if (r7 == 0) goto L_0x0690
            int r11 = r13.v()
            int r14 = r13.X
            int r11 = r11 + r14
            if (r11 <= r8) goto L_0x0690
            int r11 = r13.v()
            int r14 = r13.X
            int r11 = r11 + r14
            r14 = r23
            c1.d r21 = r13.m(r14)
            int r21 = r21.e()
            int r11 = r21 + r11
            int r8 = java.lang.Math.max(r8, r11)
            goto L_0x0692
        L_0x0690:
            r14 = r23
        L_0x0692:
            r11 = 1
            goto L_0x0698
        L_0x0694:
            r14 = r23
            r11 = r31
        L_0x0698:
            if (r0 == r15) goto L_0x06c4
            r13.O(r0)
            if (r6 == 0) goto L_0x06c0
            int r0 = r13.w()
            int r11 = r13.Y
            int r0 = r0 + r11
            if (r0 <= r9) goto L_0x06c0
            int r0 = r13.w()
            int r11 = r13.Y
            int r0 = r0 + r11
            r15 = r22
            c1.d r11 = r13.m(r15)
            int r11 = r11.e()
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r9, r11)
            r9 = r0
            goto L_0x06c2
        L_0x06c0:
            r15 = r22
        L_0x06c2:
            r11 = 1
            goto L_0x06c6
        L_0x06c4:
            r15 = r22
        L_0x06c6:
            c1.m r13 = (c1.m) r13
            boolean r0 = r13.E0
            r0 = r0 | r11
            r11 = r0
        L_0x06cc:
            int r10 = r10 + 1
            r24 = r2
            r23 = r14
            r22 = r15
            r0 = r17
            r2 = 8
            r15 = 0
            goto L_0x0633
        L_0x06db:
            r17 = r0
            r15 = r22
            r14 = r23
            r2 = r24
            r0 = 0
            r10 = 2
        L_0x06e5:
            if (r0 >= r10) goto L_0x07d6
            r13 = r11
            r11 = 0
        L_0x06e9:
            if (r11 >= r3) goto L_0x07b0
            java.util.ArrayList<c1.e> r10 = r12.f8480a
            java.lang.Object r10 = r10.get(r11)
            c1.e r10 = (c1.e) r10
            r31 = r3
            boolean r3 = r10 instanceof c1.i
            if (r3 == 0) goto L_0x06fd
            boolean r3 = r10 instanceof c1.m
            if (r3 == 0) goto L_0x0701
        L_0x06fd:
            boolean r3 = r10 instanceof c1.h
            if (r3 == 0) goto L_0x0704
        L_0x0701:
            r1 = 8
            goto L_0x0722
        L_0x0704:
            int r3 = r10.f4438j0
            r1 = 8
            if (r3 != r1) goto L_0x070b
            goto L_0x0722
        L_0x070b:
            if (r18 == 0) goto L_0x071e
            d1.l r3 = r10.f4425d
            d1.g r3 = r3.f8532e
            boolean r3 = r3.f8512j
            if (r3 == 0) goto L_0x071e
            d1.n r3 = r10.f4427e
            d1.g r3 = r3.f8532e
            boolean r3 = r3.f8512j
            if (r3 == 0) goto L_0x071e
            goto L_0x0722
        L_0x071e:
            boolean r3 = r10 instanceof c1.m
            if (r3 == 0) goto L_0x072a
        L_0x0722:
            r24 = r2
            r25 = r4
            r32 = r5
            goto L_0x07a1
        L_0x072a:
            int r3 = r10.u()
            int r1 = r10.o()
            r25 = r4
            int r4 = r10.f4426d0
            r32 = r5
            r5 = 1
            if (r0 != r5) goto L_0x073c
            r5 = 2
        L_0x073c:
            boolean r5 = r12.a(r5, r10, r2)
            r5 = r5 | r13
            int r13 = r10.u()
            r24 = r2
            int r2 = r10.o()
            if (r13 == r3) goto L_0x0770
            r10.R(r13)
            if (r7 == 0) goto L_0x076f
            int r3 = r10.v()
            int r5 = r10.X
            int r3 = r3 + r5
            if (r3 <= r8) goto L_0x076f
            int r3 = r10.v()
            int r5 = r10.X
            int r3 = r3 + r5
            c1.d r5 = r10.m(r14)
            int r5 = r5.e()
            int r5 = r5 + r3
            int r8 = java.lang.Math.max(r8, r5)
        L_0x076f:
            r5 = 1
        L_0x0770:
            if (r2 == r1) goto L_0x0796
            r10.O(r2)
            if (r6 == 0) goto L_0x0795
            int r1 = r10.w()
            int r2 = r10.Y
            int r1 = r1 + r2
            if (r1 <= r9) goto L_0x0795
            int r1 = r10.w()
            int r2 = r10.Y
            int r1 = r1 + r2
            c1.d r2 = r10.m(r15)
            int r2 = r2.e()
            int r2 = r2 + r1
            int r1 = java.lang.Math.max(r9, r2)
            r9 = r1
        L_0x0795:
            r5 = 1
        L_0x0796:
            boolean r1 = r10.F
            if (r1 == 0) goto L_0x07a0
            int r1 = r10.f4426d0
            if (r4 == r1) goto L_0x07a0
            r13 = 1
            goto L_0x07a1
        L_0x07a0:
            r13 = r5
        L_0x07a1:
            int r11 = r11 + 1
            r1 = r29
            r3 = r31
            r5 = r32
            r2 = r24
            r4 = r25
            r10 = 2
            goto L_0x06e9
        L_0x07b0:
            r24 = r2
            r31 = r3
            r25 = r4
            r32 = r5
            if (r13 == 0) goto L_0x07d1
            int r0 = r0 + 1
            r1 = r29
            r3 = r32
            r2 = r25
            r4 = 8
            r12.b(r1, r0, r2, r3)
            r4 = r2
            r5 = r3
            r2 = r24
            r10 = 2
            r11 = 0
            r3 = r31
            goto L_0x06e5
        L_0x07d1:
            r1 = r29
            goto L_0x07d6
        L_0x07d4:
            r17 = r0
        L_0x07d6:
            r0 = r17
            r1.J0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.Z(r0)
            a1.d.f28p = r0
        L_0x07e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.o(c1.f, int, int, int):void");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            e eVar = layoutParams.f1899q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f1873d0 || layoutParams.f1875e0 || isInEditMode) && !layoutParams.f1877f0) {
                int v2 = eVar.v();
                int w9 = eVar.w();
                int u10 = eVar.u() + v2;
                int o10 = eVar.o() + w9;
                childAt.layout(v2, w9, u10, o10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v2, w9, u10, o10);
                }
            }
        }
        int size = this.f1852b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1852b.get(i15).q();
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        boolean z10;
        String str;
        int k10;
        e eVar;
        int i12 = 0;
        if (!this.f1858o) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f1858o = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f1853c.B0 = f();
        if (this.f1858o) {
            this.f1858o = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z10 = false;
                    break;
                } else if (getChildAt(i14).isLayoutRequested()) {
                    z10 = true;
                    break;
                } else {
                    i14++;
                }
            }
            if (z10) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    e d10 = d(getChildAt(i15));
                    if (d10 != null) {
                        d10.G();
                    }
                }
                if (isInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                eVar = this.f1853c;
                            } else {
                                View view = this.f1851a.get(id2);
                                if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                if (view == this) {
                                    eVar = this.f1853c;
                                } else if (view == null) {
                                    eVar = null;
                                } else {
                                    eVar = ((LayoutParams) view.getLayoutParams()).f1899q0;
                                }
                            }
                            eVar.f4442l0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f1862s != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = getChildAt(i17);
                        if (childAt2.getId() == this.f1862s && (childAt2 instanceof Constraints)) {
                            this.f1860q = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                a aVar = this.f1860q;
                if (aVar != null) {
                    aVar.c(this);
                }
                this.f1853c.f4510w0.clear();
                int size = this.f1852b.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i12 < size) {
                        ConstraintHelper constraintHelper = this.f1852b.get(i12);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f1846e);
                        }
                        j jVar = constraintHelper.f1845d;
                        if (jVar != null) {
                            jVar.a();
                            while (i18 < constraintHelper.f1843b) {
                                int i19 = constraintHelper.f1842a[i18];
                                View c10 = c(i19);
                                if (c10 == null && (k10 = constraintHelper.k(this, str)) != 0) {
                                    constraintHelper.f1842a[i18] = k10;
                                    constraintHelper.f1849o.put(Integer.valueOf(k10), (str = constraintHelper.f1849o.get(Integer.valueOf(i19))));
                                    c10 = c(k10);
                                }
                                if (c10 != null) {
                                    constraintHelper.f1845d.b(d(c10));
                                }
                                i18++;
                            }
                            constraintHelper.f1845d.c();
                        }
                        i12++;
                        i18 = 0;
                    }
                }
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt3 = getChildAt(i20);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f1929a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f1931c);
                        }
                        View findViewById = findViewById(placeholder.f1929a);
                        placeholder.f1930b = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).f1877f0 = true;
                            placeholder.f1930b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.f1864u.clear();
                this.f1864u.put(0, this.f1853c);
                this.f1864u.put(getId(), this.f1853c);
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt4 = getChildAt(i21);
                    this.f1864u.put(childAt4.getId(), d(childAt4));
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt5 = getChildAt(i22);
                    e d11 = d(childAt5);
                    if (d11 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        f fVar = this.f1853c;
                        fVar.f4510w0.add(d11);
                        e eVar2 = d11.W;
                        if (eVar2 != null) {
                            ((n) eVar2).f4510w0.remove(d11);
                            d11.G();
                        }
                        d11.W = fVar;
                        b(isInEditMode, childAt5, d11, layoutParams, this.f1864u);
                    }
                }
            }
            if (z10) {
                f fVar2 = this.f1853c;
                fVar2.f4472x0.c(fVar2);
            }
        }
        o(this.f1853c, this.f1859p, i10, i11);
        int u10 = this.f1853c.u();
        int o10 = this.f1853c.o();
        f fVar3 = this.f1853c;
        n(i10, i11, u10, o10, fVar3.K0, fVar3.L0);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e d10 = d(view);
        if ((view instanceof Guideline) && !(d10 instanceof h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            h hVar = new h();
            layoutParams.f1899q0 = hVar;
            layoutParams.f1873d0 = true;
            hVar.V(layoutParams.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.t();
            ((LayoutParams) view.getLayoutParams()).f1875e0 = true;
            if (!this.f1852b.contains(constraintHelper)) {
                this.f1852b.add(constraintHelper);
            }
        }
        this.f1851a.put(view.getId(), view);
        this.f1858o = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1851a.remove(view.getId());
        e d10 = d(view);
        this.f1853c.f4510w0.remove(d10);
        d10.G();
        this.f1852b.remove(view);
        this.f1858o = true;
    }

    public final void p(e eVar, LayoutParams layoutParams, SparseArray<e> sparseArray, int i10, d.a aVar) {
        View view = this.f1851a.get(i10);
        e eVar2 = sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f1871c0 = true;
            d.a aVar2 = d.a.BASELINE;
            if (aVar == aVar2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f1871c0 = true;
                layoutParams2.f1899q0.F = true;
            }
            eVar.m(aVar2).b(eVar2.m(aVar), layoutParams.D, layoutParams.C, true);
            eVar.F = true;
            eVar.m(d.a.TOP).j();
            eVar.m(d.a.BOTTOM).j();
        }
    }

    public void requestLayout() {
        this.f1858o = true;
        super.requestLayout();
    }

    public void setConstraintSet(a aVar) {
        this.f1860q = aVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1863t == null) {
                this.f1863t = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1863t.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i10) {
        this.f1851a.remove(getId());
        super.setId(i10);
        this.f1851a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f1857n) {
            this.f1857n = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f1856f) {
            this.f1856f = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f1855e) {
            this.f1855e = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f1854d) {
            this.f1854d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(c cVar) {
        g1.b bVar = this.f1861r;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1859p = i10;
        f fVar = this.f1853c;
        fVar.J0 = i10;
        a1.d.f28p = fVar.Z(512);
    }

    public void setState(int i10, int i11, int i12) {
        g1.b bVar = this.f1861r;
        if (bVar != null) {
            bVar.b((float) i11, (float) i12, i10);
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e(attributeSet, i10, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f1866a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1867a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1868b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1869b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f1870c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1871c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1872d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1873d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1874e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1875e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1876f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1877f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f1878g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1879g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1880h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1881h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1882i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1883i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1884j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1885j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1886k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1887k0 = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f1888l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1889l0 = Integer.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        public int f1890m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1891m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f1892n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f1893n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1894o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1895o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1896p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public float f1897p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1898q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public e f1899q0 = new e();

        /* renamed from: r  reason: collision with root package name */
        public float f1900r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f1901s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1902t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1903u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1904v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1905w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public int f1906x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f1907y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1908z = Integer.MIN_VALUE;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1909a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1909a = sparseIntArray;
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f1909a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1896p);
                        this.f1896p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1896p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1898q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1898q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1900r) % 360.0f;
                        this.f1900r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1900r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1866a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1866a);
                        break;
                    case 6:
                        this.f1868b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1868b);
                        break;
                    case 7:
                        this.f1870c = obtainStyledAttributes.getFloat(index, this.f1870c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1874e);
                        this.f1874e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1874e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1876f);
                        this.f1876f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1876f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1878g);
                        this.f1878g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1878g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1880h);
                        this.f1880h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1880h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1882i);
                        this.f1882i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1882i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1884j);
                        this.f1884j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1884j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1886k);
                        this.f1886k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1886k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1888l);
                        this.f1888l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1888l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1890m);
                        this.f1890m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1890m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1901s);
                        this.f1901s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1901s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1902t);
                        this.f1902t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1902t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1903u);
                        this.f1903u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1903u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1904v);
                        this.f1904v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1904v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1905w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1905w);
                        break;
                    case 22:
                        this.f1906x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1906x);
                        break;
                    case 23:
                        this.f1907y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1907y);
                        break;
                    case 24:
                        this.f1908z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1908z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        this.L = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.M = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) != -2) {
                                break;
                            } else {
                                this.P = -2;
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) != -2) {
                                break;
                            } else {
                                this.O = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) != -2) {
                                break;
                            } else {
                                this.Q = -2;
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                a.n(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1892n);
                                this.f1892n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1892n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1894o);
                                this.f1894o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1894o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        a.m(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        a.m(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f1872d = obtainStyledAttributes.getBoolean(index, this.f1872d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f1873d0 = false;
            this.f1867a0 = true;
            this.f1869b0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.W) {
                this.f1867a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.X) {
                this.f1869b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1867a0 = false;
                if (i10 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1869b0 = false;
                if (i11 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f1870c != -1.0f || this.f1866a != -1 || this.f1868b != -1) {
                this.f1873d0 = true;
                this.f1867a0 = true;
                this.f1869b0 = true;
                if (!(this.f1899q0 instanceof h)) {
                    this.f1899q0 = new h();
                }
                ((h) this.f1899q0).V(this.V);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1883i0 = r4
                r10.f1885j0 = r4
                r10.f1879g0 = r4
                r10.f1881h0 = r4
                int r5 = r10.f1905w
                r10.f1887k0 = r5
                int r5 = r10.f1907y
                r10.f1889l0 = r5
                float r5 = r10.E
                r10.f1891m0 = r5
                int r6 = r10.f1866a
                r10.f1893n0 = r6
                int r7 = r10.f1868b
                r10.f1895o0 = r7
                float r8 = r10.f1870c
                r10.f1897p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f1901s
                if (r11 == r4) goto L_0x003f
                r10.f1883i0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1902t
                if (r11 == r4) goto L_0x0046
                r10.f1885j0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f1903u
                if (r11 == r4) goto L_0x004d
                r10.f1881h0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1904v
                if (r11 == r4) goto L_0x0054
                r10.f1879g0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f1889l0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f1887k0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1891m0 = r2
            L_0x0068:
                boolean r2 = r10.f1873d0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.V
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f1872d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1897p0 = r11
                r10.f1893n0 = r4
                r10.f1895o0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1895o0 = r6
                r10.f1893n0 = r4
                r10.f1897p0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f1893n0 = r7
                r10.f1895o0 = r4
                r10.f1897p0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f1901s
                if (r11 == r4) goto L_0x009a
                r10.f1881h0 = r11
            L_0x009a:
                int r11 = r10.f1902t
                if (r11 == r4) goto L_0x00a0
                r10.f1879g0 = r11
            L_0x00a0:
                int r11 = r10.f1903u
                if (r11 == r4) goto L_0x00a6
                r10.f1883i0 = r11
            L_0x00a6:
                int r11 = r10.f1904v
                if (r11 == r4) goto L_0x00ac
                r10.f1885j0 = r11
            L_0x00ac:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b2
                r10.f1887k0 = r11
            L_0x00b2:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b8
                r10.f1889l0 = r11
            L_0x00b8:
                int r11 = r10.f1903u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1904v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1902t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1901s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1878g
                if (r11 == r4) goto L_0x00d7
                r10.f1883i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f1880h
                if (r11 == r4) goto L_0x00e5
                r10.f1885j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f1874e
                if (r11 == r4) goto L_0x00f4
                r10.f1879g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f1876f
                if (r11 == r4) goto L_0x0102
                r10.f1881h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i10) {
            super(i10, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}

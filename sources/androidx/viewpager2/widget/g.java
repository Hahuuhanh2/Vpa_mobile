package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ScrollEventAdapter */
public final class g extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.g f3634a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f3635b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f3636c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f3637d;

    /* renamed from: e  reason: collision with root package name */
    public int f3638e;

    /* renamed from: f  reason: collision with root package name */
    public int f3639f;

    /* renamed from: g  reason: collision with root package name */
    public a f3640g = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f3641h;

    /* renamed from: i  reason: collision with root package name */
    public int f3642i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3643j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3644k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3645l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3646m;

    /* compiled from: ScrollEventAdapter */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3647a;

        /* renamed from: b  reason: collision with root package name */
        public float f3648b;

        /* renamed from: c  reason: collision with root package name */
        public int f3649c;
    }

    public g(ViewPager2 viewPager2) {
        this.f3635b = viewPager2;
        ViewPager2.k kVar = viewPager2.f3600q;
        this.f3636c = kVar;
        this.f3637d = (LinearLayoutManager) kVar.getLayoutManager();
        d();
    }

    public final void a(int i10, RecyclerView recyclerView) {
        boolean z10;
        boolean z11;
        ViewPager2.g gVar;
        ViewPager2.g gVar2;
        int i11 = this.f3638e;
        boolean z12 = true;
        if (!(i11 == 1 && this.f3639f == 1) && i10 == 1) {
            this.f3646m = false;
            this.f3638e = 1;
            int i12 = this.f3642i;
            if (i12 != -1) {
                this.f3641h = i12;
                this.f3642i = -1;
            } else if (this.f3641h == -1) {
                this.f3641h = this.f3637d.Z0();
            }
            c(1);
            return;
        }
        if (i11 == 1 || i11 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i10 != 2) {
            if (i11 == 1 || i11 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && i10 == 0) {
                e();
                if (!this.f3644k) {
                    int i13 = this.f3640g.f3647a;
                    if (!(i13 == -1 || (gVar2 = this.f3634a) == null)) {
                        gVar2.b(0.0f, i13, 0);
                    }
                } else {
                    a aVar = this.f3640g;
                    if (aVar.f3649c == 0) {
                        int i14 = this.f3641h;
                        int i15 = aVar.f3647a;
                        if (!(i14 == i15 || (gVar = this.f3634a) == null)) {
                            gVar.c(i15);
                        }
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    c(0);
                    d();
                }
            }
            if (this.f3638e == 2 && i10 == 0 && this.f3645l) {
                e();
                a aVar2 = this.f3640g;
                if (aVar2.f3649c == 0) {
                    int i16 = this.f3642i;
                    int i17 = aVar2.f3647a;
                    if (i16 != i17) {
                        if (i17 == -1) {
                            i17 = 0;
                        }
                        ViewPager2.g gVar3 = this.f3634a;
                        if (gVar3 != null) {
                            gVar3.c(i17);
                        }
                    }
                    c(0);
                    d();
                }
            }
        } else if (this.f3644k) {
            c(2);
            this.f3643j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r6 == r7) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f3644k = r5
            r4.e()
            boolean r0 = r4.f3643j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x0048
            r4.f3643j = r1
            if (r7 > 0) goto L_0x0029
            if (r7 != 0) goto L_0x0027
            if (r6 >= 0) goto L_0x0016
            r6 = r5
            goto L_0x0017
        L_0x0016:
            r6 = r1
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f3635b
            androidx.viewpager2.widget.ViewPager2$f r7 = r7.f3597n
            int r7 = r7.M()
            if (r7 != r5) goto L_0x0023
            r7 = r5
            goto L_0x0024
        L_0x0023:
            r7 = r1
        L_0x0024:
            if (r6 != r7) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r6 = r1
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            if (r6 == 0) goto L_0x0036
            androidx.viewpager2.widget.g$a r6 = r4.f3640g
            int r7 = r6.f3649c
            if (r7 == 0) goto L_0x0036
            int r6 = r6.f3647a
            int r6 = r6 + r5
            goto L_0x003a
        L_0x0036:
            androidx.viewpager2.widget.g$a r6 = r4.f3640g
            int r6 = r6.f3647a
        L_0x003a:
            r4.f3642i = r6
            int r7 = r4.f3641h
            if (r7 == r6) goto L_0x005a
            androidx.viewpager2.widget.ViewPager2$g r7 = r4.f3634a
            if (r7 == 0) goto L_0x005a
            r7.c(r6)
            goto L_0x005a
        L_0x0048:
            int r6 = r4.f3638e
            if (r6 != 0) goto L_0x005a
            androidx.viewpager2.widget.g$a r6 = r4.f3640g
            int r6 = r6.f3647a
            if (r6 != r2) goto L_0x0053
            r6 = r1
        L_0x0053:
            androidx.viewpager2.widget.ViewPager2$g r7 = r4.f3634a
            if (r7 == 0) goto L_0x005a
            r7.c(r6)
        L_0x005a:
            androidx.viewpager2.widget.g$a r6 = r4.f3640g
            int r7 = r6.f3647a
            if (r7 != r2) goto L_0x0061
            r7 = r1
        L_0x0061:
            float r0 = r6.f3648b
            int r6 = r6.f3649c
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.f3634a
            if (r3 == 0) goto L_0x006c
            r3.b(r0, r7, r6)
        L_0x006c:
            androidx.viewpager2.widget.g$a r6 = r4.f3640g
            int r7 = r6.f3647a
            int r0 = r4.f3642i
            if (r7 == r0) goto L_0x0076
            if (r0 != r2) goto L_0x0084
        L_0x0076:
            int r6 = r6.f3649c
            if (r6 != 0) goto L_0x0084
            int r6 = r4.f3639f
            if (r6 == r5) goto L_0x0084
            r4.c(r1)
            r4.d()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        if ((this.f3638e != 3 || this.f3639f != 0) && this.f3639f != i10) {
            this.f3639f = i10;
            ViewPager2.g gVar = this.f3634a;
            if (gVar != null) {
                gVar.a(i10);
            }
        }
    }

    public final void d() {
        this.f3638e = 0;
        this.f3639f = 0;
        a aVar = this.f3640g;
        aVar.f3647a = -1;
        aVar.f3648b = 0.0f;
        aVar.f3649c = 0;
        this.f3641h = -1;
        this.f3642i = -1;
        this.f3643j = false;
        this.f3644k = false;
        this.f3646m = false;
        this.f3645l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        if (r5[r2 - 1][1] >= r6) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r13 = this;
            androidx.viewpager2.widget.g$a r0 = r13.f3640g
            androidx.recyclerview.widget.LinearLayoutManager r1 = r13.f3637d
            int r1 = r1.Z0()
            r0.f3647a = r1
            r2 = 0
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L_0x0016
            r0.f3647a = r4
            r0.f3648b = r2
            r0.f3649c = r3
            return
        L_0x0016:
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f3637d
            android.view.View r1 = r5.B(r1)
            if (r1 != 0) goto L_0x0025
            r0.f3647a = r4
            r0.f3648b = r2
            r0.f3649c = r3
            return
        L_0x0025:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r13.f3637d
            r4.getClass()
            int r4 = androidx.recyclerview.widget.RecyclerView.m.N(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f3637d
            r5.getClass()
            int r5 = androidx.recyclerview.widget.RecyclerView.m.Q(r1)
            androidx.recyclerview.widget.LinearLayoutManager r6 = r13.f3637d
            r6.getClass()
            int r6 = androidx.recyclerview.widget.RecyclerView.m.S(r1)
            androidx.recyclerview.widget.LinearLayoutManager r7 = r13.f3637d
            r7.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.m.F(r1)
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x005f
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            int r9 = r8.leftMargin
            int r4 = r4 + r9
            int r9 = r8.rightMargin
            int r5 = r5 + r9
            int r9 = r8.topMargin
            int r6 = r6 + r9
            int r8 = r8.bottomMargin
            int r7 = r7 + r8
        L_0x005f:
            int r8 = r1.getHeight()
            int r8 = r8 + r6
            int r8 = r8 + r7
            int r7 = r1.getWidth()
            int r7 = r7 + r4
            int r7 = r7 + r5
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f3637d
            int r5 = r5.f2934x
            r9 = 1
            if (r5 != 0) goto L_0x0074
            r5 = r9
            goto L_0x0075
        L_0x0074:
            r5 = r3
        L_0x0075:
            if (r5 == 0) goto L_0x0095
            int r1 = r1.getLeft()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r4 = r13.f3636c
            int r4 = r4.getPaddingLeft()
            int r1 = r1 - r4
            androidx.viewpager2.widget.ViewPager2 r4 = r13.f3635b
            androidx.viewpager2.widget.ViewPager2$f r4 = r4.f3597n
            int r4 = r4.M()
            if (r4 != r9) goto L_0x008f
            r4 = r9
            goto L_0x0090
        L_0x008f:
            r4 = r3
        L_0x0090:
            if (r4 == 0) goto L_0x0093
            int r1 = -r1
        L_0x0093:
            r8 = r7
            goto L_0x00a1
        L_0x0095:
            int r1 = r1.getTop()
            int r1 = r1 - r6
            androidx.recyclerview.widget.RecyclerView r4 = r13.f3636c
            int r4 = r4.getPaddingTop()
            int r1 = r1 - r4
        L_0x00a1:
            int r1 = -r1
            r0.f3649c = r1
            if (r1 >= 0) goto L_0x0193
            androidx.viewpager2.widget.b r1 = new androidx.viewpager2.widget.b
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f3637d
            r1.<init>(r2)
            int r2 = r2.H()
            if (r2 != 0) goto L_0x00b5
            goto L_0x0144
        L_0x00b5:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r1.f3626a
            int r4 = r4.f2934x
            if (r4 != 0) goto L_0x00bd
            r4 = r9
            goto L_0x00be
        L_0x00bd:
            r4 = r3
        L_0x00be:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r9] = r5
            r6[r3] = r2
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = r3
        L_0x00ce:
            if (r6 >= r2) goto L_0x0118
            androidx.recyclerview.widget.LinearLayoutManager r7 = r1.f3626a
            android.view.View r7 = r7.G(r6)
            if (r7 == 0) goto L_0x0110
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r10 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00e3
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x00e5
        L_0x00e3:
            android.view.ViewGroup$MarginLayoutParams r8 = androidx.viewpager2.widget.b.f3625b
        L_0x00e5:
            r10 = r5[r6]
            if (r4 == 0) goto L_0x00f0
            int r11 = r7.getLeft()
            int r12 = r8.leftMargin
            goto L_0x00f6
        L_0x00f0:
            int r11 = r7.getTop()
            int r12 = r8.topMargin
        L_0x00f6:
            int r11 = r11 - r12
            r10[r3] = r11
            r10 = r5[r6]
            if (r4 == 0) goto L_0x0104
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L_0x010a
        L_0x0104:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L_0x010a:
            int r7 = r7 + r8
            r10[r9] = r7
            int r6 = r6 + 1
            goto L_0x00ce
        L_0x0110:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x0118:
            androidx.viewpager2.widget.a r4 = new androidx.viewpager2.widget.a
            r4.<init>()
            java.util.Arrays.sort(r5, r4)
            r4 = r9
        L_0x0121:
            if (r4 >= r2) goto L_0x0133
            int r6 = r4 + -1
            r6 = r5[r6]
            r6 = r6[r9]
            r7 = r5[r4]
            r7 = r7[r3]
            if (r6 == r7) goto L_0x0130
            goto L_0x0146
        L_0x0130:
            int r4 = r4 + 1
            goto L_0x0121
        L_0x0133:
            r4 = r5[r3]
            r6 = r4[r9]
            r4 = r4[r3]
            int r6 = r6 - r4
            if (r4 > 0) goto L_0x0146
            int r2 = r2 - r9
            r2 = r5[r2]
            r2 = r2[r9]
            if (r2 >= r6) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r2 = r9
            goto L_0x0147
        L_0x0146:
            r2 = r3
        L_0x0147:
            if (r2 == 0) goto L_0x0151
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f3626a
            int r2 = r2.H()
            if (r2 > r9) goto L_0x0170
        L_0x0151:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f3626a
            int r2 = r2.H()
            r4 = r3
        L_0x0158:
            if (r4 >= r2) goto L_0x016b
            androidx.recyclerview.widget.LinearLayoutManager r5 = r1.f3626a
            android.view.View r5 = r5.G(r4)
            boolean r5 = androidx.viewpager2.widget.b.a(r5)
            if (r5 == 0) goto L_0x0168
            r1 = r9
            goto L_0x016c
        L_0x0168:
            int r4 = r4 + 1
            goto L_0x0158
        L_0x016b:
            r1 = r3
        L_0x016c:
            if (r1 == 0) goto L_0x0170
            r1 = r9
            goto L_0x0171
        L_0x0170:
            r1 = r3
        L_0x0171:
            if (r1 == 0) goto L_0x017b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x017b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int r0 = r0.f3649c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r3] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r4)
            r1.<init>(r0)
            throw r1
        L_0x0193:
            if (r8 != 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            float r1 = (float) r1
            float r2 = (float) r8
            float r2 = r1 / r2
        L_0x019a:
            r0.f3648b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.e():void");
    }
}

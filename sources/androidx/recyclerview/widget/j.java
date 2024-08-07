package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import s1.n;

/* compiled from: GapWorker */
public final class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<j> f3255e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static a f3256f = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RecyclerView> f3257a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f3258b;

    /* renamed from: c  reason: collision with root package name */
    public long f3259c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c> f3260d = new ArrayList<>();

    /* compiled from: GapWorker */
    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.j$c r7 = (androidx.recyclerview.widget.j.c) r7
                androidx.recyclerview.widget.j$c r8 = (androidx.recyclerview.widget.j.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f3268d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f3268d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f3265a
                boolean r3 = r8.f3265a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f3266b
                int r2 = r7.f3266b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f3267c
                int r8 = r8.f3267c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.j.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f3261a;

        /* renamed from: b  reason: collision with root package name */
        public int f3262b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f3263c;

        /* renamed from: d  reason: collision with root package name */
        public int f3264d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f3264d * 2;
                int[] iArr = this.f3263c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3263c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f3263c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3263c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f3264d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f3264d = 0;
            int[] iArr = this.f3263c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f2994u;
            if (recyclerView.f2992t != null && mVar != null && mVar.f3055q) {
                if (!z10) {
                    if (!recyclerView.C || recyclerView.L || recyclerView.f2969e.g()) {
                        z11 = true;
                    }
                    if (!z11) {
                        mVar.s(this.f3261a, this.f3262b, recyclerView.f2985p0, this);
                    }
                } else if (!recyclerView.f2969e.g()) {
                    mVar.t(recyclerView.f2992t.c(), this);
                }
                int i10 = this.f3264d;
                if (i10 > mVar.f3056r) {
                    mVar.f3056r = i10;
                    mVar.f3057s = z10;
                    recyclerView.f2965c.n();
                }
            }
        }
    }

    /* compiled from: GapWorker */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3265a;

        /* renamed from: b  reason: collision with root package name */
        public int f3266b;

        /* renamed from: c  reason: collision with root package name */
        public int f3267c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f3268d;

        /* renamed from: e  reason: collision with root package name */
        public int f3269e;
    }

    public static RecyclerView.a0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.f2971f.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z10 = false;
                break;
            }
            RecyclerView.a0 O = RecyclerView.O(recyclerView.f2971f.g(i11));
            if (O.f3015c == i10 && !O.h()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f2965c;
        try {
            recyclerView.U();
            RecyclerView.a0 l10 = sVar.l(i10, j10);
            if (l10 != null) {
                if (!l10.g() || l10.h()) {
                    sVar.a(l10, false);
                } else {
                    sVar.i(l10.f3013a);
                }
            }
            return l10;
        } finally {
            recyclerView.V(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.I0 && !this.f3257a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f3258b == 0) {
                this.f3258b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.f2983o0;
        bVar.f3261a = i10;
        bVar.f3262b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        int size = this.f3257a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f3257a.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f2983o0.b(recyclerView3, false);
                i10 += recyclerView3.f2983o0.f3264d;
            }
        }
        this.f3260d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f3257a.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f2983o0;
                int abs = Math.abs(bVar.f3262b) + Math.abs(bVar.f3261a);
                for (int i14 = 0; i14 < bVar.f3264d * 2; i14 += 2) {
                    if (i12 >= this.f3260d.size()) {
                        cVar2 = new c();
                        this.f3260d.add(cVar2);
                    } else {
                        cVar2 = this.f3260d.get(i12);
                    }
                    int[] iArr = bVar.f3263c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f3265a = z10;
                    cVar2.f3266b = abs;
                    cVar2.f3267c = i15;
                    cVar2.f3268d = recyclerView4;
                    cVar2.f3269e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3260d, f3256f);
        for (int i16 = 0; i16 < this.f3260d.size() && (recyclerView = cVar.f3268d) != null; i16++) {
            if ((cVar = this.f3260d.get(i16)).f3265a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.a0 c10 = c(recyclerView, cVar.f3269e, j11);
            if (!(c10 == null || c10.f3014b == null || !c10.g() || c10.h() || (recyclerView2 = c10.f3014b.get()) == null)) {
                if (recyclerView2.L && recyclerView2.f2971f.h() != 0) {
                    recyclerView2.f0();
                }
                b bVar2 = recyclerView2.f2983o0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f3264d != 0) {
                    try {
                        int i17 = n.f14600a;
                        n.a.a("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.f2985p0;
                        RecyclerView.e eVar = recyclerView2.f2992t;
                        wVar.f3100d = 1;
                        wVar.f3101e = eVar.c();
                        wVar.f3103g = false;
                        wVar.f3104h = false;
                        wVar.f3105i = false;
                        for (int i18 = 0; i18 < bVar2.f3264d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f3263c[i18], j10);
                        }
                        n.a.b();
                    } catch (Throwable th2) {
                        int i19 = n.f14600a;
                        n.a.b();
                        throw th2;
                    }
                }
            }
            cVar.f3265a = false;
            cVar.f3266b = 0;
            cVar.f3267c = 0;
            cVar.f3268d = null;
            cVar.f3269e = 0;
        }
    }

    public final void run() {
        try {
            int i10 = n.f14600a;
            n.a.a("RV Prefetch");
            if (this.f3257a.isEmpty()) {
                this.f3258b = 0;
                n.a.b();
                return;
            }
            int size = this.f3257a.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f3257a.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f3258b = 0;
                n.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3259c);
            this.f3258b = 0;
            n.a.b();
        } catch (Throwable th2) {
            this.f3258b = 0;
            int i12 = n.f14600a;
            n.a.b();
            throw th2;
        }
    }
}

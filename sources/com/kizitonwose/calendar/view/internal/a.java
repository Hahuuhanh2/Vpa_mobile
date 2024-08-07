package com.kizitonwose.calendar.view.internal;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import p3.l0;
import sk.j;

/* compiled from: CalendarPageSnapHelper.kt */
public final class a extends r {

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f8046f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f8047g;

    /* renamed from: h  reason: collision with root package name */
    public e f8048h;

    /* renamed from: i  reason: collision with root package name */
    public final b f8049i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    public p f8050j;

    /* renamed from: k  reason: collision with root package name */
    public o f8051k;

    /* renamed from: com.kizitonwose.calendar.view.internal.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarPageSnapHelper.kt */
    public /* synthetic */ class C0078a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8052a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(2:1|2)|3|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.kizitonwose.calendar.view.internal.e[] r0 = com.kizitonwose.calendar.view.internal.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.kizitonwose.calendar.view.internal.e r2 = com.kizitonwose.calendar.view.internal.e.Forward     // Catch:{ NoSuchFieldError -> 0x000d }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r2 = 2
                com.kizitonwose.calendar.view.internal.e r3 = com.kizitonwose.calendar.view.internal.e.Forward     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.kizitonwose.calendar.view.internal.e r1 = com.kizitonwose.calendar.view.internal.e.Forward     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                f8052a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kizitonwose.calendar.view.internal.a.C0078a.<clinit>():void");
        }
    }

    /* compiled from: CalendarPageSnapHelper.kt */
    public static final class b extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8053a;

        public b(a aVar) {
            this.f8053a = aVar;
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            e eVar;
            j.f(recyclerView, "recyclerView");
            a aVar = this.f8053a;
            if (i10 > 0 || i11 > 0) {
                eVar = e.Forward;
            } else if (i10 < 0 || i11 < 0) {
                eVar = e.Backward;
            } else {
                eVar = e.Layout;
            }
            aVar.f8048h = eVar;
        }
    }

    private final q i(RecyclerView.m mVar) {
        o oVar = this.f8051k;
        if (oVar == null || !j.a(oVar.f3290a, mVar)) {
            this.f8051k = new o(mVar);
        }
        o oVar2 = this.f8051k;
        if (oVar2 != null) {
            return oVar2;
        }
        j.l("horizontalHelper");
        throw null;
    }

    private final q j(RecyclerView.m mVar) {
        p pVar = this.f8050j;
        if (pVar == null || !j.a(pVar.f3290a, mVar)) {
            this.f8050j = new p(mVar);
        }
        p pVar2 = this.f8050j;
        if (pVar2 != null) {
            return pVar2;
        }
        j.l("verticalHelper");
        throw null;
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        RecyclerView recyclerView2 = this.f8046f;
        if (recyclerView2 != null) {
            b bVar = this.f8049i;
            ArrayList arrayList = recyclerView2.f2989r0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
        }
        this.f8046f = recyclerView;
        if (recyclerView != null) {
            recyclerView.j(this.f8049i);
        }
    }

    public final int[] b(RecyclerView.m mVar, View view) {
        int i10;
        j.f(mVar, "lm");
        j.f(view, "targetView");
        int[] iArr = new int[2];
        int i11 = 0;
        if (mVar.o()) {
            q i12 = i(mVar);
            i10 = i12.e(view) - i12.k();
        } else {
            i10 = 0;
        }
        iArr[0] = i10;
        if (mVar.p()) {
            q j10 = j(mVar);
            i11 = j10.e(view) - j10.k();
        }
        iArr[1] = i11;
        return iArr;
    }

    public final View d(RecyclerView.m mVar) {
        q qVar;
        int i10;
        int i11;
        int e10;
        int i12;
        j.f(mVar, "lm");
        Integer num = this.f8047g;
        if (num != null) {
            this.f8047g = null;
            return mVar.B(num.intValue());
        }
        e eVar = this.f8048h;
        this.f8048h = null;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int i13 = linearLayoutManager.f2934x;
        if (i13 == 0) {
            qVar = i(mVar);
        } else if (i13 == 1) {
            qVar = j(mVar);
        } else {
            throw new IllegalStateException();
        }
        boolean z10 = linearLayoutManager.B;
        if (z10) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        if (z10) {
            i11 = linearLayoutManager.a1();
        } else {
            i11 = linearLayoutManager.Z0();
        }
        View B = mVar.B(i11);
        if (B == null || (e10 = qVar.e(B) - qVar.k()) == 0) {
            return null;
        }
        if (eVar == null) {
            i12 = -1;
        } else {
            i12 = C0078a.f8052a[eVar.ordinal()];
        }
        if (i12 != -1) {
            if (i12 != 1) {
                if (i12 == 2) {
                    View B2 = mVar.B(l0.v(i11 + i10, l0.U0(0, mVar.L())));
                    if (B2 == null) {
                        return B;
                    }
                    if (((float) Math.abs(qVar.e(B2) - qVar.k())) <= ((float) qVar.c(B2)) * 0.1f) {
                        return B2;
                    }
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (((float) Math.abs(e10)) >= ((float) qVar.c(B)) * 0.1f) {
                return mVar.B(l0.v(i11 + i10, l0.U0(0, mVar.L())));
            }
        }
        return B;
    }

    public final int e(RecyclerView.m mVar, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int i14 = 1;
        if (!linearLayoutManager.o() ? i11 <= 0 : i10 <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (linearLayoutManager.B) {
                i13 = linearLayoutManager.a1();
            } else {
                i13 = linearLayoutManager.Z0();
            }
            if (linearLayoutManager.B) {
                i14 = -1;
            }
            i12 = i13 + i14;
        } else if (linearLayoutManager.B) {
            i12 = linearLayoutManager.a1();
        } else {
            i12 = linearLayoutManager.Z0();
        }
        int v2 = l0.v(i12, l0.U0(0, linearLayoutManager.L()));
        this.f8047g = Integer.valueOf(v2);
        return v2;
    }
}

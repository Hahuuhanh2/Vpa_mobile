package nj;

import fk.j;
import fk.p;
import java.util.ArrayList;
import java.util.List;
import rk.l;

/* compiled from: ScannerConfig.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f21725a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21726b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f21727c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21728d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21729e;

    /* renamed from: f  reason: collision with root package name */
    public final float f21730f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21731g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21732h;

    /* compiled from: ScannerConfig.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public List<? extends a> f21733a = j7.a.c0(a.FORMAT_ALL_FORMATS);

        /* renamed from: b  reason: collision with root package name */
        public Integer f21734b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21735c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21736d;

        /* renamed from: e  reason: collision with root package name */
        public float f21737e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21738f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21739g;
    }

    /* renamed from: nj.b$b  reason: collision with other inner class name */
    /* compiled from: ScannerConfig.kt */
    public static final class C0291b {
        public static b a(l lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            List<? extends a> list = aVar.f21733a;
            ArrayList arrayList = new ArrayList(j.H0(list));
            for (a aVar2 : list) {
                arrayList.add(Integer.valueOf(aVar2.f21724a));
            }
            return new b(p.Y0(arrayList), aVar.f21734b, aVar.f21735c, aVar.f21736d, aVar.f21737e, aVar.f21738f, aVar.f21739g);
        }
    }

    public b(int[] iArr, Integer num, boolean z10, boolean z11, float f10, boolean z12, boolean z13) {
        this.f21725a = iArr;
        this.f21727c = num;
        this.f21728d = z10;
        this.f21729e = z11;
        this.f21730f = f10;
        this.f21731g = z12;
        this.f21732h = z13;
    }
}

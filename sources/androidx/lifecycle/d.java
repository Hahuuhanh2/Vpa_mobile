package androidx.lifecycle;

import androidx.lifecycle.i;
import r2.c;
import r2.l;
import sk.j;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public final c f2748a;

    /* renamed from: b  reason: collision with root package name */
    public final n f2749b;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f2750a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.d.a.<clinit>():void");
        }
    }

    public d(c cVar, n nVar) {
        j.f(cVar, "defaultLifecycleObserver");
        this.f2748a = cVar;
        this.f2749b = nVar;
    }

    public final void q(l lVar, i.a aVar) {
        switch (a.f2750a[aVar.ordinal()]) {
            case 1:
                this.f2748a.v(lVar);
                break;
            case 2:
                this.f2748a.onStart(lVar);
                break;
            case 3:
                this.f2748a.onResume(lVar);
                break;
            case 4:
                this.f2748a.onPause(lVar);
                break;
            case 5:
                this.f2748a.onStop(lVar);
                break;
            case 6:
                this.f2748a.onDestroy(lVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f2749b;
        if (nVar != null) {
            nVar.q(lVar, aVar);
        }
    }
}

package v9;

import com.google.android.gms.tasks.Continuation;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f16093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16094b = false;

    public /* synthetic */ d(e eVar) {
        this.f16093a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r5) {
        /*
            r4 = this;
            v9.e r5 = r4.f16093a
            boolean r0 = r4.f16094b
            if (r0 != 0) goto L_0x0038
            androidx.fragment.app.o r0 = r5.f16100f
            if (r0 == 0) goto L_0x0021
            long r0 = r0.g()
            j7.a r2 = r5.f16099e
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x003b
            androidx.fragment.app.o r5 = r5.f16100f
            y6.j.f(r5)
            v9.c r0 = new v9.c
            java.lang.String r5 = r5.v()
            r1 = 0
            r0.<init>(r5, r1)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r0)
            goto L_0x004d
        L_0x0038:
            r5.getClass()
        L_0x003b:
            com.google.firebase.FirebaseException r5 = new com.google.firebase.FirebaseException
            java.lang.String r0 = "No AppCheckProvider installed."
            r5.<init>(r0)
            v9.c r0 = new v9.c
            java.lang.String r1 = "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ=="
            r0.<init>(r1, r5)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r0)
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.d.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}

package y6;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class d0 extends l0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f17551d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f17552e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f17553f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(a aVar, int i10, Bundle bundle) {
        super(aVar, Boolean.TRUE);
        this.f17553f = aVar;
        this.f17551d = i10;
        this.f17552e = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a() {
        /*
            r3 = this;
            int r0 = r3.f17551d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.d()
            if (r0 != 0) goto L_0x001b
            y6.a r0 = r3.f17553f
            r0.zzp(r1, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 8
            r0.<init>(r1, r2)
            r3.c(r0)
        L_0x001b:
            return
        L_0x001c:
            y6.a r0 = r3.f17553f
            r0.zzp(r1, (android.os.IInterface) null)
            android.os.Bundle r0 = r3.f17552e
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L_0x002e:
            int r0 = r3.f17551d
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r2)
            r3.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.d0.a():void");
    }

    public final void b() {
    }

    public abstract void c(ConnectionResult connectionResult);

    public abstract boolean d();
}

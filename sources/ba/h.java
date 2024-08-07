package ba;

import a7.a;
import android.os.HandlerThread;
import com.google.android.gms.internal.p001firebaseauthapi.zzc;
import m9.d;
import t6.k;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f4112e = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f4113a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f4114b;

    /* renamed from: c  reason: collision with root package name */
    public final zzc f4115c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4116d;

    public h(d dVar) {
        f4112e.b("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f4115c = new zzc(handlerThread.getLooper());
        dVar.a();
        this.f4116d = new k(this, dVar.f13219b);
    }
}

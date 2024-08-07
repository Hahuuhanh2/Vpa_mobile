package t6;

import com.google.android.gms.cloudmessaging.zzq;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f14861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f14862b;

    public /* synthetic */ l(m mVar, o oVar) {
        this.f14861a = mVar;
        this.f14862b = oVar;
    }

    public final void run() {
        m mVar = this.f14861a;
        int i10 = this.f14862b.f14869a;
        synchronized (mVar) {
            o oVar = mVar.f14867e.get(i10);
            if (oVar != null) {
                mVar.f14867e.remove(i10);
                oVar.c(new zzq("Timed out waiting for response", (SecurityException) null));
                mVar.c();
            }
        }
    }
}

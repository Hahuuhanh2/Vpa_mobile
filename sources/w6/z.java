package w6;

import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f16683a;

    public z(a0 a0Var) {
        this.f16683a = a0Var;
    }

    public final void run() {
        a.f fVar = this.f16683a.f16539a.f16547b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

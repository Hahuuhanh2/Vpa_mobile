package sc;

import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import java.util.List;
import java.util.concurrent.Callable;
import rc.a;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14735a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f14736b;

    public /* synthetic */ f(e eVar, a aVar) {
        this.f14735a = eVar;
        this.f14736b = aVar;
    }

    public final Object call() {
        e eVar = this.f14735a;
        a aVar = this.f14736b;
        eVar.getClass();
        zzlx zze = zzlx.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            List b10 = eVar.f14732b.b(aVar);
            zze.close();
            return b10;
        } catch (Throwable th2) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}

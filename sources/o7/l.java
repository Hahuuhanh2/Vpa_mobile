package o7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.internal.safetynet.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class l extends zzd {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13761a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f13761a = taskCompletionSource;
    }

    public final void zzb(Status status, boolean z10) {
        zzad zzad = new zzad(status, z10);
        b bVar = new b();
        bVar.f17753b = zzad;
        l0.I0(status, bVar, this.f13761a);
    }
}

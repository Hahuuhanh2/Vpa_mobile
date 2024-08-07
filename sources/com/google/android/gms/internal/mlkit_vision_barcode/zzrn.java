package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import y6.l;
import y6.m;
import z6.c;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzrn {
    private final l zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    public zzrn(Context context, String str) {
        m mVar = m.f17572b;
        m.a aVar = new m.a();
        aVar.f17574a = "mlkit:vision";
        this.zza = new c(context, new m(aVar.f17574a));
    }

    public static zzrn zza(Context context) {
        return new zzrn(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j10, Exception exc) {
        this.zzb.set(j10);
    }

    public final synchronized void zzc(int i10, int i11, long j10, long j11) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzb.get() != -1) {
                if (elapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            l lVar = this.zza;
            c cVar = (c) lVar;
            cVar.a(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(i10, i11, 0, j10, j11, (String) null, (String) null, 0, -1)}))).addOnFailureListener(new zzrm(this, elapsedRealtime));
        }
    }
}

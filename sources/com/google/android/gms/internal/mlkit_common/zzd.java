package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.concurrent.Callable;
import k1.a;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final /* synthetic */ class zzd implements Callable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzd(Context context) {
        this.zza = context;
    }

    public final Object call() {
        Context context = this.zza;
        int i10 = zzj.zza;
        return a.getExternalCacheDirs(context);
    }
}

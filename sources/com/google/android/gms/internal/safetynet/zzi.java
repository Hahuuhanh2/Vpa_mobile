package com.google.android.gms.internal.safetynet;

import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzi extends zzr {
    public final /* synthetic */ byte[] zza;
    public final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzi(c cVar, byte[] bArr, String str) {
        super(cVar);
        this.zza = bArr;
        this.zzb = str;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzaf zzaf = (zzaf) bVar;
        zzg zzg = this.zzc;
        byte[] bArr = this.zza;
        String str = this.zzb;
        if (TextUtils.isEmpty(str)) {
            str = zzaf.zzp("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzh) zzaf.getService()).zzc(zzg, bArr, str);
    }
}

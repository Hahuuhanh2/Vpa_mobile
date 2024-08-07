package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzk extends zzz {
    public final /* synthetic */ int[] zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzk(c cVar, int[] iArr, int i10, String str, String str2) {
        super(cVar);
        this.zza = iArr;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzaf zzaf = (zzaf) bVar;
        ArrayList arrayList = new ArrayList();
        for (int valueOf : this.zza) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        zzaf.zzq(this.zze, arrayList, this.zzb, this.zzc, this.zzd);
    }
}

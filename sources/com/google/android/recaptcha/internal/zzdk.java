package com.google.android.recaptcha.internal;

import al.a0;
import al.d0;
import android.content.Context;
import fk.p;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import p3.l0;
import sk.e;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdk implements zzdg {
    /* access modifiers changed from: private */
    public static Timer zza;
    private final Context zzb;
    private final zzdl zzc;
    /* access modifiers changed from: private */
    public final d0 zzd;
    /* access modifiers changed from: private */
    public final zzda zze;

    public zzdk(Context context, zzdl zzdl, d0 d0Var) {
        this.zzb = context;
        this.zzc = zzdl;
        this.zzd = d0Var;
        zzda zzda = null;
        try {
            zzda zzc2 = zzda.zzd;
            zzc2 = zzc2 == null ? new zzda(context, (e) null) : zzc2;
            zzda.zzd = zzc2;
            zzda = zzc2;
        } catch (Exception unused) {
        }
        this.zze = zzda;
        zzh();
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        zzda zzda;
        zzda zzda2 = this.zze;
        if (zzda2 != null) {
            Iterator it = p.e1(zzda2.zzd(), 20, 20).iterator();
            while (it.hasNext()) {
                zzor zzi = zzos.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzdb zzdb : (List) it.next()) {
                    try {
                        zzre zzk = zzre.zzk(zzhz.zzg().zzj(zzdb.zzc()));
                        int zzL = zzk.zzL();
                        int i10 = zzL - 1;
                        if (zzL != 0) {
                            if (i10 == 0) {
                                zzi.zzp(zzk.zzf());
                            } else if (i10 == 1) {
                                zzi.zzq(zzk.zzg());
                            }
                            arrayList.add(zzdb);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        zzda zzda3 = this.zze;
                        if (zzda3 != null) {
                            zzda3.zzf(zzdb);
                        }
                    }
                }
                if (zzi.zze() + zzi.zzd() != 0) {
                    if (this.zzc.zza(((zzos) zzi.zzj()).zzd()) && (zzda = this.zze) != null) {
                        zzda.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzdh(this), 120000, 120000);
        }
    }

    public final void zza(zzre zzre) {
        l0.j0(this.zzd, (a0) null, new zzdj(this, zzre, (d) null), 3);
        zzh();
    }
}

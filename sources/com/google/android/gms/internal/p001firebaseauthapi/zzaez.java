package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import android.app.Activity;
import ba.j;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m9.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaez  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
abstract class zzaez implements zzafb {
    public Object zzA;
    public Status zzB;
    /* access modifiers changed from: private */
    public boolean zza;
    public final int zze;
    public final zzaew zzf = new zzaew(this);
    public d zzg;
    public FirebaseUser zzh;
    public Object zzi;
    public j zzj;
    public zzaep zzk;
    public final List zzl = new ArrayList();
    public Executor zzm;
    public zzahb zzn;
    public zzags zzo;
    public zzagc zzp;
    public zzahk zzq;
    public String zzr;
    public String zzs;
    public AuthCredential zzt;
    public String zzu;
    public String zzv;
    public zzaaf zzw;
    public zzaha zzx;
    public zzagx zzy;
    public zzahs zzz;

    public zzaez(int i10) {
        this.zze = i10;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzaez zzaez) {
        zzaez.zzb();
        y6.j.h("no success or failure set on method implementation", zzaez.zza);
    }

    public static /* bridge */ /* synthetic */ void zzk(zzaez zzaez, Status status) {
        j jVar = zzaez.zzj;
        if (jVar != null) {
            jVar.a(status);
        }
    }

    public abstract void zzb();

    public final zzaez zzd(Object obj) {
        if (obj != null) {
            this.zzi = obj;
            return this;
        }
        throw new NullPointerException("external callback cannot be null");
    }

    public final zzaez zze(j jVar) {
        if (jVar != null) {
            this.zzj = jVar;
            return this;
        }
        throw new NullPointerException("external failure callback cannot be null");
    }

    public final zzaez zzf(d dVar) {
        if (dVar != null) {
            this.zzg = dVar;
            return this;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }

    public final zzaez zzg(FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            this.zzh = firebaseUser;
            return this;
        }
        throw new NullPointerException("firebaseUser cannot be null");
    }

    public final zzaez zzh(c cVar, Activity activity, Executor executor, String str) {
        List list = this.zzl;
        c zza2 = zzafn.zza(str, cVar, this);
        synchronized (list) {
            List list2 = this.zzl;
            y6.j.f(zza2);
            list2.add(zza2);
        }
        if (activity != null) {
            zzaeq.zza(activity, this.zzl);
        }
        y6.j.f(executor);
        this.zzm = executor;
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzB = status;
        this.zzk.zza((Object) null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzA = obj;
        this.zzk.zza(obj, (Status) null);
    }
}

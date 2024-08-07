package com.google.android.gms.internal.p001firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzags  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzags {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahh zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private zze zzl;
    private List zzm;

    public zzags() {
        this.zzf = new zzahh();
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zze zzd() {
        return this.zzl;
    }

    public final zzags zze(zze zze2) {
        this.zzl = zze2;
        return this;
    }

    public final zzags zzf(String str) {
        this.zzd = str;
        return this;
    }

    public final zzags zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzags zzh(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final zzags zzi(String str) {
        j.c(str);
        this.zzg = str;
        return this;
    }

    public final zzags zzj(String str) {
        this.zze = str;
        return this;
    }

    public final zzags zzk(List list) {
        j.f(list);
        zzahh zzahh = new zzahh();
        this.zzf = zzahh;
        zzahh.zzc().addAll(list);
        return this;
    }

    public final zzahh zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzm;
    }

    public final List zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    public zzags(String str, String str2, boolean z10, String str3, String str4, zzahh zzahh, String str5, String str6, long j10, long j11, boolean z11, zze zze2, List list) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzahh.zzb(zzahh);
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list;
    }
}

package com.google.android.recaptcha.internal;

import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdb {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzdb(String str, long j10, int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdb = (zzdb) obj;
        if (j.a(zzdb.zza, this.zza) && zzdb.zzb == this.zzb && zzdb.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}

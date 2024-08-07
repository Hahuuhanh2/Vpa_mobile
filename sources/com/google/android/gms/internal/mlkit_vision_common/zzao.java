package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.EncodingException;
import sa.b;
import sa.f;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzao implements f {
    private boolean zza = false;
    private boolean zzb = false;
    private b zzc;
    private final zzak zzd;

    public zzao(zzak zzak) {
        this.zzd = zzak;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final f add(double d10) {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final void zza(b bVar, boolean z10) {
        this.zza = false;
        this.zzc = bVar;
        this.zzb = z10;
    }

    public final f add(float f10) {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    public final f add(int i10) {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    public final f add(long j10) {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    public final f add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    public final f add(boolean z10) {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    public final f add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}

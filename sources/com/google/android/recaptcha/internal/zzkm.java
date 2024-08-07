package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public class zzkm<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzif<MessageType, BuilderType> {
    public zzks zza;
    private final zzks zzb;

    public zzkm(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzI()) {
            this.zza = messagetype.zzt();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zzd(Object obj, Object obj2) {
        zzmg.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final /* synthetic */ zzlx zzac() {
        return this.zzb;
    }

    public final /* synthetic */ zzif zzb(zzig zzig) {
        zzg((zzks) zzig);
        return this;
    }

    /* renamed from: zzf */
    public final zzkm zza() {
        zzkm zzkm = (zzkm) this.zzb.zzh(5, (Object) null, (Object) null);
        zzkm.zza = zzk();
        return zzkm;
    }

    public final zzkm zzg(zzks zzks) {
        if (!this.zzb.equals(zzks)) {
            if (!this.zza.zzI()) {
                zzn();
            }
            zzd(this.zza, zzks);
        }
        return this;
    }

    /* renamed from: zzh */
    public final MessageType zzj() {
        MessageType zzi = zzk();
        if (zzi.zzo()) {
            return zzi;
        }
        throw new zzna(zzi);
    }

    /* renamed from: zzi */
    public MessageType zzk() {
        if (!this.zza.zzI()) {
            return this.zza;
        }
        this.zza.zzD();
        return this.zza;
    }

    public final void zzm() {
        if (!this.zza.zzI()) {
            zzn();
        }
    }

    public void zzn() {
        zzks zzt = this.zzb.zzt();
        zzd(zzt, this.zza);
        this.zza = zzt;
    }

    public final boolean zzo() {
        return zzks.zzH(this.zza, false);
    }
}

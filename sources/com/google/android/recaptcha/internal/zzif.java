package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzif;
import com.google.android.recaptcha.internal.zzig;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzif<MessageType extends zzig<MessageType, BuilderType>, BuilderType extends zzif<MessageType, BuilderType>> implements zzlw {
    /* renamed from: zza */
    public abstract zzif clone();

    public abstract zzif zzb(zzig zzig);

    public final /* bridge */ /* synthetic */ zzlw zzc(zzlx zzlx) {
        if (zzac().getClass().isInstance(zzlx)) {
            return zzb((zzig) zzlx);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaei  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaei {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaei";

    private zzaei() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzaga zzaga = new zzaga();
                zzaga.zzb(str);
                if (zzaga.zzd()) {
                    return zzaga.zzc();
                }
                throw new zzaca("No error message: " + str);
            } catch (Exception e10) {
                throw new zzaca("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                try {
                    return ((zzaek) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e11) {
                    throw new zzaca("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new zzaca("Instantiation of JsonResponse failed! ".concat(type.toString()), e12);
            }
        }
    }
}

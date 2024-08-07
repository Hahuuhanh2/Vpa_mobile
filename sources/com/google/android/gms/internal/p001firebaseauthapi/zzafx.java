package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m9.d;
import v0.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzafx {
    private static final Map zza = new b();
    private static final Map zzb = new b();

    public static String zza(String str) {
        zzafv zzafv;
        Map map = zza;
        synchronized (map) {
            zzafv = (zzafv) map.get(str);
        }
        if (zzafv != null) {
            return zzh(zzafv.zzb(), zzafv.zza(), zzafv.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzafv zzafv;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzafv = (zzafv) map.get(str);
        }
        if (zzafv != null) {
            str2 = "".concat(zzh(zzafv.zzb(), zzafv.zza(), zzafv.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafv zzafv;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzafv = (zzafv) map.get(str);
        }
        if (zzafv != null) {
            str2 = "".concat(zzh(zzafv.zzb(), zzafv.zza(), zzafv.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafv zzafv;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzafv = (zzafv) map.get(str);
        }
        if (zzafv != null) {
            str2 = "".concat(zzh(zzafv.zzb(), zzafv.zza(), zzafv.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return str2.concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzafw zzafw) {
        Map map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(zzafw));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzafw));
                map.put(str, arrayList);
            }
        }
    }

    public static void zzf(d dVar, String str, int i10) {
        dVar.a();
        String str2 = dVar.f13220c.f13231a;
        Map map = zza;
        synchronized (map) {
            map.put(str2, new zzafv(str, i10));
        }
        Map map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(str2)) {
                boolean z10 = false;
                for (WeakReference weakReference : (List) map2.get(str2)) {
                    zzafw zzafw = (zzafw) weakReference.get();
                    if (zzafw != null) {
                        zzafw.zzk();
                        z10 = true;
                    }
                }
                if (!z10) {
                    zza.remove(str2);
                }
            }
        }
    }

    public static boolean zzg(d dVar) {
        Map map = zza;
        dVar.a();
        return map.containsKey(dVar.f13220c.f13231a);
    }

    private static String zzh(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }
}

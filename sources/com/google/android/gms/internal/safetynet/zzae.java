package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o7.b;
import o7.d;
import v6.c;
import v6.e;
import w6.o;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzae {
    private static final String zza = "zzae";

    public static c<Object> zza(com.google.android.gms.common.api.c cVar, byte[] bArr, String str) {
        return cVar.a(new zzi(cVar, bArr, str));
    }

    public static c<Object> zzb(com.google.android.gms.common.api.c cVar, String str, int i10, String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return cVar.a(new zzk(cVar, iArr, i10, str, str2));
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }

    public final c<Object> attest(com.google.android.gms.common.api.c cVar, byte[] bArr) {
        return zza(cVar, bArr, (String) null);
    }

    public final c<o7.c> enableVerifyApps(com.google.android.gms.common.api.c cVar) {
        return cVar.a(new zzm(this, cVar));
    }

    public final boolean isVerifyAppsEnabled(Context context) {
        a<a.d.c> aVar = o7.a.f13760a;
        d dVar = new d(context);
        o.a aVar2 = new o.a();
        aVar2.f16642d = 4201;
        aVar2.f16639a = new z.d((Object) dVar);
        Task doRead = dVar.doRead(aVar2.a());
        try {
            Tasks.await(doRead, 15000, TimeUnit.MILLISECONDS);
            return ((o7.c) ((e) ((b) doRead.getResult()).f17753b)).isVerifyAppsEnabled();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    public final c<Object> listHarmfulApps(com.google.android.gms.common.api.c cVar) {
        return cVar.a(new zzn(this, cVar));
    }

    public final c<Object> lookupUri(com.google.android.gms.common.api.c cVar, String str, String str2, int... iArr) {
        return zzb(cVar, str, 1, str2, iArr);
    }

    public final c<Object> verifyWithRecaptcha(com.google.android.gms.common.api.c cVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            return cVar.a(new zzo(this, cVar, str));
        }
        throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
    }

    public final c<Object> lookupUri(com.google.android.gms.common.api.c cVar, List<Integer> list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return cVar.a(new zzj(this, cVar, list, str, (String) null));
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }

    public final c<o7.c> isVerifyAppsEnabled(com.google.android.gms.common.api.c cVar) {
        return cVar.a(new zzl(this, cVar));
    }
}

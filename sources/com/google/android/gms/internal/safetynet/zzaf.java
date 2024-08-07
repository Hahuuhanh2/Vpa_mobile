package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import y6.b;
import y6.c;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
public final class zzaf extends c<zzh> {
    private final Context zze;

    public zzaf(Context context, Looper looper, b bVar, c.a aVar, c.b bVar2) {
        super(context, looper, 45, bVar, aVar, bVar2);
        this.zze = context;
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new zzh(iBinder);
    }

    public final int getMinApkVersion() {
        return 12200000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    @VisibleForTesting
    public final String zzp(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String str2;
        try {
            PackageManager packageManager = this.zze.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zze.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || (str2 = (String) bundle.get(str)) == null) {
                return "";
            }
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final void zzq(zzg zzg, List<Integer> list, int i10, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = zzp("com.google.android.safetynet.API_KEY");
        }
        String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).intValue();
        }
        ((zzh) getService()).zzh(zzg, str3, iArr, i10, str);
    }
}

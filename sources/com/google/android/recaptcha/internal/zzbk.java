package com.google.android.recaptcha.internal;

import al.g0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import ek.e;
import fk.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbk {
    public zzbk() {
        new ConcurrentHashMap();
        zzc();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zznz.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zznz.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zznz.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zznz.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zznz.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return t.f20215a;
        }
    }

    public static final boolean zzb(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    private static final Map zzc() {
        e[] eVarArr = {new e(0, zznz.NET_CAPABILITY_MMS), new e(1, zznz.NET_CAPABILITY_SUPL), new e(2, zznz.NET_CAPABILITY_DUN), new e(3, zznz.NET_CAPABILITY_FOTA), new e(4, zznz.NET_CAPABILITY_IMS), new e(5, zznz.NET_CAPABILITY_CBS), new e(6, zznz.NET_CAPABILITY_WIFI_P2P), new e(7, zznz.NET_CAPABILITY_IA), new e(8, zznz.NET_CAPABILITY_RCS), new e(9, zznz.NET_CAPABILITY_XCAP), new e(10, zznz.NET_CAPABILITY_EIMS), new e(11, zznz.NET_CAPABILITY_NOT_METERED), new e(12, zznz.NET_CAPABILITY_INTERNET), new e(13, zznz.NET_CAPABILITY_NOT_RESTRICTED), new e(14, zznz.NET_CAPABILITY_TRUSTED), new e(15, zznz.NET_CAPABILITY_NOT_VPN)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.d0(16));
        for (int i10 = 0; i10 < 16; i10++) {
            e eVar = eVarArr[i10];
            linkedHashMap.put(eVar.f20102a, eVar.f20103b);
        }
        int i11 = Build.VERSION.SDK_INT;
        linkedHashMap.put(17, zznz.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMap.put(16, zznz.NET_CAPABILITY_VALIDATED);
        if (i11 >= 28) {
            linkedHashMap.put(18, zznz.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMap.put(19, zznz.NET_CAPABILITY_FOREGROUND);
            linkedHashMap.put(20, zznz.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMap.put(21, zznz.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i11 >= 29) {
            linkedHashMap.put(23, zznz.NET_CAPABILITY_MCX);
        }
        if (i11 >= 30) {
            linkedHashMap.put(25, zznz.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i11 >= 31) {
            linkedHashMap.put(32, zznz.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMap.put(29, zznz.NET_CAPABILITY_ENTERPRISE);
        }
        if (i11 >= 33) {
            linkedHashMap.put(35, zznz.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMap.put(34, zznz.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMap.put(33, zznz.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMap;
    }
}

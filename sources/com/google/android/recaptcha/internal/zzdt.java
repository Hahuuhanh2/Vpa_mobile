package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import j7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sk.j;
import yk.h;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdt {
    public static final /* synthetic */ int zza = 0;
    private static final List zzb = zzf(a.d0("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    public static final boolean zza(Uri uri) {
        if (!zze(uri) || !zzd(uri.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean zzb(String str) {
        Uri parse = Uri.parse(str);
        j.c(parse);
        if (!zze(parse) || !zzd(parse.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private static final boolean zzd(String str) {
        List<String> list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String L0 : list) {
            if (h.L0(str, L0, false)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        if (TextUtils.isEmpty(uri.toString()) || !j.a("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(fk.j.H0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}

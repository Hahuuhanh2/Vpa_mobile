package com.google.android.recaptcha.internal;

import android.content.Context;
import fk.i;
import fk.j;
import fk.p;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rk.l;
import vk.b;
import vk.c;
import yk.h;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbs implements zzav {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbs(Context context) {
        this.zza = context;
    }

    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzbx.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (h.L0(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(j.H0(cVar));
        Iterator it = cVar.iterator();
        while (((b) it).f23333c) {
            arrayList.add(Character.valueOf(((i) it).a()));
        }
        List c12 = p.c1(arrayList);
        Collections.shuffle(c12);
        String Q0 = p.Q0(((ArrayList) c12).subList(0, 8), "", (String) null, (String) null, (l) null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(Q0));
        zzbx.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    File file2 = listFiles[i10];
                    if (sk.j.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i10++;
                }
            }
            if (file != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}

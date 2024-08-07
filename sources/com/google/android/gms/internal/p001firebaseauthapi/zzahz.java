package com.google.android.gms.internal.p001firebaseauthapi;

import h7.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahz {
    private List zza;

    public zzahz() {
        this((List) null);
    }

    public final List zza() {
        return this.zza;
    }

    public zzahz(int i10, List list) {
        if (!list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, i.a((String) list.get(i11)));
            }
            this.zza = Collections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.emptyList();
    }

    public zzahz(List list) {
        this.zza = new ArrayList();
    }
}

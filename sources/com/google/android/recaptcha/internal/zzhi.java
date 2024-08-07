package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzhi {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}

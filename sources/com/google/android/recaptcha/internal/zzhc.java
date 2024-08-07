package com.google.android.recaptcha.internal;

import android.support.v4.media.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzhc implements Iterable {
    public final String toString() {
        StringBuilder p10 = a.p('[');
        boolean z10 = true;
        for (Object append : this) {
            if (!z10) {
                p10.append(", ");
            }
            p10.append(append);
            z10 = false;
        }
        p10.append(']');
        return p10.toString();
    }
}

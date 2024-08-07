package com.google.android.recaptcha.internal;

import f0.b0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zznk extends IllegalArgumentException {
    public zznk(int i10, int i11) {
        super(b0.p("Unpaired surrogate at index ", i10, " of ", i11));
    }
}

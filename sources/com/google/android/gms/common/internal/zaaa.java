package com.google.android.gms.common.internal;

import android.content.Context;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.widget.Button;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    public static final int a(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException(a.m("Unknown color scheme: ", i10));
    }
}

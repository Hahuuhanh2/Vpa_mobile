package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.g;

/* compiled from: MaterialCheckable */
public interface g<T extends g<T>> extends Checkable {

    /* compiled from: MaterialCheckable */
    public interface a<C> {
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}

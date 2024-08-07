package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;

/* compiled from: SearchView */
public final class i implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f6699a;

    public i(SearchView searchView) {
        this.f6699a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        ImageButton imageButton = this.f6699a.f6671r;
        if (charSequence.length() > 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageButton.setVisibility(i13);
    }
}

package e2;

import android.text.Editable;
import android.text.TextWatcher;
import d2.g;

/* compiled from: TextViewBindingAdapter */
public final class b implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9088a;

    public b(g gVar) {
        this.f9088a = gVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g gVar = this.f9088a;
        if (gVar != null) {
            gVar.b();
        }
    }
}

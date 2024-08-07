package com.ots.core.utils.customview;

import android.widget.TextView;
import com.ots.core.utils.customview.a;
import gf.b;
import java.util.ArrayList;
import sk.j;

/* compiled from: DropDownView.kt */
public final class c implements a.C0083a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DropDownView f8389a;

    public c(DropDownView dropDownView) {
        this.f8389a = dropDownView;
    }

    public final void a(ArrayList<b> arrayList, String str) {
        j.f(str, "listItemString");
        TextView dropDownView = this.f8389a.getDropDownView();
        if (dropDownView != null) {
            dropDownView.setText(str);
        }
        this.f8389a.setSelectionReflectionType(arrayList);
    }
}

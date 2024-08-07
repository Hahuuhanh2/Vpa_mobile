package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow */
public final class b0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f1066a;

    public b0(ListPopupWindow listPopupWindow) {
        this.f1066a = listPopupWindow;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        y yVar;
        if (i10 != -1 && (yVar = this.f1066a.f894c) != null) {
            yVar.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}

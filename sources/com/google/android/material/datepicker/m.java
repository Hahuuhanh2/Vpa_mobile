package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.R$string;
import w1.a;
import x1.f;

/* compiled from: MaterialCalendar */
public final class m extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f6181d;

    public m(j jVar) {
        this.f6181d = jVar;
    }

    public final void d(View view, f fVar) {
        String str;
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        if (this.f6181d.f6176r0.getVisibility() == 0) {
            str = this.f6181d.x(R$string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f6181d.x(R$string.mtrl_picker_toggle_to_day_selection);
        }
        fVar.l(str);
    }
}

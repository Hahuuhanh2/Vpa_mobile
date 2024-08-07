package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import m.a;

/* compiled from: ToolbarWidgetWrapper */
public final class o0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f1161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f1162b;

    public o0(p0 p0Var) {
        this.f1162b = p0Var;
        this.f1161a = new a(p0Var.f1180a.getContext(), p0Var.f1188i);
    }

    public final void onClick(View view) {
        p0 p0Var = this.f1162b;
        Window.Callback callback = p0Var.f1191l;
        if (callback != null && p0Var.f1192m) {
            callback.onMenuItemSelected(0, this.f1161a);
        }
    }
}

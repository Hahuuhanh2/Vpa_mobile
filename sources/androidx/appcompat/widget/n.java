package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import m.f;

/* compiled from: AppCompatSpinner */
public final class n extends a0 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.g f1154q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f1155r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.g gVar) {
        super(view);
        this.f1155r = appCompatSpinner;
        this.f1154q = gVar;
    }

    public final f b() {
        return this.f1154q;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        if (this.f1155r.getInternalPopup().a()) {
            return true;
        }
        AppCompatSpinner appCompatSpinner = this.f1155r;
        appCompatSpinner.f839f.n(AppCompatSpinner.c.b(appCompatSpinner), AppCompatSpinner.c.a(appCompatSpinner));
        return true;
    }
}

package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f421a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f422b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f422b = bVar;
        this.f421a = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f422b.f348j.onClick(this.f421a.f311b, i10);
        if (!this.f422b.f350l) {
            this.f421a.f311b.dismiss();
        }
    }
}

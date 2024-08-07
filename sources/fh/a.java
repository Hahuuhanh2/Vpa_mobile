package fh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.datepicker.q;
import com.google.android.material.search.h;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import ef.f;
import ek.i;

/* compiled from: DeleteOrderDialog.kt */
public final class a extends f.a<a> {

    /* renamed from: i  reason: collision with root package name */
    public rk.a<i> f20168i;

    public a(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(C0535R$layout.dialog_delete_order, (ViewGroup) null, false);
        int i10 = 2131361937;
        MaterialButton materialButton = (MaterialButton) j7.a.D(2131361937, inflate);
        if (materialButton != null) {
            i10 = C0533R$id.btnDelete;
            MaterialButton materialButton2 = (MaterialButton) j7.a.D(C0533R$id.btnDelete, inflate);
            if (materialButton2 != null) {
                materialButton2.setOnClickListener(new q(this, 18));
                materialButton.setOnClickListener(new h(this, 21));
                e((MaterialCardView) inflate);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}

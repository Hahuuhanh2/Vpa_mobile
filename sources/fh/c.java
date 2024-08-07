package fh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.b;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.data.model.Order;
import ef.f;
import eh.d;
import fk.p;
import j7.a;
import java.util.ArrayList;
import sk.j;

/* compiled from: PlateInfoDialog.kt */
public final class c extends f.a<c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, ArrayList<Order> arrayList, CartStatus cartStatus) {
        super(context);
        j.f(arrayList, "orderData");
        j.f(cartStatus, "status");
        String str = null;
        View inflate = LayoutInflater.from(context).inflate(C0535R$layout.dialog_plate_info, (ViewGroup) null, false);
        int i10 = 2131361936;
        ImageButton imageButton = (ImageButton) a.D(2131361936, inflate);
        if (imageButton != null) {
            i10 = C0533R$id.rcv;
            RecyclerView recyclerView = (RecyclerView) a.D(C0533R$id.rcv, inflate);
            if (recyclerView != null) {
                i10 = 2131362806;
                TextView textView = (TextView) a.D(2131362806, inflate);
                if (textView != null) {
                    e((MaterialCardView) inflate);
                    Order order = (Order) p.N0(arrayList);
                    textView.setText(order != null ? order.getOrderCode() : str);
                    d dVar = new d(cartStatus, b.f20169a);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(dVar);
                    dVar.A(arrayList);
                    imageButton.setOnClickListener(new b(this, 17));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}

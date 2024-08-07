package vg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import d2.l;
import ef.f;
import ek.g;
import j7.a;
import java.util.ArrayList;
import lg.b;
import mg.k2;
import sk.j;

/* compiled from: ProgressAuctionDialog.kt */
public final class e extends f.a<h> {
    public e(SessionAuctionActivity sessionAuctionActivity, ArrayList arrayList, b bVar) {
        super(sessionAuctionActivity);
        LayoutInflater from = LayoutInflater.from(sessionAuctionActivity);
        int i10 = k2.f21147y;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        k2 k2Var = (k2) l.l(from, C0535R$layout.dialog_auction_progress, (ViewGroup) null, (Object) null);
        j.e(k2Var, "inflate(...)");
        g b02 = a.b0(new d(bVar));
        RecyclerView recyclerView = k2Var.f21149x;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter((tg.a) b02.getValue());
        ((tg.a) b02.getValue()).f22968s = false;
        ((tg.a) b02.getValue()).f22967r = true;
        ((tg.a) b02.getValue()).A(arrayList);
        k2Var.f21148w.setOnClickListener(new com.google.android.material.textfield.b(this, 12));
        g(-1);
        e(k2Var.f8554e);
    }
}

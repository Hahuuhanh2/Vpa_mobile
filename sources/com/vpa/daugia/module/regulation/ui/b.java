package com.vpa.daugia.module.regulation.ui;

import android.content.Intent;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionRegulationActivity.kt */
public final class b extends k implements l<String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionRegulationActivity f19859a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionRegulationActivity auctionRegulationActivity) {
        super(1);
        this.f19859a = auctionRegulationActivity;
    }

    public final Object invoke(Object obj) {
        j.f((String) obj, "it");
        this.f19859a.startActivity(new Intent(this.f19859a, RegulationActivity.class));
        return i.f20112a;
    }
}

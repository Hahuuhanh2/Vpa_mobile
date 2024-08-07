package com.vpa.daugia.module.regulation.ui;

import ah.h;
import com.ots.core.utils.customview.textview.AppTextView;
import j$.time.LocalDate;
import mg.i;
import sk.j;

/* compiled from: AuctionRegulationActivity.kt */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionRegulationActivity f19858a;

    public a(AuctionRegulationActivity auctionRegulationActivity) {
        this.f19858a = auctionRegulationActivity;
    }

    public final void a(LocalDate localDate, String str) {
        boolean z10;
        this.f19858a.O = localDate;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            AppTextView appTextView = ((i) this.f19858a.M()).f21101z;
            j.e(appTextView, "tvDate");
            appTextView.setVisibility(8);
            return;
        }
        ((i) this.f19858a.M()).f21101z.setText(str);
    }
}

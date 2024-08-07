package com.vpa.daugia.module.common.ui.activity;

import android.content.Intent;
import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.common.data.model.WinningAnnounce;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: MyDocumentActivity.kt */
public final class a extends k implements l<MyDocument, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f19635a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(MyDocumentActivity myDocumentActivity) {
        super(1);
        this.f19635a = myDocumentActivity;
    }

    public final Object invoke(Object obj) {
        Long l10;
        MyDocument myDocument = (MyDocument) obj;
        j.f(myDocument, "it");
        Intent intent = new Intent(this.f19635a, AuctionReportActivity.class);
        WinningAnnounce winningAnnounce = myDocument.getWinningAnnounce();
        if (winningAnnounce != null) {
            l10 = winningAnnounce.getDocumentId();
        } else {
            l10 = null;
        }
        intent.putExtra("DATA_DOCUMENT", l10);
        this.f19635a.startActivity(intent);
        return i.f20112a;
    }
}

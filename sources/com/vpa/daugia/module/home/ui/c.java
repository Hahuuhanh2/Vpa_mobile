package com.vpa.daugia.module.home.ui;

import android.content.Intent;
import com.vpa.daugia.module.home.data.model.Item;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: HomeFragment.kt */
public final class c extends k implements l<Item, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f19744a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(HomeFragment homeFragment) {
        super(1);
        this.f19744a = homeFragment;
    }

    public final Object invoke(Object obj) {
        Item item = (Item) obj;
        j.f(item, "it");
        Integer id2 = item.getId();
        if (id2 != null && id2.intValue() == 2131231217) {
            this.f19744a.h0(new Intent(this.f19744a.d0(), AnnouncementListActivity.class));
        } else if (id2 != null && id2.intValue() == 2131231218) {
            this.f19744a.h0(new Intent(this.f19744a.d0(), ListAwaitAuctionActivity.class));
        } else if (id2 != null && id2.intValue() == 2131231216) {
            this.f19744a.h0(new Intent(this.f19744a.d0(), AuctionNotifyActivity.class));
        } else if (id2 != null && id2.intValue() == 2131231219) {
            this.f19744a.h0(new Intent(this.f19744a.d0(), SupportActivity.class));
        }
        return i.f20112a;
    }
}

package com.vpa.daugia.module.common.data.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: ApproveDocs.kt */
public final class ApproveDocs {
    @b("orderId")
    private final String orderId;

    public ApproveDocs() {
        this((String) null, 1, (e) null);
    }

    public ApproveDocs(String str) {
        this.orderId = str;
    }

    public static /* synthetic */ ApproveDocs copy$default(ApproveDocs approveDocs, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = approveDocs.orderId;
        }
        return approveDocs.copy(str);
    }

    public final String component1() {
        return this.orderId;
    }

    public final ApproveDocs copy(String str) {
        return new ApproveDocs(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApproveDocs) && j.a(this.orderId, ((ApproveDocs) obj).orderId);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return l.k(a.q("ApproveDocs(orderId="), this.orderId, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApproveDocs(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}

package com.vpa.daugia.module.register.data.api.request;

import android.support.v4.media.a;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: RegisterAuctionRequest.kt */
public final class RegisterAuctionRequest {
    private final List<String> listPublishDetailIds;

    public RegisterAuctionRequest() {
        this((List) null, 1, (e) null);
    }

    public RegisterAuctionRequest(List<String> list) {
        this.listPublishDetailIds = list;
    }

    public static /* synthetic */ RegisterAuctionRequest copy$default(RegisterAuctionRequest registerAuctionRequest, List<String> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = registerAuctionRequest.listPublishDetailIds;
        }
        return registerAuctionRequest.copy(list);
    }

    public final List<String> component1() {
        return this.listPublishDetailIds;
    }

    public final RegisterAuctionRequest copy(List<String> list) {
        return new RegisterAuctionRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisterAuctionRequest) && j.a(this.listPublishDetailIds, ((RegisterAuctionRequest) obj).listPublishDetailIds);
    }

    public final List<String> getListPublishDetailIds() {
        return this.listPublishDetailIds;
    }

    public int hashCode() {
        List<String> list = this.listPublishDetailIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder q10 = a.q("RegisterAuctionRequest(listPublishDetailIds=");
        q10.append(this.listPublishDetailIds);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegisterAuctionRequest(List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : list);
    }
}

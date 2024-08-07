package com.vpa.daugia.module.cart.data.api.request;

import android.support.v4.media.a;
import java.util.ArrayList;
import sk.e;
import sk.j;

/* compiled from: RemoveCartRequest.kt */
public final class RemoveCartRequest {
    private final ArrayList<String> idList;

    public RemoveCartRequest() {
        this((ArrayList) null, 1, (e) null);
    }

    public RemoveCartRequest(ArrayList<String> arrayList) {
        this.idList = arrayList;
    }

    public static /* synthetic */ RemoveCartRequest copy$default(RemoveCartRequest removeCartRequest, ArrayList<String> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = removeCartRequest.idList;
        }
        return removeCartRequest.copy(arrayList);
    }

    public final ArrayList<String> component1() {
        return this.idList;
    }

    public final RemoveCartRequest copy(ArrayList<String> arrayList) {
        return new RemoveCartRequest(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoveCartRequest) && j.a(this.idList, ((RemoveCartRequest) obj).idList);
    }

    public final ArrayList<String> getIdList() {
        return this.idList;
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.idList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        StringBuilder q10 = a.q("RemoveCartRequest(idList=");
        q10.append(this.idList);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoveCartRequest(ArrayList arrayList, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : arrayList);
    }
}

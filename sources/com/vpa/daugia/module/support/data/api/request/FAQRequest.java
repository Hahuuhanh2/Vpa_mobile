package com.vpa.daugia.module.support.data.api.request;

import android.support.v4.media.a;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: FAQRequest.kt */
public final class FAQRequest {
    private final String keySearch;

    public FAQRequest() {
        this((String) null, 1, (e) null);
    }

    public FAQRequest(String str) {
        this.keySearch = str;
    }

    public static /* synthetic */ FAQRequest copy$default(FAQRequest fAQRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fAQRequest.keySearch;
        }
        return fAQRequest.copy(str);
    }

    public final String component1() {
        return this.keySearch;
    }

    public final FAQRequest copy(String str) {
        return new FAQRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FAQRequest) && j.a(this.keySearch, ((FAQRequest) obj).keySearch);
    }

    public final String getKeySearch() {
        return this.keySearch;
    }

    public int hashCode() {
        String str = this.keySearch;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return l.k(a.q("FAQRequest(keySearch="), this.keySearch, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FAQRequest(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}

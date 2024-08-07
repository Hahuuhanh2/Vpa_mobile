package com.vpa.daugia.module.sse.data.model;

import android.support.v4.media.a;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: SSEEventData.kt */
public final class SSEEventData {
    private final String data;
    private final STATUS status;

    public SSEEventData() {
        this((STATUS) null, (String) null, 3, (e) null);
    }

    public SSEEventData(STATUS status2, String str) {
        this.status = status2;
        this.data = str;
    }

    public static /* synthetic */ SSEEventData copy$default(SSEEventData sSEEventData, STATUS status2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status2 = sSEEventData.status;
        }
        if ((i10 & 2) != 0) {
            str = sSEEventData.data;
        }
        return sSEEventData.copy(status2, str);
    }

    public final STATUS component1() {
        return this.status;
    }

    public final String component2() {
        return this.data;
    }

    public final SSEEventData copy(STATUS status2, String str) {
        return new SSEEventData(status2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SSEEventData)) {
            return false;
        }
        SSEEventData sSEEventData = (SSEEventData) obj;
        return this.status == sSEEventData.status && j.a(this.data, sSEEventData.data);
    }

    public final String getData() {
        return this.data;
    }

    public final STATUS getStatus() {
        return this.status;
    }

    public int hashCode() {
        STATUS status2 = this.status;
        int i10 = 0;
        int hashCode = (status2 == null ? 0 : status2.hashCode()) * 31;
        String str = this.data;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("SSEEventData(status=");
        q10.append(this.status);
        q10.append(", data=");
        return l.k(q10, this.data, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SSEEventData(STATUS status2, String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : status2, (i10 & 2) != 0 ? null : str);
    }
}

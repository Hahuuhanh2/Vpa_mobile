package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import sk.e;
import sk.j;

/* compiled from: BaseSSEData.kt */
public final class BaseSSEData<T> {
    private T data;
    private String type;

    public BaseSSEData() {
        this((String) null, (Object) null, 3, (e) null);
    }

    public BaseSSEData(String str, T t10) {
        this.type = str;
        this.data = t10;
    }

    public static /* synthetic */ BaseSSEData copy$default(BaseSSEData baseSSEData, String str, T t10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseSSEData.type;
        }
        if ((i10 & 2) != 0) {
            t10 = baseSSEData.data;
        }
        return baseSSEData.copy(str, t10);
    }

    public final String component1() {
        return this.type;
    }

    public final T component2() {
        return this.data;
    }

    public final BaseSSEData<T> copy(String str, T t10) {
        return new BaseSSEData<>(str, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseSSEData)) {
            return false;
        }
        BaseSSEData baseSSEData = (BaseSSEData) obj;
        return j.a(this.type, baseSSEData.type) && j.a(this.data, baseSSEData.data);
    }

    public final T getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        T t10 = this.data;
        if (t10 != null) {
            i10 = t10.hashCode();
        }
        return hashCode + i10;
    }

    public final void setData(T t10) {
        this.data = t10;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("BaseSSEData(type=");
        q10.append(this.type);
        q10.append(", data=");
        q10.append(this.data);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseSSEData(String str, Object obj, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj);
    }
}

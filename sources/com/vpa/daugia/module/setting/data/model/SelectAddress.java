package com.vpa.daugia.module.setting.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: SelectAddress.kt */
public final class SelectAddress {
    @b("code")
    private String code;
    @b("fullName")
    private String fullName;
    @b("name")
    private String name;
    @b("priority")
    private String priority;

    public SelectAddress() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public SelectAddress(String str, String str2, String str3, String str4) {
        this.code = str;
        this.fullName = str2;
        this.name = str3;
        this.priority = str4;
    }

    public static /* synthetic */ SelectAddress copy$default(SelectAddress selectAddress, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectAddress.code;
        }
        if ((i10 & 2) != 0) {
            str2 = selectAddress.fullName;
        }
        if ((i10 & 4) != 0) {
            str3 = selectAddress.name;
        }
        if ((i10 & 8) != 0) {
            str4 = selectAddress.priority;
        }
        return selectAddress.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.fullName;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.priority;
    }

    public final SelectAddress copy(String str, String str2, String str3, String str4) {
        return new SelectAddress(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAddress)) {
            return false;
        }
        SelectAddress selectAddress = (SelectAddress) obj;
        return j.a(this.code, selectAddress.code) && j.a(this.fullName, selectAddress.fullName) && j.a(this.name, selectAddress.name) && j.a(this.priority, selectAddress.priority);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPriority() {
        return this.priority;
    }

    public int hashCode() {
        String str = this.code;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priority;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPriority(String str) {
        this.priority = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("SelectAddress(code=");
        q10.append(this.code);
        q10.append(", fullName=");
        q10.append(this.fullName);
        q10.append(", name=");
        q10.append(this.name);
        q10.append(", priority=");
        return l.k(q10, this.priority, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectAddress(String str, String str2, String str3, String str4, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}

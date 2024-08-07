package com.vpa.daugia.module.setting.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Bank.kt */
public final class Bank {
    @b("active")
    private boolean active;
    @b("code")
    private String code;
    @b("deepLink")
    private String deepLink;
    @b("fullName")
    private String fullName;
    @b("shortName")
    private String shortName;
    @b("uuid")
    private String uuid;

    public Bank() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (e) null);
    }

    public Bank(boolean z10, String str, String str2, String str3, String str4, String str5) {
        this.active = z10;
        this.code = str;
        this.fullName = str2;
        this.shortName = str3;
        this.uuid = str4;
        this.deepLink = str5;
    }

    public static /* synthetic */ Bank copy$default(Bank bank, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bank.active;
        }
        if ((i10 & 2) != 0) {
            str = bank.code;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = bank.fullName;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = bank.shortName;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = bank.uuid;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = bank.deepLink;
        }
        return bank.copy(z10, str6, str7, str8, str9, str5);
    }

    public final boolean component1() {
        return this.active;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.fullName;
    }

    public final String component4() {
        return this.shortName;
    }

    public final String component5() {
        return this.uuid;
    }

    public final String component6() {
        return this.deepLink;
    }

    public final Bank copy(boolean z10, String str, String str2, String str3, String str4, String str5) {
        return new Bank(z10, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bank)) {
            return false;
        }
        Bank bank = (Bank) obj;
        return this.active == bank.active && j.a(this.code, bank.code) && j.a(this.fullName, bank.fullName) && j.a(this.shortName, bank.shortName) && j.a(this.uuid, bank.uuid) && j.a(this.deepLink, bank.deepLink);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        boolean z10 = this.active;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        String str = this.code;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uuid;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLink;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode4 + i11;
    }

    public final void setActive(boolean z10) {
        this.active = z10;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setDeepLink(String str) {
        this.deepLink = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setShortName(String str) {
        this.shortName = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Bank(active=");
        q10.append(this.active);
        q10.append(", code=");
        q10.append(this.code);
        q10.append(", fullName=");
        q10.append(this.fullName);
        q10.append(", shortName=");
        q10.append(this.shortName);
        q10.append(", uuid=");
        q10.append(this.uuid);
        q10.append(", deepLink=");
        return l.k(q10, this.deepLink, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Bank(boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, sk.e r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0022
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r9
        L_0x0023:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r10
        L_0x0029:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.setting.data.model.Bank.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}

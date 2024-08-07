package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: Province.kt */
public final class Province {
    @b("areaId")
    private Object areaId;
    @b("code")
    private String code;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Object f19381id;
    @b("localSymbol")
    private Object localSymbol;
    @b("name")
    private String name;
    @b("priority")
    private Object priority;
    @b("status")
    private Object status;

    public Province() {
        this((Object) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, 127, (e) null);
    }

    public Province(Object obj, String str, Object obj2, Object obj3, String str2, Object obj4, Object obj5) {
        this.areaId = obj;
        this.code = str;
        this.f19381id = obj2;
        this.localSymbol = obj3;
        this.name = str2;
        this.priority = obj4;
        this.status = obj5;
    }

    public static /* synthetic */ Province copy$default(Province province, Object obj, String str, Object obj2, Object obj3, String str2, Object obj4, Object obj5, int i10, Object obj6) {
        if ((i10 & 1) != 0) {
            obj = province.areaId;
        }
        if ((i10 & 2) != 0) {
            str = province.code;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            obj2 = province.f19381id;
        }
        Object obj7 = obj2;
        if ((i10 & 8) != 0) {
            obj3 = province.localSymbol;
        }
        Object obj8 = obj3;
        if ((i10 & 16) != 0) {
            str2 = province.name;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            obj4 = province.priority;
        }
        Object obj9 = obj4;
        if ((i10 & 64) != 0) {
            obj5 = province.status;
        }
        return province.copy(obj, str3, obj7, obj8, str4, obj9, obj5);
    }

    public final Object component1() {
        return this.areaId;
    }

    public final String component2() {
        return this.code;
    }

    public final Object component3() {
        return this.f19381id;
    }

    public final Object component4() {
        return this.localSymbol;
    }

    public final String component5() {
        return this.name;
    }

    public final Object component6() {
        return this.priority;
    }

    public final Object component7() {
        return this.status;
    }

    public final Province copy(Object obj, String str, Object obj2, Object obj3, String str2, Object obj4, Object obj5) {
        return new Province(obj, str, obj2, obj3, str2, obj4, obj5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Province)) {
            return false;
        }
        Province province = (Province) obj;
        return j.a(this.areaId, province.areaId) && j.a(this.code, province.code) && j.a(this.f19381id, province.f19381id) && j.a(this.localSymbol, province.localSymbol) && j.a(this.name, province.name) && j.a(this.priority, province.priority) && j.a(this.status, province.status);
    }

    public final Object getAreaId() {
        return this.areaId;
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getId() {
        return this.f19381id;
    }

    public final Object getLocalSymbol() {
        return this.localSymbol;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getPriority() {
        return this.priority;
    }

    public final Object getStatus() {
        return this.status;
    }

    public int hashCode() {
        Object obj = this.areaId;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.f19381id;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.localSymbol;
        int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str2 = this.name;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj4 = this.priority;
        int hashCode6 = (hashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.status;
        if (obj5 != null) {
            i10 = obj5.hashCode();
        }
        return hashCode6 + i10;
    }

    public final void setAreaId(Object obj) {
        this.areaId = obj;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setId(Object obj) {
        this.f19381id = obj;
    }

    public final void setLocalSymbol(Object obj) {
        this.localSymbol = obj;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPriority(Object obj) {
        this.priority = obj;
    }

    public final void setStatus(Object obj) {
        this.status = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("Province(areaId=");
        q10.append(this.areaId);
        q10.append(", code=");
        q10.append(this.code);
        q10.append(", id=");
        q10.append(this.f19381id);
        q10.append(", localSymbol=");
        q10.append(this.localSymbol);
        q10.append(", name=");
        q10.append(this.name);
        q10.append(", priority=");
        q10.append(this.priority);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Province(java.lang.Object r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10, java.lang.String r11, java.lang.Object r12, java.lang.Object r13, int r14, sk.e r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.Province.<init>(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, int, sk.e):void");
    }
}

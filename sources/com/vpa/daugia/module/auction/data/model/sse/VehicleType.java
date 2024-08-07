package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: VehicleType.kt */
public final class VehicleType {
    @b("code")
    private String code;
    @b("content")
    private String content;
    @b("description")
    private Object description;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f19382id;
    @b("status")
    private Object status;

    public VehicleType() {
        this((String) null, (String) null, (Object) null, (Integer) null, (Object) null, 31, (e) null);
    }

    public VehicleType(String str, String str2, Object obj, Integer num, Object obj2) {
        this.code = str;
        this.content = str2;
        this.description = obj;
        this.f19382id = num;
        this.status = obj2;
    }

    public static /* synthetic */ VehicleType copy$default(VehicleType vehicleType, String str, String str2, Object obj, Integer num, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            str = vehicleType.code;
        }
        if ((i10 & 2) != 0) {
            str2 = vehicleType.content;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            obj = vehicleType.description;
        }
        Object obj4 = obj;
        if ((i10 & 8) != 0) {
            num = vehicleType.f19382id;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            obj2 = vehicleType.status;
        }
        return vehicleType.copy(str, str3, obj4, num2, obj2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.content;
    }

    public final Object component3() {
        return this.description;
    }

    public final Integer component4() {
        return this.f19382id;
    }

    public final Object component5() {
        return this.status;
    }

    public final VehicleType copy(String str, String str2, Object obj, Integer num, Object obj2) {
        return new VehicleType(str, str2, obj, num, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleType)) {
            return false;
        }
        VehicleType vehicleType = (VehicleType) obj;
        return j.a(this.code, vehicleType.code) && j.a(this.content, vehicleType.content) && j.a(this.description, vehicleType.description) && j.a(this.f19382id, vehicleType.f19382id) && j.a(this.status, vehicleType.status);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getContent() {
        return this.content;
    }

    public final Object getDescription() {
        return this.description;
    }

    public final Integer getId() {
        return this.f19382id;
    }

    public final Object getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.code;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.description;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num = this.f19382id;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj2 = this.status;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDescription(Object obj) {
        this.description = obj;
    }

    public final void setId(Integer num) {
        this.f19382id = num;
    }

    public final void setStatus(Object obj) {
        this.status = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("VehicleType(code=");
        q10.append(this.code);
        q10.append(", content=");
        q10.append(this.content);
        q10.append(", description=");
        q10.append(this.description);
        q10.append(", id=");
        q10.append(this.f19382id);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VehicleType(java.lang.String r5, java.lang.String r6, java.lang.Object r7, java.lang.Integer r8, java.lang.Object r9, int r10, sk.e r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.VehicleType.<init>(java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.Object, int, sk.e):void");
    }
}

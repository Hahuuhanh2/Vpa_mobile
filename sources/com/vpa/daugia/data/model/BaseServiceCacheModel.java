package com.vpa.daugia.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: BaseServiceCacheModel.kt */
public final class BaseServiceCacheModel implements Serializable {
    private String cacheKey;
    @b("data")
    private Object data;
    @b("model")
    private String model;
    @b("serviceName")
    private String serviceName;
    @b("type")
    private ServiceCacheType type;

    public BaseServiceCacheModel() {
        this((String) null, (String) null, (Object) null, (ServiceCacheType) null, (String) null, 31, (e) null);
    }

    public BaseServiceCacheModel(String str, String str2, Object obj, ServiceCacheType serviceCacheType, String str3) {
        j.f(str, "cacheKey");
        j.f(serviceCacheType, "type");
        this.cacheKey = str;
        this.model = str2;
        this.data = obj;
        this.type = serviceCacheType;
        this.serviceName = str3;
    }

    public static /* synthetic */ BaseServiceCacheModel copy$default(BaseServiceCacheModel baseServiceCacheModel, String str, String str2, Object obj, ServiceCacheType serviceCacheType, String str3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = baseServiceCacheModel.cacheKey;
        }
        if ((i10 & 2) != 0) {
            str2 = baseServiceCacheModel.model;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            obj = baseServiceCacheModel.data;
        }
        Object obj3 = obj;
        if ((i10 & 8) != 0) {
            serviceCacheType = baseServiceCacheModel.type;
        }
        ServiceCacheType serviceCacheType2 = serviceCacheType;
        if ((i10 & 16) != 0) {
            str3 = baseServiceCacheModel.serviceName;
        }
        return baseServiceCacheModel.copy(str, str4, obj3, serviceCacheType2, str3);
    }

    public final String component1() {
        return this.cacheKey;
    }

    public final String component2() {
        return this.model;
    }

    public final Object component3() {
        return this.data;
    }

    public final ServiceCacheType component4() {
        return this.type;
    }

    public final String component5() {
        return this.serviceName;
    }

    public final BaseServiceCacheModel copy(String str, String str2, Object obj, ServiceCacheType serviceCacheType, String str3) {
        j.f(str, "cacheKey");
        j.f(serviceCacheType, "type");
        return new BaseServiceCacheModel(str, str2, obj, serviceCacheType, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseServiceCacheModel)) {
            return false;
        }
        BaseServiceCacheModel baseServiceCacheModel = (BaseServiceCacheModel) obj;
        return j.a(this.cacheKey, baseServiceCacheModel.cacheKey) && j.a(this.model, baseServiceCacheModel.model) && j.a(this.data, baseServiceCacheModel.data) && this.type == baseServiceCacheModel.type && j.a(this.serviceName, baseServiceCacheModel.serviceName);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Object getData() {
        return this.data;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final ServiceCacheType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.cacheKey.hashCode() * 31;
        String str = this.model;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.data;
        int hashCode3 = (this.type.hashCode() + ((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        String str2 = this.serviceName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setCacheKey(String str) {
        j.f(str, "<set-?>");
        this.cacheKey = str;
    }

    public final void setData(Object obj) {
        this.data = obj;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setServiceName(String str) {
        this.serviceName = str;
    }

    public final void setType(ServiceCacheType serviceCacheType) {
        j.f(serviceCacheType, "<set-?>");
        this.type = serviceCacheType;
    }

    public String toString() {
        StringBuilder q10 = a.q("BaseServiceCacheModel(cacheKey=");
        q10.append(this.cacheKey);
        q10.append(", model=");
        q10.append(this.model);
        q10.append(", data=");
        q10.append(this.data);
        q10.append(", type=");
        q10.append(this.type);
        q10.append(", serviceName=");
        return l.k(q10, this.serviceName, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BaseServiceCacheModel(java.lang.String r4, java.lang.String r5, java.lang.Object r6, com.vpa.daugia.data.model.ServiceCacheType r7, java.lang.String r8, int r9, sk.e r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = ""
        L_0x0006:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            com.vpa.daugia.data.model.ServiceCacheType r7 = com.vpa.daugia.data.model.ServiceCacheType.GET
        L_0x001b:
            r2 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.data.model.BaseServiceCacheModel.<init>(java.lang.String, java.lang.String, java.lang.Object, com.vpa.daugia.data.model.ServiceCacheType, java.lang.String, int, sk.e):void");
    }
}

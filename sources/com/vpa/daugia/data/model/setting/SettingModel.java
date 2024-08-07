package com.vpa.daugia.data.model.setting;

import android.support.v4.media.a;
import cc.b;
import java.util.ArrayList;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: SettingModel.kt */
public final class SettingModel {
    @b("appVersion")
    private String appVersion;
    @b("currentVersion")
    private String currentVersion;
    @b("denunciationType")
    private ArrayList<gf.b> denunciationType;
    @b("hotline")
    private String hotline;
    @b("logo")
    private String logo;
    @b("needUpdate")
    private boolean needUpdate;
    @b("onDebug")
    private boolean onDebug;
    @b("reflectionType")
    private ArrayList<gf.b> reflectionType;
    @b("vehicleType")
    private ArrayList<gf.b> vehicleType;

    public SettingModel() {
        this(false, (ArrayList) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, false, (String) null, 511, (e) null);
    }

    public SettingModel(boolean z10, ArrayList<gf.b> arrayList, ArrayList<gf.b> arrayList2, ArrayList<gf.b> arrayList3, String str, String str2, String str3, boolean z11, String str4) {
        j.f(arrayList, "reflectionType");
        j.f(arrayList2, "vehicleType");
        j.f(arrayList3, "denunciationType");
        j.f(str4, "appVersion");
        this.onDebug = z10;
        this.reflectionType = arrayList;
        this.vehicleType = arrayList2;
        this.denunciationType = arrayList3;
        this.logo = str;
        this.currentVersion = str2;
        this.hotline = str3;
        this.needUpdate = z11;
        this.appVersion = str4;
    }

    public static /* synthetic */ SettingModel copy$default(SettingModel settingModel, boolean z10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, String str2, String str3, boolean z11, String str4, int i10, Object obj) {
        SettingModel settingModel2 = settingModel;
        int i11 = i10;
        return settingModel.copy((i11 & 1) != 0 ? settingModel2.onDebug : z10, (i11 & 2) != 0 ? settingModel2.reflectionType : arrayList, (i11 & 4) != 0 ? settingModel2.vehicleType : arrayList2, (i11 & 8) != 0 ? settingModel2.denunciationType : arrayList3, (i11 & 16) != 0 ? settingModel2.logo : str, (i11 & 32) != 0 ? settingModel2.currentVersion : str2, (i11 & 64) != 0 ? settingModel2.hotline : str3, (i11 & 128) != 0 ? settingModel2.needUpdate : z11, (i11 & 256) != 0 ? settingModel2.appVersion : str4);
    }

    public final boolean component1() {
        return this.onDebug;
    }

    public final ArrayList<gf.b> component2() {
        return this.reflectionType;
    }

    public final ArrayList<gf.b> component3() {
        return this.vehicleType;
    }

    public final ArrayList<gf.b> component4() {
        return this.denunciationType;
    }

    public final String component5() {
        return this.logo;
    }

    public final String component6() {
        return this.currentVersion;
    }

    public final String component7() {
        return this.hotline;
    }

    public final boolean component8() {
        return this.needUpdate;
    }

    public final String component9() {
        return this.appVersion;
    }

    public final SettingModel copy(boolean z10, ArrayList<gf.b> arrayList, ArrayList<gf.b> arrayList2, ArrayList<gf.b> arrayList3, String str, String str2, String str3, boolean z11, String str4) {
        j.f(arrayList, "reflectionType");
        j.f(arrayList2, "vehicleType");
        j.f(arrayList3, "denunciationType");
        String str5 = str4;
        j.f(str5, "appVersion");
        return new SettingModel(z10, arrayList, arrayList2, arrayList3, str, str2, str3, z11, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingModel)) {
            return false;
        }
        SettingModel settingModel = (SettingModel) obj;
        return this.onDebug == settingModel.onDebug && j.a(this.reflectionType, settingModel.reflectionType) && j.a(this.vehicleType, settingModel.vehicleType) && j.a(this.denunciationType, settingModel.denunciationType) && j.a(this.logo, settingModel.logo) && j.a(this.currentVersion, settingModel.currentVersion) && j.a(this.hotline, settingModel.hotline) && this.needUpdate == settingModel.needUpdate && j.a(this.appVersion, settingModel.appVersion);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCurrentVersion() {
        return this.currentVersion;
    }

    public final ArrayList<gf.b> getDenunciationType() {
        return this.denunciationType;
    }

    public final String getHotline() {
        return this.hotline;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public final boolean getOnDebug() {
        return this.onDebug;
    }

    public final ArrayList<gf.b> getReflectionType() {
        return this.reflectionType;
    }

    public final ArrayList<gf.b> getVehicleType() {
        return this.vehicleType;
    }

    public int hashCode() {
        boolean z10 = this.onDebug;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode = (this.denunciationType.hashCode() + ((this.vehicleType.hashCode() + ((this.reflectionType.hashCode() + ((z10 ? 1 : 0) * true)) * 31)) * 31)) * 31;
        String str = this.logo;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentVersion;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hotline;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z12 = this.needUpdate;
        if (!z12) {
            z11 = z12;
        }
        return this.appVersion.hashCode() + ((i11 + (z11 ? 1 : 0)) * 31);
    }

    public final void setAppVersion(String str) {
        j.f(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setCurrentVersion(String str) {
        this.currentVersion = str;
    }

    public final void setDenunciationType(ArrayList<gf.b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.denunciationType = arrayList;
    }

    public final void setHotline(String str) {
        this.hotline = str;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setNeedUpdate(boolean z10) {
        this.needUpdate = z10;
    }

    public final void setOnDebug(boolean z10) {
        this.onDebug = z10;
    }

    public final void setReflectionType(ArrayList<gf.b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.reflectionType = arrayList;
    }

    public final void setVehicleType(ArrayList<gf.b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.vehicleType = arrayList;
    }

    public String toString() {
        StringBuilder q10 = a.q("SettingModel(onDebug=");
        q10.append(this.onDebug);
        q10.append(", reflectionType=");
        q10.append(this.reflectionType);
        q10.append(", vehicleType=");
        q10.append(this.vehicleType);
        q10.append(", denunciationType=");
        q10.append(this.denunciationType);
        q10.append(", logo=");
        q10.append(this.logo);
        q10.append(", currentVersion=");
        q10.append(this.currentVersion);
        q10.append(", hotline=");
        q10.append(this.hotline);
        q10.append(", needUpdate=");
        q10.append(this.needUpdate);
        q10.append(", appVersion=");
        return l.k(q10, this.appVersion, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SettingModel(boolean r12, java.util.ArrayList r13, java.util.ArrayList r14, java.util.ArrayList r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, java.lang.String r20, int r21, sk.e r22) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x0015
        L_0x0014:
            r3 = r13
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x0020
        L_0x001f:
            r4 = r14
        L_0x0020:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x002a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x002b
        L_0x002a:
            r5 = r15
        L_0x002b:
            r6 = r0 & 16
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0033
            r6 = r7
            goto L_0x0035
        L_0x0033:
            r6 = r16
        L_0x0035:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003b
            r8 = r7
            goto L_0x003d
        L_0x003b:
            r8 = r17
        L_0x003d:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0043
            r9 = r7
            goto L_0x0045
        L_0x0043:
            r9 = r18
        L_0x0045:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r19
        L_0x004c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r7 = r20
        L_0x0053:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r2
            r21 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.data.model.setting.SettingModel.<init>(boolean, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, sk.e):void");
    }
}

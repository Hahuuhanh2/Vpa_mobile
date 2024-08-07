package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: StartSSE.kt */
public final class StartSSE {
    @b("allowExtendDuration")
    private Integer allowExtendDuration;
    @b("basePrice")
    private Long basePrice;
    @b("bksId")
    private Long bksId;
    @b("currentExtendTime")
    private Integer currentExtendTime;
    @b("endTime")
    private Long endTime;
    @b("estTimeEnd")
    private Long estTimeEnd;
    @b("extendDuration")
    private Integer extendDuration;
    @b("freezeTime")
    private Boolean freezeTime;
    @b("khCongBoId")
    private Long khCongBoId;
    @b("khDauGiaId")
    private Long khDauGiaId;
    @b("khId")
    private Long khId;
    @b("listUserExtend")
    private List<? extends Object> listUserExtend;
    @b("localSymbol")
    private String localSymbol;
    @b("maxExtendTime")
    private Integer maxExtendTime;
    @b("processingDuration")
    private Integer processingDuration;
    @b("provinceCode")
    private String provinceCode;
    @b("rateLimit")
    private Object rateLimit;
    @b("roomId")
    private String roomId;
    @b("seri")
    private String seri;
    @b("sessionId")
    private Long sessionId;
    @b("soThuTu")
    private String soThuTu;
    @b("startTime")
    private Long startTime;
    @b("status")
    private Integer status;
    @b("vehicleCode")
    private Integer vehicleCode;
    @b("waitToFreezeTime")
    private Boolean waitToFreezeTime;
    @b("winNow")
    private Boolean winNow;

    public StartSSE() {
        this((Integer) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (List) null, (String) null, (Integer) null, (Integer) null, (String) null, (Object) null, (String) null, (String) null, (Long) null, (String) null, (Long) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, 67108863, (e) null);
    }

    public StartSSE(Integer num, Long l10, Long l11, Integer num2, Long l12, Long l13, Integer num3, Boolean bool, Long l14, Long l15, Long l16, List<? extends Object> list, String str, Integer num4, Integer num5, String str2, Object obj, String str3, String str4, Long l17, String str5, Long l18, Integer num6, Integer num7, Boolean bool2, Boolean bool3) {
        this.allowExtendDuration = num;
        this.basePrice = l10;
        this.bksId = l11;
        this.currentExtendTime = num2;
        this.endTime = l12;
        this.estTimeEnd = l13;
        this.extendDuration = num3;
        this.freezeTime = bool;
        this.khCongBoId = l14;
        this.khDauGiaId = l15;
        this.khId = l16;
        this.listUserExtend = list;
        this.localSymbol = str;
        this.maxExtendTime = num4;
        this.processingDuration = num5;
        this.provinceCode = str2;
        this.rateLimit = obj;
        this.roomId = str3;
        this.seri = str4;
        this.sessionId = l17;
        this.soThuTu = str5;
        this.startTime = l18;
        this.status = num6;
        this.vehicleCode = num7;
        this.waitToFreezeTime = bool2;
        this.winNow = bool3;
    }

    public static /* synthetic */ StartSSE copy$default(StartSSE startSSE, Integer num, Long l10, Long l11, Integer num2, Long l12, Long l13, Integer num3, Boolean bool, Long l14, Long l15, Long l16, List list, String str, Integer num4, Integer num5, String str2, Object obj, String str3, String str4, Long l17, String str5, Long l18, Integer num6, Integer num7, Boolean bool2, Boolean bool3, int i10, Object obj2) {
        StartSSE startSSE2 = startSSE;
        int i11 = i10;
        return startSSE.copy((i11 & 1) != 0 ? startSSE2.allowExtendDuration : num, (i11 & 2) != 0 ? startSSE2.basePrice : l10, (i11 & 4) != 0 ? startSSE2.bksId : l11, (i11 & 8) != 0 ? startSSE2.currentExtendTime : num2, (i11 & 16) != 0 ? startSSE2.endTime : l12, (i11 & 32) != 0 ? startSSE2.estTimeEnd : l13, (i11 & 64) != 0 ? startSSE2.extendDuration : num3, (i11 & 128) != 0 ? startSSE2.freezeTime : bool, (i11 & 256) != 0 ? startSSE2.khCongBoId : l14, (i11 & 512) != 0 ? startSSE2.khDauGiaId : l15, (i11 & 1024) != 0 ? startSSE2.khId : l16, (i11 & 2048) != 0 ? startSSE2.listUserExtend : list, (i11 & 4096) != 0 ? startSSE2.localSymbol : str, (i11 & 8192) != 0 ? startSSE2.maxExtendTime : num4, (i11 & 16384) != 0 ? startSSE2.processingDuration : num5, (i11 & 32768) != 0 ? startSSE2.provinceCode : str2, (i11 & 65536) != 0 ? startSSE2.rateLimit : obj, (i11 & 131072) != 0 ? startSSE2.roomId : str3, (i11 & 262144) != 0 ? startSSE2.seri : str4, (i11 & 524288) != 0 ? startSSE2.sessionId : l17, (i11 & 1048576) != 0 ? startSSE2.soThuTu : str5, (i11 & 2097152) != 0 ? startSSE2.startTime : l18, (i11 & 4194304) != 0 ? startSSE2.status : num6, (i11 & 8388608) != 0 ? startSSE2.vehicleCode : num7, (i11 & 16777216) != 0 ? startSSE2.waitToFreezeTime : bool2, (i11 & 33554432) != 0 ? startSSE2.winNow : bool3);
    }

    public final Integer component1() {
        return this.allowExtendDuration;
    }

    public final Long component10() {
        return this.khDauGiaId;
    }

    public final Long component11() {
        return this.khId;
    }

    public final List<Object> component12() {
        return this.listUserExtend;
    }

    public final String component13() {
        return this.localSymbol;
    }

    public final Integer component14() {
        return this.maxExtendTime;
    }

    public final Integer component15() {
        return this.processingDuration;
    }

    public final String component16() {
        return this.provinceCode;
    }

    public final Object component17() {
        return this.rateLimit;
    }

    public final String component18() {
        return this.roomId;
    }

    public final String component19() {
        return this.seri;
    }

    public final Long component2() {
        return this.basePrice;
    }

    public final Long component20() {
        return this.sessionId;
    }

    public final String component21() {
        return this.soThuTu;
    }

    public final Long component22() {
        return this.startTime;
    }

    public final Integer component23() {
        return this.status;
    }

    public final Integer component24() {
        return this.vehicleCode;
    }

    public final Boolean component25() {
        return this.waitToFreezeTime;
    }

    public final Boolean component26() {
        return this.winNow;
    }

    public final Long component3() {
        return this.bksId;
    }

    public final Integer component4() {
        return this.currentExtendTime;
    }

    public final Long component5() {
        return this.endTime;
    }

    public final Long component6() {
        return this.estTimeEnd;
    }

    public final Integer component7() {
        return this.extendDuration;
    }

    public final Boolean component8() {
        return this.freezeTime;
    }

    public final Long component9() {
        return this.khCongBoId;
    }

    public final StartSSE copy(Integer num, Long l10, Long l11, Integer num2, Long l12, Long l13, Integer num3, Boolean bool, Long l14, Long l15, Long l16, List<? extends Object> list, String str, Integer num4, Integer num5, String str2, Object obj, String str3, String str4, Long l17, String str5, Long l18, Integer num6, Integer num7, Boolean bool2, Boolean bool3) {
        return new StartSSE(num, l10, l11, num2, l12, l13, num3, bool, l14, l15, l16, list, str, num4, num5, str2, obj, str3, str4, l17, str5, l18, num6, num7, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartSSE)) {
            return false;
        }
        StartSSE startSSE = (StartSSE) obj;
        return j.a(this.allowExtendDuration, startSSE.allowExtendDuration) && j.a(this.basePrice, startSSE.basePrice) && j.a(this.bksId, startSSE.bksId) && j.a(this.currentExtendTime, startSSE.currentExtendTime) && j.a(this.endTime, startSSE.endTime) && j.a(this.estTimeEnd, startSSE.estTimeEnd) && j.a(this.extendDuration, startSSE.extendDuration) && j.a(this.freezeTime, startSSE.freezeTime) && j.a(this.khCongBoId, startSSE.khCongBoId) && j.a(this.khDauGiaId, startSSE.khDauGiaId) && j.a(this.khId, startSSE.khId) && j.a(this.listUserExtend, startSSE.listUserExtend) && j.a(this.localSymbol, startSSE.localSymbol) && j.a(this.maxExtendTime, startSSE.maxExtendTime) && j.a(this.processingDuration, startSSE.processingDuration) && j.a(this.provinceCode, startSSE.provinceCode) && j.a(this.rateLimit, startSSE.rateLimit) && j.a(this.roomId, startSSE.roomId) && j.a(this.seri, startSSE.seri) && j.a(this.sessionId, startSSE.sessionId) && j.a(this.soThuTu, startSSE.soThuTu) && j.a(this.startTime, startSSE.startTime) && j.a(this.status, startSSE.status) && j.a(this.vehicleCode, startSSE.vehicleCode) && j.a(this.waitToFreezeTime, startSSE.waitToFreezeTime) && j.a(this.winNow, startSSE.winNow);
    }

    public final Integer getAllowExtendDuration() {
        return this.allowExtendDuration;
    }

    public final Long getBasePrice() {
        return this.basePrice;
    }

    public final Long getBksId() {
        return this.bksId;
    }

    public final Integer getCurrentExtendTime() {
        return this.currentExtendTime;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Long getEstTimeEnd() {
        return this.estTimeEnd;
    }

    public final Integer getExtendDuration() {
        return this.extendDuration;
    }

    public final Boolean getFreezeTime() {
        return this.freezeTime;
    }

    public final Long getKhCongBoId() {
        return this.khCongBoId;
    }

    public final Long getKhDauGiaId() {
        return this.khDauGiaId;
    }

    public final Long getKhId() {
        return this.khId;
    }

    public final List<Object> getListUserExtend() {
        return this.listUserExtend;
    }

    public final String getLocalSymbol() {
        return this.localSymbol;
    }

    public final Integer getMaxExtendTime() {
        return this.maxExtendTime;
    }

    public final Integer getProcessingDuration() {
        return this.processingDuration;
    }

    public final String getProvinceCode() {
        return this.provinceCode;
    }

    public final Object getRateLimit() {
        return this.rateLimit;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSeri() {
        return this.seri;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getVehicleCode() {
        return this.vehicleCode;
    }

    public final Boolean getWaitToFreezeTime() {
        return this.waitToFreezeTime;
    }

    public final Boolean getWinNow() {
        return this.winNow;
    }

    public int hashCode() {
        Integer num = this.allowExtendDuration;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l10 = this.basePrice;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.bksId;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.currentExtendTime;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.endTime;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.estTimeEnd;
        int hashCode6 = (hashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num3 = this.extendDuration;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.freezeTime;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.khCongBoId;
        int hashCode9 = (hashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.khDauGiaId;
        int hashCode10 = (hashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.khId;
        int hashCode11 = (hashCode10 + (l16 == null ? 0 : l16.hashCode())) * 31;
        List<? extends Object> list = this.listUserExtend;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.localSymbol;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.maxExtendTime;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.processingDuration;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.provinceCode;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.rateLimit;
        int hashCode17 = (hashCode16 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.roomId;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.seri;
        int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l17 = this.sessionId;
        int hashCode20 = (hashCode19 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str5 = this.soThuTu;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l18 = this.startTime;
        int hashCode22 = (hashCode21 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Integer num6 = this.status;
        int hashCode23 = (hashCode22 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.vehicleCode;
        int hashCode24 = (hashCode23 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool2 = this.waitToFreezeTime;
        int hashCode25 = (hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.winNow;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode25 + i10;
    }

    public final void setAllowExtendDuration(Integer num) {
        this.allowExtendDuration = num;
    }

    public final void setBasePrice(Long l10) {
        this.basePrice = l10;
    }

    public final void setBksId(Long l10) {
        this.bksId = l10;
    }

    public final void setCurrentExtendTime(Integer num) {
        this.currentExtendTime = num;
    }

    public final void setEndTime(Long l10) {
        this.endTime = l10;
    }

    public final void setEstTimeEnd(Long l10) {
        this.estTimeEnd = l10;
    }

    public final void setExtendDuration(Integer num) {
        this.extendDuration = num;
    }

    public final void setFreezeTime(Boolean bool) {
        this.freezeTime = bool;
    }

    public final void setKhCongBoId(Long l10) {
        this.khCongBoId = l10;
    }

    public final void setKhDauGiaId(Long l10) {
        this.khDauGiaId = l10;
    }

    public final void setKhId(Long l10) {
        this.khId = l10;
    }

    public final void setListUserExtend(List<? extends Object> list) {
        this.listUserExtend = list;
    }

    public final void setLocalSymbol(String str) {
        this.localSymbol = str;
    }

    public final void setMaxExtendTime(Integer num) {
        this.maxExtendTime = num;
    }

    public final void setProcessingDuration(Integer num) {
        this.processingDuration = num;
    }

    public final void setProvinceCode(String str) {
        this.provinceCode = str;
    }

    public final void setRateLimit(Object obj) {
        this.rateLimit = obj;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSeri(String str) {
        this.seri = str;
    }

    public final void setSessionId(Long l10) {
        this.sessionId = l10;
    }

    public final void setSoThuTu(String str) {
        this.soThuTu = str;
    }

    public final void setStartTime(Long l10) {
        this.startTime = l10;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setVehicleCode(Integer num) {
        this.vehicleCode = num;
    }

    public final void setWaitToFreezeTime(Boolean bool) {
        this.waitToFreezeTime = bool;
    }

    public final void setWinNow(Boolean bool) {
        this.winNow = bool;
    }

    public String toString() {
        StringBuilder q10 = a.q("StartSSE(allowExtendDuration=");
        q10.append(this.allowExtendDuration);
        q10.append(", basePrice=");
        q10.append(this.basePrice);
        q10.append(", bksId=");
        q10.append(this.bksId);
        q10.append(", currentExtendTime=");
        q10.append(this.currentExtendTime);
        q10.append(", endTime=");
        q10.append(this.endTime);
        q10.append(", estTimeEnd=");
        q10.append(this.estTimeEnd);
        q10.append(", extendDuration=");
        q10.append(this.extendDuration);
        q10.append(", freezeTime=");
        q10.append(this.freezeTime);
        q10.append(", khCongBoId=");
        q10.append(this.khCongBoId);
        q10.append(", khDauGiaId=");
        q10.append(this.khDauGiaId);
        q10.append(", khId=");
        q10.append(this.khId);
        q10.append(", listUserExtend=");
        q10.append(this.listUserExtend);
        q10.append(", localSymbol=");
        q10.append(this.localSymbol);
        q10.append(", maxExtendTime=");
        q10.append(this.maxExtendTime);
        q10.append(", processingDuration=");
        q10.append(this.processingDuration);
        q10.append(", provinceCode=");
        q10.append(this.provinceCode);
        q10.append(", rateLimit=");
        q10.append(this.rateLimit);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", seri=");
        q10.append(this.seri);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", soThuTu=");
        q10.append(this.soThuTu);
        q10.append(", startTime=");
        q10.append(this.startTime);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", vehicleCode=");
        q10.append(this.vehicleCode);
        q10.append(", waitToFreezeTime=");
        q10.append(this.waitToFreezeTime);
        q10.append(", winNow=");
        q10.append(this.winNow);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StartSSE(java.lang.Integer r28, java.lang.Long r29, java.lang.Long r30, java.lang.Integer r31, java.lang.Long r32, java.lang.Long r33, java.lang.Integer r34, java.lang.Boolean r35, java.lang.Long r36, java.lang.Long r37, java.lang.Long r38, java.util.List r39, java.lang.String r40, java.lang.Integer r41, java.lang.Integer r42, java.lang.String r43, java.lang.Object r44, java.lang.String r45, java.lang.String r46, java.lang.Long r47, java.lang.String r48, java.lang.Long r49, java.lang.Integer r50, java.lang.Integer r51, java.lang.Boolean r52, java.lang.Boolean r53, int r54, sk.e r55) {
        /*
            r27 = this;
            r0 = r54
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r28
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r29
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r30
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r31
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r32
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r33
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r34
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r35
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r36
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r37
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r38
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r39
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r40
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r41
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r42
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r43
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r44
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r45
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r46
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r47
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r48
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r49
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r50
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r51
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r52
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r26
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            goto L_0x00f3
        L_0x00f1:
            r0 = r53
        L_0x00f3:
            r28 = r27
            r29 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r8
            r36 = r9
            r37 = r10
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r15
            r43 = r2
            r44 = r16
            r45 = r17
            r46 = r18
            r47 = r19
            r48 = r20
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r24
            r53 = r25
            r54 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.StartSSE.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, int, sk.e):void");
    }
}

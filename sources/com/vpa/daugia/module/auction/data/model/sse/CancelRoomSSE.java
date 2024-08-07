package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: CancelRoomSSE.kt */
public final class CancelRoomSSE {
    @b("isAccepted")
    private Boolean isAccepted;
    @b("provinceSymbol")
    private String provinceSymbol;
    @b("reason")
    private String reason;
    @b("registrationSeri")
    private String registrationSeri;
    @b("requesterName")
    private String requesterName;
    @b("role")
    private String role;
    @b("roomId")
    private String roomId;
    @b("sequenceNumber")
    private String sequenceNumber;
    @b("sessionId")
    private String sessionId;

    public CancelRoomSSE() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (e) null);
    }

    public CancelRoomSSE(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.isAccepted = bool;
        this.provinceSymbol = str;
        this.reason = str2;
        this.registrationSeri = str3;
        this.requesterName = str4;
        this.role = str5;
        this.roomId = str6;
        this.sequenceNumber = str7;
        this.sessionId = str8;
    }

    public static /* synthetic */ CancelRoomSSE copy$default(CancelRoomSSE cancelRoomSSE, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        CancelRoomSSE cancelRoomSSE2 = cancelRoomSSE;
        int i11 = i10;
        return cancelRoomSSE.copy((i11 & 1) != 0 ? cancelRoomSSE2.isAccepted : bool, (i11 & 2) != 0 ? cancelRoomSSE2.provinceSymbol : str, (i11 & 4) != 0 ? cancelRoomSSE2.reason : str2, (i11 & 8) != 0 ? cancelRoomSSE2.registrationSeri : str3, (i11 & 16) != 0 ? cancelRoomSSE2.requesterName : str4, (i11 & 32) != 0 ? cancelRoomSSE2.role : str5, (i11 & 64) != 0 ? cancelRoomSSE2.roomId : str6, (i11 & 128) != 0 ? cancelRoomSSE2.sequenceNumber : str7, (i11 & 256) != 0 ? cancelRoomSSE2.sessionId : str8);
    }

    public final Boolean component1() {
        return this.isAccepted;
    }

    public final String component2() {
        return this.provinceSymbol;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.registrationSeri;
    }

    public final String component5() {
        return this.requesterName;
    }

    public final String component6() {
        return this.role;
    }

    public final String component7() {
        return this.roomId;
    }

    public final String component8() {
        return this.sequenceNumber;
    }

    public final String component9() {
        return this.sessionId;
    }

    public final CancelRoomSSE copy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new CancelRoomSSE(bool, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelRoomSSE)) {
            return false;
        }
        CancelRoomSSE cancelRoomSSE = (CancelRoomSSE) obj;
        return j.a(this.isAccepted, cancelRoomSSE.isAccepted) && j.a(this.provinceSymbol, cancelRoomSSE.provinceSymbol) && j.a(this.reason, cancelRoomSSE.reason) && j.a(this.registrationSeri, cancelRoomSSE.registrationSeri) && j.a(this.requesterName, cancelRoomSSE.requesterName) && j.a(this.role, cancelRoomSSE.role) && j.a(this.roomId, cancelRoomSSE.roomId) && j.a(this.sequenceNumber, cancelRoomSSE.sequenceNumber) && j.a(this.sessionId, cancelRoomSSE.sessionId);
    }

    public final String getPlate() {
        CharSequence charSequence;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.provinceSymbol);
        sb2.append(this.registrationSeri);
        sb2.append(" - ");
        String str = this.sequenceNumber;
        CharSequence charSequence2 = null;
        if (str != null) {
            charSequence = str.subSequence(0, 3);
        } else {
            charSequence = null;
        }
        sb2.append(charSequence);
        sb2.append('.');
        String str2 = this.sequenceNumber;
        if (str2 != null) {
            charSequence2 = str2.subSequence(3, 5);
        }
        sb2.append(charSequence2);
        return sb2.toString();
    }

    public final String getProvinceSymbol() {
        return this.provinceSymbol;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonCancel() {
        StringBuilder q10 = a.q("Lý do: ");
        q10.append(this.reason);
        return q10.toString();
    }

    public final String getRegistrationSeri() {
        return this.registrationSeri;
    }

    public final String getRequesterName() {
        return this.requesterName;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        Boolean bool = this.isAccepted;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.provinceSymbol;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reason;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationSeri;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requesterName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.role;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.roomId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sequenceNumber;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sessionId;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return hashCode8 + i10;
    }

    public final Boolean isAccepted() {
        return this.isAccepted;
    }

    public final void setAccepted(Boolean bool) {
        this.isAccepted = bool;
    }

    public final void setProvinceSymbol(String str) {
        this.provinceSymbol = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setRegistrationSeri(String str) {
        this.registrationSeri = str;
    }

    public final void setRequesterName(String str) {
        this.requesterName = str;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("CancelRoomSSE(isAccepted=");
        q10.append(this.isAccepted);
        q10.append(", provinceSymbol=");
        q10.append(this.provinceSymbol);
        q10.append(", reason=");
        q10.append(this.reason);
        q10.append(", registrationSeri=");
        q10.append(this.registrationSeri);
        q10.append(", requesterName=");
        q10.append(this.requesterName);
        q10.append(", role=");
        q10.append(this.role);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", sequenceNumber=");
        q10.append(this.sequenceNumber);
        q10.append(", sessionId=");
        return l.k(q10, this.sessionId, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CancelRoomSSE(java.lang.Boolean r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, sk.e r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.CancelRoomSSE.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}

package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: ExtendTimeSSE.kt */
public final class ExtendTimeSSE {
    @b("endTime")
    private Long endTime;
    @b("extendTime")
    private Integer extendTime;
    @b("maxExtendTime")
    private Integer maxExtendTime;
    @b("roomId")
    private String roomId;
    @b("roundNumber")
    private Integer roundNumber;
    @b("sessionId")
    private String sessionId;
    @b("users")
    private List<String> users;

    public ExtendTimeSSE() {
        this((Long) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (List) null, 127, (e) null);
    }

    public ExtendTimeSSE(Long l10, Integer num, Integer num2, String str, Integer num3, String str2, List<String> list) {
        this.endTime = l10;
        this.extendTime = num;
        this.maxExtendTime = num2;
        this.roomId = str;
        this.roundNumber = num3;
        this.sessionId = str2;
        this.users = list;
    }

    public static /* synthetic */ ExtendTimeSSE copy$default(ExtendTimeSSE extendTimeSSE, Long l10, Integer num, Integer num2, String str, Integer num3, String str2, List<String> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = extendTimeSSE.endTime;
        }
        if ((i10 & 2) != 0) {
            num = extendTimeSSE.extendTime;
        }
        Integer num4 = num;
        if ((i10 & 4) != 0) {
            num2 = extendTimeSSE.maxExtendTime;
        }
        Integer num5 = num2;
        if ((i10 & 8) != 0) {
            str = extendTimeSSE.roomId;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            num3 = extendTimeSSE.roundNumber;
        }
        Integer num6 = num3;
        if ((i10 & 32) != 0) {
            str2 = extendTimeSSE.sessionId;
        }
        String str4 = str2;
        if ((i10 & 64) != 0) {
            list = extendTimeSSE.users;
        }
        return extendTimeSSE.copy(l10, num4, num5, str3, num6, str4, list);
    }

    public final Long component1() {
        return this.endTime;
    }

    public final Integer component2() {
        return this.extendTime;
    }

    public final Integer component3() {
        return this.maxExtendTime;
    }

    public final String component4() {
        return this.roomId;
    }

    public final Integer component5() {
        return this.roundNumber;
    }

    public final String component6() {
        return this.sessionId;
    }

    public final List<String> component7() {
        return this.users;
    }

    public final ExtendTimeSSE copy(Long l10, Integer num, Integer num2, String str, Integer num3, String str2, List<String> list) {
        return new ExtendTimeSSE(l10, num, num2, str, num3, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendTimeSSE)) {
            return false;
        }
        ExtendTimeSSE extendTimeSSE = (ExtendTimeSSE) obj;
        return j.a(this.endTime, extendTimeSSE.endTime) && j.a(this.extendTime, extendTimeSSE.extendTime) && j.a(this.maxExtendTime, extendTimeSSE.maxExtendTime) && j.a(this.roomId, extendTimeSSE.roomId) && j.a(this.roundNumber, extendTimeSSE.roundNumber) && j.a(this.sessionId, extendTimeSSE.sessionId) && j.a(this.users, extendTimeSSE.users);
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Integer getExtendTime() {
        return this.extendTime;
    }

    public final Integer getMaxExtendTime() {
        return this.maxExtendTime;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Integer getRoundNumber() {
        return this.roundNumber;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<String> getUsers() {
        return this.users;
    }

    public int hashCode() {
        Long l10 = this.endTime;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.extendTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxExtendTime;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.roomId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.roundNumber;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.sessionId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.users;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode6 + i10;
    }

    public final void setEndTime(Long l10) {
        this.endTime = l10;
    }

    public final void setExtendTime(Integer num) {
        this.extendTime = num;
    }

    public final void setMaxExtendTime(Integer num) {
        this.maxExtendTime = num;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRoundNumber(Integer num) {
        this.roundNumber = num;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setUsers(List<String> list) {
        this.users = list;
    }

    public String toString() {
        StringBuilder q10 = a.q("ExtendTimeSSE(endTime=");
        q10.append(this.endTime);
        q10.append(", extendTime=");
        q10.append(this.extendTime);
        q10.append(", maxExtendTime=");
        q10.append(this.maxExtendTime);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", roundNumber=");
        q10.append(this.roundNumber);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", users=");
        q10.append(this.users);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExtendTimeSSE(java.lang.Long r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.Integer r10, java.lang.String r11, java.util.List r12, int r13, sk.e r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x000a
            r0 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L_0x000a:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L_0x0013
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0013:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x001c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x001c:
            r1 = r8
            r7 = r13 & 8
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x0025
            r2 = r8
            goto L_0x0026
        L_0x0025:
            r2 = r9
        L_0x0026:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x002e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x002e:
            r0 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0035
            r3 = r8
            goto L_0x0036
        L_0x0035:
            r3 = r11
        L_0x0036:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x003c
            fk.r r12 = fk.r.f20213a
        L_0x003c:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r0
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.ExtendTimeSSE.<init>(java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, int, sk.e):void");
    }
}

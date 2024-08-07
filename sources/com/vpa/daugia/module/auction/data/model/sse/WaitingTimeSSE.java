package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: WaitingTimeSSE.kt */
public final class WaitingTimeSSE {
    @b("delayTime")
    private Integer delayTime;
    @b("roomId")
    private String roomId;
    @b("sessionId")
    private String sessionId;

    public WaitingTimeSSE() {
        this((Integer) null, (String) null, (String) null, 7, (e) null);
    }

    public WaitingTimeSSE(Integer num, String str, String str2) {
        this.delayTime = num;
        this.roomId = str;
        this.sessionId = str2;
    }

    public static /* synthetic */ WaitingTimeSSE copy$default(WaitingTimeSSE waitingTimeSSE, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = waitingTimeSSE.delayTime;
        }
        if ((i10 & 2) != 0) {
            str = waitingTimeSSE.roomId;
        }
        if ((i10 & 4) != 0) {
            str2 = waitingTimeSSE.sessionId;
        }
        return waitingTimeSSE.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.delayTime;
    }

    public final String component2() {
        return this.roomId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final WaitingTimeSSE copy(Integer num, String str, String str2) {
        return new WaitingTimeSSE(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitingTimeSSE)) {
            return false;
        }
        WaitingTimeSSE waitingTimeSSE = (WaitingTimeSSE) obj;
        return j.a(this.delayTime, waitingTimeSSE.delayTime) && j.a(this.roomId, waitingTimeSSE.roomId) && j.a(this.sessionId, waitingTimeSSE.sessionId);
    }

    public final Integer getDelayTime() {
        return this.delayTime;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        Integer num = this.delayTime;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.roomId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setDelayTime(Integer num) {
        this.delayTime = num;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("WaitingTimeSSE(delayTime=");
        q10.append(this.delayTime);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", sessionId=");
        return l.k(q10, this.sessionId, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WaitingTimeSSE(Integer num, String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}

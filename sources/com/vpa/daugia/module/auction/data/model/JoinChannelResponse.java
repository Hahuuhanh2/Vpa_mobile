package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: JoinChannelResponse.kt */
public final class JoinChannelResponse {
    @b("biddingRoomId")
    private final String biddingRoomId;
    @b("biddingSessionId")
    private final String biddingSessionId;
    @b("joinTime")
    private final Long joinTime;
    @b("nextId")
    private final String nextId;
    @b("participantId")
    private final String participantId;
    @b("participantType")
    private final Integer participantType;

    public JoinChannelResponse(String str, String str2, Long l10, String str3, String str4, Integer num) {
        this.biddingRoomId = str;
        this.biddingSessionId = str2;
        this.joinTime = l10;
        this.nextId = str3;
        this.participantId = str4;
        this.participantType = num;
    }

    public static /* synthetic */ JoinChannelResponse copy$default(JoinChannelResponse joinChannelResponse, String str, String str2, Long l10, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = joinChannelResponse.biddingRoomId;
        }
        if ((i10 & 2) != 0) {
            str2 = joinChannelResponse.biddingSessionId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            l10 = joinChannelResponse.joinTime;
        }
        Long l11 = l10;
        if ((i10 & 8) != 0) {
            str3 = joinChannelResponse.nextId;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = joinChannelResponse.participantId;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            num = joinChannelResponse.participantType;
        }
        return joinChannelResponse.copy(str, str5, l11, str6, str7, num);
    }

    public final String component1() {
        return this.biddingRoomId;
    }

    public final String component2() {
        return this.biddingSessionId;
    }

    public final Long component3() {
        return this.joinTime;
    }

    public final String component4() {
        return this.nextId;
    }

    public final String component5() {
        return this.participantId;
    }

    public final Integer component6() {
        return this.participantType;
    }

    public final JoinChannelResponse copy(String str, String str2, Long l10, String str3, String str4, Integer num) {
        return new JoinChannelResponse(str, str2, l10, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinChannelResponse)) {
            return false;
        }
        JoinChannelResponse joinChannelResponse = (JoinChannelResponse) obj;
        return j.a(this.biddingRoomId, joinChannelResponse.biddingRoomId) && j.a(this.biddingSessionId, joinChannelResponse.biddingSessionId) && j.a(this.joinTime, joinChannelResponse.joinTime) && j.a(this.nextId, joinChannelResponse.nextId) && j.a(this.participantId, joinChannelResponse.participantId) && j.a(this.participantType, joinChannelResponse.participantType);
    }

    public final String getBiddingRoomId() {
        return this.biddingRoomId;
    }

    public final String getBiddingSessionId() {
        return this.biddingSessionId;
    }

    public final Long getJoinTime() {
        return this.joinTime;
    }

    public final String getNextId() {
        return this.nextId;
    }

    public final String getParticipantId() {
        return this.participantId;
    }

    public final Integer getParticipantType() {
        return this.participantType;
    }

    public int hashCode() {
        String str = this.biddingRoomId;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biddingSessionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.joinTime;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.nextId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.participantId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.participantType;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("JoinChannelResponse(biddingRoomId=");
        q10.append(this.biddingRoomId);
        q10.append(", biddingSessionId=");
        q10.append(this.biddingSessionId);
        q10.append(", joinTime=");
        q10.append(this.joinTime);
        q10.append(", nextId=");
        q10.append(this.nextId);
        q10.append(", participantId=");
        q10.append(this.participantId);
        q10.append(", participantType=");
        q10.append(this.participantType);
        q10.append(')');
        return q10.toString();
    }
}

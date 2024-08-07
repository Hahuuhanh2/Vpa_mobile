package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: JoinChannelRequest.kt */
public final class JoinChannelRequest {
    @b("biddingRoomId")
    private final String biddingRoomId;
    @b("biddingSessionId")
    private final String biddingSessionId;
    @b("channel")
    private final String channel;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f19376id;
    @b("participantType")
    private final Integer participantType;

    public JoinChannelRequest(String str, String str2, String str3, String str4, Integer num) {
        this.biddingRoomId = str;
        this.biddingSessionId = str2;
        this.channel = str3;
        this.f19376id = str4;
        this.participantType = num;
    }

    public static /* synthetic */ JoinChannelRequest copy$default(JoinChannelRequest joinChannelRequest, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = joinChannelRequest.biddingRoomId;
        }
        if ((i10 & 2) != 0) {
            str2 = joinChannelRequest.biddingSessionId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = joinChannelRequest.channel;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = joinChannelRequest.f19376id;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            num = joinChannelRequest.participantType;
        }
        return joinChannelRequest.copy(str, str5, str6, str7, num);
    }

    public final String component1() {
        return this.biddingRoomId;
    }

    public final String component2() {
        return this.biddingSessionId;
    }

    public final String component3() {
        return this.channel;
    }

    public final String component4() {
        return this.f19376id;
    }

    public final Integer component5() {
        return this.participantType;
    }

    public final JoinChannelRequest copy(String str, String str2, String str3, String str4, Integer num) {
        return new JoinChannelRequest(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinChannelRequest)) {
            return false;
        }
        JoinChannelRequest joinChannelRequest = (JoinChannelRequest) obj;
        return j.a(this.biddingRoomId, joinChannelRequest.biddingRoomId) && j.a(this.biddingSessionId, joinChannelRequest.biddingSessionId) && j.a(this.channel, joinChannelRequest.channel) && j.a(this.f19376id, joinChannelRequest.f19376id) && j.a(this.participantType, joinChannelRequest.participantType);
    }

    public final String getBiddingRoomId() {
        return this.biddingRoomId;
    }

    public final String getBiddingSessionId() {
        return this.biddingSessionId;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getId() {
        return this.f19376id;
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
        String str3 = this.channel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19376id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.participantType;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("JoinChannelRequest(biddingRoomId=");
        q10.append(this.biddingRoomId);
        q10.append(", biddingSessionId=");
        q10.append(this.biddingSessionId);
        q10.append(", channel=");
        q10.append(this.channel);
        q10.append(", id=");
        q10.append(this.f19376id);
        q10.append(", participantType=");
        q10.append(this.participantType);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JoinChannelRequest(String str, String str2, String str3, String str4, Integer num, int i10, e eVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? 0 : num);
    }
}

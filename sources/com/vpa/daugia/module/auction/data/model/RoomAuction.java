package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: RoomAuction.kt */
public final class RoomAuction implements Serializable {
    @b("auctionCode")
    private String auctionCode;
    @b("biddingRoomId")
    private String biddingRoomId;
    @b("bksId")
    private String bksId;
    @b("channel")
    private String channel;
    @b("currentPrice")
    private Long currentPrice;
    @b("endRegistTime")
    private Long endRegistTime;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19379id;
    @b("isBiddingCurrent")
    private Boolean isBiddingCurrent;
    @b("isCancel")
    private Boolean isCancel;
    @b("isJoined")
    private Boolean isJoined;
    @b("khCongBoId")
    private Long khCongBoId;
    @b("khDauGiaId")
    private Long khDauGiaId;
    @b("kyHieuDiaPhuong")
    private String kyHieuDiaPhuong;
    @b("moniterName")
    private String moniterName;
    @b("payCount")
    private Integer payCount;
    @b("prices")
    private List<? extends Object> prices;
    @b("province")
    private String province;
    @b("roundNumber")
    private Integer roundNumber;
    @b("seriDangKy")
    private String seriDangKy;
    @b("sessionId")
    private String sessionId;
    @b("soThuTu")
    private String soThuTu;
    @b("startRegistTime")
    private Long startRegistTime;
    @b("status")
    private Integer status;
    @b("supervisorName")
    private String supervisorName;
    @b("userId")
    private String userId;
    @b("userMobile")
    private String userMobile;
    @b("vehicleType")
    private Integer vehicleType;
    @b("winByFirstJoin")
    private Integer winByFirstJoin;
    @b("winnerId")
    private Integer winnerId;

    public RoomAuction() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (List) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, 536870911, (e) null);
    }

    public RoomAuction(String str, String str2, String str3, String str4, Long l10, Long l11, String str5, Boolean bool, Boolean bool2, Boolean bool3, Long l12, Long l13, String str6, String str7, Integer num, List<? extends Object> list, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Integer num6) {
        this.auctionCode = str;
        this.biddingRoomId = str2;
        this.bksId = str3;
        this.channel = str4;
        this.currentPrice = l10;
        this.endRegistTime = l11;
        this.f19379id = str5;
        this.isBiddingCurrent = bool;
        this.isCancel = bool2;
        this.isJoined = bool3;
        this.khCongBoId = l12;
        this.khDauGiaId = l13;
        this.kyHieuDiaPhuong = str6;
        this.moniterName = str7;
        this.payCount = num;
        this.prices = list;
        this.province = str8;
        this.roundNumber = num2;
        this.seriDangKy = str9;
        this.sessionId = str10;
        this.soThuTu = str11;
        this.startRegistTime = l14;
        this.status = num3;
        this.supervisorName = str12;
        this.userId = str13;
        this.userMobile = str14;
        this.vehicleType = num4;
        this.winByFirstJoin = num5;
        this.winnerId = num6;
    }

    public static /* synthetic */ RoomAuction copy$default(RoomAuction roomAuction, String str, String str2, String str3, String str4, Long l10, Long l11, String str5, Boolean bool, Boolean bool2, Boolean bool3, Long l12, Long l13, String str6, String str7, Integer num, List list, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Integer num6, int i10, Object obj) {
        RoomAuction roomAuction2 = roomAuction;
        int i11 = i10;
        return roomAuction.copy((i11 & 1) != 0 ? roomAuction2.auctionCode : str, (i11 & 2) != 0 ? roomAuction2.biddingRoomId : str2, (i11 & 4) != 0 ? roomAuction2.bksId : str3, (i11 & 8) != 0 ? roomAuction2.channel : str4, (i11 & 16) != 0 ? roomAuction2.currentPrice : l10, (i11 & 32) != 0 ? roomAuction2.endRegistTime : l11, (i11 & 64) != 0 ? roomAuction2.f19379id : str5, (i11 & 128) != 0 ? roomAuction2.isBiddingCurrent : bool, (i11 & 256) != 0 ? roomAuction2.isCancel : bool2, (i11 & 512) != 0 ? roomAuction2.isJoined : bool3, (i11 & 1024) != 0 ? roomAuction2.khCongBoId : l12, (i11 & 2048) != 0 ? roomAuction2.khDauGiaId : l13, (i11 & 4096) != 0 ? roomAuction2.kyHieuDiaPhuong : str6, (i11 & 8192) != 0 ? roomAuction2.moniterName : str7, (i11 & 16384) != 0 ? roomAuction2.payCount : num, (i11 & 32768) != 0 ? roomAuction2.prices : list, (i11 & 65536) != 0 ? roomAuction2.province : str8, (i11 & 131072) != 0 ? roomAuction2.roundNumber : num2, (i11 & 262144) != 0 ? roomAuction2.seriDangKy : str9, (i11 & 524288) != 0 ? roomAuction2.sessionId : str10, (i11 & 1048576) != 0 ? roomAuction2.soThuTu : str11, (i11 & 2097152) != 0 ? roomAuction2.startRegistTime : l14, (i11 & 4194304) != 0 ? roomAuction2.status : num3, (i11 & 8388608) != 0 ? roomAuction2.supervisorName : str12, (i11 & 16777216) != 0 ? roomAuction2.userId : str13, (i11 & 33554432) != 0 ? roomAuction2.userMobile : str14, (i11 & 67108864) != 0 ? roomAuction2.vehicleType : num4, (i11 & 134217728) != 0 ? roomAuction2.winByFirstJoin : num5, (i11 & 268435456) != 0 ? roomAuction2.winnerId : num6);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final Boolean component10() {
        return this.isJoined;
    }

    public final Long component11() {
        return this.khCongBoId;
    }

    public final Long component12() {
        return this.khDauGiaId;
    }

    public final String component13() {
        return this.kyHieuDiaPhuong;
    }

    public final String component14() {
        return this.moniterName;
    }

    public final Integer component15() {
        return this.payCount;
    }

    public final List<Object> component16() {
        return this.prices;
    }

    public final String component17() {
        return this.province;
    }

    public final Integer component18() {
        return this.roundNumber;
    }

    public final String component19() {
        return this.seriDangKy;
    }

    public final String component2() {
        return this.biddingRoomId;
    }

    public final String component20() {
        return this.sessionId;
    }

    public final String component21() {
        return this.soThuTu;
    }

    public final Long component22() {
        return this.startRegistTime;
    }

    public final Integer component23() {
        return this.status;
    }

    public final String component24() {
        return this.supervisorName;
    }

    public final String component25() {
        return this.userId;
    }

    public final String component26() {
        return this.userMobile;
    }

    public final Integer component27() {
        return this.vehicleType;
    }

    public final Integer component28() {
        return this.winByFirstJoin;
    }

    public final Integer component29() {
        return this.winnerId;
    }

    public final String component3() {
        return this.bksId;
    }

    public final String component4() {
        return this.channel;
    }

    public final Long component5() {
        return this.currentPrice;
    }

    public final Long component6() {
        return this.endRegistTime;
    }

    public final String component7() {
        return this.f19379id;
    }

    public final Boolean component8() {
        return this.isBiddingCurrent;
    }

    public final Boolean component9() {
        return this.isCancel;
    }

    public final RoomAuction copy(String str, String str2, String str3, String str4, Long l10, Long l11, String str5, Boolean bool, Boolean bool2, Boolean bool3, Long l12, Long l13, String str6, String str7, Integer num, List<? extends Object> list, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Integer num6) {
        return new RoomAuction(str, str2, str3, str4, l10, l11, str5, bool, bool2, bool3, l12, l13, str6, str7, num, list, str8, num2, str9, str10, str11, l14, num3, str12, str13, str14, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomAuction)) {
            return false;
        }
        RoomAuction roomAuction = (RoomAuction) obj;
        return j.a(this.auctionCode, roomAuction.auctionCode) && j.a(this.biddingRoomId, roomAuction.biddingRoomId) && j.a(this.bksId, roomAuction.bksId) && j.a(this.channel, roomAuction.channel) && j.a(this.currentPrice, roomAuction.currentPrice) && j.a(this.endRegistTime, roomAuction.endRegistTime) && j.a(this.f19379id, roomAuction.f19379id) && j.a(this.isBiddingCurrent, roomAuction.isBiddingCurrent) && j.a(this.isCancel, roomAuction.isCancel) && j.a(this.isJoined, roomAuction.isJoined) && j.a(this.khCongBoId, roomAuction.khCongBoId) && j.a(this.khDauGiaId, roomAuction.khDauGiaId) && j.a(this.kyHieuDiaPhuong, roomAuction.kyHieuDiaPhuong) && j.a(this.moniterName, roomAuction.moniterName) && j.a(this.payCount, roomAuction.payCount) && j.a(this.prices, roomAuction.prices) && j.a(this.province, roomAuction.province) && j.a(this.roundNumber, roomAuction.roundNumber) && j.a(this.seriDangKy, roomAuction.seriDangKy) && j.a(this.sessionId, roomAuction.sessionId) && j.a(this.soThuTu, roomAuction.soThuTu) && j.a(this.startRegistTime, roomAuction.startRegistTime) && j.a(this.status, roomAuction.status) && j.a(this.supervisorName, roomAuction.supervisorName) && j.a(this.userId, roomAuction.userId) && j.a(this.userMobile, roomAuction.userMobile) && j.a(this.vehicleType, roomAuction.vehicleType) && j.a(this.winByFirstJoin, roomAuction.winByFirstJoin) && j.a(this.winnerId, roomAuction.winnerId);
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final String getBiddingRoomId() {
        return this.biddingRoomId;
    }

    public final String getBksId() {
        return this.bksId;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Long getCurrentPrice() {
        return this.currentPrice;
    }

    public final Long getEndRegistTime() {
        return this.endRegistTime;
    }

    public final String getId() {
        return this.f19379id;
    }

    public final Long getKhCongBoId() {
        return this.khCongBoId;
    }

    public final Long getKhDauGiaId() {
        return this.khDauGiaId;
    }

    public final String getKyHieuDiaPhuong() {
        return this.kyHieuDiaPhuong;
    }

    public final String getMoniterName() {
        return this.moniterName;
    }

    public final Integer getPayCount() {
        return this.payCount;
    }

    public final List<Object> getPrices() {
        return this.prices;
    }

    public final String getProvince() {
        return this.province;
    }

    public final Integer getRoundNumber() {
        return this.roundNumber;
    }

    public final String getSeriDangKy() {
        return this.seriDangKy;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public final Long getStartRegistTime() {
        return this.startRegistTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSupervisorName() {
        return this.supervisorName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserMobile() {
        return this.userMobile;
    }

    public final Integer getVehicleType() {
        return this.vehicleType;
    }

    public final Integer getWinByFirstJoin() {
        return this.winByFirstJoin;
    }

    public final Integer getWinnerId() {
        return this.winnerId;
    }

    public int hashCode() {
        String str = this.auctionCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biddingRoomId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bksId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.currentPrice;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.endRegistTime;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.f19379id;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isBiddingCurrent;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCancel;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isJoined;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l12 = this.khCongBoId;
        int hashCode11 = (hashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.khDauGiaId;
        int hashCode12 = (hashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str6 = this.kyHieuDiaPhuong;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.moniterName;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.payCount;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        List<? extends Object> list = this.prices;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.province;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.roundNumber;
        int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.seriDangKy;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sessionId;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.soThuTu;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l14 = this.startRegistTime;
        int hashCode22 = (hashCode21 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num3 = this.status;
        int hashCode23 = (hashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str12 = this.supervisorName;
        int hashCode24 = (hashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.userId;
        int hashCode25 = (hashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.userMobile;
        int hashCode26 = (hashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num4 = this.vehicleType;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.winByFirstJoin;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.winnerId;
        if (num6 != null) {
            i10 = num6.hashCode();
        }
        return hashCode28 + i10;
    }

    public final Boolean isBiddingCurrent() {
        return this.isBiddingCurrent;
    }

    public final Boolean isCancel() {
        return this.isCancel;
    }

    public final Boolean isJoined() {
        return this.isJoined;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBiddingCurrent(Boolean bool) {
        this.isBiddingCurrent = bool;
    }

    public final void setBiddingRoomId(String str) {
        this.biddingRoomId = str;
    }

    public final void setBksId(String str) {
        this.bksId = str;
    }

    public final void setCancel(Boolean bool) {
        this.isCancel = bool;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setCurrentPrice(Long l10) {
        this.currentPrice = l10;
    }

    public final void setEndRegistTime(Long l10) {
        this.endRegistTime = l10;
    }

    public final void setId(String str) {
        this.f19379id = str;
    }

    public final void setJoined(Boolean bool) {
        this.isJoined = bool;
    }

    public final void setKhCongBoId(Long l10) {
        this.khCongBoId = l10;
    }

    public final void setKhDauGiaId(Long l10) {
        this.khDauGiaId = l10;
    }

    public final void setKyHieuDiaPhuong(String str) {
        this.kyHieuDiaPhuong = str;
    }

    public final void setMoniterName(String str) {
        this.moniterName = str;
    }

    public final void setPayCount(Integer num) {
        this.payCount = num;
    }

    public final void setPrices(List<? extends Object> list) {
        this.prices = list;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final void setRoundNumber(Integer num) {
        this.roundNumber = num;
    }

    public final void setSeriDangKy(String str) {
        this.seriDangKy = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSoThuTu(String str) {
        this.soThuTu = str;
    }

    public final void setStartRegistTime(Long l10) {
        this.startRegistTime = l10;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setSupervisorName(String str) {
        this.supervisorName = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserMobile(String str) {
        this.userMobile = str;
    }

    public final void setVehicleType(Integer num) {
        this.vehicleType = num;
    }

    public final void setWinByFirstJoin(Integer num) {
        this.winByFirstJoin = num;
    }

    public final void setWinnerId(Integer num) {
        this.winnerId = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("RoomAuction(auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", biddingRoomId=");
        q10.append(this.biddingRoomId);
        q10.append(", bksId=");
        q10.append(this.bksId);
        q10.append(", channel=");
        q10.append(this.channel);
        q10.append(", currentPrice=");
        q10.append(this.currentPrice);
        q10.append(", endRegistTime=");
        q10.append(this.endRegistTime);
        q10.append(", id=");
        q10.append(this.f19379id);
        q10.append(", isBiddingCurrent=");
        q10.append(this.isBiddingCurrent);
        q10.append(", isCancel=");
        q10.append(this.isCancel);
        q10.append(", isJoined=");
        q10.append(this.isJoined);
        q10.append(", khCongBoId=");
        q10.append(this.khCongBoId);
        q10.append(", khDauGiaId=");
        q10.append(this.khDauGiaId);
        q10.append(", kyHieuDiaPhuong=");
        q10.append(this.kyHieuDiaPhuong);
        q10.append(", moniterName=");
        q10.append(this.moniterName);
        q10.append(", payCount=");
        q10.append(this.payCount);
        q10.append(", prices=");
        q10.append(this.prices);
        q10.append(", province=");
        q10.append(this.province);
        q10.append(", roundNumber=");
        q10.append(this.roundNumber);
        q10.append(", seriDangKy=");
        q10.append(this.seriDangKy);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", soThuTu=");
        q10.append(this.soThuTu);
        q10.append(", startRegistTime=");
        q10.append(this.startRegistTime);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", supervisorName=");
        q10.append(this.supervisorName);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", userMobile=");
        q10.append(this.userMobile);
        q10.append(", vehicleType=");
        q10.append(this.vehicleType);
        q10.append(", winByFirstJoin=");
        q10.append(this.winByFirstJoin);
        q10.append(", winnerId=");
        q10.append(this.winnerId);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoomAuction(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Long r35, java.lang.Long r36, java.lang.String r37, java.lang.Boolean r38, java.lang.Boolean r39, java.lang.Boolean r40, java.lang.Long r41, java.lang.Long r42, java.lang.String r43, java.lang.String r44, java.lang.Integer r45, java.util.List r46, java.lang.String r47, java.lang.Integer r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.Long r52, java.lang.Integer r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.Integer r57, java.lang.Integer r58, java.lang.Integer r59, int r60, sk.e r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r31
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r32
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r33
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r34
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r35
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r36
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r37
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r38
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r39
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r40
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r41
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r42
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r43
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r44
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r45
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r46
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r47
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r48
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r49
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r50
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r51
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r52
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r53
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r54
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r55
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r56
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r57
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r58
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x0112
            r0 = 0
            goto L_0x0114
        L_0x0112:
            r0 = r59
        L_0x0114:
            r31 = r30
            r32 = r1
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r6
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r42 = r12
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r2
            r47 = r16
            r48 = r17
            r49 = r18
            r50 = r19
            r51 = r20
            r52 = r21
            r53 = r22
            r54 = r23
            r55 = r24
            r56 = r25
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.RoomAuction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, sk.e):void");
    }
}

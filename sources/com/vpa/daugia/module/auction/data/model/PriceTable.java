package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import java.util.ArrayList;
import sk.e;
import sk.j;

/* compiled from: BiddingPriceTable.kt */
public final class PriceTable implements Serializable {
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
    private String f19378id;
    @b("isBiddingCurrent")
    private boolean isBiddingCurrent;
    @b("isCancel")
    private boolean isCancel;
    @b("isJoined")
    private boolean isJoined;
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
    private ArrayList<BiddingPrice> prices;
    @b("province")
    private String province;
    private int result;
    @b("roundNumber")
    private Integer roundNumber;
    private boolean selected;
    @b("seriDangKy")
    private String seriDangKy;
    @b("sessionId")
    private String sessionId;
    @b("soThuTu")
    private String soThuTu;
    private Long startAuction;
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
    private Long winnerId;

    public PriceTable() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, false, false, false, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (ArrayList) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Long) null, false, (Long) null, 0, -1, (e) null);
    }

    public PriceTable(String str, String str2, String str3, String str4, Long l10, Long l11, String str5, boolean z10, boolean z11, boolean z12, Long l12, Long l13, String str6, String str7, Integer num, ArrayList<BiddingPrice> arrayList, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Long l15, boolean z13, Long l16, int i10) {
        this.auctionCode = str;
        this.biddingRoomId = str2;
        this.bksId = str3;
        this.channel = str4;
        this.currentPrice = l10;
        this.endRegistTime = l11;
        this.f19378id = str5;
        this.isBiddingCurrent = z10;
        this.isCancel = z11;
        this.isJoined = z12;
        this.khCongBoId = l12;
        this.khDauGiaId = l13;
        this.kyHieuDiaPhuong = str6;
        this.moniterName = str7;
        this.payCount = num;
        this.prices = arrayList;
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
        this.winnerId = l15;
        this.selected = z13;
        this.startAuction = l16;
        this.result = i10;
    }

    public static /* synthetic */ PriceTable copy$default(PriceTable priceTable, String str, String str2, String str3, String str4, Long l10, Long l11, String str5, boolean z10, boolean z11, boolean z12, Long l12, Long l13, String str6, String str7, Integer num, ArrayList arrayList, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Long l15, boolean z13, Long l16, int i10, int i11, Object obj) {
        PriceTable priceTable2 = priceTable;
        int i12 = i11;
        return priceTable.copy((i12 & 1) != 0 ? priceTable2.auctionCode : str, (i12 & 2) != 0 ? priceTable2.biddingRoomId : str2, (i12 & 4) != 0 ? priceTable2.bksId : str3, (i12 & 8) != 0 ? priceTable2.channel : str4, (i12 & 16) != 0 ? priceTable2.currentPrice : l10, (i12 & 32) != 0 ? priceTable2.endRegistTime : l11, (i12 & 64) != 0 ? priceTable2.f19378id : str5, (i12 & 128) != 0 ? priceTable2.isBiddingCurrent : z10, (i12 & 256) != 0 ? priceTable2.isCancel : z11, (i12 & 512) != 0 ? priceTable2.isJoined : z12, (i12 & 1024) != 0 ? priceTable2.khCongBoId : l12, (i12 & 2048) != 0 ? priceTable2.khDauGiaId : l13, (i12 & 4096) != 0 ? priceTable2.kyHieuDiaPhuong : str6, (i12 & 8192) != 0 ? priceTable2.moniterName : str7, (i12 & 16384) != 0 ? priceTable2.payCount : num, (i12 & 32768) != 0 ? priceTable2.prices : arrayList, (i12 & 65536) != 0 ? priceTable2.province : str8, (i12 & 131072) != 0 ? priceTable2.roundNumber : num2, (i12 & 262144) != 0 ? priceTable2.seriDangKy : str9, (i12 & 524288) != 0 ? priceTable2.sessionId : str10, (i12 & 1048576) != 0 ? priceTable2.soThuTu : str11, (i12 & 2097152) != 0 ? priceTable2.startRegistTime : l14, (i12 & 4194304) != 0 ? priceTable2.status : num3, (i12 & 8388608) != 0 ? priceTable2.supervisorName : str12, (i12 & 16777216) != 0 ? priceTable2.userId : str13, (i12 & 33554432) != 0 ? priceTable2.userMobile : str14, (i12 & 67108864) != 0 ? priceTable2.vehicleType : num4, (i12 & 134217728) != 0 ? priceTable2.winByFirstJoin : num5, (i12 & 268435456) != 0 ? priceTable2.winnerId : l15, (i12 & 536870912) != 0 ? priceTable2.selected : z13, (i12 & 1073741824) != 0 ? priceTable2.startAuction : l16, (i12 & Integer.MIN_VALUE) != 0 ? priceTable2.result : i10);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final boolean component10() {
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

    public final ArrayList<BiddingPrice> component16() {
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

    public final Long component29() {
        return this.winnerId;
    }

    public final String component3() {
        return this.bksId;
    }

    public final boolean component30() {
        return this.selected;
    }

    public final Long component31() {
        return this.startAuction;
    }

    public final int component32() {
        return this.result;
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
        return this.f19378id;
    }

    public final boolean component8() {
        return this.isBiddingCurrent;
    }

    public final boolean component9() {
        return this.isCancel;
    }

    public final PriceTable copy(String str, String str2, String str3, String str4, Long l10, Long l11, String str5, boolean z10, boolean z11, boolean z12, Long l12, Long l13, String str6, String str7, Integer num, ArrayList<BiddingPrice> arrayList, String str8, Integer num2, String str9, String str10, String str11, Long l14, Integer num3, String str12, String str13, String str14, Integer num4, Integer num5, Long l15, boolean z13, Long l16, int i10) {
        return new PriceTable(str, str2, str3, str4, l10, l11, str5, z10, z11, z12, l12, l13, str6, str7, num, arrayList, str8, num2, str9, str10, str11, l14, num3, str12, str13, str14, num4, num5, l15, z13, l16, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceTable)) {
            return false;
        }
        PriceTable priceTable = (PriceTable) obj;
        return j.a(this.auctionCode, priceTable.auctionCode) && j.a(this.biddingRoomId, priceTable.biddingRoomId) && j.a(this.bksId, priceTable.bksId) && j.a(this.channel, priceTable.channel) && j.a(this.currentPrice, priceTable.currentPrice) && j.a(this.endRegistTime, priceTable.endRegistTime) && j.a(this.f19378id, priceTable.f19378id) && this.isBiddingCurrent == priceTable.isBiddingCurrent && this.isCancel == priceTable.isCancel && this.isJoined == priceTable.isJoined && j.a(this.khCongBoId, priceTable.khCongBoId) && j.a(this.khDauGiaId, priceTable.khDauGiaId) && j.a(this.kyHieuDiaPhuong, priceTable.kyHieuDiaPhuong) && j.a(this.moniterName, priceTable.moniterName) && j.a(this.payCount, priceTable.payCount) && j.a(this.prices, priceTable.prices) && j.a(this.province, priceTable.province) && j.a(this.roundNumber, priceTable.roundNumber) && j.a(this.seriDangKy, priceTable.seriDangKy) && j.a(this.sessionId, priceTable.sessionId) && j.a(this.soThuTu, priceTable.soThuTu) && j.a(this.startRegistTime, priceTable.startRegistTime) && j.a(this.status, priceTable.status) && j.a(this.supervisorName, priceTable.supervisorName) && j.a(this.userId, priceTable.userId) && j.a(this.userMobile, priceTable.userMobile) && j.a(this.vehicleType, priceTable.vehicleType) && j.a(this.winByFirstJoin, priceTable.winByFirstJoin) && j.a(this.winnerId, priceTable.winnerId) && this.selected == priceTable.selected && j.a(this.startAuction, priceTable.startAuction) && this.result == priceTable.result;
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
        return this.f19378id;
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

    public final ArrayList<BiddingPrice> getPrices() {
        return this.prices;
    }

    public final String getProvince() {
        return this.province;
    }

    public final int getResult() {
        return this.result;
    }

    public final Integer getRoundNumber() {
        return this.roundNumber;
    }

    public final boolean getSelected() {
        return this.selected;
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

    public final Long getStartAuction() {
        return this.startAuction;
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

    public final Long getWinnerId() {
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
        String str5 = this.f19378id;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z10 = this.isBiddingCurrent;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode7 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.isCancel;
        if (z12) {
            z12 = true;
        }
        int i12 = (i11 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.isJoined;
        if (z13) {
            z13 = true;
        }
        int i13 = (i12 + (z13 ? 1 : 0)) * 31;
        Long l12 = this.khCongBoId;
        int hashCode8 = (i13 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.khDauGiaId;
        int hashCode9 = (hashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str6 = this.kyHieuDiaPhuong;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.moniterName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.payCount;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList<BiddingPrice> arrayList = this.prices;
        int hashCode13 = (hashCode12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str8 = this.province;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.roundNumber;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.seriDangKy;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sessionId;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.soThuTu;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l14 = this.startRegistTime;
        int hashCode19 = (hashCode18 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num3 = this.status;
        int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str12 = this.supervisorName;
        int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.userId;
        int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.userMobile;
        int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num4 = this.vehicleType;
        int hashCode24 = (hashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.winByFirstJoin;
        int hashCode25 = (hashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l15 = this.winnerId;
        int hashCode26 = (hashCode25 + (l15 == null ? 0 : l15.hashCode())) * 31;
        boolean z14 = this.selected;
        if (!z14) {
            z11 = z14;
        }
        int i14 = (hashCode26 + (z11 ? 1 : 0)) * 31;
        Long l16 = this.startAuction;
        if (l16 != null) {
            i10 = l16.hashCode();
        }
        return ((i14 + i10) * 31) + this.result;
    }

    public final boolean isBiddingCurrent() {
        return this.isBiddingCurrent;
    }

    public final boolean isCancel() {
        return this.isCancel;
    }

    public final boolean isJoined() {
        return this.isJoined;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBiddingCurrent(boolean z10) {
        this.isBiddingCurrent = z10;
    }

    public final void setBiddingRoomId(String str) {
        this.biddingRoomId = str;
    }

    public final void setBksId(String str) {
        this.bksId = str;
    }

    public final void setCancel(boolean z10) {
        this.isCancel = z10;
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
        this.f19378id = str;
    }

    public final void setJoined(boolean z10) {
        this.isJoined = z10;
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

    public final void setPrices(ArrayList<BiddingPrice> arrayList) {
        this.prices = arrayList;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final void setResult(int i10) {
        this.result = i10;
    }

    public final void setRoundNumber(Integer num) {
        this.roundNumber = num;
    }

    public final void setSelected(boolean z10) {
        this.selected = z10;
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

    public final void setStartAuction(Long l10) {
        this.startAuction = l10;
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

    public final void setWinnerId(Long l10) {
        this.winnerId = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("PriceTable(auctionCode=");
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
        q10.append(this.f19378id);
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
        q10.append(", selected=");
        q10.append(this.selected);
        q10.append(", startAuction=");
        q10.append(this.startAuction);
        q10.append(", result=");
        q10.append(this.result);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PriceTable(java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.Long r38, java.lang.Long r39, java.lang.String r40, boolean r41, boolean r42, boolean r43, java.lang.Long r44, java.lang.Long r45, java.lang.String r46, java.lang.String r47, java.lang.Integer r48, java.util.ArrayList r49, java.lang.String r50, java.lang.Integer r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.Long r55, java.lang.Integer r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.Integer r60, java.lang.Integer r61, java.lang.Long r62, boolean r63, java.lang.Long r64, int r65, int r66, sk.e r67) {
        /*
            r33 = this;
            r0 = r66
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r34
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r35
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r36
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r37
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r38
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r39
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r40
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r41
        L_0x0042:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0048
            r11 = 0
            goto L_0x004a
        L_0x0048:
            r11 = r42
        L_0x004a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0050
            r12 = 0
            goto L_0x0052
        L_0x0050:
            r12 = r43
        L_0x0052:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0058
            r13 = 0
            goto L_0x005a
        L_0x0058:
            r13 = r44
        L_0x005a:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0060
            r14 = 0
            goto L_0x0062
        L_0x0060:
            r14 = r45
        L_0x0062:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0068
            r15 = 0
            goto L_0x006a
        L_0x0068:
            r15 = r46
        L_0x006a:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0072
        L_0x0070:
            r2 = r47
        L_0x0072:
            r10 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0078
            r10 = 0
            goto L_0x007a
        L_0x0078:
            r10 = r48
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0087
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            goto L_0x0089
        L_0x0087:
            r16 = r49
        L_0x0089:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0092
            r17 = 0
            goto L_0x0094
        L_0x0092:
            r17 = r50
        L_0x0094:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009d
            r18 = 0
            goto L_0x009f
        L_0x009d:
            r18 = r51
        L_0x009f:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a8
            r19 = 0
            goto L_0x00aa
        L_0x00a8:
            r19 = r52
        L_0x00aa:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b3
            r20 = 0
            goto L_0x00b5
        L_0x00b3:
            r20 = r53
        L_0x00b5:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00be
            r21 = 0
            goto L_0x00c0
        L_0x00be:
            r21 = r54
        L_0x00c0:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c9
            r22 = 0
            goto L_0x00cb
        L_0x00c9:
            r22 = r55
        L_0x00cb:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d4
            r23 = 0
            goto L_0x00d6
        L_0x00d4:
            r23 = r56
        L_0x00d6:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00df
            r24 = 0
            goto L_0x00e1
        L_0x00df:
            r24 = r57
        L_0x00e1:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00ea
            r25 = 0
            goto L_0x00ec
        L_0x00ea:
            r25 = r58
        L_0x00ec:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f5
            r26 = 0
            goto L_0x00f7
        L_0x00f5:
            r26 = r59
        L_0x00f7:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x0100
            r27 = 0
            goto L_0x0102
        L_0x0100:
            r27 = r60
        L_0x0102:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x010b
            r28 = 0
            goto L_0x010d
        L_0x010b:
            r28 = r61
        L_0x010d:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0116
            r29 = 0
            goto L_0x0118
        L_0x0116:
            r29 = r62
        L_0x0118:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0121
            r30 = 0
            goto L_0x0123
        L_0x0121:
            r30 = r63
        L_0x0123:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x012c
            r31 = 0
            goto L_0x012e
        L_0x012c:
            r31 = r64
        L_0x012e:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0136
            r0 = 0
            goto L_0x0138
        L_0x0136:
            r0 = r65
        L_0x0138:
            r34 = r33
            r35 = r1
            r36 = r3
            r37 = r4
            r38 = r5
            r39 = r6
            r40 = r7
            r41 = r8
            r42 = r9
            r43 = r11
            r44 = r12
            r45 = r13
            r46 = r14
            r47 = r15
            r48 = r2
            r49 = r10
            r50 = r16
            r51 = r17
            r52 = r18
            r53 = r19
            r54 = r20
            r55 = r21
            r56 = r22
            r57 = r23
            r58 = r24
            r59 = r25
            r60 = r26
            r61 = r27
            r62 = r28
            r63 = r29
            r64 = r30
            r65 = r31
            r66 = r0
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.PriceTable.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, boolean, boolean, boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.util.ArrayList, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, boolean, java.lang.Long, int, int, sk.e):void");
    }
}

package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import sk.e;
import sk.j;
import yk.l;

/* compiled from: BiddingRoomId.kt */
public final class BiddingRoomId {
    @b("auctionCode")
    private String auctionCode;
    @b("bksId")
    private Long bksId;
    @b("isCancel")
    private Object isCancel;
    @b("joinTime")
    private Long joinTime;
    @b("khCongBoId")
    private Long khCongBoId;
    @b("khDauGiaId")
    private Long khDauGiaId;
    @b("lastUpdate")
    private Long lastUpdate;
    @b("localSymbol")
    private String localSymbol;
    @b("numberOfSetPrice")
    private Integer numberOfSetPrice;
    @b("price")
    private Long price;
    @b("province")
    private Province province;
    private int result;
    @b("roomId")
    private String roomId;
    @b("seriDangKy")
    private String seriDangKy;
    @b("soThuTu")
    private String soThuTu;
    @b("totalAbsent")
    private Integer totalAbsent;
    @b("totalJoined")
    private Integer totalJoined;
    @b("totalRegistered")
    private Integer totalRegistered;
    @b("userId")
    private String userId;
    @b("userMobile")
    private String userMobile;
    @b("vehicleType")
    private VehicleType vehicleType;
    @b("winByFirstJoin")
    private Integer winByFirstJoin;

    public BiddingRoomId() {
        this((String) null, (Long) null, (Object) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Integer) null, (Long) null, (Province) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (VehicleType) null, (Integer) null, 0, 4194303, (e) null);
    }

    public BiddingRoomId(String str, Long l10, Object obj, Long l11, Long l12, Long l13, Long l14, String str2, Integer num, Long l15, Province province2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, String str7, VehicleType vehicleType2, Integer num5, int i10) {
        this.auctionCode = str;
        this.bksId = l10;
        this.isCancel = obj;
        this.joinTime = l11;
        this.khCongBoId = l12;
        this.khDauGiaId = l13;
        this.lastUpdate = l14;
        this.localSymbol = str2;
        this.numberOfSetPrice = num;
        this.price = l15;
        this.province = province2;
        this.roomId = str3;
        this.seriDangKy = str4;
        this.soThuTu = str5;
        this.totalAbsent = num2;
        this.totalJoined = num3;
        this.totalRegistered = num4;
        this.userId = str6;
        this.userMobile = str7;
        this.vehicleType = vehicleType2;
        this.winByFirstJoin = num5;
        this.result = i10;
    }

    public static /* synthetic */ BiddingRoomId copy$default(BiddingRoomId biddingRoomId, String str, Long l10, Object obj, Long l11, Long l12, Long l13, Long l14, String str2, Integer num, Long l15, Province province2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, String str7, VehicleType vehicleType2, Integer num5, int i10, int i11, Object obj2) {
        BiddingRoomId biddingRoomId2 = biddingRoomId;
        int i12 = i11;
        return biddingRoomId.copy((i12 & 1) != 0 ? biddingRoomId2.auctionCode : str, (i12 & 2) != 0 ? biddingRoomId2.bksId : l10, (i12 & 4) != 0 ? biddingRoomId2.isCancel : obj, (i12 & 8) != 0 ? biddingRoomId2.joinTime : l11, (i12 & 16) != 0 ? biddingRoomId2.khCongBoId : l12, (i12 & 32) != 0 ? biddingRoomId2.khDauGiaId : l13, (i12 & 64) != 0 ? biddingRoomId2.lastUpdate : l14, (i12 & 128) != 0 ? biddingRoomId2.localSymbol : str2, (i12 & 256) != 0 ? biddingRoomId2.numberOfSetPrice : num, (i12 & 512) != 0 ? biddingRoomId2.price : l15, (i12 & 1024) != 0 ? biddingRoomId2.province : province2, (i12 & 2048) != 0 ? biddingRoomId2.roomId : str3, (i12 & 4096) != 0 ? biddingRoomId2.seriDangKy : str4, (i12 & 8192) != 0 ? biddingRoomId2.soThuTu : str5, (i12 & 16384) != 0 ? biddingRoomId2.totalAbsent : num2, (i12 & 32768) != 0 ? biddingRoomId2.totalJoined : num3, (i12 & 65536) != 0 ? biddingRoomId2.totalRegistered : num4, (i12 & 131072) != 0 ? biddingRoomId2.userId : str6, (i12 & 262144) != 0 ? biddingRoomId2.userMobile : str7, (i12 & 524288) != 0 ? biddingRoomId2.vehicleType : vehicleType2, (i12 & 1048576) != 0 ? biddingRoomId2.winByFirstJoin : num5, (i12 & 2097152) != 0 ? biddingRoomId2.result : i10);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final Long component10() {
        return this.price;
    }

    public final Province component11() {
        return this.province;
    }

    public final String component12() {
        return this.roomId;
    }

    public final String component13() {
        return this.seriDangKy;
    }

    public final String component14() {
        return this.soThuTu;
    }

    public final Integer component15() {
        return this.totalAbsent;
    }

    public final Integer component16() {
        return this.totalJoined;
    }

    public final Integer component17() {
        return this.totalRegistered;
    }

    public final String component18() {
        return this.userId;
    }

    public final String component19() {
        return this.userMobile;
    }

    public final Long component2() {
        return this.bksId;
    }

    public final VehicleType component20() {
        return this.vehicleType;
    }

    public final Integer component21() {
        return this.winByFirstJoin;
    }

    public final int component22() {
        return this.result;
    }

    public final Object component3() {
        return this.isCancel;
    }

    public final Long component4() {
        return this.joinTime;
    }

    public final Long component5() {
        return this.khCongBoId;
    }

    public final Long component6() {
        return this.khDauGiaId;
    }

    public final Long component7() {
        return this.lastUpdate;
    }

    public final String component8() {
        return this.localSymbol;
    }

    public final Integer component9() {
        return this.numberOfSetPrice;
    }

    public final BiddingRoomId copy(String str, Long l10, Object obj, Long l11, Long l12, Long l13, Long l14, String str2, Integer num, Long l15, Province province2, String str3, String str4, String str5, Integer num2, Integer num3, Integer num4, String str6, String str7, VehicleType vehicleType2, Integer num5, int i10) {
        return new BiddingRoomId(str, l10, obj, l11, l12, l13, l14, str2, num, l15, province2, str3, str4, str5, num2, num3, num4, str6, str7, vehicleType2, num5, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiddingRoomId)) {
            return false;
        }
        BiddingRoomId biddingRoomId = (BiddingRoomId) obj;
        return j.a(this.auctionCode, biddingRoomId.auctionCode) && j.a(this.bksId, biddingRoomId.bksId) && j.a(this.isCancel, biddingRoomId.isCancel) && j.a(this.joinTime, biddingRoomId.joinTime) && j.a(this.khCongBoId, biddingRoomId.khCongBoId) && j.a(this.khDauGiaId, biddingRoomId.khDauGiaId) && j.a(this.lastUpdate, biddingRoomId.lastUpdate) && j.a(this.localSymbol, biddingRoomId.localSymbol) && j.a(this.numberOfSetPrice, biddingRoomId.numberOfSetPrice) && j.a(this.price, biddingRoomId.price) && j.a(this.province, biddingRoomId.province) && j.a(this.roomId, biddingRoomId.roomId) && j.a(this.seriDangKy, biddingRoomId.seriDangKy) && j.a(this.soThuTu, biddingRoomId.soThuTu) && j.a(this.totalAbsent, biddingRoomId.totalAbsent) && j.a(this.totalJoined, biddingRoomId.totalJoined) && j.a(this.totalRegistered, biddingRoomId.totalRegistered) && j.a(this.userId, biddingRoomId.userId) && j.a(this.userMobile, biddingRoomId.userMobile) && j.a(this.vehicleType, biddingRoomId.vehicleType) && j.a(this.winByFirstJoin, biddingRoomId.winByFirstJoin) && this.result == biddingRoomId.result;
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final Long getBksId() {
        return this.bksId;
    }

    public final Long getJoinTime() {
        return this.joinTime;
    }

    public final Long getKhCongBoId() {
        return this.khCongBoId;
    }

    public final Long getKhDauGiaId() {
        return this.khDauGiaId;
    }

    public final Long getLastUpdate() {
        return this.lastUpdate;
    }

    public final String getLocalSymbol() {
        return this.localSymbol;
    }

    public final String getMaxPrice() {
        Long l10 = this.price;
        if (l10 == null) {
            return null;
        }
        return b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), l10.longValue(), new StringBuilder(), " đ");
    }

    public final String getMaxPriceWord() {
        long j10;
        String str;
        String str2;
        StringBuilder q10 = a.q("Bằng chữ: ");
        Long l10 = this.price;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        if (j10 == 0) {
            str = j7.a.E[0];
        } else {
            String str3 = "";
            long j11 = j10;
            String str4 = str3;
            while (true) {
                long j12 = (long) 1000000000;
                int i10 = (int) (j11 % j12);
                j11 /= j12;
                int i11 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i11 > 0) {
                    str2 = j7.a.p0(i10, true) + str3 + str4;
                } else {
                    str2 = j7.a.p0(i10, false) + str3 + str4;
                }
                str4 = str2;
                if (i11 <= 0) {
                    break;
                }
                str3 = " tỷ";
            }
            str = l.k1(str4).toString() + ' ' + "đồng";
        }
        q10.append(str);
        return q10.toString();
    }

    public final Integer getNumberOfSetPrice() {
        return this.numberOfSetPrice;
    }

    public final String getPlate() {
        CharSequence charSequence;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.localSymbol);
        sb2.append(this.seriDangKy);
        sb2.append(10);
        String str = this.soThuTu;
        CharSequence charSequence2 = null;
        if (str != null) {
            charSequence = str.subSequence(0, 3);
        } else {
            charSequence = null;
        }
        sb2.append(charSequence);
        sb2.append('.');
        String str2 = this.soThuTu;
        if (str2 != null) {
            charSequence2 = str2.subSequence(3, 5);
        }
        sb2.append(charSequence2);
        return sb2.toString();
    }

    public final String getPlateDash() {
        CharSequence charSequence;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.localSymbol);
        sb2.append(this.seriDangKy);
        sb2.append(" - ");
        String str = this.soThuTu;
        CharSequence charSequence2 = null;
        if (str != null) {
            charSequence = str.subSequence(0, 3);
        } else {
            charSequence = null;
        }
        sb2.append(charSequence);
        sb2.append('.');
        String str2 = this.soThuTu;
        if (str2 != null) {
            charSequence2 = str2.subSequence(3, 5);
        }
        sb2.append(charSequence2);
        return sb2.toString();
    }

    public final Long getPrice() {
        return this.price;
    }

    public final Province getProvince() {
        return this.province;
    }

    public final int getResult() {
        return this.result;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSeriDangKy() {
        return this.seriDangKy;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public final Integer getTotalAbsent() {
        return this.totalAbsent;
    }

    public final Integer getTotalJoined() {
        return this.totalJoined;
    }

    public final Integer getTotalRegistered() {
        return this.totalRegistered;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserMobile() {
        return this.userMobile;
    }

    public final VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public final Integer getWinByFirstJoin() {
        return this.winByFirstJoin;
    }

    public int hashCode() {
        String str = this.auctionCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.bksId;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Object obj = this.isCancel;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l11 = this.joinTime;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.khCongBoId;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.khDauGiaId;
        int hashCode6 = (hashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.lastUpdate;
        int hashCode7 = (hashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.localSymbol;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.numberOfSetPrice;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l15 = this.price;
        int hashCode10 = (hashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Province province2 = this.province;
        int hashCode11 = (hashCode10 + (province2 == null ? 0 : province2.hashCode())) * 31;
        String str3 = this.roomId;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.seriDangKy;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.soThuTu;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.totalAbsent;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalJoined;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalRegistered;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.userId;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userMobile;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        VehicleType vehicleType2 = this.vehicleType;
        int hashCode20 = (hashCode19 + (vehicleType2 == null ? 0 : vehicleType2.hashCode())) * 31;
        Integer num5 = this.winByFirstJoin;
        if (num5 != null) {
            i10 = num5.hashCode();
        }
        return ((hashCode20 + i10) * 31) + this.result;
    }

    public final Object isCancel() {
        return this.isCancel;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBksId(Long l10) {
        this.bksId = l10;
    }

    public final void setCancel(Object obj) {
        this.isCancel = obj;
    }

    public final void setJoinTime(Long l10) {
        this.joinTime = l10;
    }

    public final void setKhCongBoId(Long l10) {
        this.khCongBoId = l10;
    }

    public final void setKhDauGiaId(Long l10) {
        this.khDauGiaId = l10;
    }

    public final void setLastUpdate(Long l10) {
        this.lastUpdate = l10;
    }

    public final void setLocalSymbol(String str) {
        this.localSymbol = str;
    }

    public final void setNumberOfSetPrice(Integer num) {
        this.numberOfSetPrice = num;
    }

    public final void setPrice(Long l10) {
        this.price = l10;
    }

    public final void setProvince(Province province2) {
        this.province = province2;
    }

    public final void setResult(int i10) {
        this.result = i10;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSeriDangKy(String str) {
        this.seriDangKy = str;
    }

    public final void setSoThuTu(String str) {
        this.soThuTu = str;
    }

    public final void setTotalAbsent(Integer num) {
        this.totalAbsent = num;
    }

    public final void setTotalJoined(Integer num) {
        this.totalJoined = num;
    }

    public final void setTotalRegistered(Integer num) {
        this.totalRegistered = num;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserMobile(String str) {
        this.userMobile = str;
    }

    public final void setVehicleType(VehicleType vehicleType2) {
        this.vehicleType = vehicleType2;
    }

    public final void setWinByFirstJoin(Integer num) {
        this.winByFirstJoin = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("BiddingRoomId(auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", bksId=");
        q10.append(this.bksId);
        q10.append(", isCancel=");
        q10.append(this.isCancel);
        q10.append(", joinTime=");
        q10.append(this.joinTime);
        q10.append(", khCongBoId=");
        q10.append(this.khCongBoId);
        q10.append(", khDauGiaId=");
        q10.append(this.khDauGiaId);
        q10.append(", lastUpdate=");
        q10.append(this.lastUpdate);
        q10.append(", localSymbol=");
        q10.append(this.localSymbol);
        q10.append(", numberOfSetPrice=");
        q10.append(this.numberOfSetPrice);
        q10.append(", price=");
        q10.append(this.price);
        q10.append(", province=");
        q10.append(this.province);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", seriDangKy=");
        q10.append(this.seriDangKy);
        q10.append(", soThuTu=");
        q10.append(this.soThuTu);
        q10.append(", totalAbsent=");
        q10.append(this.totalAbsent);
        q10.append(", totalJoined=");
        q10.append(this.totalJoined);
        q10.append(", totalRegistered=");
        q10.append(this.totalRegistered);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", userMobile=");
        q10.append(this.userMobile);
        q10.append(", vehicleType=");
        q10.append(this.vehicleType);
        q10.append(", winByFirstJoin=");
        q10.append(this.winByFirstJoin);
        q10.append(", result=");
        q10.append(this.result);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BiddingRoomId(java.lang.String r24, java.lang.Long r25, java.lang.Object r26, java.lang.Long r27, java.lang.Long r28, java.lang.Long r29, java.lang.Long r30, java.lang.String r31, java.lang.Integer r32, java.lang.Long r33, com.vpa.daugia.module.auction.data.model.sse.Province r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.Integer r38, java.lang.Integer r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, com.vpa.daugia.module.auction.data.model.sse.VehicleType r43, java.lang.Integer r44, int r45, int r46, sk.e r47) {
        /*
            r23 = this;
            r0 = r46
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r24
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r25
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r26
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r27
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r28
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r29
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r30
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r31
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r32
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r33
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r34
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r35
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r36
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r37
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r38
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r39
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r40
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r41
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r42
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r43
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r44
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00c5
            r0 = 0
            goto L_0x00c7
        L_0x00c5:
            r0 = r45
        L_0x00c7:
            r24 = r23
            r25 = r1
            r26 = r3
            r27 = r4
            r28 = r5
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r37 = r14
            r38 = r15
            r39 = r2
            r40 = r16
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r20
            r45 = r21
            r46 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId.<init>(java.lang.String, java.lang.Long, java.lang.Object, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, com.vpa.daugia.module.auction.data.model.sse.Province, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, com.vpa.daugia.module.auction.data.model.sse.VehicleType, java.lang.Integer, int, int, sk.e):void");
    }
}

package com.vpa.daugia.module.home.data.api.response;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: AnnouncementPlanResponse.kt */
public final class Plate implements Serializable {
    @b("auctionDate")
    private final String auctionDate;
    @b("bks")
    private final String bks;
    @b("bksId")
    private final String bksId;
    @b("interested")
    private final Boolean interested;
    @b("provinceName")
    private final String provinceName;
    @b("receiveCount")
    private final Integer receiveCount;
    @b("registered")
    private final boolean registered;
    @b("timeEndRegister")
    private final Long timeEndRegister;
    @b("totalInterested")
    private final Integer totalInterested;
    @b("vehicleType")
    private final String vehicleType;

    public Plate(String str, String str2, Boolean bool, String str3, Integer num, boolean z10, Integer num2, String str4, String str5, Long l10) {
        this.bks = str;
        this.bksId = str2;
        this.interested = bool;
        this.provinceName = str3;
        this.receiveCount = num;
        this.registered = z10;
        this.totalInterested = num2;
        this.vehicleType = str4;
        this.auctionDate = str5;
        this.timeEndRegister = l10;
    }

    public static /* synthetic */ Plate copy$default(Plate plate, String str, String str2, Boolean bool, String str3, Integer num, boolean z10, Integer num2, String str4, String str5, Long l10, int i10, Object obj) {
        Plate plate2 = plate;
        int i11 = i10;
        return plate.copy((i11 & 1) != 0 ? plate2.bks : str, (i11 & 2) != 0 ? plate2.bksId : str2, (i11 & 4) != 0 ? plate2.interested : bool, (i11 & 8) != 0 ? plate2.provinceName : str3, (i11 & 16) != 0 ? plate2.receiveCount : num, (i11 & 32) != 0 ? plate2.registered : z10, (i11 & 64) != 0 ? plate2.totalInterested : num2, (i11 & 128) != 0 ? plate2.vehicleType : str4, (i11 & 256) != 0 ? plate2.auctionDate : str5, (i11 & 512) != 0 ? plate2.timeEndRegister : l10);
    }

    public final String component1() {
        return this.bks;
    }

    public final Long component10() {
        return this.timeEndRegister;
    }

    public final String component2() {
        return this.bksId;
    }

    public final Boolean component3() {
        return this.interested;
    }

    public final String component4() {
        return this.provinceName;
    }

    public final Integer component5() {
        return this.receiveCount;
    }

    public final boolean component6() {
        return this.registered;
    }

    public final Integer component7() {
        return this.totalInterested;
    }

    public final String component8() {
        return this.vehicleType;
    }

    public final String component9() {
        return this.auctionDate;
    }

    public final Plate copy(String str, String str2, Boolean bool, String str3, Integer num, boolean z10, Integer num2, String str4, String str5, Long l10) {
        return new Plate(str, str2, bool, str3, num, z10, num2, str4, str5, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Plate)) {
            return false;
        }
        Plate plate = (Plate) obj;
        return j.a(this.bks, plate.bks) && j.a(this.bksId, plate.bksId) && j.a(this.interested, plate.interested) && j.a(this.provinceName, plate.provinceName) && j.a(this.receiveCount, plate.receiveCount) && this.registered == plate.registered && j.a(this.totalInterested, plate.totalInterested) && j.a(this.vehicleType, plate.vehicleType) && j.a(this.auctionDate, plate.auctionDate) && j.a(this.timeEndRegister, plate.timeEndRegister);
    }

    public final String getAuctionDate() {
        return this.auctionDate;
    }

    public final String getBks() {
        return this.bks;
    }

    public final String getBksId() {
        return this.bksId;
    }

    public final Boolean getInterested() {
        return this.interested;
    }

    public final String getProvinceName() {
        return this.provinceName;
    }

    public final Integer getReceiveCount() {
        return this.receiveCount;
    }

    public final boolean getRegistered() {
        return this.registered;
    }

    public final Long getTimeEndRegister() {
        return this.timeEndRegister;
    }

    public final Integer getTotalInterested() {
        return this.totalInterested;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public int hashCode() {
        String str = this.bks;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bksId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.interested;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.provinceName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.receiveCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.registered;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode5 + (z10 ? 1 : 0)) * 31;
        Integer num2 = this.totalInterested;
        int hashCode6 = (i11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.vehicleType;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.auctionDate;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l10 = this.timeEndRegister;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("Plate(bks=");
        q10.append(this.bks);
        q10.append(", bksId=");
        q10.append(this.bksId);
        q10.append(", interested=");
        q10.append(this.interested);
        q10.append(", provinceName=");
        q10.append(this.provinceName);
        q10.append(", receiveCount=");
        q10.append(this.receiveCount);
        q10.append(", registered=");
        q10.append(this.registered);
        q10.append(", totalInterested=");
        q10.append(this.totalInterested);
        q10.append(", vehicleType=");
        q10.append(this.vehicleType);
        q10.append(", auctionDate=");
        q10.append(this.auctionDate);
        q10.append(", timeEndRegister=");
        q10.append(this.timeEndRegister);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Plate(String str, String str2, Boolean bool, String str3, Integer num, boolean z10, Integer num2, String str4, String str5, Long l10, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? 0 : num, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? 0 : num2, str4, str5, l10);
    }
}

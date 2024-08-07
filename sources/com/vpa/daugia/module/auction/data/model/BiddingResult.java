package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: BiddingResult.kt */
public final class BiddingResult implements Serializable {
    @b("biddingRoom")
    private String biddingRoom;
    @b("result")
    private Integer result;
    @b("soThuTu")
    private String soThuTu;

    public BiddingResult() {
        this((String) null, (Integer) null, (String) null, 7, (e) null);
    }

    public BiddingResult(String str, Integer num, String str2) {
        this.biddingRoom = str;
        this.result = num;
        this.soThuTu = str2;
    }

    public static /* synthetic */ BiddingResult copy$default(BiddingResult biddingResult, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = biddingResult.biddingRoom;
        }
        if ((i10 & 2) != 0) {
            num = biddingResult.result;
        }
        if ((i10 & 4) != 0) {
            str2 = biddingResult.soThuTu;
        }
        return biddingResult.copy(str, num, str2);
    }

    public final String component1() {
        return this.biddingRoom;
    }

    public final Integer component2() {
        return this.result;
    }

    public final String component3() {
        return this.soThuTu;
    }

    public final BiddingResult copy(String str, Integer num, String str2) {
        return new BiddingResult(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiddingResult)) {
            return false;
        }
        BiddingResult biddingResult = (BiddingResult) obj;
        return j.a(this.biddingRoom, biddingResult.biddingRoom) && j.a(this.result, biddingResult.result) && j.a(this.soThuTu, biddingResult.soThuTu);
    }

    public final String getBiddingRoom() {
        return this.biddingRoom;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public int hashCode() {
        String str = this.biddingRoom;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.result;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.soThuTu;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setBiddingRoom(String str) {
        this.biddingRoom = str;
    }

    public final void setResult(Integer num) {
        this.result = num;
    }

    public final void setSoThuTu(String str) {
        this.soThuTu = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("BiddingResult(biddingRoom=");
        q10.append(this.biddingRoom);
        q10.append(", result=");
        q10.append(this.result);
        q10.append(", soThuTu=");
        return l.k(q10, this.soThuTu, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiddingResult(String str, Integer num, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2);
    }
}

package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import n0.l;
import okhttp3.MultipartBody;
import sk.j;

/* compiled from: EkycRequest.kt */
public final class EkycRequest {
    private final MultipartBody.Part backImage;
    private final MultipartBody.Part frontImage;
    private final String userId;

    public EkycRequest(MultipartBody.Part part, MultipartBody.Part part2, String str) {
        j.f(part, "frontImage");
        j.f(part2, "backImage");
        this.frontImage = part;
        this.backImage = part2;
        this.userId = str;
    }

    public static /* synthetic */ EkycRequest copy$default(EkycRequest ekycRequest, MultipartBody.Part part, MultipartBody.Part part2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            part = ekycRequest.frontImage;
        }
        if ((i10 & 2) != 0) {
            part2 = ekycRequest.backImage;
        }
        if ((i10 & 4) != 0) {
            str = ekycRequest.userId;
        }
        return ekycRequest.copy(part, part2, str);
    }

    public final MultipartBody.Part component1() {
        return this.frontImage;
    }

    public final MultipartBody.Part component2() {
        return this.backImage;
    }

    public final String component3() {
        return this.userId;
    }

    public final EkycRequest copy(MultipartBody.Part part, MultipartBody.Part part2, String str) {
        j.f(part, "frontImage");
        j.f(part2, "backImage");
        return new EkycRequest(part, part2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EkycRequest)) {
            return false;
        }
        EkycRequest ekycRequest = (EkycRequest) obj;
        return j.a(this.frontImage, ekycRequest.frontImage) && j.a(this.backImage, ekycRequest.backImage) && j.a(this.userId, ekycRequest.userId);
    }

    public final MultipartBody.Part getBackImage() {
        return this.backImage;
    }

    public final MultipartBody.Part getFrontImage() {
        return this.frontImage;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = (this.backImage.hashCode() + (this.frontImage.hashCode() * 31)) * 31;
        String str = this.userId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder q10 = a.q("EkycRequest(frontImage=");
        q10.append(this.frontImage);
        q10.append(", backImage=");
        q10.append(this.backImage);
        q10.append(", userId=");
        return l.k(q10, this.userId, ')');
    }
}

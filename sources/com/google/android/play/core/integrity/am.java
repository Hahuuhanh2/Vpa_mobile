package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class am extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f7215a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7216b;

    public final IntegrityTokenRequest build() {
        String str = this.f7215a;
        if (str != null) {
            return new ao(str, this.f7216b, (Object) null, (an) null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f7216b = Long.valueOf(j10);
        return this;
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f7215a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}

package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private long f7286a;

    /* renamed from: b  reason: collision with root package name */
    private byte f7287b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f7287b = (byte) (this.f7287b | 2);
        return this;
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f7287b == 3) {
            return new e(this.f7286a, 0, (d) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7287b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f7287b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f7286a = j10;
        this.f7287b = (byte) (this.f7287b | 1);
        return this;
    }
}

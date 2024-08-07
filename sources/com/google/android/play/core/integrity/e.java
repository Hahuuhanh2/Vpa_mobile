package com.google.android.play.core.integrity;

import android.support.v4.media.a;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final long f7288a;

    public /* synthetic */ e(long j10, int i10, d dVar) {
        this.f7288a = j10;
    }

    public final int a() {
        return 0;
    }

    public final long b() {
        return this.f7288a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f7288a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7288a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        StringBuilder q10 = a.q("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        q10.append(this.f7288a);
        q10.append(", webViewRequestMode=0}");
        return q10.toString();
    }
}

package com.google.android.play.core.integrity;

import android.support.v4.media.a;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f7290a;

    public /* synthetic */ h(String str, g gVar) {
        this.f7290a = str;
    }

    public final String a() {
        return this.f7290a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f7290a;
        if (str != null) {
            return str.equals(standardIntegrityTokenRequest.a());
        }
        if (standardIntegrityTokenRequest.a() != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        String str = this.f7290a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return i10 ^ 1000003;
    }

    public final String toString() {
        return a.o(a.q("StandardIntegrityTokenRequest{requestHash="), this.f7290a, "}");
    }
}

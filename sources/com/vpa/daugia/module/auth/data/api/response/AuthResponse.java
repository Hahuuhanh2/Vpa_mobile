package com.vpa.daugia.module.auth.data.api.response;

import android.support.v4.media.a;
import cc.b;
import com.vpa.daugia.module.auth.data.model.Auth;
import sk.e;
import sk.j;

/* compiled from: AuthResponse.kt */
public final class AuthResponse {
    @b("value")
    private final Auth result;

    public AuthResponse() {
        this((Auth) null, 1, (e) null);
    }

    public AuthResponse(Auth auth) {
        this.result = auth;
    }

    public static /* synthetic */ AuthResponse copy$default(AuthResponse authResponse, Auth auth, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            auth = authResponse.result;
        }
        return authResponse.copy(auth);
    }

    public final Auth component1() {
        return this.result;
    }

    public final AuthResponse copy(Auth auth) {
        return new AuthResponse(auth);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthResponse) && j.a(this.result, ((AuthResponse) obj).result);
    }

    public final Auth getResult() {
        return this.result;
    }

    public int hashCode() {
        Auth auth = this.result;
        if (auth == null) {
            return 0;
        }
        return auth.hashCode();
    }

    public String toString() {
        StringBuilder q10 = a.q("AuthResponse(result=");
        q10.append(this.result);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthResponse(Auth auth, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : auth);
    }
}

package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import y6.i;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    @VisibleForTesting
    public Object e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : a().values()) {
            if (f(next)) {
                if (!fastJsonResponse.f(next) || !i.a(d(next), fastJsonResponse.d(next))) {
                    return false;
                }
            } else if (fastJsonResponse.f(next)) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public boolean g() {
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (FastJsonResponse.Field next : a().values()) {
            if (f(next)) {
                Object d10 = d(next);
                j.f(d10);
                i10 = (i10 * 31) + d10.hashCode();
            }
        }
        return i10;
    }
}

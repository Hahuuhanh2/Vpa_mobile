package androidx.media;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import v1.b;

/* compiled from: MediaSessionManagerImplApi28 */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionManager$RemoteUserInfo f2903a;

    public p(String str, int i10, int i11) {
        this.f2903a = new MediaSessionManager$RemoteUserInfo(str, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f2903a.equals(((p) obj).f2903a);
    }

    public final int hashCode() {
        return b.b(this.f2903a);
    }
}

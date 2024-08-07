package q0;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import q0.c;
import r2.l;

/* compiled from: AutoValue_LifecycleCameraRepository_Key */
public final class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final l f14263a;

    /* renamed from: b  reason: collision with root package name */
    public final CameraUseCaseAdapter.a f14264b;

    public a(l lVar, CameraUseCaseAdapter.a aVar) {
        if (lVar != null) {
            this.f14263a = lVar;
            if (aVar != null) {
                this.f14264b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final CameraUseCaseAdapter.a a() {
        return this.f14264b;
    }

    public final l b() {
        return this.f14263a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        if (!this.f14263a.equals(aVar.b()) || !this.f14264b.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14263a.hashCode() ^ 1000003) * 1000003) ^ this.f14264b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Key{lifecycleOwner=");
        q10.append(this.f14263a);
        q10.append(", cameraId=");
        q10.append(this.f14264b);
        q10.append("}");
        return q10.toString();
    }
}

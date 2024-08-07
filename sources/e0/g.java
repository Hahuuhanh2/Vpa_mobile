package e0;

import android.support.v4.media.a;
import androidx.camera.core.d;
import e0.v;

/* compiled from: AutoValue_ProcessingNode_InputPacket */
public final class g extends v.b {

    /* renamed from: a  reason: collision with root package name */
    public final w f9001a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9002b;

    public g(w wVar, d dVar) {
        if (wVar != null) {
            this.f9001a = wVar;
            if (dVar != null) {
                this.f9002b = dVar;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    public final d a() {
        return this.f9002b;
    }

    public final w b() {
        return this.f9001a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        if (!this.f9001a.equals(bVar.b()) || !this.f9002b.equals(bVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f9001a.hashCode() ^ 1000003) * 1000003) ^ this.f9002b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("InputPacket{processingRequest=");
        q10.append(this.f9001a);
        q10.append(", imageProxy=");
        q10.append(this.f9002b);
        q10.append("}");
        return q10.toString();
    }
}

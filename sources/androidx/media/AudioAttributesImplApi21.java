package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.support.v4.media.a;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2844a;

    /* renamed from: b  reason: collision with root package name */
    public int f2845b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2844a.equals(((AudioAttributesImplApi21) obj).f2844a);
    }

    public final int hashCode() {
        return this.f2844a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("AudioAttributesCompat: audioattributes=");
        q10.append(this.f2844a);
        return q10.toString();
    }
}

package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Object obj = audioAttributesImplApi21.f2844a;
        if (versionedParcel.h(1)) {
            obj = versionedParcel.k();
        }
        audioAttributesImplApi21.f2844a = (AudioAttributes) obj;
        audioAttributesImplApi21.f2845b = versionedParcel.j(audioAttributesImplApi21.f2845b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2844a;
        versionedParcel.n(1);
        versionedParcel.t(audioAttributes);
        versionedParcel.s(audioAttributesImplApi21.f2845b, 2);
    }
}

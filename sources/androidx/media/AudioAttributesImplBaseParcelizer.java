package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2846a = versionedParcel.j(audioAttributesImplBase.f2846a, 1);
        audioAttributesImplBase.f2847b = versionedParcel.j(audioAttributesImplBase.f2847b, 2);
        audioAttributesImplBase.f2848c = versionedParcel.j(audioAttributesImplBase.f2848c, 3);
        audioAttributesImplBase.f2849d = versionedParcel.j(audioAttributesImplBase.f2849d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.s(audioAttributesImplBase.f2846a, 1);
        versionedParcel.s(audioAttributesImplBase.f2847b, 2);
        versionedParcel.s(audioAttributesImplBase.f2848c, 3);
        versionedParcel.s(audioAttributesImplBase.f2849d, 4);
    }
}

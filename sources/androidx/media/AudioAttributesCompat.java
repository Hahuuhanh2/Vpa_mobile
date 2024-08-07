package androidx.media;

import android.util.SparseIntArray;
import k3.b;

public class AudioAttributesCompat implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2842b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f2843a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2843a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f2843a);
        }
        if (audioAttributesCompat.f2843a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2843a.hashCode();
    }

    public final String toString() {
        return this.f2843a.toString();
    }
}

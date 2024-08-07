package s1;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f14599a;

    public m(Object obj) {
        this.f14599a = (LocaleList) obj;
    }

    public final String a() {
        return this.f14599a.toLanguageTags();
    }

    public final Object b() {
        return this.f14599a;
    }

    public final boolean equals(Object obj) {
        return this.f14599a.equals(((l) obj).b());
    }

    public final Locale get(int i10) {
        return this.f14599a.get(i10);
    }

    public final int hashCode() {
        return this.f14599a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f14599a.isEmpty();
    }

    public final int size() {
        return this.f14599a.size();
    }

    public final String toString() {
        return this.f14599a.toString();
    }
}

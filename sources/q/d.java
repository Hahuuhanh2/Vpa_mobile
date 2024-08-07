package q;

import java.util.Arrays;

/* compiled from: BiometricErrorData */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f14178a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f14179b;

    public d(int i10, CharSequence charSequence) {
        this.f14178a = i10;
        this.f14179b = charSequence;
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z10;
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14178a != dVar.f14178a) {
            return false;
        }
        CharSequence charSequence = dVar.f14179b;
        CharSequence charSequence2 = this.f14179b;
        String str2 = null;
        if (charSequence2 != null) {
            str = charSequence2.toString();
        } else {
            str = null;
        }
        if (charSequence != null) {
            str2 = charSequence.toString();
        }
        if (!(str == null && str2 == null) && (str == null || !str.equals(str2))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f14178a);
        CharSequence charSequence = this.f14179b;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        objArr[1] = str;
        return Arrays.hashCode(objArr);
    }
}

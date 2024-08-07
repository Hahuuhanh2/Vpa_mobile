package yk;

import fk.x;
import java.util.Collection;
import java.util.Iterator;
import p3.l0;
import sk.j;

/* compiled from: StringsJVM.kt */
public class h extends g {
    public static boolean F0(String str, String str2) {
        j.f(str, "<this>");
        j.f(str2, "suffix");
        return str.endsWith(str2);
    }

    public static final boolean G0(String str, String str2) {
        if (str != null) {
            return str.equalsIgnoreCase(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static final boolean H0(CharSequence charSequence) {
        boolean z10;
        j.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            vk.h hVar = new vk.h(0, charSequence.length() - 1);
            if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
                Iterator it = hVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!l0.i0(charSequence.charAt(((x) it).nextInt()))) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean I0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        j.f(str, "<this>");
        j.f(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String J0(String str, String str2, String str3) {
        j.f(str, "<this>");
        int P0 = l.P0(0, str, str2, false);
        if (P0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = 1;
        if (length >= 1) {
            i10 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i11 = 0;
            do {
                sb2.append(str, i11, P0);
                sb2.append(str3);
                i11 = P0 + length;
                if (P0 >= str.length() || (P0 = l.P0(P0 + i10, str, str2, false)) <= 0) {
                    sb2.append(str, i11, str.length());
                    String sb3 = sb2.toString();
                    j.e(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i11, P0);
                sb2.append(str3);
                i11 = P0 + length;
                break;
            } while ((P0 = l.P0(P0 + i10, str, str2, false)) <= 0);
            sb2.append(str, i11, str.length());
            String sb32 = sb2.toString();
            j.e(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean K0(int i10, String str, String str2, boolean z10) {
        j.f(str, "<this>");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return I0(i10, 0, str2.length(), str, str2, z10);
    }

    public static final boolean L0(String str, String str2, boolean z10) {
        j.f(str, "<this>");
        j.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return I0(0, 0, str2.length(), str, str2, z10);
    }
}

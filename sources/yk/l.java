package yk;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.l0;
import sk.j;
import v.v;
import vk.f;
import vk.g;
import vk.h;
import xk.m;

/* compiled from: Strings.kt */
public class l extends h {
    public static boolean N0(CharSequence charSequence, String str) {
        j.f(charSequence, "<this>");
        j.f(str, "other");
        if (S0(charSequence, str, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int O0(CharSequence charSequence) {
        j.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P0(int i10, CharSequence charSequence, String str, boolean z10) {
        j.f(charSequence, "<this>");
        j.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return Q0(charSequence, str, i10, charSequence.length(), z10, false);
    }

    public static final int Q0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        f fVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            fVar = new h(i10, i11);
        } else {
            int O0 = O0(charSequence);
            if (i10 > O0) {
                i10 = O0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            fVar = new f(i10, i11, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i12 = fVar.f23335a;
            int i13 = fVar.f23336b;
            int i14 = fVar.f23337c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!a1(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        return i12;
                    }
                }
            }
        } else {
            int i15 = fVar.f23335a;
            int i16 = fVar.f23336b;
            int i17 = fVar.f23337c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (!h.I0(0, i15, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                        if (i15 == i16) {
                            break;
                        }
                        i15 += i17;
                    } else {
                        return i15;
                    }
                }
            }
        }
        return -1;
    }

    public static int R0(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        j.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return T0(i10, charSequence, z10, new char[]{c10});
    }

    public static /* synthetic */ int S0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return P0(i10, charSequence, str, z10);
    }

    public static final int T0(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        boolean z11;
        j.f(charSequence, "<this>");
        j.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i10 < 0) {
                i10 = 0;
            }
            g m10 = new h(i10, O0(charSequence)).iterator();
            while (m10.f23340c) {
                int nextInt = m10.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        continue;
                        break;
                    } else if (l0.L(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(fk.h.v0(cArr), i10);
    }

    public static int U0(CharSequence charSequence, char c10, int i10, int i11) {
        boolean z10;
        if ((i11 & 2) != 0) {
            i10 = O0(charSequence);
        }
        j.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(fk.h.v0(cArr), i10);
        }
        int O0 = O0(charSequence);
        if (i10 > O0) {
            i10 = O0;
        }
        while (-1 < i10) {
            char charAt = charSequence.charAt(i10);
            int i12 = 0;
            while (true) {
                if (i12 >= 1) {
                    z10 = false;
                    break;
                } else if (l0.L(cArr[i12], charAt, false)) {
                    z10 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (z10) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static int V0(String str, String str2, int i10) {
        int i11;
        if ((i10 & 2) != 0) {
            i11 = O0(str);
        } else {
            i11 = 0;
        }
        j.f(str, "<this>");
        j.f(str2, "string");
        return str.lastIndexOf(str2, i11);
    }

    public static final List<String> W0(CharSequence charSequence) {
        j.f(charSequence, "<this>");
        return xk.h.q1(new m(Z0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new k(charSequence)));
    }

    public static String X0(String str, int i10) {
        CharSequence charSequence;
        j.f(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i10);
                sb2.append(str);
                g m10 = new h(1, i10 - str.length()).iterator();
                while (m10.f23340c) {
                    m10.nextInt();
                    sb2.append(' ');
                }
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(v.d("Desired length ", i10, " is less than zero."));
    }

    public static final String Y0(String str, int i10) {
        CharSequence charSequence;
        j.f(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i10);
                g m10 = new h(1, i10 - str.length()).iterator();
                while (m10.f23340c) {
                    m10.nextInt();
                    sb2.append('0');
                }
                sb2.append(str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(v.d("Desired length ", i10, " is less than zero."));
    }

    public static b Z0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        c1(i10);
        return new b(charSequence, 0, i10, new j(fk.h.l0(strArr), z10));
    }

    public static final boolean a1(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        j.f(charSequence, "<this>");
        j.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!l0.L(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String b1(String str, String str2) {
        if (!h.L0(str2, str, false)) {
            return str2;
        }
        String substring = str2.substring(str.length());
        j.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final void c1(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(a.m("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static final List d1(int i10, CharSequence charSequence, String str, boolean z10) {
        boolean z11;
        c1(i10);
        int i11 = 0;
        int P0 = P0(0, charSequence, str, z10);
        if (P0 == -1 || i10 == 1) {
            return j7.a.c0(charSequence.toString());
        }
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 10;
        if (z11 && i10 <= 10) {
            i12 = i10;
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, P0).toString());
            i11 = str.length() + P0;
            if ((z11 && arrayList.size() == i10 - 1) || (P0 = P0(i11, charSequence, str, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, P0).toString());
            i11 = str.length() + P0;
            break;
        } while ((P0 = P0(i11, charSequence, str, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static List e1(CharSequence charSequence, char[] cArr) {
        j.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return d1(0, charSequence, String.valueOf(cArr[0]), false);
        }
        c1(0);
        xk.l lVar = new xk.l(new b(charSequence, 0, 0, new i(cArr, false)));
        ArrayList arrayList = new ArrayList(fk.j.H0(lVar));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(g1(charSequence, (h) it.next()));
        }
        return arrayList;
    }

    public static List f1(CharSequence charSequence, String[] strArr) {
        j.f(charSequence, "<this>");
        boolean z10 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                return d1(0, charSequence, str, false);
            }
        }
        xk.l lVar = new xk.l(Z0(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(fk.j.H0(lVar));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(g1(charSequence, (h) it.next()));
        }
        return arrayList;
    }

    public static final String g1(CharSequence charSequence, h hVar) {
        j.f(charSequence, "<this>");
        j.f(hVar, "range");
        return charSequence.subSequence(Integer.valueOf(hVar.f23335a).intValue(), Integer.valueOf(hVar.f23336b).intValue() + 1).toString();
    }

    public static final String h1(String str, String str2, String str3) {
        j.f(str2, "delimiter");
        j.f(str3, "missingDelimiterValue");
        int S0 = S0(str, str2, 0, false, 6);
        if (S0 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + S0, str.length());
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String i1(String str, String str2) {
        j.f(str, "<this>");
        j.f(str2, "missingDelimiterValue");
        int U0 = U0(str, '.', 0, 6);
        if (U0 == -1) {
            return str2;
        }
        String substring = str.substring(U0 + 1, str.length());
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String j1(String str, String str2) {
        int S0 = S0(str, str2, 0, false, 6);
        if (S0 == -1) {
            return str;
        }
        String substring = str.substring(0, S0);
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence k1(CharSequence charSequence) {
        int i10;
        j.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean i02 = l0.i0(charSequence.charAt(i10));
            if (!z10) {
                if (!i02) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else if (!i02) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }
}

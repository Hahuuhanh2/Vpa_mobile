package fk;

import al.g0;
import ek.e;
import j7.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p3.l0;
import sk.j;
import u9.b;
import v.v;
import yk.d;
import yk.l;

/* compiled from: _Arrays.kt */
public class h extends g0 {
    public static final Map A0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return s.f20214a;
        }
        if (size == 1) {
            return g0.e0((e) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.d0(arrayList.size()));
        B0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static final void B0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            linkedHashMap.put(eVar.f20102a, eVar.f20103b);
        }
    }

    public static final Set C0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return t.f20215a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(g0.d0(objArr.length));
            for (Object add : objArr) {
                linkedHashSet.add(add);
            }
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        j.e(singleton, "singleton(element)");
        return singleton;
    }

    public static final String D0(String str) {
        Comparable comparable;
        int i10;
        boolean z10;
        j.f(str, "<this>");
        List<String> W0 = l.W0(str);
        ArrayList arrayList = new ArrayList();
        for (T next : W0) {
            if (true ^ yk.h.H0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(j.H0(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (!l0.i0(str2.charAt(i11))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                i11 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int size = (W0.size() * 0) + str.length();
        d dVar = d.f23596a;
        int I = a.I(W0);
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        for (T next2 : W0) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                String str3 = (String) next2;
                if ((i12 == 0 || i12 == I) && yk.h.H0(str3)) {
                    str3 = null;
                } else {
                    j.f(str3, "<this>");
                    if (i10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int length2 = str3.length();
                        if (i10 <= length2) {
                            length2 = i10;
                        }
                        String substring = str3.substring(length2);
                        j.e(substring, "this as java.lang.String).substring(startIndex)");
                        String str4 = (String) dVar.invoke(substring);
                        if (str4 != null) {
                            str3 = str4;
                        }
                    } else {
                        throw new IllegalArgumentException(v.d("Requested character count ", i10, " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i12 = i13;
            } else {
                a.x0();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(size);
        p.O0(arrayList3, sb2, "\n", "", "", -1, "...", (rk.l) null);
        String sb3 = sb2.toString();
        j.e(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String E0(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            sk.j.f(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = yk.h.H0(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a3
            java.util.List r1 = yk.l.W0(r13)
            int r13 = r13.length()
            int r2 = r1.size()
            r3 = 0
            int r2 = r2 * r3
            int r2 = r2 + r13
            yk.d r13 = yk.d.f23596a
            int r4 = j7.a.I(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r6 = r3
        L_0x002e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            r9 = 0
            if (r6 < 0) goto L_0x008d
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L_0x0043
            if (r6 != r4) goto L_0x004a
        L_0x0043:
            boolean r6 = yk.h.H0(r7)
            if (r6 == 0) goto L_0x004a
            goto L_0x0086
        L_0x004a:
            int r6 = r7.length()
            r10 = r3
        L_0x004f:
            r11 = -1
            if (r10 >= r6) goto L_0x0062
            char r12 = r7.charAt(r10)
            boolean r12 = p3.l0.i0(r12)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r10 = r10 + 1
            goto L_0x004f
        L_0x0062:
            r10 = r11
        L_0x0063:
            if (r10 != r11) goto L_0x0066
            goto L_0x007a
        L_0x0066:
            boolean r6 = yk.h.K0(r10, r7, r0, r3)
            if (r6 == 0) goto L_0x007a
            int r6 = r0.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            sk.j.e(r9, r6)
        L_0x007a:
            if (r9 == 0) goto L_0x0085
            java.lang.Object r6 = r13.invoke(r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0086
        L_0x0085:
            r9 = r7
        L_0x0086:
            if (r9 == 0) goto L_0x008b
            r5.add(r9)
        L_0x008b:
            r6 = r8
            goto L_0x002e
        L_0x008d:
            j7.a.x0()
            throw r9
        L_0x0091:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r2)
            fk.p.O0(r5, r13, "\n", "", "", -1, "...", (rk.l) null)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            sk.j.e(r13, r0)
            return r13
        L_0x00a3:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.h.E0(java.lang.String):java.lang.String");
    }

    public static final List l0(Object[] objArr) {
        j.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        j.e(asList, "asList(this)");
        return asList;
    }

    public static final void m0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        j.f(objArr, "<this>");
        j.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static final void n0(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        j.f(bArr, "<this>");
        j.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void o0(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        j.f(iArr, "<this>");
        System.arraycopy(iArr, 0, iArr2, 0, length - 0);
    }

    public static final void p0(Object[] objArr, int i10, int i11) {
        j.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void q0(Object[] objArr, b bVar) {
        int length = objArr.length;
        j.f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, bVar);
    }

    public static final ArrayList r0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String s0(File file) {
        j.f(file, "<this>");
        String name = file.getName();
        j.e(name, "name");
        return l.i1(name, "");
    }

    public static String t0(Object[] objArr, String str, String str2, String str3, int i10) {
        int i11;
        String str4;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            str4 = "...";
        } else {
            str4 = null;
        }
        j.f(objArr, "<this>");
        j.f(str, "separator");
        j.f(str2, "prefix");
        j.f(str3, "postfix");
        j.f(str4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append(str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            g0.t(sb2, obj, (rk.l) null);
        }
        if (i11 >= 0 && i12 > i11) {
            sb2.append(str4);
        }
        sb2.append(str3);
        String sb3 = sb2.toString();
        j.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final Map u0(e... eVarArr) {
        if (eVarArr.length <= 0) {
            return s.f20214a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.d0(eVarArr.length));
        for (e eVar : eVarArr) {
            linkedHashMap.put(eVar.f20102a, eVar.f20103b);
        }
        return linkedHashMap;
    }

    public static final char v0(char[] cArr) {
        j.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final List w0(int i10, Object[] objArr) {
        boolean z10;
        j.f(objArr, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(v.d("Requested element count ", i10, " is less than zero.").toString());
        } else if (i10 == 0) {
            return r.f20213a;
        } else {
            int length = objArr.length;
            if (i10 >= length) {
                return z0(objArr);
            }
            if (i10 == 1) {
                return a.c0(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(objArr[i11]);
            }
            return arrayList;
        }
    }

    public static final List x0(int[] iArr) {
        j.f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return r.f20213a;
        }
        if (length == 1) {
            return a.c0(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List y0(long[] jArr) {
        j.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return r.f20213a;
        }
        if (length == 1) {
            return a.c0(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List z0(Object[] objArr) {
        j.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return r.f20213a;
        }
        if (length != 1) {
            return new ArrayList(new f(objArr, false));
        }
        return a.c0(objArr[0]);
    }
}

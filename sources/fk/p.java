package fk;

import al.g0;
import ik.d;
import j7.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import rk.l;
import sk.j;
import v.v;
import xk.f;

/* compiled from: _Collections.kt */
public class p extends m {
    public static final boolean L0(Collection collection, Serializable serializable) {
        j.f(collection, "<this>");
        return collection.contains(serializable);
    }

    public static final <T> T M0(List<? extends T> list) {
        j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T N0(List<? extends T> list) {
        j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void O0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        j.f(iterable, "<this>");
        j.f(charSequence, "separator");
        j.f(charSequence2, "prefix");
        j.f(charSequence3, "postfix");
        j.f(charSequence4, "truncated");
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            g0.t(sb2, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }

    public static String Q0(Iterable iterable, String str, String str2, String str3, l lVar, int i10) {
        String str4;
        String str5;
        int i11;
        CharSequence charSequence;
        l lVar2;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if ((i10 & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i10 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        j.f(iterable, "<this>");
        j.f(str6, "separator");
        j.f(str4, "prefix");
        j.f(str5, "postfix");
        j.f(charSequence, "truncated");
        StringBuilder sb2 = new StringBuilder();
        O0(iterable, sb2, str6, str4, str5, i12, charSequence, lVar2);
        String sb3 = sb2.toString();
        j.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T R0(List<? extends T> list) {
        j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(a.I(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object S0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(arrayList.size() - 1);
    }

    public static final ArrayList T0(Object obj, Collection collection) {
        j.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList U0(List list, List list2) {
        j.f(list2, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list2);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final List V0(List list, int i10) {
        boolean z10;
        j.f(list, "<this>");
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
            if (i10 >= list.size()) {
                return Z0(list);
            }
            if (i10 == 1) {
                return a.c0(M0(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (Object add : list) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return r.f20213a;
            }
            if (size != 1) {
                return arrayList;
            }
            return a.c0(arrayList.get(0));
        }
    }

    public static final byte[] W0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void X0(Iterable iterable, AbstractCollection abstractCollection) {
        j.f(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final int[] Y0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> Z0(Iterable<? extends T> iterable) {
        Object obj;
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return r.f20213a;
            }
            if (size != 1) {
                return b1(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            return a.c0(obj);
        }
        List<T> c12 = c1(iterable);
        ArrayList arrayList = (ArrayList) c12;
        int size2 = arrayList.size();
        if (size2 == 0) {
            return r.f20213a;
        }
        if (size2 != 1) {
            return c12;
        }
        return a.c0(arrayList.get(0));
    }

    public static final long[] a1(Collection<Long> collection) {
        j.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Long longValue : collection) {
            jArr[i10] = longValue.longValue();
            i10++;
        }
        return jArr;
    }

    public static final ArrayList b1(Collection collection) {
        j.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> c1(Iterable<? extends T> iterable) {
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return b1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        X0(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> d1(Iterable<? extends T> iterable) {
        Object obj;
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return t.f20215a;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(g0.d0(collection.size()));
                X0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            Set<T> singleton = Collections.singleton(obj);
            j.e(singleton, "singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        X0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return t.f20215a;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        j.e(singleton2, "singleton(element)");
        return singleton2;
    }

    public static final ArrayList e1(Iterable iterable, int i10, int i11) {
        boolean z10;
        Iterator it;
        int i12;
        boolean z11;
        String str;
        j.f(iterable, "<this>");
        if (i10 <= 0 || i11 <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = v.d("size ", i10, " must be greater than zero.");
            }
            throw new IllegalArgumentException(str.toString());
        } else if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            j.f(it2, "iterator");
            if (!it2.hasNext()) {
                it = q.f20212a;
            } else {
                b0 b0Var = new b0(i10, i11, it2, false, true, (d<? super b0>) null);
                f fVar = new f();
                fVar.f23497d = g0.K(fVar, fVar, b0Var);
                it = fVar;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
            return arrayList;
        } else {
            List list = (List) iterable;
            int size = list.size();
            int i13 = size / i11;
            if (size % i11 == 0) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ArrayList arrayList2 = new ArrayList(i13 + i12);
            int i14 = 0;
            while (true) {
                if (i14 < 0 || i14 >= size) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return arrayList2;
                }
                int i15 = size - i14;
                if (i10 <= i15) {
                    i15 = i10;
                }
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    arrayList3.add(list.get(i16 + i14));
                }
                arrayList2.add(arrayList3);
                i14 += i11;
            }
        }
    }
}

package androidx.lifecycle;

import a3.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.fragment.app.l;
import d.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import sk.j;

/* compiled from: SavedStateHandle.kt */
public final class v {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f2829f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2830a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f2831b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2832c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2833d;

    /* renamed from: e  reason: collision with root package name */
    public final c.b f2834e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        public static v a(Bundle bundle, Bundle bundle2) {
            boolean z10;
            if (bundle != null) {
                ClassLoader classLoader = v.class.getClassLoader();
                j.c(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = parcelableArrayList.get(i10);
                        j.d(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                    }
                    return new v(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new v();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    j.e(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new v(hashMap);
            }
        }
    }

    public v(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2830a = linkedHashMap;
        this.f2831b = new LinkedHashMap();
        this.f2832c = new LinkedHashMap();
        this.f2833d = new LinkedHashMap();
        this.f2834e = new l(this, 1);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: r2.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0090 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(androidx.lifecycle.v r10) {
        /*
            java.lang.String r0 = "this$0"
            sk.j.f(r10, r0)
            java.util.LinkedHashMap r0 = r10.f2831b
            java.lang.String r1 = "<this>"
            sk.j.f(r0, r1)
            int r1 = r0.size()
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x001b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            goto L_0x0022
        L_0x001b:
            java.util.Map r1 = al.g0.k0(r0)
            goto L_0x0022
        L_0x0020:
            fk.s r1 = fk.s.f20214a
        L_0x0022:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r1 = r0.hasNext()
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            a3.c$b r1 = (a3.c.b) r1
            android.os.Bundle r1 = r1.a()
            java.lang.String r6 = "key"
            sk.j.f(r5, r6)
            if (r1 != 0) goto L_0x0050
            goto L_0x0062
        L_0x0050:
            java.lang.Class<? extends java.lang.Object>[] r6 = f2829f
            r7 = 29
            r8 = r4
        L_0x0055:
            if (r8 >= r7) goto L_0x0067
            r9 = r6[r8]
            sk.j.c(r9)
            boolean r9 = r9.isInstance(r1)
            if (r9 == 0) goto L_0x0064
        L_0x0062:
            r4 = r2
            goto L_0x0067
        L_0x0064:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0067:
            if (r4 == 0) goto L_0x0090
            java.util.LinkedHashMap r4 = r10.f2832c
            java.lang.Object r4 = r4.get(r5)
            boolean r6 = r4 instanceof r2.p
            if (r6 == 0) goto L_0x0076
            r3 = r4
            r2.p r3 = (r2.p) r3
        L_0x0076:
            if (r3 == 0) goto L_0x007c
            r3.j(r1)
            goto L_0x0081
        L_0x007c:
            java.util.LinkedHashMap r3 = r10.f2830a
            r3.put(r5, r1)
        L_0x0081:
            java.util.LinkedHashMap r3 = r10.f2833d
            java.lang.Object r3 = r3.get(r5)
            dl.r r3 = (dl.r) r3
            if (r3 != 0) goto L_0x008c
            goto L_0x002a
        L_0x008c:
            r3.setValue(r1)
            goto L_0x002a
        L_0x0090:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Can't put value with type "
            r0.append(r2)
            sk.j.c(r1)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " into saved state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00b3:
            java.util.LinkedHashMap r0 = r10.f2830a
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r0.size()
            r1.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r1.size()
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x00cf:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            r1.add(r6)
            java.util.LinkedHashMap r7 = r10.f2830a
            java.lang.Object r6 = r7.get(r6)
            r5.add(r6)
            goto L_0x00cf
        L_0x00e8:
            r10 = 2
            ek.e[] r0 = new ek.e[r10]
            ek.e r6 = new ek.e
            java.lang.String r7 = "keys"
            r6.<init>(r7, r1)
            r0[r4] = r6
            ek.e r1 = new ek.e
            java.lang.String r6 = "values"
            r1.<init>(r6, r5)
            r0[r2] = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r10)
        L_0x0102:
            if (r4 >= r10) goto L_0x02c7
            r2 = r0[r4]
            A r5 = r2.f20102a
            java.lang.String r5 = (java.lang.String) r5
            B r2 = r2.f20103b
            if (r2 != 0) goto L_0x0113
            r1.putString(r5, r3)
            goto L_0x029b
        L_0x0113:
            boolean r6 = r2 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x0122
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.putBoolean(r5, r2)
            goto L_0x029b
        L_0x0122:
            boolean r6 = r2 instanceof java.lang.Byte
            if (r6 == 0) goto L_0x0131
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            r1.putByte(r5, r2)
            goto L_0x029b
        L_0x0131:
            boolean r6 = r2 instanceof java.lang.Character
            if (r6 == 0) goto L_0x0140
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.putChar(r5, r2)
            goto L_0x029b
        L_0x0140:
            boolean r6 = r2 instanceof java.lang.Double
            if (r6 == 0) goto L_0x014f
            java.lang.Number r2 = (java.lang.Number) r2
            double r6 = r2.doubleValue()
            r1.putDouble(r5, r6)
            goto L_0x029b
        L_0x014f:
            boolean r6 = r2 instanceof java.lang.Float
            if (r6 == 0) goto L_0x015e
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r1.putFloat(r5, r2)
            goto L_0x029b
        L_0x015e:
            boolean r6 = r2 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x016d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.putInt(r5, r2)
            goto L_0x029b
        L_0x016d:
            boolean r6 = r2 instanceof java.lang.Long
            if (r6 == 0) goto L_0x017c
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            r1.putLong(r5, r6)
            goto L_0x029b
        L_0x017c:
            boolean r6 = r2 instanceof java.lang.Short
            if (r6 == 0) goto L_0x018b
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            r1.putShort(r5, r2)
            goto L_0x029b
        L_0x018b:
            boolean r6 = r2 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0196
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.putBundle(r5, r2)
            goto L_0x029b
        L_0x0196:
            boolean r6 = r2 instanceof java.lang.CharSequence
            if (r6 == 0) goto L_0x01a1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.putCharSequence(r5, r2)
            goto L_0x029b
        L_0x01a1:
            boolean r6 = r2 instanceof android.os.Parcelable
            if (r6 == 0) goto L_0x01ac
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r1.putParcelable(r5, r2)
            goto L_0x029b
        L_0x01ac:
            boolean r6 = r2 instanceof boolean[]
            if (r6 == 0) goto L_0x01b7
            boolean[] r2 = (boolean[]) r2
            r1.putBooleanArray(r5, r2)
            goto L_0x029b
        L_0x01b7:
            boolean r6 = r2 instanceof byte[]
            if (r6 == 0) goto L_0x01c2
            byte[] r2 = (byte[]) r2
            r1.putByteArray(r5, r2)
            goto L_0x029b
        L_0x01c2:
            boolean r6 = r2 instanceof char[]
            if (r6 == 0) goto L_0x01cd
            char[] r2 = (char[]) r2
            r1.putCharArray(r5, r2)
            goto L_0x029b
        L_0x01cd:
            boolean r6 = r2 instanceof double[]
            if (r6 == 0) goto L_0x01d8
            double[] r2 = (double[]) r2
            r1.putDoubleArray(r5, r2)
            goto L_0x029b
        L_0x01d8:
            boolean r6 = r2 instanceof float[]
            if (r6 == 0) goto L_0x01e3
            float[] r2 = (float[]) r2
            r1.putFloatArray(r5, r2)
            goto L_0x029b
        L_0x01e3:
            boolean r6 = r2 instanceof int[]
            if (r6 == 0) goto L_0x01ee
            int[] r2 = (int[]) r2
            r1.putIntArray(r5, r2)
            goto L_0x029b
        L_0x01ee:
            boolean r6 = r2 instanceof long[]
            if (r6 == 0) goto L_0x01f9
            long[] r2 = (long[]) r2
            r1.putLongArray(r5, r2)
            goto L_0x029b
        L_0x01f9:
            boolean r6 = r2 instanceof short[]
            if (r6 == 0) goto L_0x0204
            short[] r2 = (short[]) r2
            r1.putShortArray(r5, r2)
            goto L_0x029b
        L_0x0204:
            boolean r6 = r2 instanceof java.lang.Object[]
            r7 = 34
            java.lang.String r8 = " for key \""
            if (r6 == 0) goto L_0x0274
            java.lang.Class r6 = r2.getClass()
            java.lang.Class r6 = r6.getComponentType()
            sk.j.c(r6)
            java.lang.Class<android.os.Parcelable> r9 = android.os.Parcelable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0226
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r5, r2)
            goto L_0x029b
        L_0x0226:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0234
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.putStringArray(r5, r2)
            goto L_0x029b
        L_0x0234:
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0242
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r1.putCharSequenceArray(r5, r2)
            goto L_0x029b
        L_0x0242:
            java.lang.Class<java.io.Serializable> r9 = java.io.Serializable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0250
            java.io.Serializable r2 = (java.io.Serializable) r2
            r1.putSerializable(r5, r2)
            goto L_0x029b
        L_0x0250:
            java.lang.String r10 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value array type "
            r1.append(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0274:
            boolean r6 = r2 instanceof java.io.Serializable
            if (r6 == 0) goto L_0x027e
            java.io.Serializable r2 = (java.io.Serializable) r2
            r1.putSerializable(r5, r2)
            goto L_0x029b
        L_0x027e:
            boolean r6 = r2 instanceof android.os.IBinder
            if (r6 == 0) goto L_0x0288
            android.os.IBinder r2 = (android.os.IBinder) r2
            s1.b.a(r1, r5, r2)
            goto L_0x029b
        L_0x0288:
            boolean r6 = r2 instanceof android.util.Size
            if (r6 == 0) goto L_0x0292
            android.util.Size r2 = (android.util.Size) r2
            s1.c.a(r1, r5, r2)
            goto L_0x029b
        L_0x0292:
            boolean r6 = r2 instanceof android.util.SizeF
            if (r6 == 0) goto L_0x029f
            android.util.SizeF r2 = (android.util.SizeF) r2
            s1.c.b(r1, r5, r2)
        L_0x029b:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x029f:
            java.lang.Class r10 = r2.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value type "
            r1.append(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x02c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v.a(androidx.lifecycle.v):android.os.Bundle");
    }

    public v() {
        this.f2830a = new LinkedHashMap();
        this.f2831b = new LinkedHashMap();
        this.f2832c = new LinkedHashMap();
        this.f2833d = new LinkedHashMap();
        this.f2834e = new f(this, 1);
    }
}

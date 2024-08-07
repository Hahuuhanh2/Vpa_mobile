package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o3.j;

/* compiled from: Data */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f3753b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap f3754a;

    /* compiled from: Data */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public HashMap f3755a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f3755a.put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f3755a.put(str, value);
                    } else {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            HashMap hashMap2 = this.f3755a;
                            boolean[] zArr = (boolean[]) value;
                            c cVar = c.f3753b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            HashMap hashMap3 = this.f3755a;
                            byte[] bArr = (byte[]) value;
                            c cVar2 = c.f3753b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            HashMap hashMap4 = this.f3755a;
                            int[] iArr = (int[]) value;
                            c cVar3 = c.f3753b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap4.put(str, numArr);
                        } else if (cls == long[].class) {
                            HashMap hashMap5 = this.f3755a;
                            long[] jArr = (long[]) value;
                            c cVar4 = c.f3753b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap5.put(str, lArr);
                        } else if (cls == float[].class) {
                            HashMap hashMap6 = this.f3755a;
                            float[] fArr = (float[]) value;
                            c cVar5 = c.f3753b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            HashMap hashMap7 = this.f3755a;
                            double[] dArr = (double[]) value;
                            c cVar6 = c.f3753b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                    }
                }
            }
        }
    }

    static {
        j.b("Data");
        c cVar = new c(new HashMap());
        b(cVar);
        f3753b = cVar;
    }

    public c() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|(2:18|19)|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|(7:3|4|5|6|(2:8|9)|10|11)|28|29|30|32) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[SYNTHETIC, Splitter:B:18:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC, Splitter:B:26:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.c a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003d, all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x003d, all -> 0x0033 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0031, all -> 0x002d }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0042
        L_0x002d:
            r5 = move-exception
            r0 = r5
            r5 = r2
            goto L_0x0034
        L_0x0031:
            r5 = r2
            goto L_0x003d
        L_0x0033:
            r0 = move-exception
        L_0x0034:
            if (r5 == 0) goto L_0x0039
            r5.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            throw r0
        L_0x003d:
            if (r5 == 0) goto L_0x0042
            r5.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r1.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            androidx.work.c r5 = new androidx.work.c
            r5.<init>((java.util.HashMap) r0)
            return r5
        L_0x004b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.c.a(byte[]):androidx.work.c");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|32|(0)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|24|(0)|28|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(2:7|5)|8|9|10|11|12|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[SYNTHETIC, Splitter:B:26:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[SYNTHETIC, Splitter:B:34:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(androidx.work.c r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005c }
            java.util.HashMap r1 = r4.f3754a     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.util.HashMap r4 = r4.f3754a     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
        L_0x001e:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0058, all -> 0x0056 }
            goto L_0x001e
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x004e
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0056:
            r4 = move-exception
            goto L_0x006a
        L_0x0058:
            r1 = r2
            goto L_0x005c
        L_0x005a:
            r4 = move-exception
            goto L_0x0069
        L_0x005c:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            r0.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            return r4
        L_0x0069:
            r2 = r1
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r0.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.c.b(androidx.work.c):byte[]");
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Set<String> keySet = this.f3754a.keySet();
        if (!keySet.equals(cVar.f3754a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f3754a.get(str);
            Object obj3 = cVar.f3754a.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z10 = obj2.equals(obj3);
                continue;
            } else {
                z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3754a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f3754a.isEmpty()) {
            for (String str : this.f3754a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f3754a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public c(c cVar) {
        this.f3754a = new HashMap(cVar.f3754a);
    }

    public c(HashMap hashMap) {
        this.f3754a = new HashMap(hashMap);
    }
}

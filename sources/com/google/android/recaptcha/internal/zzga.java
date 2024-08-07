package com.google.android.recaptcha.internal;

import fk.j;
import fk.p;
import java.util.ArrayList;
import p3.l0;
import vk.g;
import vk.h;
import yk.a;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzga implements zzfe {
    public static final zzga zza = new zzga();

    private zzga() {
    }

    public final void zza(int i10, zzek zzek, zzrr... zzrrArr) {
        if (zzrrArr.length == 2) {
            Object zza2 = zzek.zzc().zza(zzrrArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzek.zzc().zza(zzrrArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzek.zzc().zze(i10, zzb(zza2, zza3));
                    return;
                }
                throw new zzby(4, 5, (Throwable) null);
            }
            throw new zzby(4, 5, (Throwable) null);
        }
        throw new zzby(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (!z13 || !(obj2 instanceof Long)) {
            int i10 = 0;
            if (obj instanceof String) {
                if (obj2 instanceof Byte) {
                    byte[] bytes = ((String) obj).getBytes(a.f23582b);
                    int length = bytes.length;
                    ArrayList arrayList = new ArrayList(length);
                    while (i10 < length) {
                        arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                        i10++;
                    }
                    return p.W0(arrayList);
                } else if (obj2 instanceof Integer) {
                    char[] charArray = ((String) obj).toCharArray();
                    int length2 = charArray.length;
                    ArrayList arrayList2 = new ArrayList(length2);
                    while (i10 < length2) {
                        arrayList2.add(Integer.valueOf(charArray[i10] ^ ((Number) obj2).intValue()));
                        i10++;
                    }
                    return p.Y0(arrayList2);
                }
            }
            if (z10 && (obj2 instanceof byte[])) {
                ArrayList arrayList3 = new ArrayList(r0);
                for (byte byteValue : (byte[]) obj2) {
                    arrayList3.add(Byte.valueOf((byte) (byteValue ^ ((Number) obj).byteValue())));
                }
                return arrayList3.toArray(new Byte[0]);
            } else if (z11 && (obj2 instanceof short[])) {
                ArrayList arrayList4 = new ArrayList(r0);
                for (short shortValue : (short[]) obj2) {
                    arrayList4.add(Short.valueOf((short) (shortValue ^ ((Number) obj).shortValue())));
                }
                return arrayList4.toArray(new Short[0]);
            } else if (z12 && (obj2 instanceof int[])) {
                ArrayList arrayList5 = new ArrayList(r0);
                for (int intValue : (int[]) obj2) {
                    arrayList5.add(Integer.valueOf(intValue ^ ((Number) obj).intValue()));
                }
                return arrayList5.toArray(new Integer[0]);
            } else if (!z13 || !(obj2 instanceof long[])) {
                boolean z14 = obj instanceof byte[];
                if (!z14 || !(obj2 instanceof Byte)) {
                    boolean z15 = obj instanceof short[];
                    if (!z15 || !(obj2 instanceof Short)) {
                        boolean z16 = obj instanceof int[];
                        if (!z16 || !(obj2 instanceof Integer)) {
                            boolean z17 = obj instanceof long[];
                            if (z17 && (obj2 instanceof Long)) {
                                ArrayList arrayList6 = new ArrayList(r0);
                                for (long longValue : (long[]) obj) {
                                    arrayList6.add(Long.valueOf(longValue ^ ((Number) obj2).longValue()));
                                }
                                return arrayList6.toArray(new Long[0]);
                            } else if (z14 && (obj2 instanceof byte[])) {
                                byte[] bArr = (byte[]) obj;
                                int length3 = bArr.length;
                                byte[] bArr2 = (byte[]) obj2;
                                zzfd.zza(this, length3, bArr2.length);
                                h U0 = l0.U0(0, length3);
                                ArrayList arrayList7 = new ArrayList(j.H0(U0));
                                g m10 = U0.iterator();
                                while (m10.f23340c) {
                                    int nextInt = m10.nextInt();
                                    arrayList7.add(Byte.valueOf((byte) (bArr2[nextInt] ^ bArr[nextInt])));
                                }
                                return arrayList7.toArray(new Byte[0]);
                            } else if (z15 && (obj2 instanceof short[])) {
                                short[] sArr = (short[]) obj;
                                int length4 = sArr.length;
                                short[] sArr2 = (short[]) obj2;
                                zzfd.zza(this, length4, sArr2.length);
                                h U02 = l0.U0(0, length4);
                                ArrayList arrayList8 = new ArrayList(j.H0(U02));
                                g m11 = U02.iterator();
                                while (m11.f23340c) {
                                    int nextInt2 = m11.nextInt();
                                    arrayList8.add(Short.valueOf((short) (sArr2[nextInt2] ^ sArr[nextInt2])));
                                }
                                return arrayList8.toArray(new Short[0]);
                            } else if (z16 && (obj2 instanceof int[])) {
                                int[] iArr = (int[]) obj;
                                int length5 = iArr.length;
                                int[] iArr2 = (int[]) obj2;
                                zzfd.zza(this, length5, iArr2.length);
                                h U03 = l0.U0(0, length5);
                                ArrayList arrayList9 = new ArrayList(j.H0(U03));
                                g m12 = U03.iterator();
                                while (m12.f23340c) {
                                    int nextInt3 = m12.nextInt();
                                    arrayList9.add(Integer.valueOf(iArr2[nextInt3] ^ iArr[nextInt3]));
                                }
                                return arrayList9.toArray(new Integer[0]);
                            } else if (!z17 || !(obj2 instanceof long[])) {
                                throw new zzby(4, 5, (Throwable) null);
                            } else {
                                long[] jArr = (long[]) obj;
                                int length6 = jArr.length;
                                long[] jArr2 = (long[]) obj2;
                                zzfd.zza(this, length6, jArr2.length);
                                h U04 = l0.U0(0, length6);
                                ArrayList arrayList10 = new ArrayList(j.H0(U04));
                                g m13 = U04.iterator();
                                while (m13.f23340c) {
                                    int nextInt4 = m13.nextInt();
                                    arrayList10.add(Long.valueOf(jArr[nextInt4] ^ jArr2[nextInt4]));
                                }
                                return arrayList10.toArray(new Long[0]);
                            }
                        } else {
                            ArrayList arrayList11 = new ArrayList(r0);
                            for (int intValue2 : (int[]) obj) {
                                arrayList11.add(Integer.valueOf(intValue2 ^ ((Number) obj2).intValue()));
                            }
                            return arrayList11.toArray(new Integer[0]);
                        }
                    } else {
                        ArrayList arrayList12 = new ArrayList(r0);
                        for (short shortValue2 : (short[]) obj) {
                            arrayList12.add(Short.valueOf((short) (shortValue2 ^ ((Number) obj2).shortValue())));
                        }
                        return arrayList12.toArray(new Short[0]);
                    }
                } else {
                    ArrayList arrayList13 = new ArrayList(r0);
                    for (byte byteValue2 : (byte[]) obj) {
                        arrayList13.add(Byte.valueOf((byte) (byteValue2 ^ ((Number) obj2).byteValue())));
                    }
                    return arrayList13.toArray(new Byte[0]);
                }
            } else {
                ArrayList arrayList14 = new ArrayList(r0);
                for (long longValue2 : (long[]) obj2) {
                    arrayList14.add(Long.valueOf(longValue2 ^ ((Number) obj).longValue()));
                }
                return arrayList14.toArray(new Long[0]);
            }
        } else {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
    }
}

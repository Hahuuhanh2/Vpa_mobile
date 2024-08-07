package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzhq {
    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i10, zzht zzht) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            zzht.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        zzht.zzb = j11;
        return i12;
    }

    public static int zza(byte[] bArr, int i10, zzht zzht) {
        int zzc = zzc(bArr, i10, zzht);
        int i11 = zzht.zza;
        if (i11 < 0) {
            throw zzjq.zzf();
        } else if (i11 > bArr.length - zzc) {
            throw zzjq.zzh();
        } else if (i11 == 0) {
            zzht.zzc = zzhu.zza;
            return zzc;
        } else {
            zzht.zzc = zzhu.zza(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    public static int zzb(byte[] bArr, int i10, zzht zzht) {
        int zzc = zzc(bArr, i10, zzht);
        int i11 = zzht.zza;
        if (i11 < 0) {
            throw zzjq.zzf();
        } else if (i11 == 0) {
            zzht.zzc = "";
            return zzc;
        } else {
            zzht.zzc = zzmp.zzb(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    public static int zzc(byte[] bArr, int i10, zzht zzht) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza((int) b10, bArr, i11, zzht);
        }
        zzht.zza = b10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int zza(zzlj zzlj, byte[] bArr, int i10, int i11, int i12, zzht zzht) {
        Object zza = zzlj.zza();
        int zza2 = zza(zza, zzlj, bArr, i10, i11, i12, zzht);
        zzlj.zzc(zza);
        zzht.zzc = zza;
        return zza2;
    }

    public static int zza(zzlj zzlj, byte[] bArr, int i10, int i11, zzht zzht) {
        Object zza = zzlj.zza();
        int zza2 = zza(zza, zzlj, bArr, i10, i11, zzht);
        zzlj.zzc(zza);
        zzht.zzc = zza;
        return zza2;
    }

    public static int zza(zzlj<?> zzlj, int i10, byte[] bArr, int i11, int i12, zzjn<?> zzjn, zzht zzht) {
        int zza = zza((zzlj) zzlj, bArr, i11, i12, zzht);
        zzjn.add(zzht.zzc);
        while (zza < i12) {
            int zzc = zzc(bArr, zza, zzht);
            if (i10 != zzht.zza) {
                break;
            }
            zza = zza((zzlj) zzlj, bArr, zzc, i12, zzht);
            zzjn.add(zzht.zzc);
        }
        return zza;
    }

    public static int zza(byte[] bArr, int i10, zzjn<?> zzjn, zzht zzht) {
        zzji zzji = (zzji) zzjn;
        int zzc = zzc(bArr, i10, zzht);
        int i11 = zzht.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzht);
            zzji.zzd(zzht.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzjq.zzh();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzmh zzmh, zzht zzht) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzd = zzd(bArr, i11, zzht);
                zzmh.zza(i10, (Object) Long.valueOf(zzht.zzb));
                return zzd;
            } else if (i13 == 1) {
                zzmh.zza(i10, (Object) Long.valueOf(zzd(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzc = zzc(bArr, i11, zzht);
                int i14 = zzht.zza;
                if (i14 < 0) {
                    throw zzjq.zzf();
                } else if (i14 <= bArr.length - zzc) {
                    if (i14 == 0) {
                        zzmh.zza(i10, (Object) zzhu.zza);
                    } else {
                        zzmh.zza(i10, (Object) zzhu.zza(bArr, zzc, i14));
                    }
                    return zzc + i14;
                } else {
                    throw zzjq.zzh();
                }
            } else if (i13 == 3) {
                zzmh zzd2 = zzmh.zzd();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i11, zzht);
                    int i17 = zzht.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzc2;
                        break;
                    }
                    int zza = zza(i16, bArr, zzc2, i12, zzd2, zzht);
                    i16 = i17;
                    i11 = zza;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzjq.zzg();
                }
                zzmh.zza(i10, (Object) zzd2);
                return i11;
            } else if (i13 == 5) {
                zzmh.zza(i10, (Object) Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzjq.zzc();
            }
        } else {
            throw zzjq.zzc();
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, zzht zzht) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzht.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzht.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzht.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzht.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzht.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzjn<?> zzjn, zzht zzht) {
        zzji zzji = (zzji) zzjn;
        int zzc = zzc(bArr, i11, zzht);
        zzji.zzd(zzht.zza);
        while (zzc < i12) {
            int zzc2 = zzc(bArr, zzc, zzht);
            if (i10 != zzht.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzht);
            zzji.zzd(zzht.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzlj zzlj, byte[] bArr, int i10, int i11, int i12, zzht zzht) {
        int zza = ((zzkv) zzlj).zza(obj, bArr, i10, i11, i12, zzht);
        zzht.zzc = obj;
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(java.lang.Object r6, com.google.android.gms.internal.measurement.zzlj r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzht r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zza((int) r9, (byte[]) r8, (int) r0, (com.google.android.gms.internal.measurement.zzht) r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zza(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzjq r6 = com.google.android.gms.internal.measurement.zzjq.zzh()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhq.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlj, byte[], int, int, com.google.android.gms.internal.measurement.zzht):int");
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzht zzht) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzd(bArr, i11, zzht);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzc(bArr, i11, zzht) + zzht.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzc(bArr, i11, zzht);
                    i15 = zzht.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zza(i15, bArr, i11, i12, zzht);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzjq.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzjq.zzc();
            }
        } else {
            throw zzjq.zzc();
        }
    }
}

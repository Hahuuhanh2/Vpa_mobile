package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzil {
    public static int zza(byte[] bArr, int i10, zzik zzik) {
        int zzi = zzi(bArr, i10, zzik);
        int i11 = zzik.zza;
        if (i11 < 0) {
            throw zzlc.zzf();
        } else if (i11 > bArr.length - zzi) {
            throw zzlc.zzi();
        } else if (i11 == 0) {
            zzik.zzc = zziv.zzb;
            return zzi;
        } else {
            zzik.zzc = zziv.zzk(bArr, zzi, i11);
            return zzi + i11;
        }
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzmk zzmk, byte[] bArr, int i10, int i11, int i12, zzik zzik) {
        Object zze = zzmk.zze();
        int zzm = zzm(zze, zzmk, bArr, i10, i11, i12, zzik);
        zzmk.zzf(zze);
        zzik.zzc = zze;
        return zzm;
    }

    public static int zzd(zzmk zzmk, byte[] bArr, int i10, int i11, zzik zzik) {
        Object zze = zzmk.zze();
        int zzn = zzn(zze, zzmk, bArr, i10, i11, zzik);
        zzmk.zzf(zze);
        zzik.zzc = zze;
        return zzn;
    }

    public static int zze(zzmk zzmk, int i10, byte[] bArr, int i11, int i12, zzkz zzkz, zzik zzik) {
        int zzd = zzd(zzmk, bArr, i11, i12, zzik);
        zzkz.add(zzik.zzc);
        while (zzd < i12) {
            int zzi = zzi(bArr, zzd, zzik);
            if (i10 != zzik.zza) {
                break;
            }
            zzd = zzd(zzmk, bArr, zzi, i12, zzik);
            zzkz.add(zzik.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzkz zzkz, zzik zzik) {
        zzkt zzkt = (zzkt) zzkz;
        int zzi = zzi(bArr, i10, zzik);
        int i11 = zzik.zza + zzi;
        while (zzi < i11) {
            zzi = zzi(bArr, zzi, zzik);
            zzkt.zzh(zzik.zza);
        }
        if (zzi == i11) {
            return zzi;
        }
        throw zzlc.zzi();
    }

    public static int zzg(byte[] bArr, int i10, zzik zzik) {
        int zzi = zzi(bArr, i10, zzik);
        int i11 = zzik.zza;
        if (i11 < 0) {
            throw zzlc.zzf();
        } else if (i11 == 0) {
            zzik.zzc = "";
            return zzi;
        } else {
            zzik.zzc = new String(bArr, zzi, i11, zzla.zza);
            return zzi + i11;
        }
    }

    public static int zzh(int i10, byte[] bArr, int i11, int i12, zznc zznc, zzik zzik) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzl = zzl(bArr, i11, zzik);
                zznc.zzj(i10, Long.valueOf(zzik.zzb));
                return zzl;
            } else if (i13 == 1) {
                zznc.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzi = zzi(bArr, i11, zzik);
                int i14 = zzik.zza;
                if (i14 < 0) {
                    throw zzlc.zzf();
                } else if (i14 <= bArr.length - zzi) {
                    if (i14 == 0) {
                        zznc.zzj(i10, zziv.zzb);
                    } else {
                        zznc.zzj(i10, zziv.zzk(bArr, zzi, i14));
                    }
                    return zzi + i14;
                } else {
                    throw zzlc.zzi();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zznc zzf = zznc.zzf();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzi2 = zzi(bArr, i11, zzik);
                    int i17 = zzik.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzi2;
                        break;
                    }
                    int zzh = zzh(i16, bArr, zzi2, i12, zzf, zzik);
                    i16 = i17;
                    i11 = zzh;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzlc.zzg();
                }
                zznc.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zznc.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzlc.zzc();
            }
        } else {
            throw zzlc.zzc();
        }
    }

    public static int zzi(byte[] bArr, int i10, zzik zzik) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzik);
        }
        zzik.zza = b10;
        return i11;
    }

    public static int zzj(int i10, byte[] bArr, int i11, zzik zzik) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzik.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzik.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzik.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzik.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzik.zza = i20;
                return i21;
            }
        }
    }

    public static int zzk(int i10, byte[] bArr, int i11, int i12, zzkz zzkz, zzik zzik) {
        zzkt zzkt = (zzkt) zzkz;
        int zzi = zzi(bArr, i11, zzik);
        zzkt.zzh(zzik.zza);
        while (zzi < i12) {
            int zzi2 = zzi(bArr, zzi, zzik);
            if (i10 != zzik.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzik);
            zzkt.zzh(zzik.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i10, zzik zzik) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzik.zzb = j10;
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
            byte b12 = b11;
            i12 = i14;
            b10 = b12;
        }
        zzik.zzb = j11;
        return i12;
    }

    public static int zzm(Object obj, zzmk zzmk, byte[] bArr, int i10, int i11, int i12, zzik zzik) {
        int zzc = ((zzma) zzmk).zzc(obj, bArr, i10, i11, i12, zzik);
        zzik.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzn(java.lang.Object r6, com.google.android.recaptcha.internal.zzmk r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzik r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzj(r9, r8, r0, r11)
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
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.recaptcha.internal.zzlc r6 = com.google.android.recaptcha.internal.zzlc.zzi()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.zzn(java.lang.Object, com.google.android.recaptcha.internal.zzmk, byte[], int, int, com.google.android.recaptcha.internal.zzik):int");
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzik zzik) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzl(bArr, i11, zzik);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzi(bArr, i11, zzik) + zzik.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzi(bArr, i11, zzik);
                    i15 = zzik.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zzo(i15, bArr, i11, i12, zzik);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzlc.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzlc.zzc();
            }
        } else {
            throw zzlc.zzc();
        }
    }

    public static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}

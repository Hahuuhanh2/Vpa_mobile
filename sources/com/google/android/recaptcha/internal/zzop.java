package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzop extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzop zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    /* access modifiers changed from: private */
    public int zzg;
    private String zzh = "";
    private String zzi = "";
    /* access modifiers changed from: private */
    public String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public long zzl;
    private zzka zzm;
    /* access modifiers changed from: private */
    public int zzn;
    private zzod zzo;
    private zzpb zzp;
    /* access modifiers changed from: private */
    public String zzq = "";
    private zzmz zzr;
    private zzka zzs;
    private zzkx zzt = zzks.zzw();
    private int zzu;

    static {
        zzop zzop = new zzop();
        zzb = zzop;
        zzks.zzF(zzop.class, zzop);
    }

    private zzop() {
    }

    public static zzop zzJ(byte[] bArr) {
        return (zzop) zzks.zzv(zzb, bArr);
    }

    public static /* synthetic */ void zzO(zzop zzop, zzod zzod) {
        zzop.zzo = zzod;
        zzop.zzd |= 2;
    }

    public static /* synthetic */ void zzP(zzop zzop, zzpb zzpb) {
        zzpb.getClass();
        zzop.zzp = zzpb;
        zzop.zzd |= 4;
    }

    public static /* synthetic */ void zzR(zzop zzop, int i10) {
        zzkx zzkx = zzop.zzt;
        if (!zzkx.zzc()) {
            zzop.zzt = zzks.zzx(zzkx);
        }
        zzop.zzt.zzh(0);
    }

    public static /* synthetic */ void zzS(zzop zzop, int i10) {
        zzop.zzd |= 32;
        zzop.zzu = i10;
    }

    public static /* synthetic */ void zzT(zzop zzop, String str) {
        str.getClass();
        zzop.zzh = str;
    }

    public static /* synthetic */ void zzU(zzop zzop, String str) {
        str.getClass();
        zzop.zzi = str;
    }

    public static zzoo zzi() {
        return (zzoo) zzb.zzp();
    }

    public static zzop zzk() {
        return zzb;
    }

    public final String zzK() {
        return this.zzi;
    }

    public final String zzL() {
        return this.zzj;
    }

    public final boolean zzV() {
        return (this.zzd & 2) != 0;
    }

    public final int zzW() {
        int i10;
        switch (this.zzg) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            case 13:
                i10 = 15;
                break;
            case 14:
                i10 = 16;
                break;
            case 15:
                i10 = 17;
                break;
            case 16:
                i10 = 18;
                break;
            case 17:
                i10 = 19;
                break;
            case 18:
                i10 = 20;
                break;
            case 19:
                i10 = 21;
                break;
            case 20:
                i10 = 22;
                break;
            case 21:
                i10 = 23;
                break;
            case 22:
                i10 = 24;
                break;
            case 23:
                i10 = 25;
                break;
            case 24:
                i10 = 26;
                break;
            case 25:
                i10 = 27;
                break;
            case 26:
                i10 = 28;
                break;
            case 27:
                i10 = 29;
                break;
            case 28:
                i10 = 30;
                break;
            case 29:
                i10 = 31;
                break;
            case 30:
                i10 = 32;
                break;
            case 31:
                i10 = 33;
                break;
            case 32:
                i10 = 34;
                break;
            case 33:
                i10 = 35;
                break;
            case 34:
                i10 = 36;
                break;
            case 35:
                i10 = 37;
                break;
            case 36:
                i10 = 38;
                break;
            case 37:
                i10 = 39;
                break;
            case 38:
                i10 = 40;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzX() {
        int i10 = this.zzn;
        int i11 = 2;
        if (i10 != 0) {
            i11 = i10 != 1 ? i10 != 2 ? 0 : 4 : 3;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzod zzg() {
        zzod zzod = this.zzo;
        if (zzod == null) {
            return zzod.zzj();
        }
        return zzod;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0010\u0001\u0001\u0001\u0012\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zznw.class, "zzt", "zzu"});
        } else if (i11 == 3) {
            return new zzop();
        } else {
            if (i11 == 4) {
                return new zzoo((zzon) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

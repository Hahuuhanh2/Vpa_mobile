package qc;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import com.google.android.gms.internal.mlkit_vision_barcode.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oc.a;
import pc.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public final zzq f14438a;

    public l(zzq zzq) {
        this.f14438a = zzq;
    }

    public final a.h a() {
        zzm zzm = this.f14438a.zzg;
        if (zzm != null) {
            return new a.h(zzm.zzb, zzm.zza);
        }
        return null;
    }

    public final Rect b() {
        zzq zzq = this.f14438a;
        if (zzq.zze == null) {
            return null;
        }
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzq.zze;
            if (i10 >= pointArr.length) {
                return new Rect(i12, i13, i11, i14);
            }
            Point point = pointArr[i10];
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
            i10++;
        }
    }

    public final String c() {
        return this.f14438a.zzb;
    }

    public final a.c d() {
        a.b bVar;
        a.b bVar2;
        zzg zzg = this.f14438a.zzl;
        if (zzg == null) {
            return null;
        }
        String str = zzg.zza;
        String str2 = zzg.zzb;
        String str3 = zzg.zzc;
        String str4 = zzg.zzd;
        String str5 = zzg.zze;
        zzf zzf = zzg.zzf;
        if (zzf == null) {
            bVar = null;
        } else {
            bVar = new a.b(zzf.zza, zzf.zzb, zzf.zzc, zzf.zzd, zzf.zze, zzf.zzf, zzf.zzg);
        }
        zzf zzf2 = zzg.zzg;
        if (zzf2 == null) {
            bVar2 = null;
        } else {
            int i10 = zzf2.zza;
            int i11 = zzf2.zzb;
            int i12 = zzf2.zzc;
            int i13 = zzf2.zzd;
            bVar2 = new a.b(i10, i11, i12, i13, zzf2.zze, zzf2.zzf, zzf2.zzg);
        }
        return new a.c(str, str2, str3, str4, str5, bVar, bVar2);
    }

    public final int e() {
        return this.f14438a.zzd;
    }

    public final a.i f() {
        zzn zzn = this.f14438a.zzh;
        if (zzn != null) {
            return new a.i(zzn.zza, zzn.zzb);
        }
        return null;
    }

    public final a.d g() {
        List list;
        zzh zzh = this.f14438a.zzm;
        a.g gVar = null;
        if (zzh == null) {
            return null;
        }
        zzl zzl = zzh.zza;
        if (zzl != null) {
            gVar = new a.g(zzl.zza, zzl.zzb, zzl.zzc, zzl.zzd, zzl.zze, zzl.zzf, zzl.zzg);
        }
        a.g gVar2 = gVar;
        String str = zzh.zzb;
        String str2 = zzh.zzc;
        zzm[] zzmArr = zzh.zzd;
        ArrayList arrayList = new ArrayList();
        if (zzmArr != null) {
            for (zzm zzm : zzmArr) {
                if (zzm != null) {
                    arrayList.add(new a.h(zzm.zzb, zzm.zza));
                }
            }
        }
        zzj[] zzjArr = zzh.zze;
        ArrayList arrayList2 = new ArrayList();
        if (zzjArr != null) {
            for (zzj zzj : zzjArr) {
                if (zzj != null) {
                    arrayList2.add(new a.e(zzj.zza, zzj.zzb, zzj.zzc, zzj.zzd));
                }
            }
        }
        String[] strArr = zzh.zzf;
        if (strArr != null) {
            list = Arrays.asList(strArr);
        } else {
            list = new ArrayList();
        }
        List list2 = list;
        zze[] zzeArr = zzh.zzg;
        ArrayList arrayList3 = new ArrayList();
        if (zzeArr != null) {
            for (zze zze : zzeArr) {
                if (zze != null) {
                    arrayList3.add(new a.C0171a(zze.zza, zze.zzb));
                }
            }
        }
        return new a.d(gVar2, str, str2, arrayList, arrayList2, list2, arrayList3);
    }

    public final int getFormat() {
        return this.f14438a.zza;
    }

    public final a.j getUrl() {
        zzo zzo = this.f14438a.zzj;
        if (zzo != null) {
            return new a.j(zzo.zza, zzo.zzb);
        }
        return null;
    }

    public final byte[] h() {
        return this.f14438a.zzo;
    }

    public final Point[] i() {
        return this.f14438a.zze;
    }

    public final a.e j() {
        zzj zzj = this.f14438a.zzf;
        if (zzj != null) {
            return new a.e(zzj.zza, zzj.zzb, zzj.zzc, zzj.zzd);
        }
        return null;
    }

    public final a.f k() {
        zzk zzk = this.f14438a.zzk;
        if (zzk != null) {
            return new a.f(zzk.zza, zzk.zzb);
        }
        return null;
    }

    public final a.k l() {
        zzp zzp = this.f14438a.zzi;
        if (zzp != null) {
            return new a.k(zzp.zza, zzp.zzb, zzp.zzc);
        }
        return null;
    }
}

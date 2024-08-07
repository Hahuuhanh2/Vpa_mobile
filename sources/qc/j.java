package qc;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsa;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oc.a;
import pc.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final zzsm f14429a;

    public j(zzsm zzsm) {
        this.f14429a = zzsm;
    }

    public static a.b m(zzsb zzsb) {
        if (zzsb == null) {
            return null;
        }
        int zzf = zzsb.zzf();
        int zzd = zzsb.zzd();
        int zza = zzsb.zza();
        int zzb = zzsb.zzb();
        int zzc = zzsb.zzc();
        int zze = zzsb.zze();
        boolean zzh = zzsb.zzh();
        zzsb.zzg();
        return new a.b(zzf, zzd, zza, zzb, zzc, zze, zzh);
    }

    public final a.h a() {
        zzsi zzh = this.f14429a.zzh();
        if (zzh != null) {
            return new a.h(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    public final Rect b() {
        Point[] zzo = this.f14429a.zzo();
        if (zzo == null) {
            return null;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i11 = Math.min(i11, point.x);
            i10 = Math.max(i10, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i11, i12, i10, i13);
    }

    public final String c() {
        return this.f14429a.zzm();
    }

    public final a.c d() {
        zzsc zzc = this.f14429a.zzc();
        if (zzc != null) {
            return new a.c(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), m(zzc.zzb()), m(zzc.zza()));
        }
        return null;
    }

    public final int e() {
        return this.f14429a.zzb();
    }

    public final a.i f() {
        zzsj zzi = this.f14429a.zzi();
        if (zzi != null) {
            return new a.i(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    public final a.d g() {
        List list;
        zzsd zzd = this.f14429a.zzd();
        a.g gVar = null;
        if (zzd == null) {
            return null;
        }
        zzsh zza = zzd.zza();
        if (zza != null) {
            gVar = new a.g(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg());
        }
        a.g gVar2 = gVar;
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzsi[] zzf = zzd.zzf();
        ArrayList arrayList = new ArrayList();
        if (zzf != null) {
            for (zzsi zzsi : zzf) {
                if (zzsi != null) {
                    arrayList.add(new a.h(zzsi.zzb(), zzsi.zza()));
                }
            }
        }
        zzsf[] zze = zzd.zze();
        ArrayList arrayList2 = new ArrayList();
        if (zze != null) {
            for (zzsf zzsf : zze) {
                if (zzsf != null) {
                    arrayList2.add(new a.e(zzsf.zza(), zzsf.zzb(), zzsf.zzd(), zzsf.zzc()));
                }
            }
        }
        if (zzd.zzg() != null) {
            String[] zzg = zzd.zzg();
            y6.j.f(zzg);
            list = Arrays.asList(zzg);
        } else {
            list = new ArrayList();
        }
        List list2 = list;
        zzsa[] zzd2 = zzd.zzd();
        ArrayList arrayList3 = new ArrayList();
        if (zzd2 != null) {
            for (zzsa zzsa : zzd2) {
                if (zzsa != null) {
                    arrayList3.add(new a.C0171a(zzsa.zza(), zzsa.zzb()));
                }
            }
        }
        return new a.d(gVar2, zzb, zzc, arrayList, arrayList2, list2, arrayList3);
    }

    public final int getFormat() {
        return this.f14429a.zza();
    }

    public final a.j getUrl() {
        zzsk zzj = this.f14429a.zzj();
        if (zzj != null) {
            return new a.j(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    public final byte[] h() {
        return this.f14429a.zzn();
    }

    public final Point[] i() {
        return this.f14429a.zzo();
    }

    public final a.e j() {
        zzsf zzf = this.f14429a.zzf();
        if (zzf == null) {
            return null;
        }
        return new a.e(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }

    public final a.f k() {
        zzsg zzg = this.f14429a.zzg();
        if (zzg != null) {
            return new a.f(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    public final a.k l() {
        zzsl zzk = this.f14429a.zzk();
        if (zzk != null) {
            return new a.k(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }
}

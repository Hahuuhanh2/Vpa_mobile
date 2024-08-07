package qc;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_barcode.zzca;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmu;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import rc.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final /* synthetic */ class f implements zzrk {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f14414a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f14415b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zznd f14416c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzca f14417d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzca f14418e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f14419f;

    public /* synthetic */ f(h hVar, long j10, zznd zznd, zzca zzca, zzca zzca2, a aVar) {
        this.f14414a = hVar;
        this.f14415b = j10;
        this.f14416c = zznd;
        this.f14417d = zzca;
        this.f14418e = zzca2;
        this.f14419f = aVar;
    }

    public final zzra zza() {
        zzmo zzmo;
        zznc zznc;
        h hVar = this.f14414a;
        long j10 = this.f14415b;
        zznd zznd = this.f14416c;
        zzca zzca = this.f14417d;
        zzca zzca2 = this.f14418e;
        a aVar = this.f14419f;
        hVar.getClass();
        zznr zznr = new zznr();
        zzmu zzmu = new zzmu();
        zzmu.zzc(Long.valueOf(j10));
        zzmu.zzd(zznd);
        zzmu.zze(Boolean.valueOf(h.f14422k));
        Boolean bool = Boolean.TRUE;
        zzmu.zza(bool);
        zzmu.zzb(bool);
        zznr.zzh(zzmu.zzf());
        zznr.zzi(b.a(hVar.f14423d));
        zznr.zze(zzca.zzf());
        zznr.zzf(zzca2.zzf());
        int i10 = aVar.f14569f;
        h.f14421j.getClass();
        int i11 = aVar.f14569f;
        int i12 = 0;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f14564a;
            j.f(bitmap);
            i12 = bitmap.getAllocationByteCount();
        } else if (i11 == 17 || i11 == 842094169) {
            j.f((Object) null);
            throw null;
        } else if (i11 == 35) {
            Image.Plane[] a10 = aVar.a();
            j.f(a10);
            i12 = (a10[0].getBuffer().limit() * 3) / 2;
        }
        zzmn zzmn = new zzmn();
        if (i10 == -1) {
            zzmo = zzmo.BITMAP;
        } else if (i10 == 35) {
            zzmo = zzmo.YUV_420_888;
        } else if (i10 == 842094169) {
            zzmo = zzmo.YV12;
        } else if (i10 == 16) {
            zzmo = zzmo.NV16;
        } else if (i10 != 17) {
            zzmo = zzmo.UNKNOWN_FORMAT;
        } else {
            zzmo = zzmo.NV21;
        }
        zzmn.zza(zzmo);
        zzmn.zzb(Integer.valueOf(i12));
        zznr.zzg(zzmn.zzd());
        zznf zznf = new zznf();
        if (hVar.f14428i) {
            zznc = zznc.TYPE_THICK;
        } else {
            zznc = zznc.TYPE_THIN;
        }
        zznf.zze(zznc);
        zznf.zzg(zznr.zzj());
        return zzro.zzf(zznf);
    }
}

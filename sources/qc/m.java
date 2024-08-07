package qc;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import lc.l;
import nc.b;
import rc.a;
import sc.c;
import y6.j;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class m implements i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14439a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14440b;

    /* renamed from: c  reason: collision with root package name */
    public final zzad f14441c;

    /* renamed from: d  reason: collision with root package name */
    public final zzrl f14442d;

    /* renamed from: e  reason: collision with root package name */
    public zzaf f14443e;

    public m(Context context, b bVar, zzrl zzrl) {
        zzad zzad = new zzad();
        this.f14441c = zzad;
        this.f14440b = context;
        zzad.zza = bVar.f13565a;
        this.f14442d = zzrl;
    }

    public final ArrayList a(a aVar) {
        zzq[] zzqArr;
        if (this.f14443e == null) {
            zzc();
        }
        zzaf zzaf = this.f14443e;
        if (zzaf != null) {
            zzaj zzaj = new zzaj(aVar.f14566c, aVar.f14567d, 0, 0, sc.b.a(aVar.f14568e));
            try {
                int i10 = aVar.f14569f;
                if (i10 == -1) {
                    zzqArr = zzaf.zzf(new k7.b(aVar.f14564a), zzaj);
                } else if (i10 == 17) {
                    zzqArr = zzaf.zze(new k7.b((Object) null), zzaj);
                } else if (i10 == 35) {
                    Image.Plane[] a10 = aVar.a();
                    j.f(a10);
                    zzaj.zza = a10[0].getRowStride();
                    zzqArr = zzaf.zze(new k7.b(a10[0].getBuffer()), zzaj);
                } else if (i10 == 842094169) {
                    zzqArr = zzaf.zze(new k7.b(c.a(aVar)), zzaj);
                } else {
                    throw new MlKitException("Unsupported image format: " + aVar.f14569f, 3);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq lVar : zzqArr) {
                    arrayList.add(new oc.a(new l(lVar), aVar.f14570g));
                }
                return arrayList;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to detect with legacy barcode detector", (Exception) e10);
            }
        } else {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
    }

    public final void zzb() {
        zzaf zzaf = this.f14443e;
        if (zzaf != null) {
            try {
                zzaf.zzd();
            } catch (RemoteException unused) {
            }
            this.f14443e = null;
        }
    }

    public final boolean zzc() {
        if (this.f14443e != null) {
            return false;
        }
        try {
            zzaf zzd = zzah.zza(DynamiteModule.c(this.f14440b, DynamiteModule.f5524b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(new k7.b(this.f14440b), this.f14441c);
            this.f14443e = zzd;
            if (zzd == null) {
                if (!this.f14439a) {
                    Context context = this.f14440b;
                    Feature[] featureArr = l.f12923a;
                    l.a(context, zzar.zzh("barcode"));
                    this.f14439a = true;
                    b.b(this.f14442d, zznd.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
            }
            b.b(this.f14442d, zznd.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to create legacy barcode detector.", (Exception) e10);
        } catch (DynamiteModule.LoadingException e11) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", (Exception) e11);
        }
    }
}

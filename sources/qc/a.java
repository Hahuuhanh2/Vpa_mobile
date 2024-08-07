package qc;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzne;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznr;
import com.google.android.gms.internal.mlkit_vision_barcode.zznt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.Executor;
import lc.l;
import nc.b;
import sc.e;
import sc.f;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class a extends e<List<oc.a>> implements nc.a {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14405f;

    public a(b bVar, h hVar, Executor executor, zzrl zzrl) {
        super(hVar, executor);
        zznc zznc;
        boolean c10 = b.c();
        this.f14405f = c10;
        zznr zznr = new zznr();
        zznr.zzi(b.a(bVar));
        zznt zzj = zznr.zzj();
        zznf zznf = new zznf();
        if (c10) {
            zznc = zznc.TYPE_THICK;
        } else {
            zznc = zznc.TYPE_THIN;
        }
        zznf.zze(zznc);
        zznf.zzg(zzj);
        zzrl.zzd(zzro.zzg(zznf, 1), zzne.ON_DEVICE_BARCODE_CREATE);
    }

    public final Task<List<oc.a>> D(rc.a aVar) {
        Task<List<oc.a>> task;
        synchronized (this) {
            if (this.f14731a.get()) {
                task = Tasks.forException(new MlKitException("This detector is already closed!", 14));
            } else if (aVar.f14566c < 32 || aVar.f14567d < 32) {
                task = Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
            } else {
                task = this.f14732b.a(this.f14734d, new f(this, aVar), this.f14733c.getToken());
            }
        }
        return task;
    }

    public final Feature[] d() {
        if (this.f14405f) {
            return l.f12923a;
        }
        return new Feature[]{l.f12924b};
    }
}

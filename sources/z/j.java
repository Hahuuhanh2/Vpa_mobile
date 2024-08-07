package z;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import b5.t;
import ba.r;
import c7.p;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g5.b;
import ga.a;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import pa.c;
import pa.f;
import s4.d;
import s4.h;
import u4.u;
import w6.m;

/* compiled from: MeteringRegionCorrection */
public class j implements d, b, m, SuccessContinuation, n7.d, Continuation, a, zzrk {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17752a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17753b;

    public j(int i10) {
        this.f17752a = i10;
        if (i10 == 16) {
            this.f17753b = qd.a.f14444e;
        }
    }

    public final c a(JSONObject jSONObject) {
        f fVar;
        if (jSONObject.getInt("settings_version") != 3) {
            fVar = new pa.a();
        } else {
            fVar = new pa.j();
        }
        return fVar.a((a.a) this.f17753b, jSONObject);
    }

    public final void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.a aVar = z6.c.f17891a;
        z6.a aVar2 = (z6.a) ((z6.d) obj).getService();
        Parcel zaa = aVar2.zaa();
        zac.zad(zaa, (TelemetryData) this.f17753b);
        aVar2.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    public final void c(Bundle bundle) {
        ((p9.a) this.f17753b).c("clx", "_ae", bundle);
    }

    public final u f(u uVar, h hVar) {
        Resources resources = (Resources) this.f17753b;
        if (uVar == null) {
            return null;
        }
        return new t(resources, uVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038 A[SYNTHETIC, Splitter:B:20:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[SYNTHETIC, Splitter:B:27:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Object r4, java.io.File r5, s4.h r6) {
        /*
            r3 = this;
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.lang.Object r6 = r3.f17753b
            v4.b r6 = (v4.b) r6
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r6 = r6.c(r1, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0030 }
        L_0x0017:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            r1 = -1
            if (r5 == r1) goto L_0x0022
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            goto L_0x0017
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            goto L_0x0044
        L_0x002c:
            r1 = r2
            goto L_0x0030
        L_0x002e:
            r4 = move-exception
            goto L_0x0043
        L_0x0030:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            java.lang.Object r4 = r3.f17753b
            v4.b r4 = (v4.b) r4
            r4.put(r6)
            return r0
        L_0x0043:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            java.lang.Object r5 = r3.f17753b
            v4.b r5 = (v4.b) r5
            r5.put(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.i(java.lang.Object, java.io.File, s4.h):boolean");
    }

    public final Task then(Object obj) {
        AtomicReference atomicReference = (AtomicReference) this.f17753b;
        Void voidR = (Void) obj;
        com.google.android.gms.common.api.a aVar = p.f4584a;
        if (atomicReference.get() != null) {
            return Tasks.forResult((ModuleInstallResponse) atomicReference.get());
        }
        return Tasks.forException(new ApiException(Status.f5342n));
    }

    public final String toString() {
        switch (this.f17752a) {
            case 14:
                return ((URL) this.f17753b).toString();
            default:
                return super.toString();
        }
    }

    public final zzra zza() {
        zznc zznc;
        zznd zznd = (zznd) this.f17753b;
        zznf zznf = new zznf();
        if (qc.b.c()) {
            zznc = zznc.TYPE_THICK;
        } else {
            zznc = zznc.TYPE_THIN;
        }
        zznf.zze(zznc);
        zznu zznu = new zznu();
        zznu.zzb(zznd);
        zznf.zzh(zznu.zzc());
        return zzro.zzf(zznf);
    }

    public j(WorkDatabase workDatabase) {
        this.f17752a = 2;
        sk.j.f(workDatabase, "workDatabase");
        this.f17753b = workDatabase;
    }

    public final Object then(Task task) {
        r rVar = (r) this.f17753b;
        if (task.isSuccessful()) {
            return rVar.a((String) task.getResult());
        }
        Exception exception = task.getException();
        y6.j.f(exception);
        exception.getMessage();
        return rVar.a("NO_RECAPTCHA");
    }

    public /* synthetic */ j(Object obj, int i10) {
        this.f17752a = i10;
        this.f17753b = obj;
    }

    public j(ViewGroup viewGroup) {
        this.f17752a = 9;
        this.f17753b = viewGroup.getOverlay();
    }

    public j(Resources resources) {
        this.f17752a = 4;
        this.f17753b = resources;
    }
}

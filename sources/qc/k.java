package qc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsz;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import nc.b;
import rc.a;
import sc.d;
import y6.j;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class k implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final zzcd f14430h = zzcd.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a  reason: collision with root package name */
    public boolean f14431a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14432b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14433c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f14434d;

    /* renamed from: e  reason: collision with root package name */
    public final b f14435e;

    /* renamed from: f  reason: collision with root package name */
    public final zzrl f14436f;

    /* renamed from: g  reason: collision with root package name */
    public zzsw f14437g;

    public k(Context context, b bVar, zzrl zzrl) {
        this.f14434d = context;
        this.f14435e = bVar;
        this.f14436f = zzrl;
    }

    public final ArrayList a(a aVar) {
        k7.b bVar;
        if (this.f14437g == null) {
            zzc();
        }
        zzsw zzsw = this.f14437g;
        j.f(zzsw);
        if (!this.f14431a) {
            try {
                zzsw.zze();
                this.f14431a = true;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to init barcode scanner.", (Exception) e10);
            }
        }
        int i10 = aVar.f14566c;
        if (aVar.f14569f == 35) {
            Image.Plane[] a10 = aVar.a();
            j.f(a10);
            i10 = a10[0].getRowStride();
        }
        zztf zztf = new zztf(aVar.f14569f, i10, aVar.f14567d, sc.b.a(aVar.f14568e), SystemClock.elapsedRealtime());
        d.f14729a.getClass();
        int i11 = aVar.f14569f;
        if (i11 != -1) {
            Image image = null;
            if (i11 != 17) {
                if (i11 == 35) {
                    if (aVar.f14565b != null) {
                        image = aVar.f14565b.f14571a;
                    }
                    bVar = new k7.b(image);
                } else if (i11 != 842094169) {
                    throw new MlKitException(android.support.v4.media.a.m("Unsupported image format: ", aVar.f14569f), 3);
                }
            }
            j.f((Object) null);
            throw null;
        }
        Bitmap bitmap = aVar.f14564a;
        j.f(bitmap);
        bVar = new k7.b(bitmap);
        try {
            List<zzsm> zzd = zzsw.zzd(bVar, zztf);
            ArrayList arrayList = new ArrayList();
            for (zzsm jVar : zzd) {
                arrayList.add(new oc.a(new j(jVar), aVar.f14570g));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run barcode scanner.", (Exception) e11);
        }
    }

    public final zzsw b(DynamiteModule.a aVar, String str, String str2) {
        zzsz zza = zzsy.zza(DynamiteModule.c(this.f14434d, aVar, str).b(str2));
        k7.b bVar = new k7.b(this.f14434d);
        b bVar2 = this.f14435e;
        return zza.zzd(bVar, new zzso(bVar2.f13565a, bVar2.f13566b));
    }

    public final void zzb() {
        zzsw zzsw = this.f14437g;
        if (zzsw != null) {
            try {
                zzsw.zzf();
            } catch (RemoteException unused) {
            }
            this.f14437g = null;
            this.f14431a = false;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc() {
        /*
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_barcode.zzsw r0 = r6.f14437g
            if (r0 == 0) goto L_0x0007
            boolean r0 = r6.f14432b
            return r0
        L_0x0007:
            android.content.Context r0 = r6.f14434d
            java.lang.String r1 = "com.google.mlkit.dynamite.barcode"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.a(r0, r1)
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            if (r0 == 0) goto L_0x0038
            r6.f14432b = r2
            com.google.android.gms.dynamite.c r0 = com.google.android.gms.dynamite.DynamiteModule.f5525c     // Catch:{ LoadingException -> 0x002f, RemoteException -> 0x0026 }
            java.lang.String r2 = "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator"
            com.google.android.gms.internal.mlkit_vision_barcode.zzsw r0 = r6.b(r0, r1, r2)     // Catch:{ LoadingException -> 0x002f, RemoteException -> 0x0026 }
            r6.f14437g = r0     // Catch:{ LoadingException -> 0x002f, RemoteException -> 0x0026 }
            goto L_0x00ca
        L_0x0026:
            r0 = move-exception
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to create thick barcode scanner."
            r1.<init>((java.lang.String) r2, (java.lang.Exception) r0)
            throw r1
        L_0x002f:
            r0 = move-exception
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to load the bundled barcode module."
            r1.<init>((java.lang.String) r2, (java.lang.Exception) r0)
            throw r1
        L_0x0038:
            r6.f14432b = r3
            android.content.Context r0 = r6.f14434d
            com.google.android.gms.internal.mlkit_vision_barcode.zzcd r1 = f14430h
            com.google.android.gms.common.Feature[] r4 = lc.l.f12923a
            u6.b r4 = u6.b.f15290b
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r4 = u6.d.f15292a
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0054 }
            java.lang.String r5 = "com.google.android.gms"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            int r4 = r4.versionCode
            goto L_0x0055
        L_0x0054:
            r4 = r3
        L_0x0055:
            r5 = 221500000(0xd33d260, float:5.5411863E-31)
            if (r4 < r5) goto L_0x0081
            com.google.android.gms.internal.mlkit_common.zzau r4 = lc.l.f12926d
            com.google.android.gms.common.Feature[] r1 = lc.l.b(r1, r4)
            c7.p r4 = new c7.p     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            r4.<init>(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            v6.b[] r0 = new v6.b[r2]     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            lc.u r5 = new lc.u     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            r5.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            r0[r3] = r5     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            com.google.android.gms.tasks.Task r0 = r4.a(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            p3.l0 r1 = p3.l0.f13956n     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            com.google.android.gms.tasks.Task r0 = r0.addOnFailureListener(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r0 = (com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            boolean r3 = r0.f5441a     // Catch:{ InterruptedException | ExecutionException -> 0x0098 }
            goto L_0x0098
        L_0x0081:
            java.util.Iterator r1 = r1.iterator()     // Catch:{  }
        L_0x0085:
            boolean r4 = r1.hasNext()     // Catch:{  }
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r1.next()     // Catch:{  }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{  }
            com.google.android.gms.dynamite.b r5 = com.google.android.gms.dynamite.DynamiteModule.f5524b     // Catch:{  }
            com.google.android.gms.dynamite.DynamiteModule.c(r0, r5, r4)     // Catch:{  }
            goto L_0x0085
        L_0x0097:
            r3 = r2
        L_0x0098:
            if (r3 != 0) goto L_0x00be
            boolean r0 = r6.f14433c
            if (r0 != 0) goto L_0x00ad
            android.content.Context r0 = r6.f14434d
            java.lang.String r1 = "barcode"
            java.lang.String r3 = "tflite_dynamite"
            com.google.android.gms.internal.mlkit_vision_barcode.zzcd r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzcd.zzh(r1, r3)
            lc.l.a(r0, r1)
            r6.f14433c = r2
        L_0x00ad:
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r0 = r6.f14436f
            com.google.android.gms.internal.mlkit_vision_barcode.zznd r1 = com.google.android.gms.internal.mlkit_vision_barcode.zznd.OPTIONAL_MODULE_NOT_AVAILABLE
            qc.b.b(r0, r1)
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            r1 = 14
            java.lang.String r2 = "Waiting for the barcode module to be downloaded. Please wait."
            r0.<init>((java.lang.String) r2, (int) r1)
            throw r0
        L_0x00be:
            com.google.android.gms.dynamite.b r0 = com.google.android.gms.dynamite.DynamiteModule.f5524b     // Catch:{ LoadingException -> 0x00d6, RemoteException -> 0x00d4 }
            java.lang.String r1 = "com.google.android.gms.vision.barcode"
            java.lang.String r2 = "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator"
            com.google.android.gms.internal.mlkit_vision_barcode.zzsw r0 = r6.b(r0, r1, r2)     // Catch:{ LoadingException -> 0x00d6, RemoteException -> 0x00d4 }
            r6.f14437g = r0     // Catch:{ LoadingException -> 0x00d6, RemoteException -> 0x00d4 }
        L_0x00ca:
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r0 = r6.f14436f
            com.google.android.gms.internal.mlkit_vision_barcode.zznd r1 = com.google.android.gms.internal.mlkit_vision_barcode.zznd.NO_ERROR
            qc.b.b(r0, r1)
            boolean r0 = r6.f14432b
            return r0
        L_0x00d4:
            r0 = move-exception
            goto L_0x00d7
        L_0x00d6:
            r0 = move-exception
        L_0x00d7:
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r1 = r6.f14436f
            com.google.android.gms.internal.mlkit_vision_barcode.zznd r2 = com.google.android.gms.internal.mlkit_vision_barcode.zznd.OPTIONAL_MODULE_INIT_ERROR
            qc.b.b(r1, r2)
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to create thin barcode scanner."
            r1.<init>((java.lang.String) r2, (java.lang.Exception) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.k.zzc():boolean");
    }
}

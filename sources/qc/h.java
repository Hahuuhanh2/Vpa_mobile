package qc;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import lc.f;
import nc.b;
import sc.a;
import sc.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class h extends f {

    /* renamed from: j  reason: collision with root package name */
    public static final d f14421j = d.f14729a;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f14422k = true;

    /* renamed from: d  reason: collision with root package name */
    public final b f14423d;

    /* renamed from: e  reason: collision with root package name */
    public final i f14424e;

    /* renamed from: f  reason: collision with root package name */
    public final zzrl f14425f;

    /* renamed from: g  reason: collision with root package name */
    public final zzrn f14426g;

    /* renamed from: h  reason: collision with root package name */
    public final a f14427h = new a();

    /* renamed from: i  reason: collision with root package name */
    public boolean f14428i;

    public h(lc.h hVar, b bVar, i iVar, zzrl zzrl) {
        if (hVar == null) {
            throw new NullPointerException("MlKitContext can not be null");
        } else if (bVar != null) {
            this.f14423d = bVar;
            this.f14424e = iVar;
            this.f14425f = zzrl;
            this.f14426g = zzrn.zza(hVar.b());
        } else {
            throw new NullPointerException("BarcodeScannerOptions can not be null");
        }
    }

    public final List b(rc.a aVar) {
        zznd zznd;
        ArrayList a10;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14427h.a(aVar);
            try {
                a10 = this.f14424e.a(aVar);
                c(zznd.NO_ERROR, elapsedRealtime, aVar, a10);
                f14422k = false;
            } catch (MlKitException e10) {
                MlKitException mlKitException = e10;
                if (mlKitException.f7856a == 14) {
                    zznd = zznd.MODEL_NOT_DOWNLOADED;
                } else {
                    zznd = zznd.UNKNOWN_ERROR;
                }
                c(zznd, elapsedRealtime, aVar, (List) null);
                throw mlKitException;
            }
        }
        return a10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r2 == 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.internal.mlkit_vision_barcode.zznd r28, long r29, rc.a r31, java.util.List r32) {
        /*
            r27 = this;
            r8 = r27
            com.google.android.gms.internal.mlkit_vision_barcode.zzca r9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzca
            r9.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zzca r10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzca
            r10.<init>()
            if (r32 == 0) goto L_0x0053
            java.util.Iterator r0 = r32.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            oc.a r1 = (oc.a) r1
            pc.a r2 = r1.f13817a
            int r2 = r2.getFormat()
            r3 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            if (r2 > r4) goto L_0x002c
            if (r2 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002c:
            r2 = r3
        L_0x002d:
            r3 = r2
        L_0x002e:
            android.util.SparseArray r2 = qc.b.f14406a
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.mlkit_vision_barcode.zznp r2 = (com.google.android.gms.internal.mlkit_vision_barcode.zznp) r2
            if (r2 != 0) goto L_0x003a
            com.google.android.gms.internal.mlkit_vision_barcode.zznp r2 = com.google.android.gms.internal.mlkit_vision_barcode.zznp.FORMAT_UNKNOWN
        L_0x003a:
            r9.zzd(r2)
            pc.a r1 = r1.f13817a
            int r1 = r1.e()
            android.util.SparseArray r2 = qc.b.f14407b
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zznq r1 = (com.google.android.gms.internal.mlkit_vision_barcode.zznq) r1
            if (r1 != 0) goto L_0x004f
            com.google.android.gms.internal.mlkit_vision_barcode.zznq r1 = com.google.android.gms.internal.mlkit_vision_barcode.zznq.TYPE_UNKNOWN
        L_0x004f:
            r10.zzd(r1)
            goto L_0x0012
        L_0x0053:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r18 = r0 - r29
            qc.f r11 = new qc.f
            r0 = r11
            r1 = r27
            r2 = r18
            r4 = r28
            r5 = r9
            r6 = r10
            r7 = r31
            r0.<init>(r1, r2, r4, r5, r6, r7)
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r0 = r8.f14425f
            com.google.android.gms.internal.mlkit_vision_barcode.zzne r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzne.ON_DEVICE_BARCODE_DETECT
            r0.zzf(r11, r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdx r0 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdx
            r0.<init>()
            r1 = r28
            r0.zze(r1)
            boolean r2 = f14422k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zzf(r2)
            nc.b r2 = r8.f14423d
            com.google.android.gms.internal.mlkit_vision_barcode.zzqv r2 = qc.b.a(r2)
            r0.zzg(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcd r2 = r9.zzf()
            r0.zzc(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcd r2 = r10.zzf()
            r0.zzd(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz r14 = r0.zzh()
            qc.g r0 = new qc.g
            r0.<init>(r8)
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r12 = r8.f14425f
            com.google.android.gms.internal.mlkit_vision_barcode.zzne r13 = com.google.android.gms.internal.mlkit_vision_barcode.zzne.AGGREGATED_ON_DEVICE_BARCODE_DETECTION
            java.lang.Object r2 = lc.g.f12910b
            lc.q r2 = lc.q.f12936a
            com.google.android.gms.internal.mlkit_vision_barcode.zzri r3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzri
            r11 = r3
            r15 = r18
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r17)
            r2.execute(r3)
            long r25 = java.lang.System.currentTimeMillis()
            r0 = 1
            boolean r2 = r8.f14428i
            long r23 = r25 - r18
            com.google.android.gms.internal.mlkit_vision_barcode.zzrn r3 = r8.f14426g
            if (r0 == r2) goto L_0x00c8
            r0 = 24301(0x5eed, float:3.4053E-41)
            goto L_0x00ca
        L_0x00c8:
            r0 = 24302(0x5eee, float:3.4054E-41)
        L_0x00ca:
            r21 = r0
            int r22 = r28.zza()
            r20 = r3
            r20.zzc(r21, r22, r23, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.h.c(com.google.android.gms.internal.mlkit_vision_barcode.zznd, long, rc.a, java.util.List):void");
    }
}

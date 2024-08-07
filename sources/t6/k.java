package t6;

import ba.h;
import y6.j;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14858a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14859b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14860c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f14858a = i10;
        this.f14859b = obj;
        this.f14860c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r0.a(0, r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0076, B:22:0x007b] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f14858a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x002f;
                case 2: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00a1
        L_0x0008:
            java.lang.Object r0 = r8.f14859b
            java.lang.ref.ReferenceQueue r0 = (java.lang.ref.ReferenceQueue) r0
            java.lang.Object r1 = r8.f14860c
            java.util.Set r1 = (java.util.Set) r1
        L_0x0010:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x002e
            java.lang.ref.Reference r2 = r0.remove()     // Catch:{ InterruptedException -> 0x0010 }
            lc.p r2 = (lc.p) r2     // Catch:{ InterruptedException -> 0x0010 }
            java.util.Set r3 = r2.f12934a     // Catch:{ InterruptedException -> 0x0010 }
            boolean r3 = r3.remove(r2)     // Catch:{ InterruptedException -> 0x0010 }
            if (r3 != 0) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            r2.clear()     // Catch:{ InterruptedException -> 0x0010 }
            java.lang.Runnable r2 = r2.f12935b     // Catch:{ InterruptedException -> 0x0010 }
            r2.run()     // Catch:{ InterruptedException -> 0x0010 }
            goto L_0x0010
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r8.f14859b
            java.lang.String r0 = (java.lang.String) r0
            m9.d r0 = m9.d.e(r0)
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            com.google.firebase.auth.FirebaseUser r2 = r0.f7476f
            if (r2 == 0) goto L_0x0068
            com.google.android.gms.internal.firebase-auth-api.zzahb r3 = r2.W0()
            r3.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzadv r4 = r0.f7475e
            m9.d r5 = r0.f7471a
            java.lang.String r3 = r3.zzf()
            aa.x r6 = new aa.x
            r6.<init>(r0)
            com.google.android.gms.tasks.Task r0 = r4.zzk(r5, r2, r3, r6)
            a7.a r2 = ba.h.f4112e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Token refreshing started"
            r2.b(r3, r1)
            z.d r1 = new z.d
            r1.<init>((java.lang.Object) r8)
            r0.addOnFailureListener(r1)
        L_0x0068:
            return
        L_0x0069:
            java.lang.Object r0 = r8.f14859b
            t6.m r0 = (t6.m) r0
            java.lang.Object r2 = r8.f14860c
            android.os.IBinder r2 = (android.os.IBinder) r2
            monitor-enter(r0)
            if (r2 != 0) goto L_0x007b
            java.lang.String r2 = "Null service connection"
            r0.a(r1, r2)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x009e
        L_0x007b:
            x2.g r3 = new x2.g     // Catch:{ RemoteException -> 0x0095 }
            r3.<init>((android.os.IBinder) r2)     // Catch:{ RemoteException -> 0x0095 }
            r0.f14865c = r3     // Catch:{ RemoteException -> 0x0095 }
            r1 = 2
            r0.f14863a = r1     // Catch:{ all -> 0x0093 }
            t6.q r1 = r0.f14868f     // Catch:{ all -> 0x0093 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.f14875b     // Catch:{ all -> 0x0093 }
            t6.i r2 = new t6.i     // Catch:{ all -> 0x0093 }
            r2.<init>((android.content.ServiceConnection) r0)     // Catch:{ all -> 0x0093 }
            r1.execute(r2)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            goto L_0x009e
        L_0x0093:
            r1 = move-exception
            goto L_0x009f
        L_0x0095:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0093 }
            r0.a(r1, r2)     // Catch:{ all -> 0x0093 }
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
        L_0x009e:
            return
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            throw r1
        L_0x00a1:
            java.lang.Object r0 = r8.f14859b
            lc.j r0 = (lc.j) r0
            java.lang.Object r2 = r8.f14860c
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f12919b
            int r3 = r3.decrementAndGet()
            r4 = 1
            if (r3 < 0) goto L_0x00b4
            r5 = r4
            goto L_0x00b5
        L_0x00b4:
            r5 = r1
        L_0x00b5:
            y6.j.i(r5)
            if (r3 != 0) goto L_0x0100
            r3 = r0
            qc.h r3 = (qc.h) r3
            monitor-enter(r3)
            qc.i r5 = r3.f14424e     // Catch:{ all -> 0x00fd }
            r5.zzb()     // Catch:{ all -> 0x00fd }
            qc.h.f14422k = r4     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zzrl r4 = r3.f14425f     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zznf r5 = new com.google.android.gms.internal.mlkit_vision_barcode.zznf     // Catch:{ all -> 0x00fd }
            r5.<init>()     // Catch:{ all -> 0x00fd }
            boolean r6 = r3.f14428i     // Catch:{ all -> 0x00fd }
            if (r6 == 0) goto L_0x00d3
            com.google.android.gms.internal.mlkit_vision_barcode.zznc r6 = com.google.android.gms.internal.mlkit_vision_barcode.zznc.TYPE_THICK     // Catch:{ all -> 0x00fd }
            goto L_0x00d5
        L_0x00d3:
            com.google.android.gms.internal.mlkit_vision_barcode.zznc r6 = com.google.android.gms.internal.mlkit_vision_barcode.zznc.TYPE_THIN     // Catch:{ all -> 0x00fd }
        L_0x00d5:
            r5.zze(r6)     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zznr r6 = new com.google.android.gms.internal.mlkit_vision_barcode.zznr     // Catch:{ all -> 0x00fd }
            r6.<init>()     // Catch:{ all -> 0x00fd }
            nc.b r7 = r3.f14423d     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zzqv r7 = qc.b.a(r7)     // Catch:{ all -> 0x00fd }
            r6.zzi(r7)     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zznt r6 = r6.zzj()     // Catch:{ all -> 0x00fd }
            r5.zzg(r6)     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zzra r5 = com.google.android.gms.internal.mlkit_vision_barcode.zzro.zzf(r5)     // Catch:{ all -> 0x00fd }
            com.google.android.gms.internal.mlkit_vision_barcode.zzne r6 = com.google.android.gms.internal.mlkit_vision_barcode.zzne.ON_DEVICE_BARCODE_CLOSE     // Catch:{ all -> 0x00fd }
            r4.zzd(r5, r6)     // Catch:{ all -> 0x00fd }
            monitor-exit(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12920c
            r0.set(r1)
            goto L_0x0100
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0100:
            com.google.android.gms.internal.mlkit_common.zzox.zza()
            r0 = 0
            r2.setResult(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.k.run():void");
    }

    public k(h hVar, String str) {
        this.f14858a = 1;
        this.f14860c = hVar;
        j.c(str);
        this.f14859b = str;
    }
}

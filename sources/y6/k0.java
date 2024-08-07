package y6;

import android.os.Looper;
import com.google.android.gms.internal.common.zzi;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class k0 extends zzi {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f17568a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(a aVar, Looper looper) {
        super(looper);
        this.f17568a = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            y6.a r0 = r10.f17568a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzd
            int r0 = r0.get()
            int r1 = r11.arg1
            r2 = 0
            r3 = 7
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x0040
            int r0 = r11.what
            if (r0 == r4) goto L_0x0019
            if (r0 == r5) goto L_0x0019
            if (r0 != r3) goto L_0x001a
        L_0x0019:
            r2 = r5
        L_0x001a:
            if (r2 == 0) goto L_0x003f
            java.lang.Object r11 = r11.obj
            y6.l0 r11 = (y6.l0) r11
            r11.b()
            monitor-enter(r11)
            r11.f17569a = r6     // Catch:{ all -> 0x003c }
            monitor-exit(r11)     // Catch:{ all -> 0x003c }
            y6.a r0 = r11.f17571c
            java.util.ArrayList r0 = r0.zzt
            monitor-enter(r0)
            y6.a r1 = r11.f17571c     // Catch:{ all -> 0x0039 }
            java.util.ArrayList r1 = r1.zzt     // Catch:{ all -> 0x0039 }
            r1.remove(r11)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r11
        L_0x003c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            return
        L_0x0040:
            int r0 = r11.what
            r1 = 4
            r7 = 5
            if (r0 == r5) goto L_0x0056
            if (r0 == r3) goto L_0x0056
            if (r0 != r1) goto L_0x0052
            y6.a r0 = r10.f17568a
            boolean r0 = r0.enableLocalFallback()
            if (r0 == 0) goto L_0x0056
        L_0x0052:
            int r0 = r11.what
            if (r0 != r7) goto L_0x005e
        L_0x0056:
            y6.a r0 = r10.f17568a
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L_0x0197
        L_0x005e:
            int r0 = r11.what
            r8 = 8
            r9 = 3
            if (r0 != r1) goto L_0x00a5
            y6.a r0 = r10.f17568a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r11 = r11.arg2
            r1.<init>(r11)
            r0.zzB = r1
            y6.a r11 = r10.f17568a
            boolean r11 = y6.a.zzo(r11)
            if (r11 == 0) goto L_0x0086
            y6.a r11 = r10.f17568a
            boolean r0 = r11.zzC
            if (r0 == 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r11.zzp(r9, (android.os.IInterface) null)
            return
        L_0x0086:
            y6.a r11 = r10.f17568a
            com.google.android.gms.common.ConnectionResult r0 = r11.zzB
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.common.ConnectionResult r11 = r11.zzB
            goto L_0x0098
        L_0x0093:
            com.google.android.gms.common.ConnectionResult r11 = new com.google.android.gms.common.ConnectionResult
            r11.<init>(r8)
        L_0x0098:
            y6.a r0 = r10.f17568a
            y6.a$c r0 = r0.zzc
            r0.a(r11)
            y6.a r0 = r10.f17568a
            r0.onConnectionFailed(r11)
            return
        L_0x00a5:
            if (r0 != r7) goto L_0x00c6
            y6.a r11 = r10.f17568a
            com.google.android.gms.common.ConnectionResult r0 = r11.zzB
            if (r0 == 0) goto L_0x00b4
            com.google.android.gms.common.ConnectionResult r11 = r11.zzB
            goto L_0x00b9
        L_0x00b4:
            com.google.android.gms.common.ConnectionResult r11 = new com.google.android.gms.common.ConnectionResult
            r11.<init>(r8)
        L_0x00b9:
            y6.a r0 = r10.f17568a
            y6.a$c r0 = r0.zzc
            r0.a(r11)
            y6.a r0 = r10.f17568a
            r0.onConnectionFailed(r11)
            return
        L_0x00c6:
            if (r0 != r9) goto L_0x00e5
            java.lang.Object r0 = r11.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00d1
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00d1:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r11 = r11.arg2
            r0.<init>(r11, r6)
            y6.a r11 = r10.f17568a
            y6.a$c r11 = r11.zzc
            r11.a(r0)
            y6.a r11 = r10.f17568a
            r11.onConnectionFailed(r0)
            return
        L_0x00e5:
            r1 = 6
            if (r0 != r1) goto L_0x010f
            y6.a r0 = r10.f17568a
            r0.zzp(r7, (android.os.IInterface) null)
            y6.a r0 = r10.f17568a
            y6.a$a r1 = r0.zzw
            if (r1 == 0) goto L_0x0102
            y6.a$a r0 = r0.zzw
            int r1 = r11.arg2
            y6.u r0 = (y6.u) r0
            w6.c r0 = r0.f17589a
            r0.m(r1)
        L_0x0102:
            y6.a r0 = r10.f17568a
            int r11 = r11.arg2
            r0.onConnectionSuspended(r11)
            y6.a r11 = r10.f17568a
            y6.a.zzn(r11, r7, r5, r6)
            return
        L_0x010f:
            if (r0 != r4) goto L_0x013e
            y6.a r0 = r10.f17568a
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x011a
            goto L_0x013e
        L_0x011a:
            java.lang.Object r11 = r11.obj
            r0 = r11
            y6.l0 r0 = (y6.l0) r0
            r0.b()
            monitor-enter(r0)
            r0.f17569a = r6     // Catch:{ all -> 0x013b }
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            y6.a r11 = r0.f17571c
            java.util.ArrayList r11 = r11.zzt
            monitor-enter(r11)
            y6.a r1 = r0.f17571c     // Catch:{ all -> 0x0138 }
            java.util.ArrayList r1 = r1.zzt     // Catch:{ all -> 0x0138 }
            r1.remove(r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r11)     // Catch:{ all -> 0x0138 }
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0138 }
            throw r0
        L_0x013b:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            throw r11
        L_0x013e:
            int r0 = r11.what
            if (r0 == r4) goto L_0x0146
            if (r0 == r5) goto L_0x0146
            if (r0 != r3) goto L_0x0147
        L_0x0146:
            r2 = r5
        L_0x0147:
            if (r2 == 0) goto L_0x0186
            java.lang.Object r11 = r11.obj
            y6.l0 r11 = (y6.l0) r11
            monitor-enter(r11)
            java.lang.Object r0 = r11.f17569a     // Catch:{ all -> 0x0183 }
            boolean r1 = r11.f17570b     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x0157
            r11.toString()     // Catch:{ all -> 0x0183 }
        L_0x0157:
            monitor-exit(r11)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0160
            r11.a()     // Catch:{ RuntimeException -> 0x015e }
            goto L_0x0160
        L_0x015e:
            r11 = move-exception
            throw r11
        L_0x0160:
            monitor-enter(r11)
            r11.f17570b = r5     // Catch:{ all -> 0x0180 }
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            monitor-enter(r11)
            r11.f17569a = r6     // Catch:{ all -> 0x017d }
            monitor-exit(r11)     // Catch:{ all -> 0x017d }
            y6.a r0 = r11.f17571c
            java.util.ArrayList r0 = r0.zzt
            monitor-enter(r0)
            y6.a r1 = r11.f17571c     // Catch:{ all -> 0x017a }
            java.util.ArrayList r1 = r1.zzt     // Catch:{ all -> 0x017a }
            r1.remove(r11)     // Catch:{ all -> 0x017a }
            monitor-exit(r0)     // Catch:{ all -> 0x017a }
            return
        L_0x017a:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017a }
            throw r11
        L_0x017d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            throw r0
        L_0x0183:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0183 }
            throw r0
        L_0x0186:
            java.lang.String r11 = "Don't know how to handle message: "
            java.lang.String r11 = android.support.v4.media.a.m(r11, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r11, r0)
            return
        L_0x0197:
            java.lang.Object r11 = r11.obj
            y6.l0 r11 = (y6.l0) r11
            r11.b()
            monitor-enter(r11)
            r11.f17569a = r6     // Catch:{ all -> 0x01b7 }
            monitor-exit(r11)     // Catch:{ all -> 0x01b7 }
            y6.a r0 = r11.f17571c
            java.util.ArrayList r0 = r0.zzt
            monitor-enter(r0)
            y6.a r1 = r11.f17571c     // Catch:{ all -> 0x01b4 }
            java.util.ArrayList r1 = r1.zzt     // Catch:{ all -> 0x01b4 }
            r1.remove(r11)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            return
        L_0x01b4:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            throw r11
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01b7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.k0.handleMessage(android.os.Message):void");
    }
}

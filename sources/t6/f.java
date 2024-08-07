package t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CloudMessagingReceiver f14846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f14847b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f14848c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f14849d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f14850e;

    public /* synthetic */ f(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f14846a = cloudMessagingReceiver;
        this.f14847b = intent;
        this.f14848c = context;
        this.f14849d = z10;
        this.f14850e = pendingResult;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|(2:9|10)|11|12|(1:14)(1:15)|16|(1:18)(1:19)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[Catch:{ all -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.cloudmessaging.CloudMessagingReceiver r0 = r7.f14846a
            android.content.Intent r1 = r7.f14847b
            android.content.Context r2 = r7.f14848c
            boolean r3 = r7.f14849d
            android.content.BroadcastReceiver$PendingResult r4 = r7.f14850e
            r0.getClass()
            java.lang.String r5 = "wrapped_intent"
            android.os.Parcelable r5 = r1.getParcelableExtra(r5)     // Catch:{ all -> 0x005a }
            boolean r6 = r5 instanceof android.content.Intent     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x001a
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ all -> 0x005a }
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x004d
            java.lang.String r1 = "pending_intent"
            android.os.Parcelable r2 = r5.getParcelableExtra(r1)     // Catch:{ all -> 0x005a }
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x002a
            r2.send()     // Catch:{ CanceledException -> 0x002a }
        L_0x002a:
            android.os.Bundle r2 = r5.getExtras()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0034
            r2.remove(r1)     // Catch:{ all -> 0x005a }
            goto L_0x0039
        L_0x0034:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x005a }
            r2.<init>()     // Catch:{ all -> 0x005a }
        L_0x0039:
            java.lang.String r1 = r5.getAction()     // Catch:{ all -> 0x005a }
            java.lang.String r5 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x004a
            r0.b(r2)     // Catch:{ all -> 0x005a }
            r0 = -1
            goto L_0x0051
        L_0x004a:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0051
        L_0x004d:
            int r0 = r0.c(r2, r1)     // Catch:{ all -> 0x005a }
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            r4.setResultCode(r0)     // Catch:{ all -> 0x005a }
        L_0x0056:
            r4.finish()
            return
        L_0x005a:
            r0 = move-exception
            r4.finish()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.run():void");
    }
}

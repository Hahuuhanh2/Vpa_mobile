package u6;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class g extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f15299b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(u6.a r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f15299b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f15298a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.<init>(u6.a, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        if (message.what == 1) {
            int b10 = this.f15299b.b(this.f15298a);
            if (this.f15299b.e(b10)) {
                a aVar = this.f15299b;
                Context context = this.f15298a;
                Intent a10 = aVar.a(b10, context, "n");
                if (a10 == null) {
                    pendingIntent = null;
                } else {
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, zzd.zza | 134217728);
                }
                aVar.h(context, b10, pendingIntent);
            }
        }
    }
}

package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import ek.i;
import java.util.LinkedHashMap;
import sk.j;
import x2.e;
import x2.f;

/* compiled from: MultiInstanceInvalidationService.kt */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public int f3316a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f3317b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final b f3318c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    public final a f3319d = new a(this);

    /* compiled from: MultiInstanceInvalidationService.kt */
    public static final class a extends f.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f3320b;

        public a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f3320b = multiInstanceInvalidationService;
        }

        public final int k(e eVar, String str) {
            j.f(eVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3320b;
            synchronized (multiInstanceInvalidationService.f3318c) {
                int i11 = multiInstanceInvalidationService.f3316a + 1;
                multiInstanceInvalidationService.f3316a = i11;
                if (multiInstanceInvalidationService.f3318c.register(eVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f3317b.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f3316a--;
                }
            }
            return i10;
        }

        public final void t(int i10, String[] strArr) {
            j.f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3320b;
            synchronized (multiInstanceInvalidationService.f3318c) {
                String str = (String) multiInstanceInvalidationService.f3317b.get(Integer.valueOf(i10));
                if (str != null) {
                    int beginBroadcast = multiInstanceInvalidationService.f3318c.beginBroadcast();
                    int i11 = 0;
                    while (i11 < beginBroadcast) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.f3318c.getBroadcastCookie(i11);
                            j.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int intValue = ((Integer) broadcastCookie).intValue();
                            String str2 = (String) multiInstanceInvalidationService.f3317b.get(Integer.valueOf(intValue));
                            if (i10 != intValue && j.a(str, str2)) {
                                try {
                                    ((e) multiInstanceInvalidationService.f3318c.getBroadcastItem(i11)).e(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i11++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.f3318c.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.f3318c.finishBroadcast();
                    i iVar = i.f20112a;
                }
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    public static final class b extends RemoteCallbackList<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f3321a;

        public b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f3321a = multiInstanceInvalidationService;
        }

        public final void onCallbackDied(IInterface iInterface, Object obj) {
            j.f((e) iInterface, "callback");
            j.f(obj, "cookie");
            this.f3321a.f3317b.remove((Integer) obj);
        }
    }

    public final IBinder onBind(Intent intent) {
        j.f(intent, "intent");
        return this.f3319d;
    }
}

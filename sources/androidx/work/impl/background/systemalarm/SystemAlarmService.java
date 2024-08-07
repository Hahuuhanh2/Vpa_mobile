package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.d;
import ek.i;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.j;
import p3.r;
import y3.t;
import y3.u;

public class SystemAlarmService extends LifecycleService implements d.c {

    /* renamed from: b  reason: collision with root package name */
    public d f3776b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3777c;

    static {
        j.b("SystemAlarmService");
    }

    public final void a() {
        this.f3777c = true;
        j.a().getClass();
        int i10 = t.f17418a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (u.f17419a) {
            linkedHashMap.putAll(u.f17420b);
            i iVar = i.f20112a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z10 = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            }
            if (z10) {
                j.a().getClass();
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        d dVar = new d(this);
        this.f3776b = dVar;
        if (dVar.f3812p != null) {
            j.a().getClass();
        } else {
            dVar.f3812p = this;
        }
        this.f3777c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3777c = true;
        d dVar = this.f3776b;
        dVar.getClass();
        j.a().getClass();
        r rVar = dVar.f3807d;
        synchronized (rVar.f14021k) {
            rVar.f14020j.remove(dVar);
        }
        dVar.f3812p = null;
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3777c) {
            j.a().getClass();
            d dVar = this.f3776b;
            dVar.getClass();
            j.a().getClass();
            r rVar = dVar.f3807d;
            synchronized (rVar.f14021k) {
                rVar.f14020j.remove(dVar);
            }
            dVar.f3812p = null;
            d dVar2 = new d(this);
            this.f3776b = dVar2;
            if (dVar2.f3812p != null) {
                j.a().getClass();
            } else {
                dVar2.f3812p = this;
            }
            this.f3777c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3776b.a(intent, i11);
        return 3;
    }
}

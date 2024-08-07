package r3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import o3.j;
import x3.i;
import x3.l;
import y3.g;

/* compiled from: Alarms */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14501a = 0;

    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* compiled from: Alarms */
    public static class C0186a {
        public static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    static {
        j.b("Alarms");
    }

    public static void a(Context context, l lVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = androidx.work.impl.background.systemalarm.a.f3778f;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service != null && alarmManager != null) {
            j a10 = j.a();
            lVar.toString();
            a10.getClass();
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, l lVar, long j10) {
        x3.j r10 = workDatabase.r();
        i e10 = r10.e(lVar);
        if (e10 != null) {
            a(context, lVar, e10.f17005c);
            int i10 = e10.f17005c;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i11 = androidx.work.impl.background.systemalarm.a.f3778f;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            androidx.work.impl.background.systemalarm.a.d(intent, lVar);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                C0186a.a(alarmManager, 0, j10, service);
                return;
            }
            return;
        }
        z.j jVar = new z.j(workDatabase);
        Object m10 = ((WorkDatabase) jVar.f17753b).m(new g(jVar, 0));
        sk.j.e(m10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) m10).intValue();
        r10.c(new i(lVar.f17010a, lVar.f17011b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i12 = androidx.work.impl.background.systemalarm.a.f3778f;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent2, lVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            C0186a.a(alarmManager2, 0, j10, service2);
        }
    }
}

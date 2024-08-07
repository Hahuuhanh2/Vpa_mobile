package a;

import al.g0;
import android.content.ContentValues;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import ca.f;
import ca.s;
import cd.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import dc.q;
import f0.b0;
import h5.h;
import h5.i;
import hd.c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.TreeMap;
import kd.d;
import kd.j;
import kd.x;
import l4.c0;
import l4.m;
import lc.p;
import t6.k;
import uc.l;
import w6.n;

/* compiled from: CoroutineDebugging.kt */
public class a implements y2.a, h, n, ga.a, c, q, f, c0, Continuation, l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f1a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f2b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f3c = new a();

    public static k4.a f(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new k4.a(httpURLConnection);
    }

    public void a(i iVar) {
    }

    public Object b(m4.c cVar, float f10) {
        int K = cVar.K();
        if (K == 1) {
            return m.b(cVar, f10);
        }
        if (K == 3) {
            return m.b(cVar, f10);
        }
        if (K == 7) {
            PointF pointF = new PointF(((float) cVar.z()) * f10, ((float) cVar.z()) * f10);
            while (cVar.v()) {
                cVar.S();
            }
            return pointF;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot convert json to point. Next token is ");
        q10.append(b0.I(K));
        throw new IllegalArgumentException(q10.toString());
    }

    public void c(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public void d(i iVar) {
        iVar.b();
    }

    public b e(String str, uc.a aVar) {
        l lVar;
        switch (aVar.ordinal()) {
            case 0:
                lVar = new lb.b(8);
                break;
            case 1:
                lVar = new kd.b();
                break;
            case 2:
                lVar = new kd.f();
                break;
            case 3:
                lVar = new kd.h();
                break;
            case 4:
                lVar = new d();
                break;
            case 5:
                lVar = new lb.b(9);
                break;
            case 6:
                lVar = new kd.l();
                break;
            case 7:
                lVar = new j();
                break;
            case 8:
                lVar = new kd.n();
                break;
            case 10:
                lVar = new lb.b(12);
                break;
            case 11:
                lVar = new g0(11);
                break;
            case 14:
                lVar = new z.d(10);
                break;
            case 15:
                lVar = new x();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return lVar.e(str, aVar);
    }

    public void g(ArrayList arrayList, boolean z10) {
        throw null;
    }

    public Object k(s sVar) {
        lc.a aVar = new lc.a();
        aVar.f12905b.add(new p(aVar, aVar.f12904a, aVar.f12905b));
        Thread thread = new Thread(new k(2, aVar.f12904a, aVar.f12905b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public void l(d3.c cVar) {
        cVar.o("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        cVar.s("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    public void m(hd.d dVar) {
        int i10;
        boolean z10;
        boolean z11;
        String str = dVar.f10742a;
        int i11 = dVar.f10745d;
        int length = str.length();
        boolean z12 = false;
        if (i11 < length) {
            char charAt = str.charAt(i11);
            i10 = 0;
            while (true) {
                if (charAt < '0' || charAt > '9') {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11 || i11 >= length) {
                    break;
                }
                i10++;
                i11++;
                if (i11 < length) {
                    charAt = str.charAt(i11);
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 >= 2) {
            char charAt2 = dVar.f10742a.charAt(dVar.f10745d);
            char charAt3 = dVar.f10742a.charAt(dVar.f10745d + 1);
            if (charAt2 < '0' || charAt2 > '9') {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (charAt3 >= '0' && charAt3 <= '9') {
                    z12 = true;
                }
                if (z12) {
                    dVar.e((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                    dVar.f10745d += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char b10 = dVar.b();
        int M = m9.b.M(dVar.f10742a, dVar.f10745d, 0);
        if (M != 0) {
            if (M == 1) {
                dVar.e(230);
                dVar.f10746e = 1;
            } else if (M == 2) {
                dVar.e(239);
                dVar.f10746e = 2;
            } else if (M == 3) {
                dVar.e(238);
                dVar.f10746e = 3;
            } else if (M == 4) {
                dVar.e(240);
                dVar.f10746e = 4;
            } else if (M == 5) {
                dVar.e(231);
                dVar.f10746e = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(M)));
            }
        } else if (m9.b.I(b10)) {
            dVar.e(235);
            dVar.e((char) ((b10 - 128) + 1));
            dVar.f10745d++;
        } else {
            dVar.e((char) (b10 + 1));
            dVar.f10745d++;
        }
    }

    public Object p() {
        return new TreeMap();
    }

    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(task.getException()).length() + 22);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}

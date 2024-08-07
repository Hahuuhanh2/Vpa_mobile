package s6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f14635c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static a f14636d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f14637a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f14638b;

    @VisibleForTesting
    public a(Context context) {
        this.f14638b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        j.f(context);
        ReentrantLock reentrantLock = f14635c;
        reentrantLock.lock();
        try {
            if (f14636d == null) {
                f14636d = new a(context.getApplicationContext());
            }
            a aVar = f14636d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th2) {
            f14635c.unlock();
            throw th2;
        }
    }

    public final String b(String str) {
        this.f14637a.lock();
        try {
            return this.f14638b.getString(str, (String) null);
        } finally {
            this.f14637a.unlock();
        }
    }
}

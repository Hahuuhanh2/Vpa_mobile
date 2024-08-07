package t6;

import com.google.android.gms.common.ConnectionResult;
import java.util.Deque;
import lc.i;
import s7.a;
import w6.e0;
import w6.u0;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14857b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f14856a = i10;
        this.f14857b = obj;
    }

    public final void run() {
        switch (this.f14856a) {
            case 0:
                m mVar = (m) this.f14857b;
                synchronized (mVar) {
                    if (mVar.f14863a == 1) {
                        mVar.a(1, "Timed out while binding");
                    }
                }
                return;
            case 1:
                ((e0) ((u0) this.f14857b).f16667j).b(new ConnectionResult(4));
                return;
            case 2:
                a aVar = (a) this.f14857b;
                synchronized (aVar.f14642a) {
                    if (aVar.b()) {
                        String.valueOf(aVar.f14651j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                        aVar.d();
                        if (aVar.b()) {
                            aVar.f14644c = 1;
                            aVar.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                Runnable runnable = (Runnable) this.f14857b;
                Deque deque = (Deque) i.f12916b.get();
                y6.j.f(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
        }
    }
}

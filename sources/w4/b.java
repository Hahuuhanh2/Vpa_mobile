package w4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f16459a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0215b f16460b = new C0215b();

    /* compiled from: DiskCacheWriteLocker */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f16461a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f16462b;
    }

    /* renamed from: w4.b$b  reason: collision with other inner class name */
    /* compiled from: DiskCacheWriteLocker */
    public static class C0215b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f16463a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f16459a.get(str);
            j7.a.r(obj);
            aVar = (a) obj;
            int i10 = aVar.f16462b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f16462b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f16459a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0215b bVar = this.f16460b;
                        synchronized (bVar.f16463a) {
                            if (bVar.f16463a.size() < 10) {
                                bVar.f16463a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f16462b);
            }
        }
        aVar.f16461a.unlock();
    }
}

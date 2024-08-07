package j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0358a {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j10, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j10) != null) {
                return false;
            }
        }
        return true;
    }
}

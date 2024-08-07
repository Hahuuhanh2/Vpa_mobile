package j$.util.stream;

import java.security.AccessController;

abstract class D3 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f18597a = ((Boolean) AccessController.doPrivileged(new C3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}

package j$.util;

import java.security.AccessController;

abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f18388a = ((Boolean) AccessController.doPrivileged(new b0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}

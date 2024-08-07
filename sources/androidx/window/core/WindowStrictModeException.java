package androidx.window.core;

import sk.j;

/* compiled from: SpecificationComputer.kt */
public final class WindowStrictModeException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String str) {
        super(str);
        j.f(str, "message");
    }
}

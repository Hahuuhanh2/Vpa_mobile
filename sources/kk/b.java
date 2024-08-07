package kk;

import ik.d;
import ik.f;

/* compiled from: ContinuationImpl.kt */
public final class b implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20837a = new b();

    public final f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

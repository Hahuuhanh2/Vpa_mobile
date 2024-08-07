package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult */
public final class h0<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f4830a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f4831b;

    public h0(i iVar) {
        this.f4830a = iVar;
        this.f4831b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        V v2 = this.f4830a;
        if (v2 != null && v2.equals(h0Var.f4830a)) {
            return true;
        }
        Throwable th2 = this.f4831b;
        if (th2 == null || h0Var.f4831b == null) {
            return false;
        }
        return th2.toString().equals(this.f4831b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4830a, this.f4831b});
    }

    public h0(Throwable th2) {
        this.f4831b = th2;
        this.f4830a = null;
    }
}

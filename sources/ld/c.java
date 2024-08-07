package ld;

import uc.j;

/* compiled from: FinderPattern */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f12961a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12962b;

    /* renamed from: c  reason: collision with root package name */
    public final j[] f12963c;

    public c(int i10, int i11, int i12, int i13, int[] iArr) {
        this.f12961a = i10;
        this.f12962b = iArr;
        float f10 = (float) i13;
        this.f12963c = new j[]{new j((float) i11, f10), new j((float) i12, f10)};
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && this.f12961a == ((c) obj).f12961a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12961a;
    }
}

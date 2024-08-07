package vk;

import fk.i;
import java.util.NoSuchElementException;
import sk.j;

/* compiled from: ProgressionIterators.kt */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final int f23331a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23332b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23333c;

    /* renamed from: d  reason: collision with root package name */
    public int f23334d;

    public b(char c10, char c11, int i10) {
        this.f23331a = i10;
        this.f23332b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? j.h(c10, c11) < 0 : j.h(c10, c11) > 0) {
            z10 = false;
        }
        this.f23333c = z10;
        this.f23334d = !z10 ? c11 : c10;
    }

    public final char a() {
        int i10 = this.f23334d;
        if (i10 != this.f23332b) {
            this.f23334d = this.f23331a + i10;
        } else if (this.f23333c) {
            this.f23333c = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i10;
    }

    public final boolean hasNext() {
        return this.f23333c;
    }
}

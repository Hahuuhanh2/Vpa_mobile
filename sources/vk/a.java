package vk;

import al.g0;
import java.util.Iterator;

/* compiled from: Progressions.kt */
public class a implements Iterable<Character> {

    /* renamed from: a  reason: collision with root package name */
    public final char f23328a;

    /* renamed from: b  reason: collision with root package name */
    public final char f23329b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23330c = 1;

    public a(char c10, char c11) {
        this.f23328a = c10;
        this.f23329b = (char) g0.a0(c10, c11, 1);
    }

    public final Iterator iterator() {
        return new b(this.f23328a, this.f23329b, this.f23330c);
    }
}

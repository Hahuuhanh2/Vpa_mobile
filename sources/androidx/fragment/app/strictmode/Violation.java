package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import sk.j;

/* compiled from: Violation.kt */
public abstract class Violation extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f2704a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        j.f(fragment, "fragment");
        this.f2704a = fragment;
    }
}

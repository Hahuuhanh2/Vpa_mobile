package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import sk.j;

/* compiled from: FragmentReuseViolation.kt */
public final class FragmentReuseViolation extends Violation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        j.f(fragment, "fragment");
        j.f(str, "previousFragmentId");
    }
}

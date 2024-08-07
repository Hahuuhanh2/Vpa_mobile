package p2;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import fk.t;
import java.util.LinkedHashMap;
import java.util.Set;
import sk.j;
import v.n;

/* compiled from: FragmentStrictMode.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c f13907a = c.f13915c;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* compiled from: FragmentStrictMode.kt */
    public enum C0176a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    public interface b {
        void a();
    }

    /* compiled from: FragmentStrictMode.kt */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f13915c = new c();

        /* renamed from: a  reason: collision with root package name */
        public final Set<C0176a> f13916a = t.f20215a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f13917b = new LinkedHashMap();
    }

    public static c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.C()) {
                fragment.v();
            }
            fragment = fragment.B;
        }
        return f13907a;
    }

    public static void b(c cVar, Violation violation) {
        Fragment fragment = violation.f2704a;
        String name = fragment.getClass().getName();
        cVar.f13916a.contains(C0176a.PENALTY_LOG);
        cVar.getClass();
        if (cVar.f13916a.contains(C0176a.PENALTY_DEATH)) {
            e(fragment, new n(16, name, violation));
        }
    }

    public static void c(Violation violation) {
        if (FragmentManager.J(3)) {
            violation.f2704a.getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        j.f(fragment, "fragment");
        j.f(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        c(fragmentReuseViolation);
        c a10 = a(fragment);
        if (a10.f13916a.contains(C0176a.DETECT_FRAGMENT_REUSE) && f(a10, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a10, fragmentReuseViolation);
        }
    }

    public static void e(Fragment fragment, Runnable runnable) {
        if (fragment.C()) {
            Handler handler = fragment.v().f2504u.f2699d;
            j.e(handler, "fragment.parentFragmentManager.host.handler");
            if (j.a(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public static boolean f(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f13917b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (j.a(cls2.getSuperclass(), Violation.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

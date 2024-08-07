package bj;

import android.content.Context;
import p3.l0;
import sk.j;
import u8.l;

/* compiled from: FragmentGetContextFix */
public final class a {

    /* renamed from: bj.a$a  reason: collision with other inner class name */
    /* compiled from: FragmentGetContextFix */
    public interface C0256a {
        l c();
    }

    public static boolean a(Context context) {
        boolean z10;
        j.f(context, "context");
        l c10 = ((C0256a) l0.X(C0256a.class, j7.a.F(context.getApplicationContext()))).c();
        if (c10.f15397o <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0.q(z10, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (c10.isEmpty()) {
            return true;
        }
        return ((Boolean) ((u8.a) c10.iterator()).next()).booleanValue();
    }
}

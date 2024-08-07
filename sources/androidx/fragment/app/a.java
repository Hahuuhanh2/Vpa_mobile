package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a0;
import androidx.lifecycle.i;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: BackStackRecord */
public final class a extends a0 implements FragmentManager.l {

    /* renamed from: q  reason: collision with root package name */
    public final FragmentManager f2552q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2553r;

    /* renamed from: s  reason: collision with root package name */
    public int f2554s;

    public a(FragmentManager fragmentManager) {
        fragmentManager.G();
        r<?> rVar = fragmentManager.f2504u;
        if (rVar != null) {
            rVar.f2698c.getClassLoader();
        }
        this.f2554s = -1;
        this.f2552q = fragmentManager;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.J(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2561g) {
            return true;
        }
        FragmentManager fragmentManager = this.f2552q;
        if (fragmentManager.f2487d == null) {
            fragmentManager.f2487d = new ArrayList<>();
        }
        fragmentManager.f2487d.add(this);
        return true;
    }

    public final void c(int i10) {
        if (this.f2561g) {
            if (FragmentManager.J(2)) {
                toString();
            }
            int size = this.f2555a.size();
            for (int i11 = 0; i11 < size; i11++) {
                a0.a aVar = this.f2555a.get(i11);
                Fragment fragment = aVar.f2572b;
                if (fragment != null) {
                    fragment.f2459x += i10;
                    if (FragmentManager.J(2)) {
                        Objects.toString(aVar.f2572b);
                        int i12 = aVar.f2572b.f2459x;
                    }
                }
            }
        }
    }

    public final int d() {
        return e(true);
    }

    public final int e(boolean z10) {
        if (!this.f2553r) {
            if (FragmentManager.J(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new k0());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f2553r = true;
            if (this.f2561g) {
                this.f2554s = this.f2552q.f2492i.getAndIncrement();
            } else {
                this.f2554s = -1;
            }
            this.f2552q.w(this, z10);
            return this.f2554s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f() {
        if (!this.f2561g) {
            this.f2562h = false;
            this.f2552q.z(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void g(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.S;
        if (str2 != null) {
            p2.a.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder q10 = android.support.v4.media.a.q("Fragment ");
            q10.append(cls.getCanonicalName());
            q10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(q10.toString());
        }
        if (str != null) {
            String str3 = fragment.E;
            if (str3 == null || str.equals(str3)) {
                fragment.E = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.E + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = fragment.C;
                if (i12 == 0 || i12 == i10) {
                    fragment.C = i10;
                    fragment.D = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.C + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        b(new a0.a(i11, fragment));
        fragment.f2460y = this.f2552q;
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2563i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2554s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2553r);
            if (this.f2560f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2560f));
            }
            if (!(this.f2556b == 0 && this.f2557c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2556b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2557c));
            }
            if (!(this.f2558d == 0 && this.f2559e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2558d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2559e));
            }
            if (!(this.f2564j == 0 && this.f2565k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2564j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2565k);
            }
            if (!(this.f2566l == 0 && this.f2567m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2566l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2567m);
            }
        }
        if (!this.f2555a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2555a.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0.a aVar = this.f2555a.get(i10);
                switch (aVar.f2571a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder q10 = android.support.v4.media.a.q("cmd=");
                        q10.append(aVar.f2571a);
                        str2 = q10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2572b);
                if (z10) {
                    if (!(aVar.f2574d == 0 && aVar.f2575e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2574d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2575e));
                    }
                    if (aVar.f2576f != 0 || aVar.f2577g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2576f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2577g));
                    }
                }
            }
        }
    }

    public final a i(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f2460y;
        if (fragmentManager == null || fragmentManager == this.f2552q) {
            b(new a0.a(3, fragment));
            return this;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        q10.append(fragment.toString());
        q10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(q10.toString());
    }

    public final a j(Fragment fragment, i.b bVar) {
        if (fragment.f2460y != this.f2552q) {
            StringBuilder q10 = android.support.v4.media.a.q("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            q10.append(this.f2552q);
            throw new IllegalArgumentException(q10.toString());
        } else if (bVar == i.b.INITIALIZED && fragment.f2440a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != i.b.DESTROYED) {
            b(new a0.a(fragment, bVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2554s >= 0) {
            sb2.append(" #");
            sb2.append(this.f2554s);
        }
        if (this.f2563i != null) {
            sb2.append(" ");
            sb2.append(this.f2563i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}

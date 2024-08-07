package w1;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* compiled from: NestedScrollingChildHelper */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f16336a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f16337b;

    /* renamed from: c  reason: collision with root package name */
    public final View f16338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16339d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f16340e;

    public m(View view) {
        this.f16338c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent f12;
        if (!this.f16339d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return n0.a(f12, this.f16338c, f10, f11, z10);
        } catch (AbstractMethodError unused) {
            Objects.toString(f12);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f16339d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return n0.b(f12, this.f16338c, f10, f11);
        } catch (AbstractMethodError unused) {
            Objects.toString(f12);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        int[] iArr4 = iArr2;
        if (!this.f16339d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i15 != 0 || i16 != 0) {
            if (iArr4 != null) {
                this.f16338c.getLocationInWindow(iArr4);
                i14 = iArr4[0];
                i13 = iArr4[1];
            } else {
                i14 = 0;
                i13 = 0;
            }
            if (iArr == null) {
                if (this.f16340e == null) {
                    this.f16340e = new int[2];
                }
                iArr3 = this.f16340e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f16338c;
            if (f10 instanceof n) {
                ((n) f10).m(view, i10, i11, iArr3, i12);
            } else if (i17 == 0) {
                try {
                    n0.c(f10, view, i10, i11, iArr3);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f10);
                }
            }
            if (iArr4 != null) {
                this.f16338c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i14;
                iArr4[1] = iArr4[1] - i13;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, (int[]) null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i17 = i14;
        if (!this.f16339d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f16338c.getLocationInWindow(iArr4);
            i16 = iArr4[0];
            i15 = iArr4[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f16340e == null) {
                this.f16340e = new int[2];
            }
            int[] iArr5 = this.f16340e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f16338c;
        if (f10 instanceof o) {
            ((o) f10).i(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof n) {
                ((n) f10).j(view, i10, i11, i12, i13, i14);
            } else if (i17 == 0) {
                try {
                    n0.d(f10, view, i10, i11, i12, i13);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f10);
                }
            }
        }
        if (iArr4 != null) {
            this.f16338c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i16;
            iArr4[1] = iArr4[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f16336a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f16337b;
    }

    public final boolean g(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (f(i11) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f16339d) {
            View view = this.f16338c;
            for (ViewParent parent = this.f16338c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f16338c;
                boolean z12 = parent instanceof n;
                if (z12) {
                    z11 = ((n) parent).k(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            z11 = n0.f(parent, view, view2, i10);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    if (i11 == 0) {
                        this.f16336a = parent;
                    } else if (i11 == 1) {
                        this.f16337b = parent;
                    }
                    View view3 = this.f16338c;
                    if (z12) {
                        ((n) parent).l(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            n0.e(parent, view, view3, i10);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            View view = this.f16338c;
            if (f10 instanceof n) {
                ((n) f10).h(i10, view);
            } else if (i10 == 0) {
                try {
                    n0.g(f10, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f10);
                }
            }
            if (i10 == 0) {
                this.f16336a = null;
            } else if (i10 == 1) {
                this.f16337b = null;
            }
        }
    }
}

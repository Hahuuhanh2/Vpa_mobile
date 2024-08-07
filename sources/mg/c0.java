package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.g;
import d2.i;
import d2.l;

/* compiled from: ActivityForgotBindingImpl */
public final class c0 extends b0 {
    public static final l.d O;
    public static final SparseIntArray P;
    public final q5 J;
    public a K;
    public b L;
    public c M;
    public long N;

    /* compiled from: ActivityForgotBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(c0.this.f20965x);
            LoginViewModel loginViewModel = c0.this.I;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<User> iVar = loginViewModel.L;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    User user = (User) iVar.f8545b;
                    if (user == null) {
                        z12 = false;
                    }
                    if (z12) {
                        user.setIdentityNumber(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityForgotBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(c0.this.f20967z);
            LoginViewModel loginViewModel = c0.this.I;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<User> iVar = loginViewModel.L;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    User user = (User) iVar.f8545b;
                    if (user == null) {
                        z12 = false;
                    }
                    if (z12) {
                        user.setEmail(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityForgotBindingImpl */
    public class c implements g {
        public c() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(c0.this.A);
            LoginViewModel loginViewModel = c0.this.I;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<User> iVar = loginViewModel.L;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    User user = (User) iVar.f8545b;
                    if (user == null) {
                        z12 = false;
                    }
                    if (z12) {
                        user.setPhone(a10);
                    }
                }
            }
        }
    }

    static {
        l.d dVar = new l.d(15);
        O = dVar;
        dVar.a(2, new int[]{7}, new int[]{2131558582}, new String[]{"item_forgot_step_1"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(2131362720, 6);
        sparseIntArray.put(C0533R$id.radioGroup, 8);
        sparseIntArray.put(C0533R$id.radioButton1, 9);
        sparseIntArray.put(C0533R$id.radioButton2, 10);
        sparseIntArray.put(C0533R$id.edtCard, 11);
        sparseIntArray.put(C0533R$id.inputEmail, 12);
        sparseIntArray.put(C0533R$id.inputPhone, 13);
        sparseIntArray.put(C0533R$id.button, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(d2.e r20, android.view.View r21) {
        /*
            r19 = this;
            r15 = r19
            r14 = r21
            d2.l$d r0 = O
            android.util.SparseIntArray r1 = P
            r2 = 15
            r3 = r20
            java.lang.Object[] r16 = d2.l.o(r3, r14, r2, r0, r1)
            r0 = 14
            r0 = r16[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 3
            r0 = r16[r0]
            r5 = r0
            androidx.appcompat.widget.AppCompatEditText r5 = (androidx.appcompat.widget.AppCompatEditText) r5
            r0 = 11
            r0 = r16[r0]
            r6 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r6 = (com.ots.core.utils.customview.edit.TextInputLayout) r6
            r0 = 4
            r0 = r16[r0]
            r7 = r0
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r0 = 5
            r0 = r16[r0]
            r8 = r0
            androidx.appcompat.widget.AppCompatEditText r8 = (androidx.appcompat.widget.AppCompatEditText) r8
            r0 = 12
            r0 = r16[r0]
            r9 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r9 = (com.ots.core.utils.customview.edit.TextInputLayout) r9
            r0 = 13
            r0 = r16[r0]
            r10 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r10 = (com.ots.core.utils.customview.edit.TextInputLayout) r10
            r0 = 0
            r0 = r16[r0]
            r11 = r0
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r0 = 9
            r0 = r16[r0]
            r12 = r0
            android.widget.RadioButton r12 = (android.widget.RadioButton) r12
            r0 = 10
            r0 = r16[r0]
            r13 = r0
            android.widget.RadioButton r13 = (android.widget.RadioButton) r13
            r0 = 8
            r0 = r16[r0]
            r17 = r0
            android.widget.RadioGroup r17 = (android.widget.RadioGroup) r17
            r0 = 6
            r0 = r16[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0069
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r18 = r0
            goto L_0x006b
        L_0x0069:
            r18 = r2
        L_0x006b:
            r0 = r19
            r1 = r20
            r3 = r2
            r2 = r21
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r17
            r14 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            mg.c0$a r0 = new mg.c0$a
            r0.<init>()
            r15.K = r0
            mg.c0$b r0 = new mg.c0$b
            r0.<init>()
            r15.L = r0
            mg.c0$c r0 = new mg.c0$c
            r0.<init>()
            r15.M = r0
            r0 = -1
            r15.N = r0
            androidx.appcompat.widget.AppCompatEditText r0 = r15.f20965x
            r1 = 0
            r0.setTag(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r15.f20967z
            r0.setTag(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r15.A
            r0.setTag(r1)
            android.widget.RelativeLayout r0 = r15.D
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            r0 = 2
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 7
            r0 = r16[r0]
            mg.q5 r0 = (mg.q5) r0
            r15.J = r0
            if (r0 == 0) goto L_0x00cc
            r0.f8560r = r15
        L_0x00cc:
            int r0 = androidx.databinding.library.R$id.dataBinding
            r1 = r21
            r1.setTag(r0, r15)
            r19.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.N     // Catch:{ all -> 0x006c }
            r2 = 0
            r9.N = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r9)     // Catch:{ all -> 0x006c }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r4 = r9.I
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0037
            if (r4 == 0) goto L_0x0017
            d2.i<com.vpa.daugia.module.auth.data.model.User> r4 = r4.L
            goto L_0x0018
        L_0x0017:
            r4 = r6
        L_0x0018:
            r7 = 0
            r9.u(r7, r4)
            if (r4 == 0) goto L_0x0023
            T r4 = r4.f8545b
            com.vpa.daugia.module.auth.data.model.User r4 = (com.vpa.daugia.module.auth.data.model.User) r4
            goto L_0x0024
        L_0x0023:
            r4 = r6
        L_0x0024:
            if (r4 == 0) goto L_0x0037
            java.lang.String r6 = r4.getEmail()
            java.lang.String r7 = r4.getIdentityNumber()
            java.lang.String r4 = r4.getPhone()
            r8 = r7
            r7 = r4
            r4 = r6
            r6 = r8
            goto L_0x0039
        L_0x0037:
            r4 = r6
            r7 = r4
        L_0x0039:
            if (r5 == 0) goto L_0x004a
            androidx.appcompat.widget.AppCompatEditText r5 = r9.f20965x
            e2.c.d(r5, r6)
            androidx.appcompat.widget.AppCompatEditText r5 = r9.f20967z
            e2.c.d(r5, r4)
            androidx.appcompat.widget.AppCompatEditText r4 = r9.A
            e2.c.d(r4, r7)
        L_0x004a:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            androidx.appcompat.widget.AppCompatEditText r0 = r9.f20965x
            mg.c0$a r1 = r9.K
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.f20967z
            mg.c0$b r1 = r9.L
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.A
            mg.c0$c r1 = r9.M
            e2.c.e(r0, r1)
        L_0x0066:
            mg.q5 r0 = r9.J
            r0.i()
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.J.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.N     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            mg.q5 r0 = r4.J
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c0.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.N = 4;
        }
        this.J.m();
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 != 0) {
            return false;
        }
        i iVar = (i) obj;
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    public final void v(LoginViewModel loginViewModel) {
        this.I = loginViewModel;
        synchronized (this) {
            this.N |= 2;
        }
        f(4);
        t();
    }
}

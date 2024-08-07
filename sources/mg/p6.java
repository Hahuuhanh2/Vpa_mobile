package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.i;

/* compiled from: ItemPersonalInfoBindingImpl */
public final class p6 extends o6 {
    public static final SparseIntArray Y;
    public a Q = new a();
    public b R = new b();
    public c S = new c();
    public d T = new d();
    public e U = new e();
    public f V = new f();
    public g W = new g();
    public long X = -1;

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class a implements d2.g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.f21278z);
            LoginViewModel loginViewModel = p6.this.P;
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
                        user.setRePass(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class b implements d2.g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.A);
            LoginViewModel loginViewModel = p6.this.P;
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

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class c implements d2.g {
        public c() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.B);
            LoginViewModel loginViewModel = p6.this.P;
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
                        user.setFullname(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class d implements d2.g {
        public d() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.C);
            LoginViewModel loginViewModel = p6.this.P;
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

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class e implements d2.g {
        public e() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.D);
            LoginViewModel loginViewModel = p6.this.P;
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
                        user.setPhoneVerificationCode(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class f implements d2.g {
        public f() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.E);
            LoginViewModel loginViewModel = p6.this.P;
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
                        user.setPassword(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ItemPersonalInfoBindingImpl */
    public class g implements d2.g {
        public g() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(p6.this.F);
            LoginViewModel loginViewModel = p6.this.P;
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
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(C0533R$id.tvPage, 8);
        sparseIntArray.put(C0533R$id.tvQuestion, 9);
        sparseIntArray.put(C0533R$id.tlFullName, 10);
        sparseIntArray.put(C0533R$id.tlCitizenIdentify, 11);
        sparseIntArray.put(C0533R$id.inputEmail, 12);
        sparseIntArray.put(C0533R$id.inputPassword, 13);
        sparseIntArray.put(C0533R$id.inputConfirmPassword, 14);
        sparseIntArray.put(C0533R$id.tvErrorOldPassword, 15);
        sparseIntArray.put(C0533R$id.inputPhone, 16);
        sparseIntArray.put(C0533R$id.lnFormOtp, 17);
        sparseIntArray.put(2131362198, 18);
        sparseIntArray.put(C0533R$id.tvTitleOtp, 19);
        sparseIntArray.put(C0533R$id.tvOtp, 20);
        sparseIntArray.put(C0533R$id.lnCbs, 21);
        sparseIntArray.put(2131361999, 22);
        sparseIntArray.put(C0533R$id.tvPolicy, 23);
        sparseIntArray.put(C0533R$id.button, 24);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p6(d2.e r24, android.view.View r25) {
        /*
            r23 = this;
            r15 = r23
            r14 = r25
            r0 = r23
            r1 = r24
            r2 = r25
            android.util.SparseIntArray r3 = Y
            r4 = 25
            r13 = 0
            r5 = r24
            java.lang.Object[] r21 = d2.l.o(r5, r14, r4, r13, r3)
            r3 = 24
            r3 = r21[r3]
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r4 = 22
            r4 = r21[r4]
            com.google.android.material.checkbox.MaterialCheckBox r4 = (com.google.android.material.checkbox.MaterialCheckBox) r4
            r5 = 0
            r5 = r21[r5]
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 5
            r6 = r21[r6]
            com.ots.core.utils.customview.edit.PasswordEditText r6 = (com.ots.core.utils.customview.edit.PasswordEditText) r6
            r7 = 3
            r7 = r21[r7]
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r8 = 1
            r8 = r21[r8]
            androidx.appcompat.widget.AppCompatEditText r8 = (androidx.appcompat.widget.AppCompatEditText) r8
            r9 = 2
            r9 = r21[r9]
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r10 = 7
            r10 = r21[r10]
            androidx.appcompat.widget.AppCompatEditText r10 = (androidx.appcompat.widget.AppCompatEditText) r10
            r11 = 4
            r11 = r21[r11]
            com.ots.core.utils.customview.edit.PasswordEditText r11 = (com.ots.core.utils.customview.edit.PasswordEditText) r11
            r12 = 6
            r12 = r21[r12]
            androidx.appcompat.widget.AppCompatEditText r12 = (androidx.appcompat.widget.AppCompatEditText) r12
            r16 = 18
            r16 = r21[r16]
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r16 = 14
            r16 = r21[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r16 = 12
            r16 = r21[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r13 = r16
            r16 = 13
            r16 = r21[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r16 = 16
            r16 = r21[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r14 = r16
            r16 = 21
            r16 = r21[r16]
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r16 = 17
            r16 = r21[r16]
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r15 = r16
            r16 = 11
            r16 = r21[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r17 = 10
            r17 = r21[r17]
            com.ots.core.utils.customview.edit.TextInputLayout r17 = (com.ots.core.utils.customview.edit.TextInputLayout) r17
            r18 = 15
            r18 = r21[r18]
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r19 = 20
            r19 = r21[r19]
            com.ots.core.utils.customview.textview.AppTextView r19 = (com.ots.core.utils.customview.textview.AppTextView) r19
            r20 = 8
            r20 = r21[r20]
            com.ots.base.utils.customview.GradientTextView r20 = (com.ots.base.utils.customview.GradientTextView) r20
            r20 = 23
            r20 = r21[r20]
            com.ots.core.utils.customview.textview.AppTextView r20 = (com.ots.core.utils.customview.textview.AppTextView) r20
            r22 = 9
            r22 = r21[r22]
            com.ots.core.utils.customview.textview.AppTextView r22 = (com.ots.core.utils.customview.textview.AppTextView) r22
            r22 = 19
            r21 = r21[r22]
            com.ots.core.utils.customview.textview.AppTextView r21 = (com.ots.core.utils.customview.textview.AppTextView) r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            mg.p6$a r0 = new mg.p6$a
            r1 = r23
            r0.<init>()
            r1.Q = r0
            mg.p6$b r0 = new mg.p6$b
            r0.<init>()
            r1.R = r0
            mg.p6$c r0 = new mg.p6$c
            r0.<init>()
            r1.S = r0
            mg.p6$d r0 = new mg.p6$d
            r0.<init>()
            r1.T = r0
            mg.p6$e r0 = new mg.p6$e
            r0.<init>()
            r1.U = r0
            mg.p6$f r0 = new mg.p6$f
            r0.<init>()
            r1.V = r0
            mg.p6$g r0 = new mg.p6$g
            r0.<init>()
            r1.W = r0
            r2 = -1
            r1.X = r2
            android.widget.LinearLayout r0 = r1.f21277y
            r2 = 0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r1.f21278z
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.A
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.B
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.C
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.D
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r1.E
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r25
            r2.setTag(r0, r1)
            r23.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.p6.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.X     // Catch:{ all -> 0x00ab }
            r2 = 0
            r13.X = r2     // Catch:{ all -> 0x00ab }
            monitor-exit(r13)     // Catch:{ all -> 0x00ab }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r4 = r13.P
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0047
            if (r4 == 0) goto L_0x0017
            d2.i<com.vpa.daugia.module.auth.data.model.User> r4 = r4.L
            goto L_0x0018
        L_0x0017:
            r4 = r6
        L_0x0018:
            r7 = 0
            r13.u(r7, r4)
            if (r4 == 0) goto L_0x0023
            T r4 = r4.f8545b
            com.vpa.daugia.module.auth.data.model.User r4 = (com.vpa.daugia.module.auth.data.model.User) r4
            goto L_0x0024
        L_0x0023:
            r4 = r6
        L_0x0024:
            if (r4 == 0) goto L_0x0047
            java.lang.String r6 = r4.getEmail()
            java.lang.String r7 = r4.getIdentityNumber()
            java.lang.String r8 = r4.getRePass()
            java.lang.String r9 = r4.getPhone()
            java.lang.String r10 = r4.getFullname()
            java.lang.String r11 = r4.getPassword()
            java.lang.String r4 = r4.getPhoneVerificationCode()
            r12 = r8
            r8 = r4
            r4 = r6
            r6 = r12
            goto L_0x004d
        L_0x0047:
            r4 = r6
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x004d:
            if (r5 == 0) goto L_0x0072
            com.ots.core.utils.customview.edit.PasswordEditText r5 = r13.f21278z
            e2.c.d(r5, r6)
            androidx.appcompat.widget.AppCompatEditText r5 = r13.A
            e2.c.d(r5, r4)
            androidx.appcompat.widget.AppCompatEditText r4 = r13.B
            e2.c.d(r4, r10)
            androidx.appcompat.widget.AppCompatEditText r4 = r13.C
            e2.c.d(r4, r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r13.D
            e2.c.d(r4, r8)
            com.ots.core.utils.customview.edit.PasswordEditText r4 = r13.E
            e2.c.d(r4, r11)
            androidx.appcompat.widget.AppCompatEditText r4 = r13.F
            e2.c.d(r4, r9)
        L_0x0072:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r13.f21278z
            mg.p6$a r1 = r13.Q
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r13.A
            mg.p6$b r1 = r13.R
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r13.B
            mg.p6$c r1 = r13.S
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r13.C
            mg.p6$d r1 = r13.T
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r13.D
            mg.p6$e r1 = r13.U
            e2.c.e(r0, r1)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r13.E
            mg.p6$f r1 = r13.V
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r13.F
            mg.p6$g r1 = r13.W
            e2.c.e(r0, r1)
        L_0x00aa:
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.p6.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.X != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.X = 4;
        }
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
            this.X |= 1;
        }
        return true;
    }

    public final void v(LoginViewModel loginViewModel) {
        this.P = loginViewModel;
        synchronized (this) {
            this.X |= 2;
        }
        f(4);
        t();
    }
}

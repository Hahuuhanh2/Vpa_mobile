package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.g;
import d2.i;
import d2.l;

/* compiled from: ActivityChangePasswordBindingImpl */
public final class s extends r {
    public static final l.d V;
    public static final SparseIntArray W;
    public final u5 Q;
    public a R = new a();
    public b S = new b();
    public c T = new c();
    public long U = -1;

    /* compiled from: ActivityChangePasswordBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(s.this.f21322y);
            LoginViewModel loginViewModel = s.this.P;
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
                        user.setNewPassword(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityChangePasswordBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(s.this.f21323z);
            LoginViewModel loginViewModel = s.this.P;
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
                        user.setOldPassword(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityChangePasswordBindingImpl */
    public class c implements g {
        public c() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(s.this.A);
            LoginViewModel loginViewModel = s.this.P;
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
                        user.setNewPassword(a10);
                    }
                }
            }
        }
    }

    static {
        l.d dVar = new l.d(27);
        V = dVar;
        dVar.a(1, new int[]{5}, new int[]{2131558584}, new String[]{"item_forgot_step_3"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(C0533R$id.llToolbar, 6);
        sparseIntArray.put(2131361936, 7);
        sparseIntArray.put(2131362806, 8);
        sparseIntArray.put(C0533R$id.btnMore, 9);
        sparseIntArray.put(C0533R$id.logo, 10);
        sparseIntArray.put(2131362452, 11);
        sparseIntArray.put(2131362803, 12);
        sparseIntArray.put(C0533R$id.lnFormOldPassword, 13);
        sparseIntArray.put(2131362198, 14);
        sparseIntArray.put(C0533R$id.tvTitleOldPassword, 15);
        sparseIntArray.put(C0533R$id.tvErrorOldPassword, 16);
        sparseIntArray.put(C0533R$id.lnFormNewPassword, 17);
        sparseIntArray.put(C0533R$id.iconStartNewPassword, 18);
        sparseIntArray.put(C0533R$id.tvTitleNewPassword, 19);
        sparseIntArray.put(C0533R$id.tvErrorPassword, 20);
        sparseIntArray.put(C0533R$id.lnFormConfirmPassword, 21);
        sparseIntArray.put(C0533R$id.iconStartConfirmPassword, 22);
        sparseIntArray.put(C0533R$id.tvTitleConfirmassword, 23);
        sparseIntArray.put(C0533R$id.tvErrorConfirmPassword, 24);
        sparseIntArray.put(C0533R$id.tvNote, 25);
        sparseIntArray.put(C0533R$id.button, 26);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(d2.e r24, android.view.View r25) {
        /*
            r23 = this;
            r15 = r23
            r14 = r25
            r0 = r23
            r1 = r24
            r2 = r25
            d2.l$d r3 = V
            android.util.SparseIntArray r4 = W
            r5 = 27
            r6 = r24
            java.lang.Object[] r22 = d2.l.o(r6, r14, r5, r3, r4)
            r3 = 7
            r3 = r22[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 9
            r4 = r22[r4]
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r4 = 26
            r4 = r22[r4]
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r5 = 4
            r5 = r22[r5]
            com.ots.core.utils.customview.edit.PasswordEditText r5 = (com.ots.core.utils.customview.edit.PasswordEditText) r5
            r6 = 2
            r6 = r22[r6]
            com.ots.core.utils.customview.edit.PasswordEditText r6 = (com.ots.core.utils.customview.edit.PasswordEditText) r6
            r7 = 3
            r7 = r22[r7]
            com.ots.core.utils.customview.edit.PasswordEditText r7 = (com.ots.core.utils.customview.edit.PasswordEditText) r7
            r8 = 14
            r8 = r22[r8]
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8 = 22
            r8 = r22[r8]
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8 = 18
            r8 = r22[r8]
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r8 = 6
            r8 = r22[r8]
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r8 = 21
            r8 = r22[r8]
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r9 = 17
            r9 = r22[r9]
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r10 = 13
            r10 = r22[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r11 = 10
            r11 = r22[r11]
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11 = 0
            r11 = r22[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r12 = 11
            r12 = r22[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r13 = 1
            r13 = r22[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r16 = 24
            r16 = r22[r16]
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r14 = r16
            r16 = 16
            r16 = r22[r16]
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r16 = 20
            r16 = r22[r16]
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r15 = r16
            r16 = 25
            r16 = r22[r16]
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r17 = 12
            r17 = r22[r17]
            com.ots.core.utils.customview.textview.AppTextView r17 = (com.ots.core.utils.customview.textview.AppTextView) r17
            r18 = 8
            r18 = r22[r18]
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r19 = 23
            r19 = r22[r19]
            com.ots.core.utils.customview.textview.AppTextView r19 = (com.ots.core.utils.customview.textview.AppTextView) r19
            r20 = 19
            r20 = r22[r20]
            com.ots.core.utils.customview.textview.AppTextView r20 = (com.ots.core.utils.customview.textview.AppTextView) r20
            r21 = 15
            r21 = r22[r21]
            com.ots.core.utils.customview.textview.AppTextView r21 = (com.ots.core.utils.customview.textview.AppTextView) r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            mg.s$a r0 = new mg.s$a
            r1 = r23
            r0.<init>()
            r1.R = r0
            mg.s$b r0 = new mg.s$b
            r0.<init>()
            r1.S = r0
            mg.s$c r0 = new mg.s$c
            r0.<init>()
            r1.T = r0
            r2 = -1
            r1.U = r2
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r1.f21322y
            r2 = 0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r1.f21323z
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r1.A
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.E
            r0.setTag(r2)
            r0 = 5
            r0 = r22[r0]
            mg.u5 r0 = (mg.u5) r0
            r1.Q = r0
            if (r0 == 0) goto L_0x00ed
            r0.f8560r = r1
        L_0x00ed:
            android.widget.LinearLayout r0 = r1.G
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r25
            r2.setTag(r0, r1)
            r23.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.s.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.U     // Catch:{ all -> 0x0066 }
            r2 = 0
            r9.U = r2     // Catch:{ all -> 0x0066 }
            monitor-exit(r9)     // Catch:{ all -> 0x0066 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r4 = r9.P
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0032
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
            if (r4 == 0) goto L_0x0032
            java.lang.String r6 = r4.getOldPassword()
            java.lang.String r4 = r4.getNewPassword()
            r8 = r6
            r6 = r4
            r4 = r8
            goto L_0x0033
        L_0x0032:
            r4 = r6
        L_0x0033:
            if (r5 == 0) goto L_0x0044
            com.ots.core.utils.customview.edit.PasswordEditText r5 = r9.f21322y
            e2.c.d(r5, r6)
            com.ots.core.utils.customview.edit.PasswordEditText r5 = r9.f21323z
            e2.c.d(r5, r4)
            com.ots.core.utils.customview.edit.PasswordEditText r4 = r9.A
            e2.c.d(r4, r6)
        L_0x0044:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r9.f21322y
            mg.s$a r1 = r9.R
            e2.c.e(r0, r1)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r9.f21323z
            mg.s$b r1 = r9.S
            e2.c.e(r0, r1)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r9.A
            mg.s$c r1 = r9.T
            e2.c.e(r0, r1)
        L_0x0060:
            mg.u5 r0 = r9.Q
            r0.i()
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.s.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.Q.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.U     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            mg.u5 r0 = r4.Q
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
        throw new UnsupportedOperationException("Method not decompiled: mg.s.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.U = 4;
        }
        this.Q.m();
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
            this.U |= 1;
        }
        return true;
    }

    public final void v(LoginViewModel loginViewModel) {
        this.P = loginViewModel;
        synchronized (this) {
            this.U |= 2;
        }
        f(4);
        t();
    }
}

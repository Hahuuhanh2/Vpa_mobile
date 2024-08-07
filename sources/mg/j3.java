package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.g;
import d2.i;
import d2.l;
import e2.c;

/* compiled from: FragmentLoginBindingImpl */
public final class j3 extends i3 {
    public static final l.d L;
    public static final SparseIntArray M;
    public a I = new a();
    public b J = new b();
    public long K = -1;

    /* compiled from: FragmentLoginBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            String a10 = c.a(j3.this.B);
            LoginViewModel loginViewModel = j3.this.H;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = loginViewModel.f19550i;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    /* compiled from: FragmentLoginBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            boolean z10;
            String a10 = c.a(j3.this.E);
            LoginViewModel loginViewModel = j3.this.H;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = loginViewModel.f19551j;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    static {
        l.d dVar = new l.d(18);
        L = dVar;
        dVar.a(1, new int[]{4}, new int[]{2131558586}, new String[]{"item_info_login"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(2131362022, 5);
        sparseIntArray.put(2131362720, 6);
        sparseIntArray.put(2131361926, 7);
        sparseIntArray.put(C0533R$id.imvLogo, 8);
        sparseIntArray.put(2131362317, 9);
        sparseIntArray.put(C0533R$id.edtCard, 10);
        sparseIntArray.put(C0533R$id.edtPassword, 11);
        sparseIntArray.put(C0533R$id.button, 12);
        sparseIntArray.put(C0533R$id.btnFaceId, 13);
        sparseIntArray.put(C0533R$id.tvForgotPassword, 14);
        sparseIntArray.put(C0533R$id.lnBottom, 15);
        sparseIntArray.put(C0533R$id.tvRegister, 16);
        sparseIntArray.put(C0533R$id.tvDebug, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j3(d2.e r19, android.view.View r20) {
        /*
            r18 = this;
            r14 = r18
            r15 = r20
            d2.l$d r0 = L
            android.util.SparseIntArray r1 = M
            r2 = 18
            r3 = r19
            java.lang.Object[] r16 = d2.l.o(r3, r15, r2, r0, r1)
            r0 = 7
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 13
            r0 = r16[r0]
            r5 = r0
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            r0 = 12
            r0 = r16[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 5
            r0 = r16[r0]
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0 = 10
            r0 = r16[r0]
            r7 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r7 = (com.ots.core.utils.customview.edit.TextInputLayout) r7
            r0 = 11
            r0 = r16[r0]
            r8 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r8 = (com.ots.core.utils.customview.edit.TextInputLayout) r8
            r0 = 2
            r0 = r16[r0]
            r9 = r0
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r0 = 8
            r0 = r16[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 4
            r0 = r16[r0]
            r11 = r0
            mg.w5 r11 = (mg.w5) r11
            r0 = 15
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 9
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 3
            r0 = r16[r0]
            r12 = r0
            com.ots.core.utils.customview.edit.PasswordEditText r12 = (com.ots.core.utils.customview.edit.PasswordEditText) r12
            r0 = 6
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 17
            r0 = r16[r0]
            com.ots.base.utils.customview.DebugView r0 = (com.ots.base.utils.customview.DebugView) r0
            r0 = 14
            r0 = r16[r0]
            r13 = r0
            com.ots.core.utils.customview.textview.AppTextView r13 = (com.ots.core.utils.customview.textview.AppTextView) r13
            r0 = 16
            r0 = r16[r0]
            r17 = r0
            com.ots.base.utils.customview.GradientTextView r17 = (com.ots.base.utils.customview.GradientTextView) r17
            r0 = r18
            r1 = r19
            r2 = r20
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
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            mg.j3$a r0 = new mg.j3$a
            r0.<init>()
            r14.I = r0
            mg.j3$b r0 = new mg.j3$b
            r0.<init>()
            r14.J = r0
            r0 = -1
            r14.K = r0
            androidx.appcompat.widget.AppCompatEditText r0 = r14.B
            r1 = 0
            r0.setTag(r1)
            mg.w5 r0 = r14.D
            if (r0 == 0) goto L_0x00a9
            r0.f8560r = r14
        L_0x00a9:
            r0 = 0
            r0 = r16[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r14.E
            r0.setTag(r1)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r15.setTag(r0, r14)
            r18.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j3.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.K     // Catch:{ all -> 0x0078 }
            r2 = 0
            r13.K = r2     // Catch:{ all -> 0x0078 }
            monitor-exit(r13)     // Catch:{ all -> 0x0078 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r4 = r13.H
            r5 = 30
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 28
            r8 = 26
            r10 = 0
            if (r5 == 0) goto L_0x0048
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x002d
            if (r4 == 0) goto L_0x0021
            d2.i<java.lang.String> r5 = r4.f19550i
            goto L_0x0022
        L_0x0021:
            r5 = r10
        L_0x0022:
            r11 = 1
            r13.u(r11, r5)
            if (r5 == 0) goto L_0x002d
            T r5 = r5.f8545b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x002e
        L_0x002d:
            r5 = r10
        L_0x002e:
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0039
            d2.i<java.lang.String> r4 = r4.f19551j
            goto L_0x003a
        L_0x0039:
            r4 = r10
        L_0x003a:
            r11 = 2
            r13.u(r11, r4)
            if (r4 == 0) goto L_0x0045
            T r4 = r4.f8545b
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
        L_0x0045:
            r4 = r10
            r10 = r5
            goto L_0x0049
        L_0x0048:
            r4 = r10
        L_0x0049:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0053
            androidx.appcompat.widget.AppCompatEditText r5 = r13.B
            e2.c.d(r5, r10)
        L_0x0053:
            r8 = 16
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0068
            androidx.appcompat.widget.AppCompatEditText r5 = r13.B
            mg.j3$a r8 = r13.I
            e2.c.e(r5, r8)
            com.ots.core.utils.customview.edit.PasswordEditText r5 = r13.E
            mg.j3$b r8 = r13.J
            e2.c.e(r5, r8)
        L_0x0068:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r13.E
            e2.c.d(r0, r4)
        L_0x0072:
            mg.w5 r0 = r13.D
            r0.i()
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j3.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.D.k() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.K     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            mg.w5 r0 = r4.D
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
        throw new UnsupportedOperationException("Method not decompiled: mg.j3.k():boolean");
    }

    public final void m() {
        synchronized (this) {
            this.K = 16;
        }
        this.D.m();
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 == 0) {
            w5 w5Var = (w5) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.K |= 1;
            }
            return true;
        } else if (i10 == 1) {
            i iVar = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.K |= 2;
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            i iVar2 = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.K |= 4;
            }
            return true;
        }
    }

    public final void v(LoginViewModel loginViewModel) {
        this.H = loginViewModel;
        synchronized (this) {
            this.K |= 8;
        }
        f(4);
        t();
    }
}

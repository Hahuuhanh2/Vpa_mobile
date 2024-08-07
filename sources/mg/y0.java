package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.ArrayList;

/* compiled from: ActivityProfileBindingImpl */
public final class y0 extends x0 {
    public static final SparseIntArray D0;
    public c A0;
    public d B0;
    public long C0;

    /* renamed from: p0  reason: collision with root package name */
    public e f21463p0;

    /* renamed from: q0  reason: collision with root package name */
    public f f21464q0;

    /* renamed from: r0  reason: collision with root package name */
    public g f21465r0;

    /* renamed from: s0  reason: collision with root package name */
    public h f21466s0;

    /* renamed from: t0  reason: collision with root package name */
    public i f21467t0;

    /* renamed from: u0  reason: collision with root package name */
    public j f21468u0;

    /* renamed from: v0  reason: collision with root package name */
    public k f21469v0;

    /* renamed from: w0  reason: collision with root package name */
    public l f21470w0;

    /* renamed from: x0  reason: collision with root package name */
    public m f21471x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f21472y0;

    /* renamed from: z0  reason: collision with root package name */
    public b f21473z0;

    /* compiled from: ActivityProfileBindingImpl */
    public class a implements d2.g {
        public a() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(y0.this.P);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.b>> iVar = loginViewModel.G;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class b implements d2.g {
        public b() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(y0.this.X);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.b>> iVar = loginViewModel.H;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class c implements d2.g {
        public c() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(y0.this.f21436h0);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.b>> iVar = loginViewModel.D;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class d implements d2.g {
        public d() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            long c10 = ye.c.c(y0.this.f21439k0);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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
                        user.setPersonIssuanceDate(Long.valueOf(c10));
                    }
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class e implements d2.g {
        public e() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.F);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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
                        user.setBankAccount(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class f implements d2.g {
        public f() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.G);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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

    /* compiled from: ActivityProfileBindingImpl */
    public class g implements d2.g {
        public g() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(y0.this.H);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.b>> iVar = loginViewModel.E;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class h implements d2.g {
        public h() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(y0.this.I);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.b>> iVar = loginViewModel.F;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(b10);
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class i implements d2.g {
        public i() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.J);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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

    /* compiled from: ActivityProfileBindingImpl */
    public class j implements d2.g {
        public j() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.K);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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
                        user.setBankAccountOwner(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class k implements d2.g {
        public k() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.L);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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
                        user.setAddress(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityProfileBindingImpl */
    public class l implements d2.g {
        public l() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.M);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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

    /* compiled from: ActivityProfileBindingImpl */
    public class m implements d2.g {
        public m() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(y0.this.N);
            LoginViewModel loginViewModel = y0.this.f21442n0;
            boolean z12 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<User> iVar = loginViewModel.L;
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
        D0 = sparseIntArray;
        sparseIntArray.put(2131362720, 27);
        sparseIntArray.put(2131362022, 28);
        sparseIntArray.put(C0533R$id.onCreateStep, 29);
        sparseIntArray.put(C0533R$id.tvPage, 30);
        sparseIntArray.put(C0533R$id.tvQuestion, 31);
        sparseIntArray.put(C0533R$id.btnInfo, 32);
        sparseIntArray.put(C0533R$id.lnInfo, 33);
        sparseIntArray.put(C0533R$id.tvCity, 34);
        sparseIntArray.put(C0533R$id.tvDistrict, 35);
        sparseIntArray.put(C0533R$id.tvWard, 36);
        sparseIntArray.put(C0533R$id.btnBank, 37);
        sparseIntArray.put(C0533R$id.lnBank, 38);
        sparseIntArray.put(C0533R$id.bank, 39);
        sparseIntArray.put(C0533R$id.btnId, 40);
        sparseIntArray.put(C0533R$id.lnCitizen, 41);
        sparseIntArray.put(C0533R$id.tvDate, 42);
        sparseIntArray.put(C0533R$id.edtPlaceOfIssue, 43);
        sparseIntArray.put(C0533R$id.btnFront, 44);
        sparseIntArray.put(C0533R$id.btnBackSide, 45);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y0(d2.e r51, android.view.View r52) {
        /*
            r50 = this;
            r15 = r50
            r14 = r52
            android.util.SparseIntArray r0 = D0
            r1 = 46
            r13 = 0
            r2 = r51
            java.lang.Object[] r46 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 24
            r0 = r46[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 39
            r0 = r46[r0]
            r4 = r0
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r0 = 45
            r0 = r46[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 37
            r0 = r46[r0]
            r6 = r0
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r0 = 44
            r0 = r46[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 40
            r0 = r46[r0]
            r8 = r0
            com.ots.core.utils.customview.textview.AppTextView r8 = (com.ots.core.utils.customview.textview.AppTextView) r8
            r0 = 32
            r0 = r46[r0]
            r9 = r0
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r0 = 26
            r0 = r46[r0]
            r10 = r0
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r0 = 28
            r0 = r46[r0]
            r11 = r0
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r0 = 17
            r0 = r46[r0]
            r12 = r0
            androidx.appcompat.widget.AppCompatEditText r12 = (androidx.appcompat.widget.AppCompatEditText) r12
            r0 = 7
            r0 = r46[r0]
            r16 = r0
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r0 = 8
            r0 = r46[r0]
            r17 = r0
            com.ots.base.ui.AddressEdittext r17 = (com.ots.base.ui.AddressEdittext) r17
            r0 = 9
            r0 = r46[r0]
            r18 = r0
            com.ots.base.ui.AddressEdittext r18 = (com.ots.base.ui.AddressEdittext) r18
            r0 = 14
            r0 = r46[r0]
            r19 = r0
            androidx.appcompat.widget.AppCompatEditText r19 = (androidx.appcompat.widget.AppCompatEditText) r19
            r0 = 19
            r0 = r46[r0]
            r20 = r0
            androidx.appcompat.widget.AppCompatEditText r20 = (androidx.appcompat.widget.AppCompatEditText) r20
            r0 = 12
            r0 = r46[r0]
            r21 = r0
            androidx.appcompat.widget.AppCompatEditText r21 = (androidx.appcompat.widget.AppCompatEditText) r21
            r0 = 3
            r0 = r46[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatEditText r22 = (androidx.appcompat.widget.AppCompatEditText) r22
            r0 = 5
            r0 = r46[r0]
            r23 = r0
            androidx.appcompat.widget.AppCompatEditText r23 = (androidx.appcompat.widget.AppCompatEditText) r23
            r0 = 43
            r0 = r46[r0]
            r24 = r0
            com.ots.core.utils.customview.textview.AppTextView r24 = (com.ots.core.utils.customview.textview.AppTextView) r24
            r0 = 10
            r0 = r46[r0]
            r25 = r0
            com.ots.base.ui.AddressEdittext r25 = (com.ots.base.ui.AddressEdittext) r25
            r0 = 16
            r0 = r46[r0]
            r26 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r26 = (com.ots.core.utils.customview.edit.TextInputLayout) r26
            r0 = 18
            r0 = r46[r0]
            r27 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r27 = (com.ots.core.utils.customview.edit.TextInputLayout) r27
            r0 = 6
            r0 = r46[r0]
            r28 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r28 = (com.ots.core.utils.customview.edit.TextInputLayout) r28
            r0 = 13
            r0 = r46[r0]
            r29 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r29 = (com.ots.core.utils.customview.edit.TextInputLayout) r29
            r0 = 2
            r0 = r46[r0]
            r30 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r30 = (com.ots.core.utils.customview.edit.TextInputLayout) r30
            r0 = 11
            r0 = r46[r0]
            r31 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r31 = (com.ots.core.utils.customview.edit.TextInputLayout) r31
            r0 = 4
            r0 = r46[r0]
            r32 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r32 = (com.ots.core.utils.customview.edit.TextInputLayout) r32
            r0 = 21
            r0 = r46[r0]
            r33 = r0
            com.ots.base.ui.AddressEdittext r33 = (com.ots.base.ui.AddressEdittext) r33
            r0 = 25
            r0 = r46[r0]
            r34 = r0
            android.widget.ImageView r34 = (android.widget.ImageView) r34
            r0 = 23
            r0 = r46[r0]
            r35 = r0
            android.widget.ImageView r35 = (android.widget.ImageView) r35
            r0 = 38
            r0 = r46[r0]
            r36 = r0
            android.widget.LinearLayout r36 = (android.widget.LinearLayout) r36
            r0 = 41
            r0 = r46[r0]
            r37 = r0
            android.widget.LinearLayout r37 = (android.widget.LinearLayout) r37
            r0 = 22
            r0 = r46[r0]
            r38 = r0
            android.widget.LinearLayout r38 = (android.widget.LinearLayout) r38
            r0 = 33
            r0 = r46[r0]
            r39 = r0
            android.widget.LinearLayout r39 = (android.widget.LinearLayout) r39
            r0 = 0
            r0 = r46[r0]
            r47 = r0
            android.widget.LinearLayout r47 = (android.widget.LinearLayout) r47
            r0 = 29
            r0 = r46[r0]
            r48 = r0
            android.widget.LinearLayout r48 = (android.widget.LinearLayout) r48
            r0 = 27
            r0 = r46[r0]
            if (r0 == 0) goto L_0x012d
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r49 = r0
            goto L_0x012f
        L_0x012d:
            r49 = r13
        L_0x012f:
            r0 = 15
            r0 = r46[r0]
            r40 = r0
            com.ots.base.ui.AddressEdittext r40 = (com.ots.base.ui.AddressEdittext) r40
            r0 = 34
            r0 = r46[r0]
            r41 = r0
            com.ots.core.utils.customview.textview.AppTextView r41 = (com.ots.core.utils.customview.textview.AppTextView) r41
            r0 = 42
            r0 = r46[r0]
            r42 = r0
            com.ots.core.utils.customview.textview.AppTextView r42 = (com.ots.core.utils.customview.textview.AppTextView) r42
            r0 = 20
            r0 = r46[r0]
            r43 = r0
            com.ots.base.ui.AddressEdittext r43 = (com.ots.base.ui.AddressEdittext) r43
            r0 = 35
            r0 = r46[r0]
            r44 = r0
            com.ots.core.utils.customview.textview.AppTextView r44 = (com.ots.core.utils.customview.textview.AppTextView) r44
            r0 = 30
            r0 = r46[r0]
            com.ots.base.utils.customview.GradientTextView r0 = (com.ots.base.utils.customview.GradientTextView) r0
            r0 = 31
            r0 = r46[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 36
            r0 = r46[r0]
            r45 = r0
            com.ots.core.utils.customview.textview.AppTextView r45 = (com.ots.core.utils.customview.textview.AppTextView) r45
            r0 = r50
            r1 = r51
            r2 = r52
            r13 = r16
            r14 = r17
            r15 = r18
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r22
            r20 = r23
            r21 = r24
            r22 = r25
            r23 = r26
            r24 = r27
            r25 = r28
            r26 = r29
            r27 = r30
            r28 = r31
            r29 = r32
            r30 = r33
            r31 = r34
            r32 = r35
            r33 = r36
            r34 = r37
            r35 = r38
            r36 = r39
            r37 = r47
            r38 = r48
            r39 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            mg.y0$e r0 = new mg.y0$e
            r1 = r50
            r0.<init>()
            r1.f21463p0 = r0
            mg.y0$f r0 = new mg.y0$f
            r0.<init>()
            r1.f21464q0 = r0
            mg.y0$g r0 = new mg.y0$g
            r0.<init>()
            r1.f21465r0 = r0
            mg.y0$h r0 = new mg.y0$h
            r0.<init>()
            r1.f21466s0 = r0
            mg.y0$i r0 = new mg.y0$i
            r0.<init>()
            r1.f21467t0 = r0
            mg.y0$j r0 = new mg.y0$j
            r0.<init>()
            r1.f21468u0 = r0
            mg.y0$k r0 = new mg.y0$k
            r0.<init>()
            r1.f21469v0 = r0
            mg.y0$l r0 = new mg.y0$l
            r0.<init>()
            r1.f21470w0 = r0
            mg.y0$m r0 = new mg.y0$m
            r0.<init>()
            r1.f21471x0 = r0
            mg.y0$a r0 = new mg.y0$a
            r0.<init>()
            r1.f21472y0 = r0
            mg.y0$b r0 = new mg.y0$b
            r0.<init>()
            r1.f21473z0 = r0
            mg.y0$c r0 = new mg.y0$c
            r0.<init>()
            r1.A0 = r0
            mg.y0$d r0 = new mg.y0$d
            r0.<init>()
            r1.B0 = r0
            r2 = -1
            r1.C0 = r2
            android.widget.LinearLayout r0 = r1.f21444w
            r2 = 0
            r0.setTag(r2)
            com.google.android.material.button.MaterialButton r0 = r1.D
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.G
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.H
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.I
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.J
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.K
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.L
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.M
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.N
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.P
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.Q
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.R
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.S
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.T
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.U
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.V
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.W
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.X
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.Y
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.Z
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f21431c0
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f21433e0
            r0.setTag(r2)
            r0 = 1
            r0 = r46[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21436h0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21439k0
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r52
            r2.setTag(r0, r1)
            r50.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.y0.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r41 = this;
            r1 = r41
            monitor-enter(r41)
            long r2 = r1.C0     // Catch:{ all -> 0x02be }
            r4 = 0
            r1.C0 = r4     // Catch:{ all -> 0x02be }
            monitor-exit(r41)     // Catch:{ all -> 0x02be }
            yg.a r0 = r1.f21443o0
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r6 = r1.f21442n0
            r7 = 320(0x140, double:1.58E-321)
            long r9 = r2 & r7
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0021
            java.lang.String r9 = r0.a()
            java.lang.String r0 = r0.b()
            goto L_0x0023
        L_0x0021:
            r0 = 0
            r9 = 0
        L_0x0023:
            r11 = 447(0x1bf, double:2.21E-321)
            long r11 = r11 & r2
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r12 = 400(0x190, double:1.976E-321)
            r14 = 386(0x182, double:1.907E-321)
            r16 = 385(0x181, double:1.9E-321)
            r18 = 388(0x184, double:1.917E-321)
            r10 = 1
            r21 = 392(0x188, double:1.937E-321)
            r23 = 416(0x1a0, double:2.055E-321)
            r7 = 0
            if (r11 == 0) goto L_0x014c
            long r25 = r2 & r16
            int r8 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x004e
            if (r6 == 0) goto L_0x0043
            d2.i<java.util.ArrayList<gf.b>> r8 = r6.E
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            r1.u(r7, r8)
            if (r8 == 0) goto L_0x004e
            T r8 = r8.f8545b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            goto L_0x004f
        L_0x004e:
            r8 = 0
        L_0x004f:
            long r25 = r2 & r14
            int r11 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x005a
            d2.i<java.util.ArrayList<gf.b>> r11 = r6.D
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r1.u(r10, r11)
            if (r11 == 0) goto L_0x0065
            T r11 = r11.f8545b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            goto L_0x0066
        L_0x0065:
            r11 = 0
        L_0x0066:
            long r25 = r2 & r18
            int r25 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r25 == 0) goto L_0x00d3
            if (r6 == 0) goto L_0x0071
            d2.i<com.vpa.daugia.module.auth.data.model.User> r7 = r6.L
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            r14 = 2
            r1.u(r14, r7)
            if (r7 == 0) goto L_0x007d
            T r7 = r7.f8545b
            com.vpa.daugia.module.auth.data.model.User r7 = (com.vpa.daugia.module.auth.data.model.User) r7
            goto L_0x007e
        L_0x007d:
            r7 = 0
        L_0x007e:
            if (r7 == 0) goto L_0x00a5
            java.lang.String r14 = r7.getEmail()
            java.lang.String r15 = r7.getIdentityNumber()
            java.lang.String r27 = r7.getPhone()
            java.lang.String r28 = r7.getBankAccountOwner()
            boolean r29 = r7.getIsEdit()
            java.lang.Long r30 = r7.getPersonIssuanceDate()
            java.lang.String r31 = r7.getFullname()
            java.lang.String r32 = r7.getBankAccount()
            java.lang.String r7 = r7.getAddress()
            goto L_0x00b4
        L_0x00a5:
            r7 = 0
            r14 = 0
            r15 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L_0x00b4:
            if (r25 == 0) goto L_0x00bf
            if (r29 == 0) goto L_0x00bb
            r33 = 1024(0x400, double:5.06E-321)
            goto L_0x00bd
        L_0x00bb:
            r33 = 512(0x200, double:2.53E-321)
        L_0x00bd:
            long r2 = r2 | r33
        L_0x00bf:
            if (r29 == 0) goto L_0x00c7
            r25 = r15
            r15 = r14
            r14 = r7
            r7 = 0
            goto L_0x00e4
        L_0x00c7:
            r25 = 8
            r40 = r14
            r14 = r7
            r7 = r25
            r25 = r15
            r15 = r40
            goto L_0x00e4
        L_0x00d3:
            r7 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L_0x00e4:
            long r33 = r2 & r21
            int r26 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x00fb
            if (r6 == 0) goto L_0x00ef
            d2.i<java.util.ArrayList<gf.b>> r10 = r6.G
            goto L_0x00f0
        L_0x00ef:
            r10 = 0
        L_0x00f0:
            r4 = 3
            r1.u(r4, r10)
            if (r10 == 0) goto L_0x00fb
            T r4 = r10.f8545b
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            goto L_0x00fc
        L_0x00fb:
            r4 = 0
        L_0x00fc:
            long r36 = r2 & r12
            r34 = 0
            int r5 = (r36 > r34 ? 1 : (r36 == r34 ? 0 : -1))
            if (r5 == 0) goto L_0x0115
            if (r6 == 0) goto L_0x0109
            d2.i<java.util.ArrayList<gf.b>> r5 = r6.F
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            r10 = 4
            r1.u(r10, r5)
            if (r5 == 0) goto L_0x0115
            T r5 = r5.f8545b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            goto L_0x0116
        L_0x0115:
            r5 = 0
        L_0x0116:
            long r36 = r2 & r23
            r34 = 0
            int r10 = (r36 > r34 ? 1 : (r36 == r34 ? 0 : -1))
            if (r10 == 0) goto L_0x0130
            if (r6 == 0) goto L_0x0123
            d2.i<java.util.ArrayList<gf.b>> r6 = r6.H
            goto L_0x0124
        L_0x0123:
            r6 = 0
        L_0x0124:
            r10 = 5
            r1.u(r10, r6)
            if (r6 == 0) goto L_0x0130
            T r6 = r6.f8545b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r10 = r6
            goto L_0x0131
        L_0x0130:
            r10 = 0
        L_0x0131:
            r20 = r0
            r0 = r8
            r38 = r10
            r39 = r11
            r6 = r25
            r12 = r27
            r8 = r28
            r13 = r30
            r11 = r31
            r10 = r4
            r4 = r7
            r27 = r9
            r7 = r29
            r9 = r5
            r5 = r32
            goto L_0x0161
        L_0x014c:
            r20 = r0
            r27 = r9
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r38 = 0
            r39 = 0
        L_0x0161:
            long r18 = r2 & r18
            r28 = 0
            int r18 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r18 == 0) goto L_0x01fc
            r18 = r10
            android.widget.LinearLayout r10 = r1.f21444w
            r10.setEnabled(r7)
            com.google.android.material.button.MaterialButton r10 = r1.D
            r10.setVisibility(r4)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.F
            e2.c.d(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.G
            e2.c.d(r4, r6)
            com.ots.base.ui.AddressEdittext r4 = r1.H
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.I
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.J
            e2.c.d(r4, r15)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.K
            e2.c.d(r4, r8)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.L
            e2.c.d(r4, r14)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.M
            e2.c.d(r4, r11)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.N
            e2.c.d(r4, r12)
            com.ots.base.ui.AddressEdittext r4 = r1.P
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.Q
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.R
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.S
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.T
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.U
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.V
            m9.b.T(r4, r7)
            com.ots.core.utils.customview.edit.TextInputLayout r4 = r1.W
            m9.b.T(r4, r7)
            com.ots.base.ui.AddressEdittext r4 = r1.X
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            android.widget.LinearLayout r4 = r1.f21431c0
            r4.setEnabled(r7)
            com.ots.base.ui.AddressEdittext r4 = r1.f21436h0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.f21439k0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            ye.c.d(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.f21439k0
            ye.c.h(r4, r13)
            goto L_0x01fe
        L_0x01fc:
            r18 = r10
        L_0x01fe:
            r4 = 256(0x100, double:1.265E-321)
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0262
            androidx.appcompat.widget.AppCompatEditText r4 = r1.F
            mg.y0$e r5 = r1.f21463p0
            e2.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.G
            mg.y0$f r5 = r1.f21464q0
            e2.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.H
            mg.y0$g r5 = r1.f21465r0
            ye.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.I
            mg.y0$h r5 = r1.f21466s0
            ye.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.J
            mg.y0$i r5 = r1.f21467t0
            e2.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.K
            mg.y0$j r5 = r1.f21468u0
            e2.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.L
            mg.y0$k r5 = r1.f21469v0
            e2.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.M
            mg.y0$l r5 = r1.f21470w0
            e2.c.e(r4, r5)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.N
            mg.y0$m r5 = r1.f21471x0
            e2.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.P
            mg.y0$a r5 = r1.f21472y0
            ye.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.X
            mg.y0$b r5 = r1.f21473z0
            ye.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.f21436h0
            mg.y0$c r5 = r1.A0
            ye.c.e(r4, r5)
            com.ots.base.ui.AddressEdittext r4 = r1.f21439k0
            mg.y0$d r5 = r1.B0
            ye.c.g(r4, r5)
        L_0x0262:
            long r4 = r2 & r16
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x026f
            com.ots.base.ui.AddressEdittext r4 = r1.H
            ye.c.f(r4, r0)
        L_0x026f:
            r4 = 400(0x190, double:1.976E-321)
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x027b
            com.ots.base.ui.AddressEdittext r0 = r1.I
            ye.c.f(r0, r9)
        L_0x027b:
            long r4 = r2 & r21
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0288
            com.ots.base.ui.AddressEdittext r0 = r1.P
            r4 = r18
            ye.c.f(r0, r4)
        L_0x0288:
            long r4 = r2 & r23
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0295
            com.ots.base.ui.AddressEdittext r0 = r1.X
            r10 = r38
            ye.c.f(r0, r10)
        L_0x0295:
            r4 = 320(0x140, double:1.58E-321)
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02af
            android.widget.ImageView r0 = r1.Y
            java.lang.String r4 = "ROUND"
            r9 = r27
            r5 = 1
            ze.d.a(r0, r9, r4, r5)
            android.widget.ImageView r0 = r1.Z
            java.lang.String r4 = "ROUND"
            r10 = r20
            ze.d.a(r0, r10, r4, r5)
        L_0x02af:
            r4 = 386(0x182, double:1.907E-321)
            long r2 = r2 & r4
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02bd
            com.ots.base.ui.AddressEdittext r0 = r1.f21436h0
            r11 = r39
            ye.c.f(r0, r11)
        L_0x02bd:
            return
        L_0x02be:
            r0 = move-exception
            monitor-exit(r41)     // Catch:{ all -> 0x02be }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.y0.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.C0 != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.C0 = 256;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 == 0) {
            d2.i iVar = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 1;
            }
            return true;
        } else if (i10 == 1) {
            d2.i iVar2 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 2;
            }
            return true;
        } else if (i10 == 2) {
            d2.i iVar3 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 4;
            }
            return true;
        } else if (i10 == 3) {
            d2.i iVar4 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 8;
            }
            return true;
        } else if (i10 == 4) {
            d2.i iVar5 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 16;
            }
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            d2.i iVar6 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C0 |= 32;
            }
            return true;
        }
    }

    public final void v(yg.a aVar) {
        this.f21443o0 = aVar;
        synchronized (this) {
            this.C0 |= 64;
        }
        f(1);
        t();
    }

    public final void w(LoginViewModel loginViewModel) {
        this.f21442n0 = loginViewModel;
        synchronized (this) {
            this.C0 |= 128;
        }
        f(4);
        t();
    }
}

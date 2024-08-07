package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.ArrayList;

/* compiled from: FragmentStepThreeBindingImpl */
public final class z3 extends y3 {

    /* renamed from: n0  reason: collision with root package name */
    public static final SparseIntArray f21512n0;

    /* renamed from: a0  reason: collision with root package name */
    public d f21513a0 = new d();

    /* renamed from: b0  reason: collision with root package name */
    public e f21514b0 = new e();

    /* renamed from: c0  reason: collision with root package name */
    public f f21515c0 = new f();

    /* renamed from: d0  reason: collision with root package name */
    public g f21516d0 = new g();

    /* renamed from: e0  reason: collision with root package name */
    public h f21517e0 = new h();

    /* renamed from: f0  reason: collision with root package name */
    public i f21518f0 = new i();

    /* renamed from: g0  reason: collision with root package name */
    public j f21519g0 = new j();

    /* renamed from: h0  reason: collision with root package name */
    public k f21520h0 = new k();

    /* renamed from: i0  reason: collision with root package name */
    public l f21521i0 = new l();

    /* renamed from: j0  reason: collision with root package name */
    public a f21522j0 = new a();

    /* renamed from: k0  reason: collision with root package name */
    public b f21523k0 = new b();

    /* renamed from: l0  reason: collision with root package name */
    public c f21524l0 = new c();

    /* renamed from: m0  reason: collision with root package name */
    public long f21525m0 = -1;

    /* compiled from: FragmentStepThreeBindingImpl */
    public class a implements d2.g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            long c10 = ye.c.c(z3.this.V);
            LoginViewModel loginViewModel = z3.this.Z;
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
                        user.setOrgIssuanceDate(Long.valueOf(c10));
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStepThreeBindingImpl */
    public class b implements d2.g {
        public b() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(z3.this.W);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class c implements d2.g {
        public c() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(z3.this.Y);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class d implements d2.g {
        public d() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.B);
            LoginViewModel loginViewModel = z3.this.Z;
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
                        user.setOrgBusinessRegistration(a10);
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStepThreeBindingImpl */
    public class e implements d2.g {
        public e() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.C);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class f implements d2.g {
        public f() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.D);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class g implements d2.g {
        public g() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.E);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class h implements d2.g {
        public h() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.F);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class i implements d2.g {
        public i() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.G);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class j implements d2.g {
        public j() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(z3.this.H);
            LoginViewModel loginViewModel = z3.this.Z;
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
                        user.setOrgIssuancePlace(a10);
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStepThreeBindingImpl */
    public class k implements d2.g {
        public k() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(z3.this.T);
            LoginViewModel loginViewModel = z3.this.Z;
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

    /* compiled from: FragmentStepThreeBindingImpl */
    public class l implements d2.g {
        public l() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(z3.this.U);
            LoginViewModel loginViewModel = z3.this.Z;
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

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21512n0 = sparseIntArray;
        sparseIntArray.put(2131362720, 13);
        sparseIntArray.put(2131361926, 14);
        sparseIntArray.put(2131361936, 15);
        sparseIntArray.put(2131362022, 16);
        sparseIntArray.put(C0533R$id.lnBtn, 17);
        sparseIntArray.put(C0533R$id.tvPage, 18);
        sparseIntArray.put(C0533R$id.tvQuestion, 19);
        sparseIntArray.put(C0533R$id.btnInfo, 20);
        sparseIntArray.put(C0533R$id.lnInfo, 21);
        sparseIntArray.put(C0533R$id.inputAddress, 22);
        sparseIntArray.put(C0533R$id.inputEmail, 23);
        sparseIntArray.put(C0533R$id.inputPhone, 24);
        sparseIntArray.put(C0533R$id.btnBank, 25);
        sparseIntArray.put(C0533R$id.lnBank, 26);
        sparseIntArray.put(C0533R$id.inputIdNumber, 27);
        sparseIntArray.put(C0533R$id.inputFullName, 28);
        sparseIntArray.put(C0533R$id.btnId, 29);
        sparseIntArray.put(C0533R$id.lnCitizen, 30);
        sparseIntArray.put(C0533R$id.inputCode, 31);
        sparseIntArray.put(C0533R$id.inputPlaceOfIssue, 32);
        sparseIntArray.put(C0533R$id.lnFontFace, 33);
        sparseIntArray.put(C0533R$id.iv, 34);
        sparseIntArray.put(C0533R$id.bottomButton, 35);
        sparseIntArray.put(C0533R$id.btnLater, 36);
        sparseIntArray.put(C0533R$id.button, 37);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z3(d2.e r34, android.view.View r35) {
        /*
            r33 = this;
            r15 = r33
            r14 = r35
            r0 = r33
            r1 = r34
            r2 = r35
            android.util.SparseIntArray r3 = f21512n0
            r4 = 38
            r13 = 0
            r5 = r34
            java.lang.Object[] r32 = d2.l.o(r5, r14, r4, r13, r3)
            r3 = 35
            r3 = r32[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 14
            r3 = r32[r3]
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r3 = 25
            r3 = r32[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 15
            r4 = r32[r4]
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r5 = 29
            r5 = r32[r5]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 20
            r6 = r32[r6]
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 36
            r7 = r32[r7]
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r7 = 37
            r7 = r32[r7]
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r8 = 16
            r8 = r32[r8]
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r8 = 10
            r8 = r32[r8]
            androidx.appcompat.widget.AppCompatEditText r8 = (androidx.appcompat.widget.AppCompatEditText) r8
            r9 = 5
            r9 = r32[r9]
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r10 = 9
            r10 = r32[r10]
            androidx.appcompat.widget.AppCompatEditText r10 = (androidx.appcompat.widget.AppCompatEditText) r10
            r11 = 8
            r11 = r32[r11]
            androidx.appcompat.widget.AppCompatEditText r11 = (androidx.appcompat.widget.AppCompatEditText) r11
            r12 = 4
            r12 = r32[r12]
            androidx.appcompat.widget.AppCompatEditText r12 = (androidx.appcompat.widget.AppCompatEditText) r12
            r16 = 6
            r16 = r32[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r13 = r16
            r16 = 12
            r16 = r32[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r14 = r16
            r16 = 22
            r16 = r32[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r15 = r16
            r16 = 31
            r16 = r32[r16]
            com.ots.core.utils.customview.edit.TextInputLayout r16 = (com.ots.core.utils.customview.edit.TextInputLayout) r16
            r17 = 23
            r17 = r32[r17]
            com.ots.core.utils.customview.edit.TextInputLayout r17 = (com.ots.core.utils.customview.edit.TextInputLayout) r17
            r18 = 28
            r18 = r32[r18]
            com.ots.core.utils.customview.edit.TextInputLayout r18 = (com.ots.core.utils.customview.edit.TextInputLayout) r18
            r19 = 27
            r19 = r32[r19]
            com.ots.core.utils.customview.edit.TextInputLayout r19 = (com.ots.core.utils.customview.edit.TextInputLayout) r19
            r20 = 24
            r20 = r32[r20]
            com.ots.core.utils.customview.edit.TextInputLayout r20 = (com.ots.core.utils.customview.edit.TextInputLayout) r20
            r21 = 32
            r21 = r32[r21]
            com.ots.core.utils.customview.edit.TextInputLayout r21 = (com.ots.core.utils.customview.edit.TextInputLayout) r21
            r22 = 34
            r22 = r32[r22]
            android.widget.ImageView r22 = (android.widget.ImageView) r22
            r23 = 26
            r23 = r32[r23]
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            r24 = 17
            r24 = r32[r24]
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            r24 = 30
            r24 = r32[r24]
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            r25 = 33
            r25 = r32[r25]
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r25 = 21
            r25 = r32[r25]
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r26 = 13
            r26 = r32[r26]
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r26 = 7
            r26 = r32[r26]
            com.ots.base.ui.AddressEdittext r26 = (com.ots.base.ui.AddressEdittext) r26
            r27 = 1
            r27 = r32[r27]
            com.ots.base.ui.AddressEdittext r27 = (com.ots.base.ui.AddressEdittext) r27
            r28 = 11
            r28 = r32[r28]
            com.ots.base.ui.AddressEdittext r28 = (com.ots.base.ui.AddressEdittext) r28
            r29 = 2
            r29 = r32[r29]
            com.ots.base.ui.AddressEdittext r29 = (com.ots.base.ui.AddressEdittext) r29
            r30 = 18
            r30 = r32[r30]
            com.ots.base.utils.customview.GradientTextView r30 = (com.ots.base.utils.customview.GradientTextView) r30
            r31 = 19
            r31 = r32[r31]
            android.widget.TextView r31 = (android.widget.TextView) r31
            r31 = 3
            r31 = r32[r31]
            com.ots.base.ui.AddressEdittext r31 = (com.ots.base.ui.AddressEdittext) r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            mg.z3$d r0 = new mg.z3$d
            r1 = r33
            r0.<init>()
            r1.f21513a0 = r0
            mg.z3$e r0 = new mg.z3$e
            r0.<init>()
            r1.f21514b0 = r0
            mg.z3$f r0 = new mg.z3$f
            r0.<init>()
            r1.f21515c0 = r0
            mg.z3$g r0 = new mg.z3$g
            r0.<init>()
            r1.f21516d0 = r0
            mg.z3$h r0 = new mg.z3$h
            r0.<init>()
            r1.f21517e0 = r0
            mg.z3$i r0 = new mg.z3$i
            r0.<init>()
            r1.f21518f0 = r0
            mg.z3$j r0 = new mg.z3$j
            r0.<init>()
            r1.f21519g0 = r0
            mg.z3$k r0 = new mg.z3$k
            r0.<init>()
            r1.f21520h0 = r0
            mg.z3$l r0 = new mg.z3$l
            r0.<init>()
            r1.f21521i0 = r0
            mg.z3$a r0 = new mg.z3$a
            r0.<init>()
            r1.f21522j0 = r0
            mg.z3$b r0 = new mg.z3$b
            r0.<init>()
            r1.f21523k0 = r0
            mg.z3$c r0 = new mg.z3$c
            r0.<init>()
            r1.f21524l0 = r0
            r2 = -1
            r1.f21525m0 = r2
            androidx.appcompat.widget.AppCompatEditText r0 = r1.B
            r2 = 0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.C
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.D
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.E
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.G
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.H
            r0.setTag(r2)
            r0 = 0
            r0 = r32[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.T
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.U
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.V
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.W
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.Y
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r35
            r2.setTag(r0, r1)
            r33.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z3.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r32 = this;
            r1 = r32
            monitor-enter(r32)
            long r2 = r1.f21525m0     // Catch:{ all -> 0x01b8 }
            r4 = 0
            r1.f21525m0 = r4     // Catch:{ all -> 0x01b8 }
            monitor-exit(r32)     // Catch:{ all -> 0x01b8 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.Z
            r6 = 127(0x7f, double:6.27E-322)
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 100
            r9 = 112(0x70, double:5.53E-322)
            r11 = 97
            r13 = 98
            r15 = 104(0x68, double:5.14E-322)
            r17 = 0
            if (r6 == 0) goto L_0x00e5
            long r18 = r2 & r11
            int r6 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x002a
            d2.i<java.util.ArrayList<gf.b>> r6 = r0.D
            goto L_0x002c
        L_0x002a:
            r6 = r17
        L_0x002c:
            r11 = 0
            r1.u(r11, r6)
            if (r6 == 0) goto L_0x0037
            T r6 = r6.f8545b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L_0x0039
        L_0x0037:
            r6 = r17
        L_0x0039:
            long r11 = r2 & r13
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0044
            d2.i<java.util.ArrayList<gf.b>> r11 = r0.G
            goto L_0x0046
        L_0x0044:
            r11 = r17
        L_0x0046:
            r12 = 1
            r1.u(r12, r11)
            if (r11 == 0) goto L_0x0051
            T r11 = r11.f8545b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            goto L_0x0053
        L_0x0051:
            r11 = r17
        L_0x0053:
            long r20 = r2 & r7
            int r12 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x005e
            d2.i<com.vpa.daugia.module.auth.data.model.User> r12 = r0.L
            goto L_0x0060
        L_0x005e:
            r12 = r17
        L_0x0060:
            r13 = 2
            r1.u(r13, r12)
            if (r12 == 0) goto L_0x006b
            T r12 = r12.f8545b
            com.vpa.daugia.module.auth.data.model.User r12 = (com.vpa.daugia.module.auth.data.model.User) r12
            goto L_0x006d
        L_0x006b:
            r12 = r17
        L_0x006d:
            if (r12 == 0) goto L_0x0090
            java.lang.String r13 = r12.getEmail()
            java.lang.String r14 = r12.getOrgIssuancePlace()
            java.lang.Long r22 = r12.getOrgIssuanceDate()
            java.lang.String r23 = r12.getPhone()
            java.lang.String r24 = r12.getBankAccountOwner()
            java.lang.String r25 = r12.getBankAccount()
            java.lang.String r26 = r12.getAddress()
            java.lang.String r12 = r12.getOrgBusinessRegistration()
            goto L_0x009e
        L_0x0090:
            r12 = r17
            r13 = r12
            r14 = r13
            r22 = r14
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
        L_0x009e:
            long r27 = r2 & r15
            int r27 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r27 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00a9
            d2.i<java.util.ArrayList<gf.b>> r15 = r0.F
            goto L_0x00ab
        L_0x00a9:
            r15 = r17
        L_0x00ab:
            r7 = 3
            r1.u(r7, r15)
            if (r15 == 0) goto L_0x00b6
            T r7 = r15.f8545b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            goto L_0x00b8
        L_0x00b6:
            r7 = r17
        L_0x00b8:
            long r15 = r2 & r9
            int r8 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00d1
            if (r0 == 0) goto L_0x00c3
            d2.i<java.util.ArrayList<gf.b>> r0 = r0.E
            goto L_0x00c5
        L_0x00c3:
            r0 = r17
        L_0x00c5:
            r8 = 4
            r1.u(r8, r0)
            if (r0 == 0) goto L_0x00d1
            T r0 = r0.f8545b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r17 = r0
        L_0x00d1:
            r15 = r6
            r30 = r7
            r31 = r11
            r29 = r17
            r11 = r22
            r8 = r23
            r0 = r24
            r6 = r25
            r7 = r26
            r16 = 100
            goto L_0x00f8
        L_0x00e5:
            r0 = r17
            r6 = r0
            r11 = r6
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r29 = r15
            r30 = r29
            r31 = r30
            r16 = r7
            r7 = r31
            r8 = r7
        L_0x00f8:
            long r16 = r16 & r2
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x0126
            androidx.appcompat.widget.AppCompatEditText r9 = r1.B
            e2.c.d(r9, r12)
            androidx.appcompat.widget.AppCompatEditText r9 = r1.C
            e2.c.d(r9, r13)
            androidx.appcompat.widget.AppCompatEditText r9 = r1.D
            e2.c.d(r9, r0)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.E
            e2.c.d(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            e2.c.d(r0, r7)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.G
            e2.c.d(r0, r8)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.H
            e2.c.d(r0, r14)
            com.ots.base.ui.AddressEdittext r0 = r1.V
            ye.c.h(r0, r11)
        L_0x0126:
            r6 = 64
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            androidx.appcompat.widget.AppCompatEditText r0 = r1.B
            mg.z3$d r6 = r1.f21513a0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.C
            mg.z3$e r6 = r1.f21514b0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.D
            mg.z3$f r6 = r1.f21515c0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.E
            mg.z3$g r6 = r1.f21516d0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            mg.z3$h r6 = r1.f21517e0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.G
            mg.z3$i r6 = r1.f21518f0
            e2.c.e(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.H
            mg.z3$j r6 = r1.f21519g0
            e2.c.e(r0, r6)
            com.ots.base.ui.AddressEdittext r0 = r1.T
            mg.z3$k r6 = r1.f21520h0
            ye.c.e(r0, r6)
            com.ots.base.ui.AddressEdittext r0 = r1.U
            mg.z3$l r6 = r1.f21521i0
            ye.c.e(r0, r6)
            com.ots.base.ui.AddressEdittext r0 = r1.V
            mg.z3$a r6 = r1.f21522j0
            ye.c.g(r0, r6)
            com.ots.base.ui.AddressEdittext r0 = r1.W
            mg.z3$b r6 = r1.f21523k0
            ye.c.e(r0, r6)
            com.ots.base.ui.AddressEdittext r0 = r1.Y
            mg.z3$c r6 = r1.f21524l0
            ye.c.e(r0, r6)
        L_0x0181:
            r6 = 97
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x018d
            com.ots.base.ui.AddressEdittext r0 = r1.T
            ye.c.f(r0, r15)
        L_0x018d:
            r6 = 112(0x70, double:5.53E-322)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x019b
            com.ots.base.ui.AddressEdittext r0 = r1.U
            r6 = r29
            ye.c.f(r0, r6)
        L_0x019b:
            r6 = 104(0x68, double:5.14E-322)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01a9
            com.ots.base.ui.AddressEdittext r0 = r1.W
            r7 = r30
            ye.c.f(r0, r7)
        L_0x01a9:
            r6 = 98
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01b7
            com.ots.base.ui.AddressEdittext r0 = r1.Y
            r11 = r31
            ye.c.f(r0, r11)
        L_0x01b7:
            return
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r32)     // Catch:{ all -> 0x01b8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z3.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f21525m0 != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f21525m0 = 64;
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
                this.f21525m0 |= 1;
            }
            return true;
        } else if (i10 == 1) {
            d2.i iVar2 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f21525m0 |= 2;
            }
            return true;
        } else if (i10 == 2) {
            d2.i iVar3 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f21525m0 |= 4;
            }
            return true;
        } else if (i10 == 3) {
            d2.i iVar4 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f21525m0 |= 8;
            }
            return true;
        } else if (i10 != 4) {
            return false;
        } else {
            d2.i iVar5 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f21525m0 |= 16;
            }
            return true;
        }
    }

    public final void v(LoginViewModel loginViewModel) {
        this.Z = loginViewModel;
        synchronized (this) {
            this.f21525m0 |= 32;
        }
        f(4);
        t();
    }
}

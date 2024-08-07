package mg;

import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.ArrayList;

/* compiled from: FragmentStepThreePersonalBindingImpl */
public final class b4 extends a4 {

    /* renamed from: q0  reason: collision with root package name */
    public static final SparseIntArray f20972q0;

    /* renamed from: f0  reason: collision with root package name */
    public b f20973f0 = new b();

    /* renamed from: g0  reason: collision with root package name */
    public c f20974g0 = new c();

    /* renamed from: h0  reason: collision with root package name */
    public d f20975h0 = new d();

    /* renamed from: i0  reason: collision with root package name */
    public e f20976i0 = new e();

    /* renamed from: j0  reason: collision with root package name */
    public f f20977j0 = new f();

    /* renamed from: k0  reason: collision with root package name */
    public g f20978k0 = new g();

    /* renamed from: l0  reason: collision with root package name */
    public h f20979l0 = new h();

    /* renamed from: m0  reason: collision with root package name */
    public i f20980m0 = new i();

    /* renamed from: n0  reason: collision with root package name */
    public j f20981n0 = new j();

    /* renamed from: o0  reason: collision with root package name */
    public a f20982o0 = new a();

    /* renamed from: p0  reason: collision with root package name */
    public long f20983p0 = -1;

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class a implements d2.g {
        public a() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(b4.this.f20946c0);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class b implements d2.g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(b4.this.F);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class c implements d2.g {
        public c() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(b4.this.G);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class d implements d2.g {
        public d() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(b4.this.H);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class e implements d2.g {
        public e() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(b4.this.I);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class f implements d2.g {
        public f() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(b4.this.K);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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
                        user.setPersonIssuancePlace(a10);
                    }
                }
            }
        }
    }

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class g implements d2.g {
        public g() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(b4.this.X);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class h implements d2.g {
        public h() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(b4.this.Y);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class i implements d2.g {
        public i() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            long c10 = ye.c.c(b4.this.Z);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    /* compiled from: FragmentStepThreePersonalBindingImpl */
    public class j implements d2.g {
        public j() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(b4.this.f20944a0);
            LoginViewModel loginViewModel = b4.this.f20947d0;
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

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20972q0 = sparseIntArray;
        sparseIntArray.put(2131362720, 13);
        sparseIntArray.put(2131361926, 14);
        sparseIntArray.put(2131361936, 15);
        sparseIntArray.put(2131362022, 16);
        sparseIntArray.put(C0533R$id.lnBtn, 17);
        sparseIntArray.put(C0533R$id.tvPage, 18);
        sparseIntArray.put(C0533R$id.tvQuestion, 19);
        sparseIntArray.put(C0533R$id.btnInfo, 20);
        sparseIntArray.put(C0533R$id.lnInfo, 21);
        sparseIntArray.put(C0533R$id.inputMyLocation, 22);
        sparseIntArray.put(C0533R$id.edtMyLocation, 23);
        sparseIntArray.put(C0533R$id.inputEmail, 24);
        sparseIntArray.put(C0533R$id.btnBank, 25);
        sparseIntArray.put(C0533R$id.lnBank, 26);
        sparseIntArray.put(C0533R$id.inputIdNumber, 27);
        sparseIntArray.put(C0533R$id.inputFullName, 28);
        sparseIntArray.put(C0533R$id.btnId, 29);
        sparseIntArray.put(C0533R$id.lnCitizen, 30);
        sparseIntArray.put(C0533R$id.inputCard, 31);
        sparseIntArray.put(C0533R$id.inputPlaceOfIssue, 32);
        sparseIntArray.put(C0533R$id.lnFontFace, 33);
        sparseIntArray.put(C0533R$id.btnFront, 34);
        sparseIntArray.put(C0533R$id.backSide, 35);
        sparseIntArray.put(C0533R$id.btnBackSide, 36);
        sparseIntArray.put(C0533R$id.bottomButton, 37);
        sparseIntArray.put(C0533R$id.btnLater, 38);
        sparseIntArray.put(C0533R$id.button, 39);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b4(d2.e r38, android.view.View r39) {
        /*
            r37 = this;
            r15 = r37
            r14 = r39
            r0 = r37
            r1 = r38
            r2 = r39
            android.util.SparseIntArray r3 = f20972q0
            r4 = 40
            r13 = 0
            r5 = r38
            java.lang.Object[] r35 = d2.l.o(r5, r14, r4, r13, r3)
            r3 = 35
            r3 = r35[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 37
            r4 = r35[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4 = 14
            r4 = r35[r4]
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r4 = 36
            r4 = r35[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 25
            r5 = r35[r5]
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 15
            r6 = r35[r6]
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r7 = 34
            r7 = r35[r7]
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 29
            r8 = r35[r8]
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 20
            r9 = r35[r9]
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 38
            r10 = r35[r10]
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r11 = 39
            r11 = r35[r11]
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            r12 = 16
            r12 = r35[r12]
            androidx.core.widget.NestedScrollView r12 = (androidx.core.widget.NestedScrollView) r12
            r12 = 8
            r12 = r35[r12]
            androidx.appcompat.widget.AppCompatEditText r12 = (androidx.appcompat.widget.AppCompatEditText) r12
            r16 = 4
            r16 = r35[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r13 = r16
            r16 = 7
            r16 = r35[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r14 = r16
            r16 = 6
            r16 = r35[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r15 = r16
            r16 = 23
            r16 = r35[r16]
            androidx.appcompat.widget.AppCompatEditText r16 = (androidx.appcompat.widget.AppCompatEditText) r16
            r17 = 10
            r17 = r35[r17]
            androidx.appcompat.widget.AppCompatEditText r17 = (androidx.appcompat.widget.AppCompatEditText) r17
            r18 = 31
            r18 = r35[r18]
            com.ots.core.utils.customview.edit.TextInputLayout r18 = (com.ots.core.utils.customview.edit.TextInputLayout) r18
            r18 = 24
            r18 = r35[r18]
            com.ots.core.utils.customview.edit.TextInputLayout r18 = (com.ots.core.utils.customview.edit.TextInputLayout) r18
            r19 = 28
            r19 = r35[r19]
            com.ots.core.utils.customview.edit.TextInputLayout r19 = (com.ots.core.utils.customview.edit.TextInputLayout) r19
            r20 = 27
            r20 = r35[r20]
            com.ots.core.utils.customview.edit.TextInputLayout r20 = (com.ots.core.utils.customview.edit.TextInputLayout) r20
            r21 = 22
            r21 = r35[r21]
            com.ots.core.utils.customview.edit.TextInputLayout r21 = (com.ots.core.utils.customview.edit.TextInputLayout) r21
            r22 = 32
            r22 = r35[r22]
            com.ots.core.utils.customview.edit.TextInputLayout r22 = (com.ots.core.utils.customview.edit.TextInputLayout) r22
            r23 = 12
            r23 = r35[r23]
            android.widget.ImageView r23 = (android.widget.ImageView) r23
            r24 = 11
            r24 = r35[r24]
            android.widget.ImageView r24 = (android.widget.ImageView) r24
            r25 = 26
            r25 = r35[r25]
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            r26 = 17
            r26 = r35[r26]
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r26 = 30
            r26 = r35[r26]
            android.widget.LinearLayout r26 = (android.widget.LinearLayout) r26
            r27 = 33
            r27 = r35[r27]
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            r28 = 21
            r28 = r35[r28]
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            r29 = 0
            r29 = r35[r29]
            android.widget.RelativeLayout r29 = (android.widget.RelativeLayout) r29
            r30 = 13
            r30 = r35[r30]
            android.widget.LinearLayout r30 = (android.widget.LinearLayout) r30
            r30 = 5
            r30 = r35[r30]
            com.ots.base.ui.AddressEdittext r30 = (com.ots.base.ui.AddressEdittext) r30
            r31 = 1
            r31 = r35[r31]
            com.ots.base.ui.AddressEdittext r31 = (com.ots.base.ui.AddressEdittext) r31
            r32 = 9
            r32 = r35[r32]
            com.ots.base.ui.AddressEdittext r32 = (com.ots.base.ui.AddressEdittext) r32
            r33 = 2
            r33 = r35[r33]
            com.ots.base.ui.AddressEdittext r33 = (com.ots.base.ui.AddressEdittext) r33
            r34 = 18
            r34 = r35[r34]
            com.ots.base.utils.customview.GradientTextView r34 = (com.ots.base.utils.customview.GradientTextView) r34
            r36 = 19
            r36 = r35[r36]
            android.widget.TextView r36 = (android.widget.TextView) r36
            r36 = 3
            r35 = r35[r36]
            com.ots.base.ui.AddressEdittext r35 = (com.ots.base.ui.AddressEdittext) r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            mg.b4$b r0 = new mg.b4$b
            r1 = r37
            r0.<init>()
            r1.f20973f0 = r0
            mg.b4$c r0 = new mg.b4$c
            r0.<init>()
            r1.f20974g0 = r0
            mg.b4$d r0 = new mg.b4$d
            r0.<init>()
            r1.f20975h0 = r0
            mg.b4$e r0 = new mg.b4$e
            r0.<init>()
            r1.f20976i0 = r0
            mg.b4$f r0 = new mg.b4$f
            r0.<init>()
            r1.f20977j0 = r0
            mg.b4$g r0 = new mg.b4$g
            r0.<init>()
            r1.f20978k0 = r0
            mg.b4$h r0 = new mg.b4$h
            r0.<init>()
            r1.f20979l0 = r0
            mg.b4$i r0 = new mg.b4$i
            r0.<init>()
            r1.f20980m0 = r0
            mg.b4$j r0 = new mg.b4$j
            r0.<init>()
            r1.f20981n0 = r0
            mg.b4$a r0 = new mg.b4$a
            r0.<init>()
            r1.f20982o0 = r0
            r2 = -1
            r1.f20983p0 = r2
            androidx.appcompat.widget.AppCompatEditText r0 = r1.F
            r2 = 0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.G
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.H
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.I
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.K
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.Q
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.R
            r0.setTag(r2)
            android.widget.RelativeLayout r0 = r1.W
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.X
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.Y
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.Z
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f20944a0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f20946c0
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r39
            r2.setTag(r0, r1)
            r37.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b4.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r36 = this;
            r1 = r36
            monitor-enter(r36)
            long r2 = r1.f20983p0     // Catch:{ all -> 0x01ac }
            r4 = 0
            r1.f20983p0 = r4     // Catch:{ all -> 0x01ac }
            monitor-exit(r36)     // Catch:{ all -> 0x01ac }
            yg.a r0 = r1.f20948e0
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r6 = r1.f20947d0
            r7 = 160(0xa0, double:7.9E-322)
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            java.lang.String r9 = r0.a()
            java.lang.String r0 = r0.b()
            goto L_0x0022
        L_0x0020:
            r0 = 0
            r9 = 0
        L_0x0022:
            r10 = 223(0xdf, double:1.1E-321)
            long r10 = r10 & r2
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 193(0xc1, double:9.54E-322)
            r13 = 196(0xc4, double:9.7E-322)
            r15 = 208(0xd0, double:1.03E-321)
            r8 = 1
            r18 = 194(0xc2, double:9.6E-322)
            r20 = 200(0xc8, double:9.9E-322)
            if (r10 == 0) goto L_0x00e6
            long r22 = r2 & r11
            int r10 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x004b
            if (r6 == 0) goto L_0x003f
            d2.i<java.util.ArrayList<gf.b>> r10 = r6.D
            goto L_0x0040
        L_0x003f:
            r10 = 0
        L_0x0040:
            r11 = 0
            r1.u(r11, r10)
            if (r10 == 0) goto L_0x004b
            T r10 = r10.f8545b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            goto L_0x004c
        L_0x004b:
            r10 = 0
        L_0x004c:
            long r11 = r2 & r18
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x0062
            if (r6 == 0) goto L_0x0057
            d2.i<java.util.ArrayList<gf.b>> r11 = r6.G
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            r1.u(r8, r11)
            if (r11 == 0) goto L_0x0062
            T r11 = r11.f8545b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            long r24 = r2 & r13
            int r12 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x006e
            d2.i<com.vpa.daugia.module.auth.data.model.User> r12 = r6.L
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            r8 = 2
            r1.u(r8, r12)
            if (r12 == 0) goto L_0x007a
            T r8 = r12.f8545b
            com.vpa.daugia.module.auth.data.model.User r8 = (com.vpa.daugia.module.auth.data.model.User) r8
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            if (r8 == 0) goto L_0x0096
            java.lang.String r12 = r8.getEmail()
            java.lang.String r25 = r8.getIdentityNumber()
            java.lang.Long r26 = r8.getPersonIssuanceDate()
            java.lang.String r27 = r8.getBankAccountOwner()
            java.lang.String r28 = r8.getBankAccount()
            java.lang.String r8 = r8.getPersonIssuancePlace()
            goto L_0x00a0
        L_0x0096:
            r8 = 0
            r12 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x00a0:
            long r29 = r2 & r20
            int r29 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r29 == 0) goto L_0x00b7
            if (r6 == 0) goto L_0x00ab
            d2.i<java.util.ArrayList<gf.b>> r13 = r6.F
            goto L_0x00ac
        L_0x00ab:
            r13 = 0
        L_0x00ac:
            r14 = 3
            r1.u(r14, r13)
            if (r13 == 0) goto L_0x00b7
            T r13 = r13.f8545b
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            goto L_0x00b8
        L_0x00b7:
            r13 = 0
        L_0x00b8:
            long r31 = r2 & r15
            int r14 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x00d1
            if (r6 == 0) goto L_0x00c3
            d2.i<java.util.ArrayList<gf.b>> r6 = r6.E
            goto L_0x00c4
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            r14 = 4
            r1.u(r14, r6)
            if (r6 == 0) goto L_0x00d1
            T r6 = r6.f8545b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r17 = r6
            goto L_0x00d3
        L_0x00d1:
            r17 = 0
        L_0x00d3:
            r14 = r10
            r35 = r11
            r34 = r13
            r33 = r17
            r13 = r26
            r6 = r27
            r10 = r28
            r11 = r8
            r8 = r25
            r25 = 196(0xc4, double:9.7E-322)
            goto L_0x00f5
        L_0x00e6:
            r25 = r13
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r33 = 0
            r34 = 0
            r35 = 0
        L_0x00f5:
            long r25 = r2 & r25
            int r17 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0119
            androidx.appcompat.widget.AppCompatEditText r15 = r1.F
            e2.c.d(r15, r8)
            androidx.appcompat.widget.AppCompatEditText r8 = r1.G
            e2.c.d(r8, r12)
            androidx.appcompat.widget.AppCompatEditText r8 = r1.H
            e2.c.d(r8, r6)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.I
            e2.c.d(r6, r10)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.K
            e2.c.d(r6, r11)
            com.ots.base.ui.AddressEdittext r6 = r1.Z
            ye.c.h(r6, r13)
        L_0x0119:
            r10 = 128(0x80, double:6.32E-322)
            long r10 = r10 & r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0166
            androidx.appcompat.widget.AppCompatEditText r6 = r1.F
            mg.b4$b r8 = r1.f20973f0
            e2.c.e(r6, r8)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.G
            mg.b4$c r8 = r1.f20974g0
            e2.c.e(r6, r8)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.H
            mg.b4$d r8 = r1.f20975h0
            e2.c.e(r6, r8)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.I
            mg.b4$e r8 = r1.f20976i0
            e2.c.e(r6, r8)
            androidx.appcompat.widget.AppCompatEditText r6 = r1.K
            mg.b4$f r8 = r1.f20977j0
            e2.c.e(r6, r8)
            com.ots.base.ui.AddressEdittext r6 = r1.X
            mg.b4$g r8 = r1.f20978k0
            ye.c.e(r6, r8)
            com.ots.base.ui.AddressEdittext r6 = r1.Y
            mg.b4$h r8 = r1.f20979l0
            ye.c.e(r6, r8)
            com.ots.base.ui.AddressEdittext r6 = r1.Z
            mg.b4$i r8 = r1.f20980m0
            ye.c.g(r6, r8)
            com.ots.base.ui.AddressEdittext r6 = r1.f20944a0
            mg.b4$j r8 = r1.f20981n0
            ye.c.e(r6, r8)
            com.ots.base.ui.AddressEdittext r6 = r1.f20946c0
            mg.b4$a r8 = r1.f20982o0
            ye.c.e(r6, r8)
        L_0x0166:
            if (r7 == 0) goto L_0x0177
            android.widget.ImageView r6 = r1.Q
            java.lang.String r7 = "ROUND"
            r8 = 1
            ze.d.a(r6, r9, r7, r8)
            android.widget.ImageView r6 = r1.R
            java.lang.String r7 = "ROUND"
            ze.d.a(r6, r0, r7, r8)
        L_0x0177:
            r6 = 193(0xc1, double:9.54E-322)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0183
            com.ots.base.ui.AddressEdittext r0 = r1.X
            ye.c.f(r0, r14)
        L_0x0183:
            r6 = 208(0xd0, double:1.03E-321)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0191
            com.ots.base.ui.AddressEdittext r0 = r1.Y
            r6 = r33
            ye.c.f(r0, r6)
        L_0x0191:
            long r6 = r2 & r20
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x019e
            com.ots.base.ui.AddressEdittext r0 = r1.f20944a0
            r13 = r34
            ye.c.f(r0, r13)
        L_0x019e:
            long r2 = r2 & r18
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
            com.ots.base.ui.AddressEdittext r0 = r1.f20946c0
            r11 = r35
            ye.c.f(r0, r11)
        L_0x01ab:
            return
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x01ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.b4.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.f20983p0 != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.f20983p0 = 128;
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
                this.f20983p0 |= 1;
            }
            return true;
        } else if (i10 == 1) {
            d2.i iVar2 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f20983p0 |= 2;
            }
            return true;
        } else if (i10 == 2) {
            d2.i iVar3 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f20983p0 |= 4;
            }
            return true;
        } else if (i10 == 3) {
            d2.i iVar4 = (d2.i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f20983p0 |= 8;
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
                this.f20983p0 |= 16;
            }
            return true;
        }
    }

    public final void v(yg.a aVar) {
        this.f20948e0 = aVar;
        synchronized (this) {
            this.f20983p0 |= 32;
        }
        f(1);
        t();
    }

    public final void w(LoginViewModel loginViewModel) {
        this.f20947d0 = loginViewModel;
        synchronized (this) {
            this.f20983p0 |= 64;
        }
        f(4);
        t();
    }
}

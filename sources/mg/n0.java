package mg;

import android.util.SparseIntArray;
import com.ots.core.utils.customview.ImageRecyclerview;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.ArrayList;

/* compiled from: ActivityOrganizationProfileBindingImpl */
public final class n0 extends m0 {
    public static final SparseIntArray S0;
    public i A0;
    public j B0;
    public k C0;
    public l D0;
    public m E0;
    public n F0;
    public o G0;
    public p H0;
    public q I0;
    public a J0;
    public b K0;
    public c L0;
    public d M0;
    public e N0;
    public f O0;
    public g P0;
    public h Q0;
    public long R0;

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class a implements d2.g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.T);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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
                        user.setContactPersonTitle(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class b implements d2.g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.U);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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
                        user.setTaxCode(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class c implements d2.g {
        public c() {
        }

        public final void b() {
            boolean z10;
            ImageRecyclerview imageRecyclerview = n0.this.V;
            sk.j.f(imageRecyclerview, "view");
            imageRecyclerview.getMedias();
            int i10 = kf.h.f12560a;
            ArrayList<gf.a> medias = imageRecyclerview.getMedias();
            LoginViewModel loginViewModel = n0.this.f21212z0;
            boolean z11 = true;
            if (loginViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d2.i<ArrayList<gf.a>> iVar = loginViewModel.I;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(medias);
                }
            }
        }
    }

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class d implements d2.g {
        public d() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(n0.this.f21202t0);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class e implements d2.g {
        public e() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(n0.this.f21203u0);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class f implements d2.g {
        public f() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            long c10 = ye.c.c(n0.this.f21204v0);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class g implements d2.g {
        public g() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(n0.this.f21206w0);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class h implements d2.g {
        public h() {
        }

        public final void b() {
            boolean z10;
            ArrayList<gf.b> b10 = ye.c.b(n0.this.f21208x0);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class i implements d2.g {
        public i() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.K);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class j implements d2.g {
        public j() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.L);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class k implements d2.g {
        public k() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.M);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class l implements d2.g {
        public l() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.N);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class m implements d2.g {
        public m() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.O);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class n implements d2.g {
        public n() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.P);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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
                        user.setCompanyName(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class o implements d2.g {
        public o() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.Q);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class p implements d2.g {
        public p() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.R);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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

    /* compiled from: ActivityOrganizationProfileBindingImpl */
    public class q implements d2.g {
        public q() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(n0.this.S);
            LoginViewModel loginViewModel = n0.this.f21212z0;
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
                        user.setContactPersonName(a10);
                    }
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S0 = sparseIntArray;
        sparseIntArray.put(2131362720, 36);
        sparseIntArray.put(2131362022, 37);
        sparseIntArray.put(C0533R$id.onCreateStep, 38);
        sparseIntArray.put(C0533R$id.tvPage, 39);
        sparseIntArray.put(C0533R$id.tvQuestion, 40);
        sparseIntArray.put(C0533R$id.btnInfoBasic, 41);
        sparseIntArray.put(C0533R$id.lnInfoBasic, 42);
        sparseIntArray.put(C0533R$id.btnInfo, 43);
        sparseIntArray.put(C0533R$id.lnInfo, 44);
        sparseIntArray.put(C0533R$id.city, 45);
        sparseIntArray.put(C0533R$id.district, 46);
        sparseIntArray.put(C0533R$id.ward, 47);
        sparseIntArray.put(C0533R$id.btnBank, 48);
        sparseIntArray.put(C0533R$id.lnBank, 49);
        sparseIntArray.put(C0533R$id.bank, 50);
        sparseIntArray.put(C0533R$id.btnId, 51);
        sparseIntArray.put(C0533R$id.lnCitizen, 52);
        sparseIntArray.put(C0533R$id.date, 53);
        sparseIntArray.put(C0533R$id.btnContact, 54);
        sparseIntArray.put(C0533R$id.lnContact, 55);
        sparseIntArray.put(C0533R$id.btnFront, 56);
        sparseIntArray.put(C0533R$id.btnBackSide, 57);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n0(d2.e r63, android.view.View r64) {
        /*
            r62 = this;
            r15 = r62
            r14 = r64
            android.util.SparseIntArray r0 = S0
            r1 = 58
            r13 = 0
            r2 = r63
            java.lang.Object[] r58 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 33
            r0 = r58[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 50
            r0 = r58[r0]
            r4 = r0
            com.ots.core.utils.customview.textview.AppTextView r4 = (com.ots.core.utils.customview.textview.AppTextView) r4
            r0 = 57
            r0 = r58[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 48
            r0 = r58[r0]
            r6 = r0
            com.ots.core.utils.customview.textview.AppTextView r6 = (com.ots.core.utils.customview.textview.AppTextView) r6
            r0 = 54
            r0 = r58[r0]
            r7 = r0
            com.ots.core.utils.customview.textview.AppTextView r7 = (com.ots.core.utils.customview.textview.AppTextView) r7
            r0 = 56
            r0 = r58[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 51
            r0 = r58[r0]
            r9 = r0
            com.ots.core.utils.customview.textview.AppTextView r9 = (com.ots.core.utils.customview.textview.AppTextView) r9
            r0 = 43
            r0 = r58[r0]
            r10 = r0
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r0 = 41
            r0 = r58[r0]
            r11 = r0
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r0 = 35
            r0 = r58[r0]
            r12 = r0
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            r0 = 45
            r0 = r58[r0]
            r16 = r0
            com.ots.core.utils.customview.textview.AppTextView r16 = (com.ots.core.utils.customview.textview.AppTextView) r16
            r0 = 37
            r0 = r58[r0]
            r17 = r0
            androidx.core.widget.NestedScrollView r17 = (androidx.core.widget.NestedScrollView) r17
            r0 = 53
            r0 = r58[r0]
            r18 = r0
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r0 = 46
            r0 = r58[r0]
            r19 = r0
            com.ots.core.utils.customview.textview.AppTextView r19 = (com.ots.core.utils.customview.textview.AppTextView) r19
            r0 = 25
            r0 = r58[r0]
            r20 = r0
            androidx.appcompat.widget.AppCompatEditText r20 = (androidx.appcompat.widget.AppCompatEditText) r20
            r0 = 18
            r0 = r58[r0]
            r21 = r0
            androidx.appcompat.widget.AppCompatEditText r21 = (androidx.appcompat.widget.AppCompatEditText) r21
            r0 = 23
            r0 = r58[r0]
            r22 = r0
            androidx.appcompat.widget.AppCompatEditText r22 = (androidx.appcompat.widget.AppCompatEditText) r22
            r0 = 21
            r0 = r58[r0]
            r23 = r0
            androidx.appcompat.widget.AppCompatEditText r23 = (androidx.appcompat.widget.AppCompatEditText) r23
            r0 = 16
            r0 = r58[r0]
            r24 = r0
            androidx.appcompat.widget.AppCompatEditText r24 = (androidx.appcompat.widget.AppCompatEditText) r24
            r0 = 3
            r0 = r58[r0]
            r25 = r0
            androidx.appcompat.widget.AppCompatEditText r25 = (androidx.appcompat.widget.AppCompatEditText) r25
            r0 = 11
            r0 = r58[r0]
            r26 = r0
            androidx.appcompat.widget.AppCompatEditText r26 = (androidx.appcompat.widget.AppCompatEditText) r26
            r0 = 28
            r0 = r58[r0]
            r27 = r0
            androidx.appcompat.widget.AppCompatEditText r27 = (androidx.appcompat.widget.AppCompatEditText) r27
            r0 = 7
            r0 = r58[r0]
            r28 = r0
            androidx.appcompat.widget.AppCompatEditText r28 = (androidx.appcompat.widget.AppCompatEditText) r28
            r0 = 9
            r0 = r58[r0]
            r29 = r0
            androidx.appcompat.widget.AppCompatEditText r29 = (androidx.appcompat.widget.AppCompatEditText) r29
            r0 = 5
            r0 = r58[r0]
            r30 = r0
            androidx.appcompat.widget.AppCompatEditText r30 = (androidx.appcompat.widget.AppCompatEditText) r30
            r0 = 30
            r0 = r58[r0]
            r31 = r0
            com.ots.core.utils.customview.ImageRecyclerview r31 = (com.ots.core.utils.customview.ImageRecyclerview) r31
            r0 = 15
            r0 = r58[r0]
            r32 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r32 = (com.ots.core.utils.customview.edit.TextInputLayout) r32
            r0 = 20
            r0 = r58[r0]
            r33 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r33 = (com.ots.core.utils.customview.edit.TextInputLayout) r33
            r0 = 22
            r0 = r58[r0]
            r34 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r34 = (com.ots.core.utils.customview.edit.TextInputLayout) r34
            r0 = 2
            r0 = r58[r0]
            r35 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r35 = (com.ots.core.utils.customview.edit.TextInputLayout) r35
            r0 = 6
            r0 = r58[r0]
            r36 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r36 = (com.ots.core.utils.customview.edit.TextInputLayout) r36
            r0 = 17
            r0 = r58[r0]
            r37 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r37 = (com.ots.core.utils.customview.edit.TextInputLayout) r37
            r0 = 24
            r0 = r58[r0]
            r38 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r38 = (com.ots.core.utils.customview.edit.TextInputLayout) r38
            r0 = 10
            r0 = r58[r0]
            r39 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r39 = (com.ots.core.utils.customview.edit.TextInputLayout) r39
            r0 = 27
            r0 = r58[r0]
            r40 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r40 = (com.ots.core.utils.customview.edit.TextInputLayout) r40
            r0 = 8
            r0 = r58[r0]
            r41 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r41 = (com.ots.core.utils.customview.edit.TextInputLayout) r41
            r0 = 4
            r0 = r58[r0]
            r42 = r0
            com.ots.core.utils.customview.edit.TextInputLayout r42 = (com.ots.core.utils.customview.edit.TextInputLayout) r42
            r0 = 34
            r0 = r58[r0]
            r43 = r0
            android.widget.ImageView r43 = (android.widget.ImageView) r43
            r0 = 32
            r0 = r58[r0]
            r44 = r0
            android.widget.ImageView r44 = (android.widget.ImageView) r44
            r0 = 49
            r0 = r58[r0]
            r45 = r0
            android.widget.LinearLayout r45 = (android.widget.LinearLayout) r45
            r0 = 52
            r0 = r58[r0]
            r46 = r0
            android.widget.LinearLayout r46 = (android.widget.LinearLayout) r46
            r0 = 55
            r0 = r58[r0]
            r47 = r0
            android.widget.LinearLayout r47 = (android.widget.LinearLayout) r47
            r0 = 29
            r0 = r58[r0]
            r48 = r0
            android.widget.LinearLayout r48 = (android.widget.LinearLayout) r48
            r0 = 31
            r0 = r58[r0]
            r49 = r0
            android.widget.LinearLayout r49 = (android.widget.LinearLayout) r49
            r0 = 44
            r0 = r58[r0]
            r50 = r0
            android.widget.LinearLayout r50 = (android.widget.LinearLayout) r50
            r0 = 42
            r0 = r58[r0]
            r51 = r0
            android.widget.LinearLayout r51 = (android.widget.LinearLayout) r51
            r0 = 0
            r0 = r58[r0]
            r59 = r0
            androidx.constraintlayout.widget.ConstraintLayout r59 = (androidx.constraintlayout.widget.ConstraintLayout) r59
            r0 = 38
            r0 = r58[r0]
            r60 = r0
            android.widget.LinearLayout r60 = (android.widget.LinearLayout) r60
            r0 = 36
            r0 = r58[r0]
            if (r0 == 0) goto L_0x018d
            android.view.View r0 = (android.view.View) r0
            h1.a r0 = h1.a.a(r0)
            r61 = r0
            goto L_0x018f
        L_0x018d:
            r61 = r13
        L_0x018f:
            r0 = 19
            r0 = r58[r0]
            r52 = r0
            com.ots.base.ui.AddressEdittext r52 = (com.ots.base.ui.AddressEdittext) r52
            r0 = 12
            r0 = r58[r0]
            r53 = r0
            com.ots.base.ui.AddressEdittext r53 = (com.ots.base.ui.AddressEdittext) r53
            r0 = 26
            r0 = r58[r0]
            r54 = r0
            com.ots.base.ui.AddressEdittext r54 = (com.ots.base.ui.AddressEdittext) r54
            r0 = 13
            r0 = r58[r0]
            r55 = r0
            com.ots.base.ui.AddressEdittext r55 = (com.ots.base.ui.AddressEdittext) r55
            r0 = 39
            r0 = r58[r0]
            com.ots.base.utils.customview.GradientTextView r0 = (com.ots.base.utils.customview.GradientTextView) r0
            r0 = 40
            r0 = r58[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 14
            r0 = r58[r0]
            r56 = r0
            com.ots.base.ui.AddressEdittext r56 = (com.ots.base.ui.AddressEdittext) r56
            r0 = 47
            r0 = r58[r0]
            r57 = r0
            com.ots.core.utils.customview.textview.AppTextView r57 = (com.ots.core.utils.customview.textview.AppTextView) r57
            r0 = r62
            r1 = r63
            r2 = r64
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
            r37 = r40
            r38 = r41
            r39 = r42
            r40 = r43
            r41 = r44
            r42 = r45
            r43 = r46
            r44 = r47
            r45 = r48
            r46 = r49
            r47 = r50
            r48 = r51
            r49 = r59
            r50 = r60
            r51 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            mg.n0$i r0 = new mg.n0$i
            r1 = r62
            r0.<init>()
            r1.A0 = r0
            mg.n0$j r0 = new mg.n0$j
            r0.<init>()
            r1.B0 = r0
            mg.n0$k r0 = new mg.n0$k
            r0.<init>()
            r1.C0 = r0
            mg.n0$l r0 = new mg.n0$l
            r0.<init>()
            r1.D0 = r0
            mg.n0$m r0 = new mg.n0$m
            r0.<init>()
            r1.E0 = r0
            mg.n0$n r0 = new mg.n0$n
            r0.<init>()
            r1.F0 = r0
            mg.n0$o r0 = new mg.n0$o
            r0.<init>()
            r1.G0 = r0
            mg.n0$p r0 = new mg.n0$p
            r0.<init>()
            r1.H0 = r0
            mg.n0$q r0 = new mg.n0$q
            r0.<init>()
            r1.I0 = r0
            mg.n0$a r0 = new mg.n0$a
            r0.<init>()
            r1.J0 = r0
            mg.n0$b r0 = new mg.n0$b
            r0.<init>()
            r1.K0 = r0
            mg.n0$c r0 = new mg.n0$c
            r0.<init>()
            r1.L0 = r0
            mg.n0$d r0 = new mg.n0$d
            r0.<init>()
            r1.M0 = r0
            mg.n0$e r0 = new mg.n0$e
            r0.<init>()
            r1.N0 = r0
            mg.n0$f r0 = new mg.n0$f
            r0.<init>()
            r1.O0 = r0
            mg.n0$g r0 = new mg.n0$g
            r0.<init>()
            r1.P0 = r0
            mg.n0$h r0 = new mg.n0$h
            r0.<init>()
            r1.Q0 = r0
            r2 = -1
            r1.R0 = r2
            android.widget.LinearLayout r0 = r1.f21205w
            r2 = 0
            r0.setTag(r2)
            com.google.android.material.button.MaterialButton r0 = r1.F
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.K
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.L
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.M
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.N
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.O
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.P
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.Q
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.R
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.S
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.T
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.U
            r0.setTag(r2)
            com.ots.core.utils.customview.ImageRecyclerview r0 = r1.V
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.W
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.X
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.Y
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.Z
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21183a0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21184b0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21185c0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21186d0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21187e0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21188f0
            r0.setTag(r2)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21189g0
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.f21190h0
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.f21191i0
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f21195m0
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f21196n0
            r0.setTag(r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f21199q0
            r0.setTag(r2)
            r0 = 1
            r0 = r58[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21202t0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21203u0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21204v0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21206w0
            r0.setTag(r2)
            com.ots.base.ui.AddressEdittext r0 = r1.f21208x0
            r0.setTag(r2)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r2 = r64
            r2.setTag(r0, r1)
            r62.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.n0.<init>(d2.e, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0378 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r55 = this;
            r1 = r55
            monitor-enter(r55)
            long r2 = r1.R0     // Catch:{ all -> 0x0415 }
            r4 = 0
            r1.R0 = r4     // Catch:{ all -> 0x0415 }
            monitor-exit(r55)     // Catch:{ all -> 0x0415 }
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r0 = r1.f21212z0
            r6 = 1023(0x3ff, double:5.054E-321)
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 770(0x302, double:3.804E-321)
            r9 = 769(0x301, double:3.8E-321)
            r11 = 800(0x320, double:3.953E-321)
            r17 = 772(0x304, double:3.814E-321)
            r19 = 776(0x308, double:3.834E-321)
            r21 = 784(0x310, double:3.873E-321)
            r15 = 1
            r13 = 0
            if (r6 == 0) goto L_0x018c
            long r27 = r2 & r9
            int r6 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x002c
            d2.i<java.util.ArrayList<gf.b>> r6 = r0.E
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            r1.u(r13, r6)
            if (r6 == 0) goto L_0x0037
            T r6 = r6.f8545b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            long r27 = r2 & r7
            int r16 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x004e
            if (r0 == 0) goto L_0x0043
            d2.i<java.lang.String> r13 = r0.f19554m
            goto L_0x0044
        L_0x0043:
            r13 = 0
        L_0x0044:
            r1.u(r15, r13)
            if (r13 == 0) goto L_0x004e
            T r13 = r13.f8545b
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            long r27 = r2 & r17
            int r27 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r27 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x005a
            d2.i<java.util.ArrayList<gf.a>> r14 = r0.I
            goto L_0x005b
        L_0x005a:
            r14 = 0
        L_0x005b:
            r9 = 2
            r1.u(r9, r14)
            if (r14 == 0) goto L_0x0066
            T r9 = r14.f8545b
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            long r29 = r2 & r19
            int r10 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x007e
            if (r0 == 0) goto L_0x0072
            d2.i<java.lang.String> r10 = r0.f19553l
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            r14 = 3
            r1.u(r14, r10)
            if (r10 == 0) goto L_0x007e
            T r10 = r10.f8545b
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x007f
        L_0x007e:
            r10 = 0
        L_0x007f:
            long r29 = r2 & r21
            int r14 = (r29 > r4 ? 1 : (r29 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0096
            if (r0 == 0) goto L_0x008a
            d2.i<java.util.ArrayList<gf.b>> r14 = r0.D
            goto L_0x008b
        L_0x008a:
            r14 = 0
        L_0x008b:
            r7 = 4
            r1.u(r7, r14)
            if (r14 == 0) goto L_0x0096
            T r7 = r14.f8545b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            goto L_0x0097
        L_0x0096:
            r7 = 0
        L_0x0097:
            long r31 = r2 & r11
            int r8 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00a2
            d2.i<com.vpa.daugia.module.auth.data.model.User> r8 = r0.L
            goto L_0x00a3
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            r14 = 5
            r1.u(r14, r8)
            if (r8 == 0) goto L_0x00ae
            T r8 = r8.f8545b
            com.vpa.daugia.module.auth.data.model.User r8 = (com.vpa.daugia.module.auth.data.model.User) r8
            goto L_0x00af
        L_0x00ae:
            r8 = 0
        L_0x00af:
            if (r8 == 0) goto L_0x00ec
            java.lang.String r14 = r8.getEmail()
            java.lang.String r31 = r8.getOrgIssuancePlace()
            java.lang.Long r32 = r8.getOrgIssuanceDate()
            java.lang.String r33 = r8.getContactPersonName()
            java.lang.String r34 = r8.getPhone()
            java.lang.String r35 = r8.getBankAccountOwner()
            boolean r36 = r8.getIsEdit()
            java.lang.String r37 = r8.getContactPersonTitle()
            int r38 = r8.getFlow()
            java.lang.String r39 = r8.getOrgBusinessRegistration()
            java.lang.String r40 = r8.getBankAccount()
            java.lang.String r41 = r8.getCompanyName()
            java.lang.String r42 = r8.getAddress()
            java.lang.String r8 = r8.getTaxCode()
            r25 = 832(0x340, double:4.11E-321)
            goto L_0x0108
        L_0x00ec:
            r8 = 0
            r14 = 0
            r25 = 832(0x340, double:4.11E-321)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
        L_0x0108:
            long r43 = r2 & r25
            int r43 = (r43 > r4 ? 1 : (r43 == r4 ? 0 : -1))
            if (r43 == 0) goto L_0x011f
            if (r0 == 0) goto L_0x0113
            d2.i<java.util.ArrayList<gf.b>> r15 = r0.G
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            r11 = 6
            r1.u(r11, r15)
            if (r15 == 0) goto L_0x011f
            T r11 = r15.f8545b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            goto L_0x0120
        L_0x011f:
            r11 = 0
        L_0x0120:
            r23 = 896(0x380, double:4.427E-321)
            long r45 = r2 & r23
            int r12 = (r45 > r4 ? 1 : (r45 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0162
            if (r0 == 0) goto L_0x012d
            d2.i<java.util.ArrayList<gf.b>> r0 = r0.F
            goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            r12 = 7
            r1.u(r12, r0)
            if (r0 == 0) goto L_0x0162
            T r0 = r0.f8545b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r53 = r0
            r51 = r6
            r52 = r7
            r27 = r8
            r47 = r9
            r49 = r10
            r54 = r11
            r50 = r13
            r0 = r14
            r11 = r31
            r48 = r32
            r12 = r33
            r10 = r34
            r6 = r35
            r15 = r36
            r13 = r37
            r14 = r39
            r7 = r40
            r9 = r41
            r8 = r42
            r31 = 800(0x320, double:3.953E-321)
            goto L_0x01ad
        L_0x0162:
            r51 = r6
            r52 = r7
            r27 = r8
            r47 = r9
            r49 = r10
            r54 = r11
            r50 = r13
            r0 = r14
            r11 = r31
            r48 = r32
            r12 = r33
            r10 = r34
            r6 = r35
            r15 = r36
            r13 = r37
            r14 = r39
            r7 = r40
            r9 = r41
            r8 = r42
            r31 = 800(0x320, double:3.953E-321)
            r53 = 0
            goto L_0x01ad
        L_0x018c:
            r31 = r11
            r0 = 0
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
            r27 = 0
            r38 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
        L_0x01ad:
            long r31 = r2 & r31
            int r31 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
            if (r31 == 0) goto L_0x029b
            android.widget.LinearLayout r4 = r1.f21205w
            r4.setEnabled(r15)
            com.google.android.material.button.MaterialButton r4 = r1.F
            r4.setEnabled(r15)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.K
            e2.c.d(r4, r14)
            androidx.appcompat.widget.AppCompatEditText r4 = r1.L
            e2.c.d(r4, r0)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.M
            e2.c.d(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.N
            e2.c.d(r0, r7)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.O
            e2.c.d(r0, r8)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.P
            e2.c.d(r0, r9)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.Q
            e2.c.d(r0, r10)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.R
            e2.c.d(r0, r11)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.S
            e2.c.d(r0, r12)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.T
            e2.c.d(r0, r13)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.U
            r8 = r27
            e2.c.d(r0, r8)
            com.ots.core.utils.customview.ImageRecyclerview r0 = r1.V
            java.lang.Integer r4 = java.lang.Integer.valueOf(r38)
            java.lang.String r5 = "view"
            sk.j.f(r0, r5)
            if (r4 == 0) goto L_0x0208
            int r4 = r4.intValue()
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            if (r4 == 0) goto L_0x021b
            r5 = 1
            if (r4 == r5) goto L_0x020f
            goto L_0x0226
        L_0x020f:
            if.c r0 = r0.getAdapter()
            r0.getClass()
            java.lang.String r4 = "DETAIL"
            r0.f11440s = r4
            goto L_0x0226
        L_0x021b:
            if.c r0 = r0.getAdapter()
            r0.getClass()
            java.lang.String r4 = "CREATE"
            r0.f11440s = r4
        L_0x0226:
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.W
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.X
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.Y
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.Z
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21183a0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21184b0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21185c0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21186d0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21187e0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21188f0
            m9.b.T(r0, r15)
            com.ots.core.utils.customview.edit.TextInputLayout r0 = r1.f21189g0
            m9.b.T(r0, r15)
            android.widget.LinearLayout r0 = r1.f21195m0
            r0.setEnabled(r15)
            android.widget.LinearLayout r0 = r1.f21196n0
            r0.setEnabled(r15)
            com.ots.base.ui.AddressEdittext r0 = r1.f21202t0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            ye.c.d(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21203u0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            ye.c.d(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21204v0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            ye.c.d(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21204v0
            r4 = r48
            ye.c.h(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21206w0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            ye.c.d(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21208x0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            ye.c.d(r0, r4)
        L_0x029b:
            r4 = 512(0x200, double:2.53E-321)
            long r4 = r4 & r2
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0330
            androidx.appcompat.widget.AppCompatEditText r0 = r1.K
            mg.n0$i r4 = r1.A0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.L
            mg.n0$j r4 = r1.B0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.M
            mg.n0$k r4 = r1.C0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.N
            mg.n0$l r4 = r1.D0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.O
            mg.n0$m r4 = r1.E0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.P
            mg.n0$n r4 = r1.F0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.Q
            mg.n0$o r4 = r1.G0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.R
            mg.n0$p r4 = r1.H0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.S
            mg.n0$q r4 = r1.I0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.T
            mg.n0$a r4 = r1.J0
            e2.c.e(r0, r4)
            androidx.appcompat.widget.AppCompatEditText r0 = r1.U
            mg.n0$b r4 = r1.K0
            e2.c.e(r0, r4)
            com.ots.core.utils.customview.ImageRecyclerview r0 = r1.V
            mg.n0$c r4 = r1.L0
            java.lang.String r5 = "imageView"
            sk.j.f(r0, r5)
            if (r4 == 0) goto L_0x030d
            z.d r0 = mf.e.f13293a
            mf.d r5 = new mf.d
            r5.<init>(r4)
            r0.getClass()
            java.lang.Object r0 = r0.f17746a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
        L_0x030d:
            com.ots.base.ui.AddressEdittext r0 = r1.f21202t0
            mg.n0$d r4 = r1.M0
            ye.c.e(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21203u0
            mg.n0$e r4 = r1.N0
            ye.c.e(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21204v0
            mg.n0$f r4 = r1.O0
            ye.c.g(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21206w0
            mg.n0$g r4 = r1.P0
            ye.c.e(r0, r4)
            com.ots.base.ui.AddressEdittext r0 = r1.f21208x0
            mg.n0$h r4 = r1.Q0
            ye.c.e(r0, r4)
        L_0x0330:
            long r4 = r2 & r17
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03b9
            com.ots.core.utils.customview.ImageRecyclerview r0 = r1.V
            java.lang.String r4 = "view"
            sk.j.f(r0, r4)
            if.c r4 = r0.getAdapter()
            java.lang.String r5 = r0.getAccessToken()
            r4.getClass()
            java.lang.String r6 = "<set-?>"
            sk.j.f(r5, r6)
            r4.f11438q = r5
            r9 = r47
            if (r9 == 0) goto L_0x035e
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r5 = 0
            goto L_0x035f
        L_0x035e:
            r5 = 1
        L_0x035f:
            if (r5 != 0) goto L_0x03b9
            if.c r4 = r0.getAdapter()
            java.lang.String r4 = r4.f11440s
            java.lang.String r5 = "DETAIL"
            boolean r4 = sk.j.a(r4, r5)
            if (r4 == 0) goto L_0x03ab
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x0378:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x03a7
            java.lang.Object r6 = r5.next()
            r7 = r6
            gf.a r7 = (gf.a) r7
            java.lang.String r8 = r7.a()
            if (r8 == 0) goto L_0x03a0
            java.lang.String r7 = r7.a()
            if (r7 != 0) goto L_0x0393
            java.lang.String r7 = ""
        L_0x0393:
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x039b
            r7 = 1
            goto L_0x039c
        L_0x039b:
            r7 = 0
        L_0x039c:
            if (r7 == 0) goto L_0x03a0
            r7 = 1
            goto L_0x03a1
        L_0x03a0:
            r7 = 0
        L_0x03a1:
            if (r7 == 0) goto L_0x0378
            r4.add(r6)
            goto L_0x0378
        L_0x03a7:
            r0.setMedias(r4)
            goto L_0x03ae
        L_0x03ab:
            r0.setMedias(r9)
        L_0x03ae:
            if.c r4 = r0.getAdapter()
            java.util.ArrayList r0 = r0.getMedias()
            r4.A(r0)
        L_0x03b9:
            r4 = 770(0x302, double:3.804E-321)
            long r4 = r4 & r2
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03cd
            android.widget.ImageView r0 = r1.f21190h0
            java.lang.String r4 = "ROUND"
            r13 = r50
            r5 = 1
            ze.d.a(r0, r13, r4, r5)
            goto L_0x03ce
        L_0x03cd:
            r5 = 1
        L_0x03ce:
            long r8 = r2 & r19
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03dd
            android.widget.ImageView r0 = r1.f21191i0
            java.lang.String r4 = "ROUND"
            r10 = r49
            ze.d.a(r0, r10, r4, r5)
        L_0x03dd:
            long r4 = r2 & r21
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03ea
            com.ots.base.ui.AddressEdittext r0 = r1.f21202t0
            r4 = r52
            ye.c.f(r0, r4)
        L_0x03ea:
            r4 = 769(0x301, double:3.8E-321)
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03f8
            com.ots.base.ui.AddressEdittext r0 = r1.f21203u0
            r4 = r51
            ye.c.f(r0, r4)
        L_0x03f8:
            r4 = 896(0x380, double:4.427E-321)
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0406
            com.ots.base.ui.AddressEdittext r0 = r1.f21206w0
            r4 = r53
            ye.c.f(r0, r4)
        L_0x0406:
            r4 = 832(0x340, double:4.11E-321)
            long r2 = r2 & r4
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0414
            com.ots.base.ui.AddressEdittext r0 = r1.f21208x0
            r11 = r54
            ye.c.f(r0, r11)
        L_0x0414:
            return
        L_0x0415:
            r0 = move-exception
            monitor-exit(r55)     // Catch:{ all -> 0x0415 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.n0.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.R0 != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.R0 = 512;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        switch (i10) {
            case 0:
                d2.i iVar = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 1;
                }
                return true;
            case 1:
                d2.i iVar2 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 2;
                }
                return true;
            case 2:
                d2.i iVar3 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 4;
                }
                return true;
            case 3:
                d2.i iVar4 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 8;
                }
                return true;
            case 4:
                d2.i iVar5 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 16;
                }
                return true;
            case 5:
                d2.i iVar6 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 32;
                }
                return true;
            case 6:
                d2.i iVar7 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 64;
                }
                return true;
            case 7:
                d2.i iVar8 = (d2.i) obj;
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.R0 |= 128;
                }
                return true;
            default:
                return false;
        }
    }

    public final void v(LoginViewModel loginViewModel) {
        this.f21212z0 = loginViewModel;
        synchronized (this) {
            this.R0 |= 256;
        }
        f(4);
        t();
    }
}

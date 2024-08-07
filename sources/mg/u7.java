package mg;

import al.r0;
import android.util.SparseIntArray;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import d2.g;
import d2.i;
import ik.d;
import p3.l0;
import qg.a;

/* compiled from: ViewLoginAuctionBindingImpl */
public final class u7 extends t7 implements a.C0304a {
    public static final SparseIntArray L;
    public final qg.a G;
    public a H = new a();
    public b I = new b();
    public c J = new c();
    public long K = -1;

    /* compiled from: ViewLoginAuctionBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(u7.this.A);
            AuctionRoomViewModel auctionRoomViewModel = u7.this.F;
            boolean z12 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<AccountRequest> iVar = auctionRoomViewModel.F;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    AccountRequest accountRequest = (AccountRequest) iVar.f8545b;
                    if (accountRequest == null) {
                        z12 = false;
                    }
                    if (z12) {
                        accountRequest.setInvitationCode(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ViewLoginAuctionBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(u7.this.C);
            AuctionRoomViewModel auctionRoomViewModel = u7.this.F;
            boolean z12 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<AccountRequest> iVar = auctionRoomViewModel.F;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    AccountRequest accountRequest = (AccountRequest) iVar.f8545b;
                    if (accountRequest == null) {
                        z12 = false;
                    }
                    if (z12) {
                        accountRequest.setUsername(a10);
                    }
                }
            }
        }
    }

    /* compiled from: ViewLoginAuctionBindingImpl */
    public class c implements g {
        public c() {
        }

        public final void b() {
            boolean z10;
            boolean z11;
            String a10 = e2.c.a(u7.this.E);
            AuctionRoomViewModel auctionRoomViewModel = u7.this.F;
            boolean z12 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<AccountRequest> iVar = auctionRoomViewModel.F;
                if (iVar != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    AccountRequest accountRequest = (AccountRequest) iVar.f8545b;
                    if (accountRequest == null) {
                        z12 = false;
                    }
                    if (z12) {
                        accountRequest.setPassword(a10);
                    }
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(C0533R$id.edtCard, 5);
        sparseIntArray.put(C0533R$id.edtPassword, 6);
        sparseIntArray.put(C0533R$id.edtCode, 7);
        sparseIntArray.put(C0533R$id.btnLogin, 8);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u7(d2.e r17, android.view.View r18) {
        /*
            r16 = this;
            r12 = r16
            r13 = r18
            android.util.SparseIntArray r0 = L
            r1 = 9
            r14 = 0
            r2 = r17
            java.lang.Object[] r0 = d2.l.o(r2, r13, r1, r14, r0)
            r1 = 4
            r1 = r0[r1]
            r3 = r1
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r1 = 8
            r1 = r0[r1]
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            com.ots.core.utils.customview.edit.TextInputLayout r5 = (com.ots.core.utils.customview.edit.TextInputLayout) r5
            r1 = 7
            r1 = r0[r1]
            r6 = r1
            com.ots.core.utils.customview.edit.TextInputLayout r6 = (com.ots.core.utils.customview.edit.TextInputLayout) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7
            r1 = 6
            r1 = r0[r1]
            r8 = r1
            com.ots.core.utils.customview.edit.TextInputLayout r8 = (com.ots.core.utils.customview.edit.TextInputLayout) r8
            r15 = 1
            r1 = r0[r15]
            r9 = r1
            androidx.appcompat.widget.AppCompatEditText r9 = (androidx.appcompat.widget.AppCompatEditText) r9
            r1 = 0
            r1 = r0[r1]
            r10 = r1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r1 = 2
            r0 = r0[r1]
            r11 = r0
            com.ots.core.utils.customview.edit.PasswordEditText r11 = (com.ots.core.utils.customview.edit.PasswordEditText) r11
            r0 = r16
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            mg.u7$a r0 = new mg.u7$a
            r0.<init>()
            r12.H = r0
            mg.u7$b r0 = new mg.u7$b
            r0.<init>()
            r12.I = r0
            mg.u7$c r0 = new mg.u7$c
            r0.<init>()
            r12.J = r0
            r0 = -1
            r12.K = r0
            com.google.android.material.button.MaterialButton r0 = r12.f21365w
            r0.setTag(r14)
            androidx.appcompat.widget.AppCompatEditText r0 = r12.A
            r0.setTag(r14)
            androidx.appcompat.widget.AppCompatEditText r0 = r12.C
            r0.setTag(r14)
            android.widget.LinearLayout r0 = r12.D
            r0.setTag(r14)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r12.E
            r0.setTag(r14)
            int r0 = androidx.databinding.library.R$id.dataBinding
            r13.setTag(r0, r12)
            qg.a r0 = new qg.a
            r0.<init>(r12, r15)
            r12.G = r0
            r16.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.u7.<init>(d2.e, android.view.View):void");
    }

    public final void e(int i10) {
        boolean z10;
        AuctionRoomViewModel auctionRoomViewModel = this.F;
        if (auctionRoomViewModel != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            auctionRoomViewModel.getClass();
            l0.j0(l0.d0(auctionRoomViewModel), r0.f19085b, new xg.a(auctionRoomViewModel, (d<? super xg.a>) null), 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.K     // Catch:{ all -> 0x006d }
            r2 = 0
            r11.K = r2     // Catch:{ all -> 0x006d }
            monitor-exit(r11)     // Catch:{ all -> 0x006d }
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r4 = r11.F
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0017
            d2.i<com.vpa.daugia.module.auction.data.model.AccountRequest> r4 = r4.F
            goto L_0x0018
        L_0x0017:
            r4 = r6
        L_0x0018:
            r7 = 0
            r11.u(r7, r4)
            if (r4 == 0) goto L_0x0023
            T r4 = r4.f8545b
            com.vpa.daugia.module.auction.data.model.AccountRequest r4 = (com.vpa.daugia.module.auction.data.model.AccountRequest) r4
            goto L_0x0024
        L_0x0023:
            r4 = r6
        L_0x0024:
            if (r4 == 0) goto L_0x0036
            java.lang.String r6 = r4.getPassword()
            java.lang.String r7 = r4.getInvitationCode()
            java.lang.String r4 = r4.getUsername()
            r10 = r7
            r7 = r6
            r6 = r10
            goto L_0x0038
        L_0x0036:
            r4 = r6
            r7 = r4
        L_0x0038:
            r8 = 4
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            com.google.android.material.button.MaterialButton r0 = r11.f21365w
            qg.a r1 = r11.G
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.A
            mg.u7$a r1 = r11.H
            e2.c.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.C
            mg.u7$b r1 = r11.I
            e2.c.e(r0, r1)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r11.E
            mg.u7$c r1 = r11.J
            e2.c.e(r0, r1)
        L_0x005b:
            if (r5 == 0) goto L_0x006c
            androidx.appcompat.widget.AppCompatEditText r0 = r11.A
            e2.c.d(r0, r6)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.C
            e2.c.d(r0, r4)
            com.ots.core.utils.customview.edit.PasswordEditText r0 = r11.E
            e2.c.d(r0, r7)
        L_0x006c:
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x006d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.u7.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.K = 4;
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
            this.K |= 1;
        }
        return true;
    }

    public final void v(AuctionRoomViewModel auctionRoomViewModel) {
        this.F = auctionRoomViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        f(4);
        t();
    }
}

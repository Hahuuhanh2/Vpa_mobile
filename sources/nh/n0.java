package nh;

import com.vpa.daugia.module.home.ui.HomeFragment;
import q.l;
import sk.j;
import th.b;

/* compiled from: HomeFragment.kt */
public final class n0 extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21671a;

    /* compiled from: HomeFragment.kt */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f21672a;

        public a(HomeFragment homeFragment) {
            this.f21672a = homeFragment;
        }

        public final void a(boolean z10) {
            if (z10) {
                HomeFragment homeFragment = this.f21672a;
                l lVar = homeFragment.f19685s0;
                if (lVar != null) {
                    l.d dVar = homeFragment.f19686t0;
                    if (dVar != null) {
                        lVar.a(dVar);
                    } else {
                        j.l("promptInfo");
                        throw null;
                    }
                } else {
                    j.l("biometricPrompt");
                    throw null;
                }
            }
        }
    }

    public n0(HomeFragment homeFragment) {
        this.f21671a = homeFragment;
    }

    public final void a(CharSequence charSequence) {
        j.f(charSequence, "errString");
    }

    public final void b() {
        l lVar = this.f21671a.f19685s0;
        if (lVar != null) {
            lVar.b();
            th.a aVar = new th.a(this.f21671a.d0(), "Không nhận diện được", "Hệ thống không thể xác minh vân tay của bạn. Vui lòng thử lại!", "Hủy bỏ", "Xác thực lại");
            aVar.f23013j = new a(this.f21671a);
            aVar.h();
            return;
        }
        j.l("biometricPrompt");
        throw null;
    }

    public final void c(l.b bVar) {
        j.f(bVar, "result");
        this.f21671a.m0().j(Boolean.TRUE, "isUsedBiometric");
        new th.a(this.f21671a.d0(), "Xác thực thành công", "Vân tay đã sẵn sàng. Bạn có thể sử dụng dấu vân tay của mình để đăng nhập.", "", "").h();
    }
}

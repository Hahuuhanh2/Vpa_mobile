package bh;

import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import kk.c;
import kk.e;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel", f = "LoginViewModel.kt", l = {292}, m = "setProfile")
/* compiled from: LoginViewModel.kt */
public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public LoginViewModel f19154a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f19155b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19156c;

    /* renamed from: d  reason: collision with root package name */
    public int f19157d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(LoginViewModel loginViewModel, d<? super p> dVar) {
        super(dVar);
        this.f19156c = loginViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f19155b = obj;
        this.f19157d |= Integer.MIN_VALUE;
        return LoginViewModel.d(this.f19156c, this);
    }
}

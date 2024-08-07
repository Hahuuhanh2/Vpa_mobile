package com.vpa.daugia.module.menu.ui;

import al.r0;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import d2.i;
import ik.d;
import lg.b;
import p3.l0;
import r2.p;
import r2.v;
import sk.e;
import sk.j;
import ze.f;

/* compiled from: MenuViewModel.kt */
public final class MenuViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final b f19748d;

    /* renamed from: e  reason: collision with root package name */
    public final AuthApiHelper f19749e;

    /* renamed from: f  reason: collision with root package name */
    public p<User> f19750f;

    /* renamed from: g  reason: collision with root package name */
    public p<f<Object>> f19751g = new p<>();

    /* renamed from: h  reason: collision with root package name */
    public final p<User> f19752h = new p<>();

    /* renamed from: i  reason: collision with root package name */
    public final p<String> f19753i;

    /* renamed from: j  reason: collision with root package name */
    public final p f19754j;

    public MenuViewModel(b bVar, AuthApiHelper authApiHelper) {
        b bVar2 = bVar;
        AuthApiHelper authApiHelper2 = authApiHelper;
        j.f(bVar2, "sharedPrefsHelper");
        j.f(authApiHelper2, "authApiHelper");
        this.f19748d = bVar2;
        this.f19749e = authApiHelper2;
        new i("");
        new i("");
        new i("");
        p<User> pVar = new p<>();
        User user = r2;
        User user2 = new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (e) null);
        pVar.j(user);
        this.f19750f = pVar;
        p<String> pVar2 = new p<>();
        this.f19753i = pVar2;
        this.f19754j = pVar2;
        l0.j0(l0.d0(this), r0.f19085b, new rh.b(this, (d<? super rh.b>) null), 2);
    }
}

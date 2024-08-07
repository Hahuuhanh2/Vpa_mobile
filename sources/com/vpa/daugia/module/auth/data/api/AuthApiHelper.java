package com.vpa.daugia.module.auth.data.api;

import com.vpa.daugia.module.auth.data.api.AuthService;
import com.vpa.daugia.module.auth.data.api.response.CheckRecover;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.data.model.User;
import ef.k;
import ik.d;
import kg.c;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: AuthApiHelper.kt */
public final class AuthApiHelper {
    private final AuthService api;
    private final c serviceCache;
    private final b sharedPrefs;

    public AuthApiHelper(AuthService authService, b bVar, c cVar) {
        j.f(authService, "api");
        j.f(bVar, "sharedPrefs");
        j.f(cVar, "serviceCache");
        this.api = authService;
        this.sharedPrefs = bVar;
        this.serviceCache = cVar;
    }

    public final Object changePassword(Object obj, d<? super k<Object>> dVar) {
        return this.api.changePassword(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object checkOtpEmail(Object obj, d<? super CheckRecover> dVar) {
        return this.api.checkOtpEmail(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object checkOtpPhone(Object obj, d<? super CheckRecover> dVar) {
        return this.api.checkOtpPhone(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getProfile(d<? super k<User>> dVar) {
        return this.api.getProfile(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object getRecoverWithMail(String str, d<? super k<Object>> dVar) {
        return this.api.getRecoverWithMail(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object getRecoverWithPhone(String str, d<? super k<Object>> dVar) {
        return this.api.getRecoverWithPhone(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object login(Object obj, d<? super k<Auth>> dVar) {
        return this.api.login(a.b(this.sharedPrefs, false), obj, dVar);
    }

    public final Object logout(d<? super k<Object>> dVar) {
        return this.api.logout(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object recoverWithMail(Object obj, d<? super k<Object>> dVar) {
        return this.api.recoverWithMail(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object recoverWithPhone(Object obj, d<? super k<Object>> dVar) {
        return this.api.recoverWithPhone(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object refreshToken(Object obj, d<? super k<Auth>> dVar) {
        return this.api.refreshToken(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object register(Object obj, d<? super k<Auth>> dVar) {
        return this.api.register(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object registerORG(Object obj, d<? super k<Auth>> dVar) {
        return this.api.registerORG(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object requestOtp(String str, d<? super k<Object>> dVar) {
        return AuthService.DefaultImpls.requestOtp$default(this.api, a.b(this.sharedPrefs, true), str, (String) null, (String) null, dVar, 12, (Object) null);
    }

    public final Object updateDevice(Object obj, d<? super k<Object>> dVar) {
        return this.api.updateDevice(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object updateORGProfile(Object obj, d<? super k<User>> dVar) {
        return this.api.updateORGProfile(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object updatePersonProfile(Object obj, d<? super k<User>> dVar) {
        return this.api.updatePersonProfile(a.b(this.sharedPrefs, true), obj, dVar);
    }
}

package bh;

import al.d0;
import com.vpa.daugia.module.auth.data.api.request.RegisterORG;
import com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import gf.a;
import gf.b;
import ik.d;
import java.util.ArrayList;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$setProfile$2", f = "LoginViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class q extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19158a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(LoginViewModel loginViewModel, d<? super q> dVar) {
        super(2, dVar);
        this.f19158a = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new q(this.f19158a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l10;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        ContactPersonIdentityCard contactPersonIdentityCard;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        ContactPersonIdentityCard contactPersonIdentityCard2;
        ArrayList<a> files;
        a aVar;
        ContactPersonIdentityCard contactPersonIdentityCard3;
        ArrayList<a> files2;
        a aVar2;
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<a> files3;
        a aVar3;
        jk.a aVar4 = jk.a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        LoginViewModel loginViewModel = this.f19158a;
        User user = (User) loginViewModel.L.f8545b;
        UpdatePersonProfile updatePersonProfile = loginViewModel.J;
        if (user != null) {
            str = user.getEmail();
        } else {
            str = null;
        }
        updatePersonProfile.setEmail(str);
        UpdatePersonProfile updatePersonProfile2 = loginViewModel.J;
        if (user != null) {
            str2 = user.getBankAccount();
        } else {
            str2 = null;
        }
        updatePersonProfile2.setBankAccount(str2);
        UpdatePersonProfile updatePersonProfile3 = loginViewModel.J;
        if (user != null) {
            str3 = user.getBankAccountOwner();
        } else {
            str3 = null;
        }
        updatePersonProfile3.setBankAccountOwner(str3);
        UpdatePersonProfile updatePersonProfile4 = loginViewModel.J;
        if (user != null) {
            str4 = user.getPersonIssuancePlace();
        } else {
            str4 = null;
        }
        updatePersonProfile4.setPersonIssuancePlace(str4);
        UpdatePersonProfile updatePersonProfile5 = loginViewModel.J;
        if (user != null) {
            l10 = user.getPersonIssuanceDate();
        } else {
            l10 = null;
        }
        updatePersonProfile5.setPersonIssuanceDate(l10);
        UpdatePersonProfile updatePersonProfile6 = loginViewModel.J;
        if (user != null) {
            str5 = user.getPhone();
        } else {
            str5 = null;
        }
        updatePersonProfile6.setPhone(str5);
        UpdatePersonProfile updatePersonProfile7 = loginViewModel.J;
        if (user != null) {
            str6 = user.getFullname();
        } else {
            str6 = null;
        }
        updatePersonProfile7.setFullname(str6);
        UpdatePersonProfile updatePersonProfile8 = loginViewModel.J;
        if (user != null) {
            str7 = user.getIdentityNumber();
        } else {
            str7 = null;
        }
        updatePersonProfile8.setIdentityNumber(str7);
        d2.i<String> iVar = loginViewModel.f19552k;
        if (user == null || (frontOfIdentityCard = user.getFrontOfIdentityCard()) == null || (files3 = frontOfIdentityCard.getFiles()) == null || (aVar3 = (a) fk.p.N0(files3)) == null) {
            str8 = null;
        } else {
            str8 = aVar3.a();
        }
        iVar.g(str8);
        d2.i<String> iVar2 = loginViewModel.f19553l;
        if (user == null || (contactPersonIdentityCard3 = user.getContactPersonIdentityCard()) == null || (files2 = contactPersonIdentityCard3.getFiles()) == null || (aVar2 = (a) fk.p.N0(files2)) == null) {
            str9 = null;
        } else {
            str9 = aVar2.a();
        }
        iVar2.g(str9);
        d2.i<String> iVar3 = loginViewModel.f19554m;
        if (user == null || (contactPersonIdentityCard2 = user.getContactPersonIdentityCard()) == null || (files = contactPersonIdentityCard2.getFiles()) == null || (aVar = (a) fk.p.S0(files)) == null) {
            str10 = null;
        } else {
            str10 = aVar.a();
        }
        iVar3.g(str10);
        UpdatePersonProfile updatePersonProfile9 = loginViewModel.J;
        if (user != null) {
            contactPersonIdentityCard = user.getContactPersonIdentityCard();
        } else {
            contactPersonIdentityCard = null;
        }
        updatePersonProfile9.setContactPersonIdentityCard(contactPersonIdentityCard);
        RegisterORG registerORG = loginViewModel.K;
        if (user != null) {
            str11 = user.getCompanyName();
        } else {
            str11 = null;
        }
        registerORG.setCompanyName(str11);
        RegisterORG registerORG2 = loginViewModel.K;
        if (user != null) {
            str12 = user.getContactPersonName();
        } else {
            str12 = null;
        }
        registerORG2.setContactPersonName(str12);
        RegisterORG registerORG3 = loginViewModel.K;
        if (user != null) {
            str13 = user.getFullname();
        } else {
            str13 = null;
        }
        registerORG3.setRepresentative(str13);
        RegisterORG registerORG4 = loginViewModel.K;
        if (user != null) {
            str14 = user.getOrgBusinessRegistration();
        } else {
            str14 = null;
        }
        registerORG4.setRepresentativeRole(str14);
        RegisterORG registerORG5 = loginViewModel.K;
        if (user != null) {
            str15 = user.getPhone();
        } else {
            str15 = null;
        }
        registerORG5.setPhone(str15);
        LoginViewModel loginViewModel2 = this.f19158a;
        ArrayList<b> arrayList = (ArrayList) loginViewModel2.H.f8545b;
        if (arrayList == null) {
            return null;
        }
        for (b bVar : arrayList) {
            String b10 = bVar.b();
            User user2 = (User) loginViewModel2.L.f8545b;
            if (user2 != null) {
                str16 = user2.getPersonIssuancePlace();
            } else {
                str16 = null;
            }
            if (j.a(b10, str16)) {
                bVar.f10499c = true;
            }
        }
        return ek.i.f20112a;
    }
}

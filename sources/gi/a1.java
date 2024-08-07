package gi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import bc.h;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import fk.p;
import gf.a;
import java.util.ArrayList;
import mg.x0;
import ph.c;
import rk.l;
import sk.e;
import sk.j;
import sk.k;

/* compiled from: ProfileActivity.kt */
public final class a1 extends k implements l<User, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20347a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(ProfileActivity profileActivity) {
        super(1);
        this.f20347a = profileActivity;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        int i10;
        String str;
        ArrayList<a> files;
        a aVar;
        String a10;
        ArrayList<a> files2;
        a aVar2;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int i13;
        ArrayList<a> files3;
        ArrayList<a> files4;
        Bundle extras;
        String string;
        boolean z13;
        User user = (User) obj;
        Class<User> cls = User.class;
        Intent intent = this.f20347a.getIntent();
        String str2 = "";
        boolean z14 = true;
        int i14 = 0;
        if (intent != null) {
            boolean hasExtra = intent.hasExtra("DATA_VERIFY");
            ProfileActivity profileActivity = this.f20347a;
            if (hasExtra) {
                EkycReponse ekycReponse = (EkycReponse) new h().d(EkycReponse.class, profileActivity.getIntent().getStringExtra("DATA_VERIFY"));
                LoginViewModel T = profileActivity.T();
                j.c(ekycReponse);
                User user2 = (User) T.L.f8545b;
                if (user2 != null) {
                    user2.setFullname(ekycReponse.getFullname());
                }
                User user3 = (User) T.L.f8545b;
                if (user3 != null) {
                    user3.setIdentityNumber(ekycReponse.getIdentityNumber());
                }
                User user4 = (User) T.L.f8545b;
                if (user4 != null) {
                    user4.setProvinceId(ekycReponse.getProvinceId());
                }
                User user5 = (User) T.L.f8545b;
                if (user5 != null) {
                    user5.setDistrictId(ekycReponse.getDistrictId());
                }
                User user6 = (User) T.L.f8545b;
                if (user6 != null) {
                    user6.setWardId(ekycReponse.getWardId());
                }
                User user7 = (User) T.L.f8545b;
                if (user7 != null) {
                    user7.setAddress(ekycReponse.getAddress());
                }
                User user8 = (User) T.L.f8545b;
                if (user8 != null) {
                    user8.setPersonIssuanceDate(ekycReponse.getPersonIssuanceDate());
                }
                User user9 = (User) T.L.f8545b;
                if (user9 != null) {
                    user9.setPersonIssuancePlace(ekycReponse.getPersonIssuancePlace());
                }
                User user10 = (User) T.L.f8545b;
                if (user10 != null) {
                    user10.setFrontOfIdentityCard(ekycReponse.getFrontOfIdentityCard());
                }
                d2.i<User> iVar = T.L;
                iVar.g(iVar.f8545b);
                LoginViewModel T2 = profileActivity.T();
                ContactPersonIdentityCard frontOfIdentityCard = ekycReponse.getFrontOfIdentityCard();
                if (frontOfIdentityCard == null) {
                    frontOfIdentityCard = new ContactPersonIdentityCard((ArrayList) null, 1, (e) null);
                }
                T2.M.k(frontOfIdentityCard);
                ((x0) profileActivity.M()).L.setText(ekycReponse.getAddress());
                ((x0) profileActivity.M()).G.setText(ekycReponse.getIdentityNumber());
                ((x0) profileActivity.M()).M.setText(ekycReponse.getFullname());
                ((x0) profileActivity.M()).f21439k0.setTimeContent(ekycReponse.getPersonIssuanceDate());
                ImageView imageView = ((x0) profileActivity.M()).Z;
                j.e(imageView, "ivFront");
                App.a aVar3 = App.f19364o;
                Object obj2 = aVar3.a().f19367e;
                if (obj2 == null) {
                    obj2 = str2;
                }
                kf.e.g(imageView, obj2);
                ImageView imageView2 = ((x0) profileActivity.M()).Y;
                j.e(imageView2, "ivBack");
                Object obj3 = aVar3.a().f19368f;
                if (obj3 == null) {
                    obj3 = str2;
                }
                kf.e.g(imageView2, obj3);
                aVar3.a().f19367e = null;
                aVar3.a().f19368f = null;
                ((x0) profileActivity.M()).M.setEnabled(false);
                ((x0) profileActivity.M()).G.setEnabled(false);
                ((x0) profileActivity.M()).H.setEnabled(false);
                ((x0) profileActivity.M()).I.setEnabled(false);
                ((x0) profileActivity.M()).P.setEnabled(false);
                ((x0) profileActivity.M()).L.setEnabled(false);
                ((x0) profileActivity.M()).f21439k0.setEnabled(false);
                ((x0) profileActivity.M()).O.setEnabled(false);
                ((x0) profileActivity.M()).f21431c0.setEnabled(false);
                ((x0) profileActivity.M()).f21444w.setEnabled(false);
                ((x0) profileActivity.M()).X.setEnabled(false);
            }
        }
        ProfileActivity profileActivity2 = this.f20347a;
        if (!(!profileActivity2.U || (extras = profileActivity2.getIntent().getExtras()) == null || (string = extras.getString("DATA_USER")) == null)) {
            ProfileActivity profileActivity3 = this.f20347a;
            int i15 = kf.h.f12560a;
            String identityNumber = user.getIdentityNumber();
            if (identityNumber == null || identityNumber.length() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                ((x0) profileActivity3.M()).G.setText(((User) new h().d(cls, string)).getIdentityNumber());
            }
            User user11 = (User) profileActivity3.T().L.f8545b;
            if (user11 != null) {
                user11.setIdentityNumber(((User) new h().d(cls, string)).getIdentityNumber());
            }
        }
        ((x0) this.f20347a.M()).O.setText(user.getPersonIssuancePlace());
        Intent intent2 = this.f20347a.getIntent();
        if (intent2 != null) {
            z10 = intent2.hasExtra("DATA_VERIFY");
        } else {
            z10 = false;
        }
        Integer profileStatus = user.getProfileStatus();
        if (profileStatus != null) {
            i10 = profileStatus.intValue();
        } else {
            i10 = 0;
        }
        if (i10 < 2 && !this.f20347a.U && !z10) {
            c cVar = new c(this.f20347a);
            cVar.f22649n = new z0(user, this.f20347a);
            cVar.show();
        }
        ProfileActivity profileActivity4 = this.f20347a;
        if (profileActivity4.U) {
            ImageButton imageButton = (ImageButton) ((x0) profileActivity4.M()).f21435g0.f10529c;
            j.e(imageButton, "btnMore");
            Integer profileStatus2 = user.getProfileStatus();
            if (profileStatus2 != null && profileStatus2.intValue() == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            imageButton.setVisibility(i11);
            Integer profileStatus3 = user.getProfileStatus();
            if (profileStatus3 == null || profileStatus3.intValue() != 5) {
                ImageView imageView3 = ((x0) this.f20347a.M()).A;
                j.e(imageView3, "btnFront");
                ContactPersonIdentityCard contactPersonIdentityCard = user.getContactPersonIdentityCard();
                if (contactPersonIdentityCard == null || (files4 = contactPersonIdentityCard.getFiles()) == null) {
                    i12 = 0;
                } else {
                    i12 = files4.size();
                }
                if (i12 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView3.setVisibility(i13);
                ImageView imageView4 = ((x0) this.f20347a.M()).f21446y;
                j.e(imageView4, "btnBackSide");
                ContactPersonIdentityCard contactPersonIdentityCard2 = user.getContactPersonIdentityCard();
                if (contactPersonIdentityCard2 == null || (files3 = contactPersonIdentityCard2.getFiles()) == null || files3.size() != 2) {
                    z14 = false;
                }
                if (!z14) {
                    i14 = 8;
                }
                imageView4.setVisibility(i14);
            }
        }
        ProfileActivity profileActivity5 = this.f20347a;
        ContactPersonIdentityCard frontOfIdentityCard2 = user.getFrontOfIdentityCard();
        if (frontOfIdentityCard2 == null || (files2 = frontOfIdentityCard2.getFiles()) == null || (aVar2 = (a) p.N0(files2)) == null || (str = aVar2.a()) == null) {
            str = str2;
        }
        profileActivity5.X = str;
        ProfileActivity profileActivity6 = this.f20347a;
        ContactPersonIdentityCard frontOfIdentityCard3 = user.getFrontOfIdentityCard();
        if (!(frontOfIdentityCard3 == null || (files = frontOfIdentityCard3.getFiles()) == null || (aVar = (a) p.S0(files)) == null || (a10 = aVar.a()) == null)) {
            str2 = a10;
        }
        profileActivity6.Y = str2;
        return i.f20112a;
    }
}

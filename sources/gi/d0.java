package gi;

import android.net.Uri;
import android.widget.ImageView;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import gf.a;
import java.io.File;
import java.util.ArrayList;
import kf.e;
import mg.m0;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: OrganizationProfileActivity.kt */
public final class d0 extends k implements l<f<? extends a>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20361a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(OrganizationProfileActivity organizationProfileActivity) {
        super(1);
        this.f20361a = organizationProfileActivity;
    }

    public final Object invoke(Object obj) {
        int i10;
        ContactPersonIdentityCard contactPersonIdentityCard;
        ArrayList<a> files;
        User user;
        ContactPersonIdentityCard contactPersonIdentityCard2;
        ArrayList<a> files2;
        ContactPersonIdentityCard contactPersonIdentityCard3;
        ArrayList<a> files3;
        int i11;
        ContactPersonIdentityCard contactPersonIdentityCard4;
        ArrayList<a> files4;
        User user2;
        ContactPersonIdentityCard contactPersonIdentityCard5;
        ArrayList<a> files5;
        ContactPersonIdentityCard contactPersonIdentityCard6;
        ArrayList<a> files6;
        ContactPersonIdentityCard contactPersonIdentityCard7;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20361a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20361a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20361a.O().dismiss();
            String str = this.f20361a.Y;
            int hashCode = str.hashCode();
            if (hashCode != 2030823) {
                if (hashCode != 67167753) {
                    if (hashCode == 92413603 && str.equals("REGISTER")) {
                        User user3 = (User) this.f20361a.V().L.f8545b;
                        if (user3 != null) {
                            contactPersonIdentityCard7 = user3.getFrontOfIdentityCard();
                        } else {
                            contactPersonIdentityCard7 = null;
                        }
                        if (contactPersonIdentityCard7 != null) {
                            contactPersonIdentityCard7.setFiles(j7.a.e(((f.c) fVar).f18006a));
                        }
                        f.c cVar = (f.c) fVar;
                        OrganizationProfileActivity organizationProfileActivity = this.f20361a;
                        Uri fromFile = Uri.fromFile(new File(this.f20361a.V));
                        j.e(fromFile, "fromFile(...)");
                        ((a) cVar.f18006a).f10496c = e.k(organizationProfileActivity, fromFile);
                        if (this.f20361a.V().I.f8545b == null) {
                            this.f20361a.V().I.g(j7.a.e(cVar.f18006a));
                        } else {
                            ArrayList arrayList = (ArrayList) this.f20361a.V().I.f8545b;
                            j.c(arrayList);
                            arrayList.addAll(0, j7.a.e(cVar.f18006a));
                            this.f20361a.V().I.g(arrayList);
                            d2.i<ArrayList<a>> iVar = this.f20361a.V().I;
                            synchronized (iVar) {
                                d2.k kVar = iVar.f8538a;
                                if (kVar != null) {
                                    kVar.b(0, iVar);
                                }
                            }
                        }
                    }
                } else if (str.equals("FRONT")) {
                    User user4 = (User) this.f20361a.V().L.f8545b;
                    if (user4 == null || (contactPersonIdentityCard6 = user4.getContactPersonIdentityCard()) == null || (files6 = contactPersonIdentityCard6.getFiles()) == null) {
                        i11 = 0;
                    } else {
                        i11 = files6.size();
                    }
                    if (!(i11 <= 1 || (user2 = (User) this.f20361a.V().L.f8545b) == null || (contactPersonIdentityCard5 = user2.getContactPersonIdentityCard()) == null || (files5 = contactPersonIdentityCard5.getFiles()) == null)) {
                        a aVar = (a) fk.l.J0(files5);
                    }
                    User user5 = (User) this.f20361a.V().L.f8545b;
                    if (!(user5 == null || (contactPersonIdentityCard4 = user5.getContactPersonIdentityCard()) == null || (files4 = contactPersonIdentityCard4.getFiles()) == null)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(j7.a.f11713u);
                        sb2.append("web-api/user-bidding/api/file/download/");
                        f.c cVar2 = (f.c) fVar;
                        sb2.append(((a) cVar2.f18006a).a());
                        files4.add(0, new a(sb2.toString(), ((a) cVar2.f18006a).b(), 4));
                    }
                    ImageView imageView = ((m0) this.f20361a.M()).B;
                    j.e(imageView, "btnFront");
                    imageView.setVisibility(0);
                }
            } else if (str.equals("BACK")) {
                User user6 = (User) this.f20361a.V().L.f8545b;
                if (user6 == null || (contactPersonIdentityCard3 = user6.getContactPersonIdentityCard()) == null || (files3 = contactPersonIdentityCard3.getFiles()) == null) {
                    i10 = 0;
                } else {
                    i10 = files3.size();
                }
                if (!(i10 <= 1 || (user = (User) this.f20361a.V().L.f8545b) == null || (contactPersonIdentityCard2 = user.getContactPersonIdentityCard()) == null || (files2 = contactPersonIdentityCard2.getFiles()) == null)) {
                    a aVar2 = (a) fk.l.K0(files2);
                }
                User user7 = (User) this.f20361a.V().L.f8545b;
                if (!(user7 == null || (contactPersonIdentityCard = user7.getContactPersonIdentityCard()) == null || (files = contactPersonIdentityCard.getFiles()) == null)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(j7.a.f11713u);
                    sb3.append("web-api/user-bidding/api/file/download/");
                    f.c cVar3 = (f.c) fVar;
                    sb3.append(((a) cVar3.f18006a).a());
                    files.add(new a(sb3.toString(), ((a) cVar3.f18006a).b(), 4));
                }
                ImageView imageView2 = ((m0) this.f20361a.M()).f21209y;
                j.e(imageView2, "btnBackSide");
                imageView2.setVisibility(0);
            }
        }
        return i.f20112a;
    }
}

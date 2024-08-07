package com.vpa.daugia.module.auth.data.model;

import cc.b;
import gf.a;
import java.util.ArrayList;
import sk.e;
import sk.j;

/* compiled from: ContactPersonIdentityCard.kt */
public final class ContactPersonIdentityCard {
    @b("files")
    private ArrayList<a> files;

    public ContactPersonIdentityCard() {
        this((ArrayList) null, 1, (e) null);
    }

    public ContactPersonIdentityCard(ArrayList<a> arrayList) {
        this.files = arrayList;
    }

    public static /* synthetic */ ContactPersonIdentityCard copy$default(ContactPersonIdentityCard contactPersonIdentityCard, ArrayList<a> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = contactPersonIdentityCard.files;
        }
        return contactPersonIdentityCard.copy(arrayList);
    }

    public final ArrayList<a> component1() {
        return this.files;
    }

    public final ContactPersonIdentityCard copy(ArrayList<a> arrayList) {
        return new ContactPersonIdentityCard(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactPersonIdentityCard) && j.a(this.files, ((ContactPersonIdentityCard) obj).files);
    }

    public final ArrayList<a> getFiles() {
        return this.files;
    }

    public int hashCode() {
        ArrayList<a> arrayList = this.files;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setFiles(ArrayList<a> arrayList) {
        this.files = arrayList;
    }

    public String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ContactPersonIdentityCard(files=");
        q10.append(this.files);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactPersonIdentityCard(ArrayList arrayList, int i10, e eVar) {
        this((i10 & 1) != 0 ? new ArrayList() : arrayList);
    }
}

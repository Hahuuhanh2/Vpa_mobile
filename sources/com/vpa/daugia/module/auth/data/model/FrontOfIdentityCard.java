package com.vpa.daugia.module.auth.data.model;

import cc.b;
import fk.r;
import gf.a;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: FrontOfIdentityCard.kt */
public final class FrontOfIdentityCard {
    @b("files")
    private List<a> files;

    public FrontOfIdentityCard() {
        this((List) null, 1, (e) null);
    }

    public FrontOfIdentityCard(List<a> list) {
        this.files = list;
    }

    public static /* synthetic */ FrontOfIdentityCard copy$default(FrontOfIdentityCard frontOfIdentityCard, List<a> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = frontOfIdentityCard.files;
        }
        return frontOfIdentityCard.copy(list);
    }

    public final List<a> component1() {
        return this.files;
    }

    public final FrontOfIdentityCard copy(List<a> list) {
        return new FrontOfIdentityCard(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrontOfIdentityCard) && j.a(this.files, ((FrontOfIdentityCard) obj).files);
    }

    public final List<a> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<a> list = this.files;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setFiles(List<a> list) {
        this.files = list;
    }

    public String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("FrontOfIdentityCard(files=");
        q10.append(this.files);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrontOfIdentityCard(List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? r.f20213a : list);
    }
}

package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: FrontOfIdentityCard.kt */
public final class FrontOfIdentityCard {
    @b("files")
    private List<File> files;

    public FrontOfIdentityCard() {
        this((List) null, 1, (e) null);
    }

    public FrontOfIdentityCard(List<File> list) {
        this.files = list;
    }

    public static /* synthetic */ FrontOfIdentityCard copy$default(FrontOfIdentityCard frontOfIdentityCard, List<File> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = frontOfIdentityCard.files;
        }
        return frontOfIdentityCard.copy(list);
    }

    public final List<File> component1() {
        return this.files;
    }

    public final FrontOfIdentityCard copy(List<File> list) {
        return new FrontOfIdentityCard(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrontOfIdentityCard) && j.a(this.files, ((FrontOfIdentityCard) obj).files);
    }

    public final List<File> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<File> list = this.files;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setFiles(List<File> list) {
        this.files = list;
    }

    public String toString() {
        StringBuilder q10 = a.q("FrontOfIdentityCard(files=");
        q10.append(this.files);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrontOfIdentityCard(List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? j7.a.c0(new File("https://stg-dgbs.vpa.com.vn/web-api/userbidding/api/file/download/4624305506996_giy_kkd.jpg", "4624305506996_giy_kkd.jpg")) : list);
    }
}

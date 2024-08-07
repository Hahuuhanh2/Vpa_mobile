package com.vpa.daugia.module.history.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: NotifyAuction.kt */
public final class NotifyAuction implements Serializable {
    @b("documentFile")
    private String documentFile;
    @b("nameFile")
    private String nameFile;
    @b("timePublic")
    private Long timePublic;

    public NotifyAuction() {
        this((String) null, (String) null, (Long) null, 7, (e) null);
    }

    public NotifyAuction(String str, String str2, Long l10) {
        this.documentFile = str;
        this.nameFile = str2;
        this.timePublic = l10;
    }

    public static /* synthetic */ NotifyAuction copy$default(NotifyAuction notifyAuction, String str, String str2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notifyAuction.documentFile;
        }
        if ((i10 & 2) != 0) {
            str2 = notifyAuction.nameFile;
        }
        if ((i10 & 4) != 0) {
            l10 = notifyAuction.timePublic;
        }
        return notifyAuction.copy(str, str2, l10);
    }

    public final String component1() {
        return this.documentFile;
    }

    public final String component2() {
        return this.nameFile;
    }

    public final Long component3() {
        return this.timePublic;
    }

    public final NotifyAuction copy(String str, String str2, Long l10) {
        return new NotifyAuction(str, str2, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyAuction)) {
            return false;
        }
        NotifyAuction notifyAuction = (NotifyAuction) obj;
        return j.a(this.documentFile, notifyAuction.documentFile) && j.a(this.nameFile, notifyAuction.nameFile) && j.a(this.timePublic, notifyAuction.timePublic);
    }

    public final String getDocumentFile() {
        return this.documentFile;
    }

    public final String getNameFile() {
        return this.nameFile;
    }

    public final Long getTimePublic() {
        return this.timePublic;
    }

    public int hashCode() {
        String str = this.documentFile;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameFile;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.timePublic;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setDocumentFile(String str) {
        this.documentFile = str;
    }

    public final void setNameFile(String str) {
        this.nameFile = str;
    }

    public final void setTimePublic(Long l10) {
        this.timePublic = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("NotifyAuction(documentFile=");
        q10.append(this.documentFile);
        q10.append(", nameFile=");
        q10.append(this.nameFile);
        q10.append(", timePublic=");
        q10.append(this.timePublic);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotifyAuction(String str, String str2, Long l10, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
    }
}

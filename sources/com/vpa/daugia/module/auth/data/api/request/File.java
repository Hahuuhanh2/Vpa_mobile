package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: File.kt */
public final class File {
    @b("fileUrl")
    private String fileUrl;
    @b("filename")
    private String filename;

    public File() {
        this((String) null, (String) null, 3, (e) null);
    }

    public File(String str, String str2) {
        this.fileUrl = str;
        this.filename = str2;
    }

    public static /* synthetic */ File copy$default(File file, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = file.fileUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = file.filename;
        }
        return file.copy(str, str2);
    }

    public final String component1() {
        return this.fileUrl;
    }

    public final String component2() {
        return this.filename;
    }

    public final File copy(String str, String str2) {
        return new File(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        return j.a(this.fileUrl, file.fileUrl) && j.a(this.filename, file.filename);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getFilename() {
        return this.filename;
    }

    public int hashCode() {
        String str = this.fileUrl;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filename;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public final void setFilename(String str) {
        this.filename = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("File(fileUrl=");
        q10.append(this.fileUrl);
        q10.append(", filename=");
        return l.k(q10, this.filename, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ File(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}

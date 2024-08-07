package com.vpa.daugia.module.support.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import java.util.List;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: FAQ.kt */
public final class FAQ implements Serializable {
    @b("answer")
    private String answer;
    @b("attachments")
    private List<? extends Object> attachments;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Long f19886id;
    @b("lastUpdated")
    private Object lastUpdated;
    @b("question")
    private String question;

    public FAQ() {
        this((String) null, (List) null, (Long) null, (Object) null, (String) null, 31, (e) null);
    }

    public FAQ(String str, List<? extends Object> list, Long l10, Object obj, String str2) {
        this.answer = str;
        this.attachments = list;
        this.f19886id = l10;
        this.lastUpdated = obj;
        this.question = str2;
    }

    public static /* synthetic */ FAQ copy$default(FAQ faq, String str, List<? extends Object> list, Long l10, Object obj, String str2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = faq.answer;
        }
        if ((i10 & 2) != 0) {
            list = faq.attachments;
        }
        List<? extends Object> list2 = list;
        if ((i10 & 4) != 0) {
            l10 = faq.f19886id;
        }
        Long l11 = l10;
        if ((i10 & 8) != 0) {
            obj = faq.lastUpdated;
        }
        Object obj3 = obj;
        if ((i10 & 16) != 0) {
            str2 = faq.question;
        }
        return faq.copy(str, list2, l11, obj3, str2);
    }

    public final String component1() {
        return this.answer;
    }

    public final List<Object> component2() {
        return this.attachments;
    }

    public final Long component3() {
        return this.f19886id;
    }

    public final Object component4() {
        return this.lastUpdated;
    }

    public final String component5() {
        return this.question;
    }

    public final FAQ copy(String str, List<? extends Object> list, Long l10, Object obj, String str2) {
        return new FAQ(str, list, l10, obj, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FAQ)) {
            return false;
        }
        FAQ faq = (FAQ) obj;
        return j.a(this.answer, faq.answer) && j.a(this.attachments, faq.attachments) && j.a(this.f19886id, faq.f19886id) && j.a(this.lastUpdated, faq.lastUpdated) && j.a(this.question, faq.question);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final List<Object> getAttachments() {
        return this.attachments;
    }

    public final Long getId() {
        return this.f19886id;
    }

    public final Object getLastUpdated() {
        return this.lastUpdated;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        String str = this.answer;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends Object> list = this.attachments;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l10 = this.f19886id;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Object obj = this.lastUpdated;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.question;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    public final void setAttachments(List<? extends Object> list) {
        this.attachments = list;
    }

    public final void setId(Long l10) {
        this.f19886id = l10;
    }

    public final void setLastUpdated(Object obj) {
        this.lastUpdated = obj;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("FAQ(answer=");
        q10.append(this.answer);
        q10.append(", attachments=");
        q10.append(this.attachments);
        q10.append(", id=");
        q10.append(this.f19886id);
        q10.append(", lastUpdated=");
        q10.append(this.lastUpdated);
        q10.append(", question=");
        return l.k(q10, this.question, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FAQ(java.lang.String r5, java.util.List r6, java.lang.Long r7, java.lang.Object r8, java.lang.String r9, int r10, sk.e r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.support.data.model.FAQ.<init>(java.lang.String, java.util.List, java.lang.Long, java.lang.Object, java.lang.String, int, sk.e):void");
    }
}

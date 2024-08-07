package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Item.kt */
public final class Item implements Serializable {
    @b("action")
    private Action action;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f19664id;
    @b("image")
    private String image;
    @b("isOn")
    private boolean isOn;
    @b("title")
    private String title;

    public Item() {
        this((Action) null, (Integer) null, (String) null, false, (String) null, 31, (e) null);
    }

    public Item(Action action2, Integer num, String str, boolean z10, String str2) {
        j.f(action2, "action");
        this.action = action2;
        this.f19664id = num;
        this.image = str;
        this.isOn = z10;
        this.title = str2;
    }

    public static /* synthetic */ Item copy$default(Item item, Action action2, Integer num, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            action2 = item.action;
        }
        if ((i10 & 2) != 0) {
            num = item.f19664id;
        }
        Integer num2 = num;
        if ((i10 & 4) != 0) {
            str = item.image;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            z10 = item.isOn;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            str2 = item.title;
        }
        return item.copy(action2, num2, str3, z11, str2);
    }

    public final Action component1() {
        return this.action;
    }

    public final Integer component2() {
        return this.f19664id;
    }

    public final String component3() {
        return this.image;
    }

    public final boolean component4() {
        return this.isOn;
    }

    public final String component5() {
        return this.title;
    }

    public final Item copy(Action action2, Integer num, String str, boolean z10, String str2) {
        j.f(action2, "action");
        return new Item(action2, num, str, z10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return j.a(this.action, item.action) && j.a(this.f19664id, item.f19664id) && j.a(this.image, item.image) && this.isOn == item.isOn && j.a(this.title, item.title);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Integer getId() {
        return this.f19664id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        Integer num = this.f19664id;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.image;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isOn;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode3 + (z10 ? 1 : 0)) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isOn() {
        return this.isOn;
    }

    public final void setAction(Action action2) {
        j.f(action2, "<set-?>");
        this.action = action2;
    }

    public final void setId(Integer num) {
        this.f19664id = num;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setOn(boolean z10) {
        this.isOn = z10;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Item(action=");
        q10.append(this.action);
        q10.append(", id=");
        q10.append(this.f19664id);
        q10.append(", image=");
        q10.append(this.image);
        q10.append(", isOn=");
        q10.append(this.isOn);
        q10.append(", title=");
        return l.k(q10, this.title, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Item(Action action2, Integer num, String str, boolean z10, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? new Action((String) null, (String) null, 3, (e) null) : action2, (i10 & 2) != 0 ? -1 : num, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? "" : str2);
    }
}

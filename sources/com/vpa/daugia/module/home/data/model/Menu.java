package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: Menu.kt */
public final class Menu implements Serializable {
    private Integer icon;

    /* renamed from: id  reason: collision with root package name */
    private int f19665id;
    private String title;

    public Menu() {
        this((Integer) null, (String) null, 0, 7, (e) null);
    }

    public Menu(Integer num, String str, int i10) {
        this.icon = num;
        this.title = str;
        this.f19665id = i10;
    }

    public static /* synthetic */ Menu copy$default(Menu menu, Integer num, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = menu.icon;
        }
        if ((i11 & 2) != 0) {
            str = menu.title;
        }
        if ((i11 & 4) != 0) {
            i10 = menu.f19665id;
        }
        return menu.copy(num, str, i10);
    }

    public final Integer component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.f19665id;
    }

    public final Menu copy(Integer num, String str, int i10) {
        return new Menu(num, str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) obj;
        return j.a(this.icon, menu.icon) && j.a(this.title, menu.title) && this.f19665id == menu.f19665id;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f19665id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.icon;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f19665id;
    }

    public final void setIcon(Integer num) {
        this.icon = num;
    }

    public final void setId(int i10) {
        this.f19665id = i10;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Menu(icon=");
        q10.append(this.icon);
        q10.append(", title=");
        q10.append(this.title);
        q10.append(", id=");
        q10.append(this.f19665id);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Menu(Integer num, String str, int i10, int i11, e eVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10);
    }
}

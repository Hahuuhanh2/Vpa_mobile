package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import java.util.ArrayList;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Feature.kt */
public final class Feature implements Serializable {
    @b("content")
    private String content;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f19663id;
    @b("isOn")
    private boolean isOn;
    @b("items")
    private ArrayList<Item> items;
    @b("title")
    private String title;

    public Feature(String str, int i10, boolean z10, ArrayList<Item> arrayList, String str2) {
        j.f(str, "content");
        j.f(arrayList, "items");
        j.f(str2, "title");
        this.content = str;
        this.f19663id = i10;
        this.isOn = z10;
        this.items = arrayList;
        this.title = str2;
    }

    public static /* synthetic */ Feature copy$default(Feature feature, String str, int i10, boolean z10, ArrayList<Item> arrayList, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = feature.content;
        }
        if ((i11 & 2) != 0) {
            i10 = feature.f19663id;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            z10 = feature.isOn;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            arrayList = feature.items;
        }
        ArrayList<Item> arrayList2 = arrayList;
        if ((i11 & 16) != 0) {
            str2 = feature.title;
        }
        return feature.copy(str, i12, z11, arrayList2, str2);
    }

    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.f19663id;
    }

    public final boolean component3() {
        return this.isOn;
    }

    public final ArrayList<Item> component4() {
        return this.items;
    }

    public final String component5() {
        return this.title;
    }

    public final Feature copy(String str, int i10, boolean z10, ArrayList<Item> arrayList, String str2) {
        j.f(str, "content");
        j.f(arrayList, "items");
        j.f(str2, "title");
        return new Feature(str, i10, z10, arrayList, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return j.a(this.content, feature.content) && this.f19663id == feature.f19663id && this.isOn == feature.isOn && j.a(this.items, feature.items) && j.a(this.title, feature.title);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.f19663id;
    }

    public final ArrayList<Item> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.content.hashCode() * 31) + this.f19663id) * 31;
        boolean z10 = this.isOn;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = this.items.hashCode();
        return this.title.hashCode() + ((hashCode2 + ((hashCode + (z10 ? 1 : 0)) * 31)) * 31);
    }

    public final boolean isOn() {
        return this.isOn;
    }

    public final void setContent(String str) {
        j.f(str, "<set-?>");
        this.content = str;
    }

    public final void setId(int i10) {
        this.f19663id = i10;
    }

    public final void setItems(ArrayList<Item> arrayList) {
        j.f(arrayList, "<set-?>");
        this.items = arrayList;
    }

    public final void setOn(boolean z10) {
        this.isOn = z10;
    }

    public final void setTitle(String str) {
        j.f(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Feature(content=");
        q10.append(this.content);
        q10.append(", id=");
        q10.append(this.f19663id);
        q10.append(", isOn=");
        q10.append(this.isOn);
        q10.append(", items=");
        q10.append(this.items);
        q10.append(", title=");
        return l.k(q10, this.title, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Feature(String str, int i10, boolean z10, ArrayList arrayList, String str2, int i11, e eVar) {
        this(str, i10, z10, arrayList, (i11 & 16) != 0 ? "" : str2);
    }
}

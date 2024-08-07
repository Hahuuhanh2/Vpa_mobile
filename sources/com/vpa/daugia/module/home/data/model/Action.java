package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Action.kt */
public final class Action {
    @b("actionName")
    private String actionName;
    @b("actionObjectId")
    private String actionObjectId;

    public Action() {
        this((String) null, (String) null, 3, (e) null);
    }

    public Action(String str, String str2) {
        this.actionName = str;
        this.actionObjectId = str2;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = action.actionName;
        }
        if ((i10 & 2) != 0) {
            str2 = action.actionObjectId;
        }
        return action.copy(str, str2);
    }

    public final String component1() {
        return this.actionName;
    }

    public final String component2() {
        return this.actionObjectId;
    }

    public final Action copy(String str, String str2) {
        return new Action(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return j.a(this.actionName, action.actionName) && j.a(this.actionObjectId, action.actionObjectId);
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final String getActionObjectId() {
        return this.actionObjectId;
    }

    public int hashCode() {
        String str = this.actionName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionObjectId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final void setActionObjectId(String str) {
        this.actionObjectId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Action(actionName=");
        q10.append(this.actionName);
        q10.append(", actionObjectId=");
        return l.k(q10, this.actionObjectId, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Action(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}

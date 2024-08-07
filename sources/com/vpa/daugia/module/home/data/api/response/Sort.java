package com.vpa.daugia.module.home.data.api.response;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: AnnouncementPlanResponse.kt */
public final class Sort {
    @b("empty")
    private final Boolean empty;
    @b("sorted")
    private final Boolean sorted;
    @b("unsorted")
    private final Boolean unsorted;

    public Sort(Boolean bool, Boolean bool2, Boolean bool3) {
        this.empty = bool;
        this.sorted = bool2;
        this.unsorted = bool3;
    }

    public static /* synthetic */ Sort copy$default(Sort sort, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sort.empty;
        }
        if ((i10 & 2) != 0) {
            bool2 = sort.sorted;
        }
        if ((i10 & 4) != 0) {
            bool3 = sort.unsorted;
        }
        return sort.copy(bool, bool2, bool3);
    }

    public final Boolean component1() {
        return this.empty;
    }

    public final Boolean component2() {
        return this.sorted;
    }

    public final Boolean component3() {
        return this.unsorted;
    }

    public final Sort copy(Boolean bool, Boolean bool2, Boolean bool3) {
        return new Sort(bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sort)) {
            return false;
        }
        Sort sort = (Sort) obj;
        return j.a(this.empty, sort.empty) && j.a(this.sorted, sort.sorted) && j.a(this.unsorted, sort.unsorted);
    }

    public final Boolean getEmpty() {
        return this.empty;
    }

    public final Boolean getSorted() {
        return this.sorted;
    }

    public final Boolean getUnsorted() {
        return this.unsorted;
    }

    public int hashCode() {
        Boolean bool = this.empty;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.sorted;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unsorted;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("Sort(empty=");
        q10.append(this.empty);
        q10.append(", sorted=");
        q10.append(this.sorted);
        q10.append(", unsorted=");
        q10.append(this.unsorted);
        q10.append(')');
        return q10.toString();
    }
}

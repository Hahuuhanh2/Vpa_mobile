package com.vpa.daugia.module.home.data.api.response;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: AnnouncementPlanResponse.kt */
public final class Pageable {
    @b("offset")
    private final Integer offset;
    @b("pageNumber")
    private final Integer pageNumber;
    @b("pageSize")
    private final Integer pageSize;
    @b("paged")
    private final Boolean paged;
    @b("sort")
    private final Sort sort;
    @b("unpaged")
    private final Boolean unpaged;

    public Pageable(Integer num, Integer num2, Integer num3, Boolean bool, Sort sort2, Boolean bool2) {
        this.offset = num;
        this.pageNumber = num2;
        this.pageSize = num3;
        this.paged = bool;
        this.sort = sort2;
        this.unpaged = bool2;
    }

    public static /* synthetic */ Pageable copy$default(Pageable pageable, Integer num, Integer num2, Integer num3, Boolean bool, Sort sort2, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = pageable.offset;
        }
        if ((i10 & 2) != 0) {
            num2 = pageable.pageNumber;
        }
        Integer num4 = num2;
        if ((i10 & 4) != 0) {
            num3 = pageable.pageSize;
        }
        Integer num5 = num3;
        if ((i10 & 8) != 0) {
            bool = pageable.paged;
        }
        Boolean bool3 = bool;
        if ((i10 & 16) != 0) {
            sort2 = pageable.sort;
        }
        Sort sort3 = sort2;
        if ((i10 & 32) != 0) {
            bool2 = pageable.unpaged;
        }
        return pageable.copy(num, num4, num5, bool3, sort3, bool2);
    }

    public final Integer component1() {
        return this.offset;
    }

    public final Integer component2() {
        return this.pageNumber;
    }

    public final Integer component3() {
        return this.pageSize;
    }

    public final Boolean component4() {
        return this.paged;
    }

    public final Sort component5() {
        return this.sort;
    }

    public final Boolean component6() {
        return this.unpaged;
    }

    public final Pageable copy(Integer num, Integer num2, Integer num3, Boolean bool, Sort sort2, Boolean bool2) {
        return new Pageable(num, num2, num3, bool, sort2, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pageable)) {
            return false;
        }
        Pageable pageable = (Pageable) obj;
        return j.a(this.offset, pageable.offset) && j.a(this.pageNumber, pageable.pageNumber) && j.a(this.pageSize, pageable.pageSize) && j.a(this.paged, pageable.paged) && j.a(this.sort, pageable.sort) && j.a(this.unpaged, pageable.unpaged);
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final Boolean getPaged() {
        return this.paged;
    }

    public final Sort getSort() {
        return this.sort;
    }

    public final Boolean getUnpaged() {
        return this.unpaged;
    }

    public int hashCode() {
        Integer num = this.offset;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageNumber;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pageSize;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.paged;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Sort sort2 = this.sort;
        int hashCode5 = (hashCode4 + (sort2 == null ? 0 : sort2.hashCode())) * 31;
        Boolean bool2 = this.unpaged;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("Pageable(offset=");
        q10.append(this.offset);
        q10.append(", pageNumber=");
        q10.append(this.pageNumber);
        q10.append(", pageSize=");
        q10.append(this.pageSize);
        q10.append(", paged=");
        q10.append(this.paged);
        q10.append(", sort=");
        q10.append(this.sort);
        q10.append(", unpaged=");
        q10.append(this.unpaged);
        q10.append(')');
        return q10.toString();
    }
}

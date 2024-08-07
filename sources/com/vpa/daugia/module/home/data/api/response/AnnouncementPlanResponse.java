package com.vpa.daugia.module.home.data.api.response;

import android.support.v4.media.a;
import cc.b;
import java.util.ArrayList;
import sk.j;

/* compiled from: AnnouncementPlanResponse.kt */
public final class AnnouncementPlanResponse {
    @b("content")
    private final ArrayList<Plate> content;
    @b("empty")
    private final Boolean empty;
    @b("first")
    private final Boolean first;
    @b("last")
    private final Boolean last;
    @b("number")
    private final Integer number;
    @b("numberOfElements")
    private final Integer numberOfElements;
    @b("pageable")
    private final Pageable pageable;
    @b("size")
    private final Integer size;
    @b("sort")
    private final Sort sort;
    @b("totalElements")
    private final Integer totalElements;
    @b("totalPages")
    private final Integer totalPages;

    public AnnouncementPlanResponse(ArrayList<Plate> arrayList, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Pageable pageable2, Integer num3, Sort sort2, Integer num4, Integer num5) {
        j.f(arrayList, "content");
        this.content = arrayList;
        this.empty = bool;
        this.first = bool2;
        this.last = bool3;
        this.number = num;
        this.numberOfElements = num2;
        this.pageable = pageable2;
        this.size = num3;
        this.sort = sort2;
        this.totalElements = num4;
        this.totalPages = num5;
    }

    public static /* synthetic */ AnnouncementPlanResponse copy$default(AnnouncementPlanResponse announcementPlanResponse, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Pageable pageable2, Integer num3, Sort sort2, Integer num4, Integer num5, int i10, Object obj) {
        AnnouncementPlanResponse announcementPlanResponse2 = announcementPlanResponse;
        int i11 = i10;
        return announcementPlanResponse.copy((i11 & 1) != 0 ? announcementPlanResponse2.content : arrayList, (i11 & 2) != 0 ? announcementPlanResponse2.empty : bool, (i11 & 4) != 0 ? announcementPlanResponse2.first : bool2, (i11 & 8) != 0 ? announcementPlanResponse2.last : bool3, (i11 & 16) != 0 ? announcementPlanResponse2.number : num, (i11 & 32) != 0 ? announcementPlanResponse2.numberOfElements : num2, (i11 & 64) != 0 ? announcementPlanResponse2.pageable : pageable2, (i11 & 128) != 0 ? announcementPlanResponse2.size : num3, (i11 & 256) != 0 ? announcementPlanResponse2.sort : sort2, (i11 & 512) != 0 ? announcementPlanResponse2.totalElements : num4, (i11 & 1024) != 0 ? announcementPlanResponse2.totalPages : num5);
    }

    public final ArrayList<Plate> component1() {
        return this.content;
    }

    public final Integer component10() {
        return this.totalElements;
    }

    public final Integer component11() {
        return this.totalPages;
    }

    public final Boolean component2() {
        return this.empty;
    }

    public final Boolean component3() {
        return this.first;
    }

    public final Boolean component4() {
        return this.last;
    }

    public final Integer component5() {
        return this.number;
    }

    public final Integer component6() {
        return this.numberOfElements;
    }

    public final Pageable component7() {
        return this.pageable;
    }

    public final Integer component8() {
        return this.size;
    }

    public final Sort component9() {
        return this.sort;
    }

    public final AnnouncementPlanResponse copy(ArrayList<Plate> arrayList, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Pageable pageable2, Integer num3, Sort sort2, Integer num4, Integer num5) {
        j.f(arrayList, "content");
        return new AnnouncementPlanResponse(arrayList, bool, bool2, bool3, num, num2, pageable2, num3, sort2, num4, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnouncementPlanResponse)) {
            return false;
        }
        AnnouncementPlanResponse announcementPlanResponse = (AnnouncementPlanResponse) obj;
        return j.a(this.content, announcementPlanResponse.content) && j.a(this.empty, announcementPlanResponse.empty) && j.a(this.first, announcementPlanResponse.first) && j.a(this.last, announcementPlanResponse.last) && j.a(this.number, announcementPlanResponse.number) && j.a(this.numberOfElements, announcementPlanResponse.numberOfElements) && j.a(this.pageable, announcementPlanResponse.pageable) && j.a(this.size, announcementPlanResponse.size) && j.a(this.sort, announcementPlanResponse.sort) && j.a(this.totalElements, announcementPlanResponse.totalElements) && j.a(this.totalPages, announcementPlanResponse.totalPages);
    }

    public final ArrayList<Plate> getContent() {
        return this.content;
    }

    public final Boolean getEmpty() {
        return this.empty;
    }

    public final Boolean getFirst() {
        return this.first;
    }

    public final Boolean getLast() {
        return this.last;
    }

    public final Integer getNumber() {
        return this.number;
    }

    public final Integer getNumberOfElements() {
        return this.numberOfElements;
    }

    public final Pageable getPageable() {
        return this.pageable;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final Sort getSort() {
        return this.sort;
    }

    public final Integer getTotalElements() {
        return this.totalElements;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        Boolean bool = this.empty;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.first;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.last;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.number;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numberOfElements;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Pageable pageable2 = this.pageable;
        int hashCode7 = (hashCode6 + (pageable2 == null ? 0 : pageable2.hashCode())) * 31;
        Integer num3 = this.size;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Sort sort2 = this.sort;
        int hashCode9 = (hashCode8 + (sort2 == null ? 0 : sort2.hashCode())) * 31;
        Integer num4 = this.totalElements;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.totalPages;
        if (num5 != null) {
            i10 = num5.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AnnouncementPlanResponse(content=");
        q10.append(this.content);
        q10.append(", empty=");
        q10.append(this.empty);
        q10.append(", first=");
        q10.append(this.first);
        q10.append(", last=");
        q10.append(this.last);
        q10.append(", number=");
        q10.append(this.number);
        q10.append(", numberOfElements=");
        q10.append(this.numberOfElements);
        q10.append(", pageable=");
        q10.append(this.pageable);
        q10.append(", size=");
        q10.append(this.size);
        q10.append(", sort=");
        q10.append(this.sort);
        q10.append(", totalElements=");
        q10.append(this.totalElements);
        q10.append(", totalPages=");
        q10.append(this.totalPages);
        q10.append(')');
        return q10.toString();
    }
}

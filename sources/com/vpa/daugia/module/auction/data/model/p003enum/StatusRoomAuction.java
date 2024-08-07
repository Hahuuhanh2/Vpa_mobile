package com.vpa.daugia.module.auction.data.model.p003enum;

import lk.a;
import p3.l0;

/* renamed from: com.vpa.daugia.module.auction.data.model.enum.StatusRoomAuction  reason: invalid package */
/* compiled from: StatusRoomAuction.kt */
public enum StatusRoomAuction {
    WAITING("Chờ đấu giá", 6),
    PROGRESSING("Đang diễn ra đấu giá", 5),
    END("Kết thúc đấu giá", 7);
    
    private final String text;
    private final int value;

    /* access modifiers changed from: public */
    static {
        StatusRoomAuction[] $values;
        $ENTRIES = l0.K($values);
    }

    private StatusRoomAuction(String str, int i10) {
        this.text = str;
        this.value = i10;
    }

    public static a<StatusRoomAuction> getEntries() {
        return $ENTRIES;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}

package uc;

import java.util.List;

/* compiled from: DecodeHintType */
public enum b {
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(k.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f15460a;

    /* access modifiers changed from: public */
    b(Class<?> cls) {
        this.f15460a = cls;
    }
}

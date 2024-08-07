package j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.h  reason: case insensitive filesystem */
public abstract class C0402h {
    public static Optional a(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.d(optional.get()) : Optional.a();
    }

    public static C0403i b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C0403i.d(optionalDouble.getAsDouble()) : C0403i.a();
    }

    public static C0404j c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C0404j.d(optionalInt.getAsInt()) : C0404j.a();
    }

    public static C0405k d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C0405k.d(optionalLong.getAsLong()) : C0405k.a();
    }

    public static Optional e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.c() ? Optional.of(optional.b()) : Optional.empty();
    }

    public static OptionalDouble f(C0403i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.c() ? OptionalDouble.of(iVar.b()) : OptionalDouble.empty();
    }

    public static OptionalInt g(C0404j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.c() ? OptionalInt.of(jVar.b()) : OptionalInt.empty();
    }

    public static OptionalLong h(C0405k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.c() ? OptionalLong.of(kVar.b()) : OptionalLong.empty();
    }
}

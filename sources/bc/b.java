package bc;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy */
public enum b implements c {
    ;

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        public final String b(Field field) {
            return field.getName();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: bc.b$b  reason: collision with other inner class name */
    /* compiled from: FieldNamingPolicy */
    public final class C0045b extends b {
        public C0045b() {
            super("UPPER_CAMEL_CASE", 1);
        }

        public final String b(Field field) {
            return b.i(field.getName());
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class c extends b {
        public c() {
            super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        }

        public final String b(Field field) {
            return b.i(b.c(field.getName(), ' '));
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class d extends b {
        public d() {
            super("UPPER_CASE_WITH_UNDERSCORES", 3);
        }

        public final String b(Field field) {
            return b.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class e extends b {
        public e() {
            super("LOWER_CASE_WITH_UNDERSCORES", 4);
        }

        public final String b(Field field) {
            return b.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class f extends b {
        public f() {
            super("LOWER_CASE_WITH_DASHES", 5);
        }

        public final String b(Field field) {
            return b.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: FieldNamingPolicy */
    public final class g extends b {
        public g() {
            super("LOWER_CASE_WITH_DOTS", 6);
        }

        public final String b(Field field) {
            return b.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    /* access modifiers changed from: public */
    b() {
        throw null;
    }

    public static String c(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String i(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (!Character.isLetter(charAt)) {
                i10++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    StringBuilder p10 = android.support.v4.media.a.p(upperCase);
                    p10.append(str.substring(1));
                    return p10.toString();
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }
}

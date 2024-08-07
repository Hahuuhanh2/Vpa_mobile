package u1;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import u1.f;
import u1.g;

/* compiled from: BidiFormatter */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f15039d = Character.toString(8206);

    /* renamed from: e  reason: collision with root package name */
    public static final String f15040e = Character.toString(8207);

    /* renamed from: f  reason: collision with root package name */
    public static final a f15041f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f15042g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15043a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15044b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15045c;

    /* renamed from: u1.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static class C0200a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f15046e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f15047a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15048b;

        /* renamed from: c  reason: collision with root package name */
        public int f15049c;

        /* renamed from: d  reason: collision with root package name */
        public char f15050d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f15046e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0200a(CharSequence charSequence) {
            this.f15047a = charSequence;
            this.f15048b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.f15047a.charAt(this.f15049c - 1);
            this.f15050d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f15047a, this.f15049c);
                this.f15049c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f15049c--;
            char c10 = this.f15050d;
            if (c10 < 1792) {
                return f15046e[c10];
            }
            return Character.getDirectionality(c10);
        }
    }

    static {
        f.d dVar = f.f15058c;
        f15041f = new a(false, 2, dVar);
        f15042g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i10, f.d dVar) {
        this.f15043a = z10;
        this.f15044b = i10;
        this.f15045c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            u1.a$a r0 = new u1.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f15049c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f15049c
            int r7 = r0.f15048b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f15047a
            char r6 = r7.charAt(r6)
            r0.f15050d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f15047a
            int r7 = r0.f15049c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f15049c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f15049c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f15049c
            int r6 = r6 + r2
            r0.f15049c = r6
            char r6 = r0.f15050d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = u1.a.C0200a.f15046e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r9
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f15049c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = r1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            u1.a$a r0 = new u1.a$a
            r0.<init>(r6)
            int r6 = r0.f15048b
            r0.f15049c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f15049c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = g.f15063a;
        boolean z10 = true;
        if (g.a.a(locale) != 1) {
            z10 = false;
        }
        if (z10) {
            return f15042g;
        }
        return f15041f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, e eVar) {
        f.d dVar;
        char c10;
        f.d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean z10 = false;
        boolean b10 = ((f.c) eVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f15044b & 2) != 0) {
            z10 = true;
        }
        String str2 = "";
        if (z10) {
            if (b10) {
                dVar2 = f.f15057b;
            } else {
                dVar2 = f.f15056a;
            }
            boolean b11 = dVar2.b(charSequence, charSequence.length());
            if (!this.f15043a && (b11 || a(charSequence) == 1)) {
                str = f15039d;
            } else if (!this.f15043a || (b11 && a(charSequence) != -1)) {
                str = str2;
            } else {
                str = f15040e;
            }
            spannableStringBuilder.append(str);
        }
        if (b10 != this.f15043a) {
            if (b10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar = f.f15057b;
        } else {
            dVar = f.f15056a;
        }
        boolean b12 = dVar.b(charSequence, charSequence.length());
        if (!this.f15043a && (b12 || b(charSequence) == 1)) {
            str2 = f15039d;
        } else if (this.f15043a && (!b12 || b(charSequence) == -1)) {
            str2 = f15040e;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}

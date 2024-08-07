package com.bumptech.glide.load.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s4.e;

public final class GlideException extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public static final StackTraceElement[] f4991f = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f4992a;

    /* renamed from: b  reason: collision with root package name */
    public e f4993b;

    /* renamed from: c  reason: collision with root package name */
    public s4.a f4994c;

    /* renamed from: d  reason: collision with root package name */
    public Class<?> f4995d;

    /* renamed from: e  reason: collision with root package name */
    public String f4996e;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof GlideException) {
            for (Throwable a10 : ((GlideException) th2).f4992a) {
                a(a10, arrayList);
            }
            return;
        }
        arrayList.add(th2);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append((CharSequence) "Cause (");
            int i11 = i10 + 1;
            aVar.append((CharSequence) String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).e(aVar);
            } else {
                d(th2, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void e(Appendable appendable) {
        d(this, appendable);
        b(this.f4992a, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f4996e);
        String str3 = "";
        if (this.f4995d != null) {
            StringBuilder q10 = android.support.v4.media.a.q(", ");
            q10.append(this.f4995d);
            str = q10.toString();
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f4994c != null) {
            StringBuilder q11 = android.support.v4.media.a.q(", ");
            q11.append(this.f4994c);
            str2 = q11.toString();
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f4993b != null) {
            StringBuilder q12 = android.support.v4.media.a.q(", ");
            q12.append(this.f4993b);
            str3 = q12.toString();
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append(10);
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void printStackTrace() {
        e(System.err);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f4996e = str;
        setStackTrace(f4991f);
        this.f4992a = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f4997a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4998b = true;

        public a(Appendable appendable) {
            this.f4997a = appendable;
        }

        public final Appendable append(char c10) {
            boolean z10 = false;
            if (this.f4998b) {
                this.f4998b = false;
                this.f4997a.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f4998b = z10;
            this.f4997a.append(c10);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = false;
            if (this.f4998b) {
                this.f4998b = false;
                this.f4997a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f4998b = z10;
            this.f4997a.append(charSequence, i10, i11);
            return this;
        }
    }
}

package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f20774a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20775b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f20776c;

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static abstract class b {
        public abstract b a(Object obj);
    }

    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final PrintStream f20777a;

        public c(PrintStream printStream) {
            this.f20777a = printStream;
        }

        public final b a(Object obj) {
            this.f20777a.print(obj);
            return this;
        }
    }

    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final PrintWriter f20778a;

        public d(PrintWriter printWriter) {
            this.f20778a = printWriter;
        }

        public final b a(Object obj) {
            this.f20778a.print(obj);
            return this;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(b bVar, Throwable th2, String str) {
        bVar.a(str).a(th2).a(10);
        for (StackTraceElement a10 : th2.getStackTrace()) {
            bVar.a("\t\tat ").a(a10).a(10);
        }
        if (th2.getCause() != null) {
            bVar.a("\tCaused by: ");
            a(bVar, th2.getCause(), "");
        }
    }

    public final void b(b bVar) {
        bVar.a(this).a("\n");
        for (StackTraceElement a10 : getStackTrace()) {
            bVar.a("\tat ").a(a10).a("\n");
        }
        int i10 = 1;
        for (Throwable a11 : this.f20774a) {
            bVar.a("  ComposedException ").a(Integer.valueOf(i10)).a(" :\n");
            a(bVar, a11, "\t");
            i10++;
        }
        bVar.a("\n");
    }

    public final synchronized Throwable getCause() {
        int i10;
        if (this.f20776c == null) {
            String property = System.getProperty("line.separator");
            if (this.f20774a.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Multiple exceptions (");
                sb2.append(this.f20774a.size());
                sb2.append(")");
                sb2.append(property);
                for (Throwable next : this.f20774a) {
                    int i11 = 0;
                    while (true) {
                        if (next == null) {
                            break;
                        }
                        for (int i12 = 0; i12 < i11; i12++) {
                            sb2.append("  ");
                        }
                        sb2.append("|-- ");
                        sb2.append(next.getClass().getCanonicalName());
                        sb2.append(": ");
                        String message = next.getMessage();
                        if (message == null || !message.contains(property)) {
                            sb2.append(message);
                            sb2.append(property);
                        } else {
                            sb2.append(property);
                            for (String str : message.split(property)) {
                                for (int i13 = 0; i13 < i11 + 2; i13++) {
                                    sb2.append("  ");
                                }
                                sb2.append(str);
                                sb2.append(property);
                            }
                        }
                        int i14 = 0;
                        while (true) {
                            i10 = i11 + 2;
                            if (i14 >= i10) {
                                break;
                            }
                            sb2.append("  ");
                            i14++;
                        }
                        StackTraceElement[] stackTrace = next.getStackTrace();
                        if (stackTrace.length > 0) {
                            sb2.append("at ");
                            sb2.append(stackTrace[0]);
                            sb2.append(property);
                        }
                        if (!identityHashMap.containsKey(next)) {
                            identityHashMap.put(next, Boolean.TRUE);
                            next = next.getCause();
                            i11++;
                        } else {
                            Throwable cause = next.getCause();
                            if (cause != null) {
                                for (int i15 = 0; i15 < i10; i15++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append("(cause not expanded again) ");
                                sb2.append(cause.getClass().getCanonicalName());
                                sb2.append(": ");
                                sb2.append(cause.getMessage());
                                sb2.append(property);
                            }
                        }
                    }
                }
                this.f20776c = new a(sb2.toString().trim());
            } else {
                this.f20776c = this.f20774a.get(0);
            }
        }
        return this.f20776c;
    }

    public final String getMessage() {
        return this.f20775b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).f20774a);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f20774a = unmodifiableList;
            this.f20775b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}

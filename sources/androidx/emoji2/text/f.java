package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import l2.e;
import n1.f;

/* compiled from: EmojiProcessor */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final d.i f2399a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2400b;

    /* renamed from: c  reason: collision with root package name */
    public d.C0022d f2401c;

    /* compiled from: EmojiProcessor */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2402a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final h.a f2403b;

        /* renamed from: c  reason: collision with root package name */
        public h.a f2404c;

        /* renamed from: d  reason: collision with root package name */
        public h.a f2405d;

        /* renamed from: e  reason: collision with root package name */
        public int f2406e;

        /* renamed from: f  reason: collision with root package name */
        public int f2407f;

        public a(h.a aVar) {
            this.f2403b = aVar;
            this.f2404c = aVar;
        }

        public final int a(int i10) {
            h.a aVar;
            boolean z10;
            SparseArray<h.a> sparseArray = this.f2404c.f2421a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 3;
            if (this.f2402a != 2) {
                if (aVar == null) {
                    b();
                    i11 = 1;
                    this.f2406e = i10;
                    return i11;
                }
                this.f2402a = 2;
                this.f2404c = aVar;
                this.f2407f = 1;
            } else if (aVar != null) {
                this.f2404c = aVar;
                this.f2407f++;
            } else {
                boolean z11 = false;
                if (i10 == 65038) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b();
                } else {
                    if (i10 == 65039) {
                        z11 = true;
                    }
                    if (!z11) {
                        h.a aVar2 = this.f2404c;
                        if (aVar2.f2422b != null) {
                            if (this.f2407f != 1) {
                                this.f2405d = aVar2;
                                b();
                            } else if (c()) {
                                this.f2405d = this.f2404c;
                                b();
                            } else {
                                b();
                            }
                            this.f2406e = i10;
                            return i11;
                        }
                        b();
                    }
                }
                i11 = 1;
                this.f2406e = i10;
                return i11;
            }
            i11 = 2;
            this.f2406e = i10;
            return i11;
        }

        public final void b() {
            this.f2402a = 1;
            this.f2404c = this.f2403b;
            this.f2407f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            m2.a c10 = this.f2404c.f2422b.c();
            int a10 = c10.a(6);
            if (a10 == 0 || c10.f13087b.get(a10 + c10.f13086a) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
            if (this.f2406e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
            return false;
        }
    }

    public f(h hVar, d.i iVar, b bVar) {
        this.f2399a = iVar;
        this.f2400b = hVar;
        this.f2401c = bVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        e[] eVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (eVarArr = (e[]) editable.getSpans(selectionStart, selectionEnd, e.class)) != null && eVarArr.length > 0) {
            int length = eVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                e eVar = eVarArr[i10];
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((!z10 || spanStart != selectionStart) && ((z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, l2.d dVar) {
        int i12;
        if (dVar.f12637c == 0) {
            d.C0022d dVar2 = this.f2401c;
            m2.a c10 = dVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                c10.f13087b.getShort(a10 + c10.f13086a);
            }
            b bVar = (b) dVar2;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = b.f2376b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = bVar.f2377a;
            String sb3 = sb2.toString();
            int i13 = n1.f.f13431a;
            if (f.a.a(textPaint, sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            dVar.f12637c = i12;
        }
        if (dVar.f12637c == 2) {
            return true;
        }
        return false;
    }
}

package w1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import x1.f;
import x1.g;
import x1.j;

/* compiled from: AccessibilityDelegateCompat */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f16279c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f16280a;

    /* renamed from: b  reason: collision with root package name */
    public final C0209a f16281b;

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class C0209a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f16282a;

        public C0209a(a aVar) {
            this.f16282a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f16282a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            g b10 = this.f16282a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f16882a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16282a.c(view, accessibilityEvent);
        }

        /* JADX WARNING: type inference failed for: r1v19, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onInitializeAccessibilityNodeInfo(android.view.View r18, android.view.accessibility.AccessibilityNodeInfo r19) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                x1.f r3 = new x1.f
                r3.<init>(r1)
                java.util.WeakHashMap<android.view.View, w1.q0> r4 = w1.d0.f16298a
                int r4 = androidx.core.R$id.tag_screen_reader_focusable
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 28
                r7 = 1
                r8 = 0
                if (r5 < r6) goto L_0x0019
                r5 = r7
                goto L_0x001a
            L_0x0019:
                r5 = r8
            L_0x001a:
                r9 = 0
                if (r5 == 0) goto L_0x0026
                boolean r4 = w1.d0.m.d(r18)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                goto L_0x0032
            L_0x0026:
                java.lang.Object r4 = r0.getTag(r4)
                boolean r5 = r2.isInstance(r4)
                if (r5 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r4 = r9
            L_0x0032:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                if (r4 == 0) goto L_0x003e
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x003e
                r4 = r7
                goto L_0x003f
            L_0x003e:
                r4 = r8
            L_0x003f:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r6) goto L_0x0047
                r1.setScreenReaderFocusable(r4)
                goto L_0x004a
            L_0x0047:
                r3.h(r7, r4)
            L_0x004a:
                int r4 = androidx.core.R$id.tag_accessibility_heading
                int r10 = android.os.Build.VERSION.SDK_INT
                if (r10 < r6) goto L_0x0052
                r10 = r7
                goto L_0x0053
            L_0x0052:
                r10 = r8
            L_0x0053:
                if (r10 == 0) goto L_0x005e
                boolean r2 = w1.d0.m.c(r18)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x006b
            L_0x005e:
                java.lang.Object r4 = r0.getTag(r4)
                boolean r2 = r2.isInstance(r4)
                if (r2 == 0) goto L_0x006a
                r2 = r4
                goto L_0x006b
            L_0x006a:
                r2 = r9
            L_0x006b:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0077
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0077
                r2 = r7
                goto L_0x0078
            L_0x0077:
                r2 = r8
            L_0x0078:
                if (r5 < r6) goto L_0x007e
                r1.setHeading(r2)
                goto L_0x0082
            L_0x007e:
                r4 = 2
                r3.h(r4, r2)
            L_0x0082:
                java.lang.CharSequence r2 = w1.d0.e(r18)
                if (r5 < r6) goto L_0x008c
                r1.setPaneTitle(r2)
                goto L_0x0095
            L_0x008c:
                android.os.Bundle r4 = x1.f.b.c(r19)
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r4.putCharSequence(r6, r2)
            L_0x0095:
                int r2 = androidx.core.R$id.tag_state_description
                java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
                int r6 = android.os.Build.VERSION.SDK_INT
                r10 = 30
                if (r6 < r10) goto L_0x00a0
                goto L_0x00a1
            L_0x00a0:
                r7 = r8
            L_0x00a1:
                if (r7 == 0) goto L_0x00a8
                java.lang.CharSequence r2 = w1.d0.o.b(r18)
                goto L_0x00b4
            L_0x00a8:
                java.lang.Object r2 = r0.getTag(r2)
                boolean r4 = r4.isInstance(r2)
                if (r4 == 0) goto L_0x00b3
                goto L_0x00b4
            L_0x00b3:
                r2 = r9
            L_0x00b4:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r5 < r10) goto L_0x00bc
                x1.f.c.c(r1, r2)
                goto L_0x00c5
            L_0x00bc:
                android.os.Bundle r4 = x1.f.b.c(r19)
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
                r4.putCharSequence(r6, r2)
            L_0x00c5:
                r2 = r17
                w1.a r4 = r2.f16282a
                r4.d(r0, r3)
                java.lang.CharSequence r4 = r19.getText()
                r6 = 26
                if (r5 >= r6) goto L_0x01eb
                android.os.Bundle r5 = x1.f.b.c(r19)
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
                r5.remove(r6)
                android.os.Bundle r5 = x1.f.b.c(r19)
                java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
                r5.remove(r7)
                android.os.Bundle r5 = x1.f.b.c(r19)
                java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
                r5.remove(r10)
                android.os.Bundle r1 = x1.f.b.c(r19)
                java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
                r1.remove(r5)
                int r1 = androidx.core.R$id.tag_accessibility_clickable_spans
                java.lang.Object r1 = r0.getTag(r1)
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                if (r1 == 0) goto L_0x013b
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r12 = r8
            L_0x0108:
                int r13 = r1.size()
                if (r12 >= r13) goto L_0x0124
                java.lang.Object r13 = r1.valueAt(r12)
                java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
                java.lang.Object r13 = r13.get()
                if (r13 != 0) goto L_0x0121
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r11.add(r13)
            L_0x0121:
                int r12 = r12 + 1
                goto L_0x0108
            L_0x0124:
                r12 = r8
            L_0x0125:
                int r13 = r11.size()
                if (r12 >= r13) goto L_0x013b
                java.lang.Object r13 = r11.get(r12)
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                r1.remove(r13)
                int r12 = r12 + 1
                goto L_0x0125
            L_0x013b:
                boolean r1 = r4 instanceof android.text.Spanned
                if (r1 == 0) goto L_0x014f
                r1 = r4
                android.text.Spanned r1 = (android.text.Spanned) r1
                int r9 = r4.length()
                java.lang.Class<android.text.style.ClickableSpan> r11 = android.text.style.ClickableSpan.class
                java.lang.Object[] r1 = r1.getSpans(r8, r9, r11)
                r9 = r1
                android.text.style.ClickableSpan[] r9 = (android.text.style.ClickableSpan[]) r9
            L_0x014f:
                if (r9 == 0) goto L_0x01eb
                int r1 = r9.length
                if (r1 <= 0) goto L_0x01eb
                android.view.accessibility.AccessibilityNodeInfo r1 = r3.f16862a
                android.os.Bundle r1 = x1.f.b.c(r1)
                int r11 = androidx.core.R$id.accessibility_action_clickable_span
                java.lang.String r12 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
                r1.putInt(r12, r11)
                int r1 = androidx.core.R$id.tag_accessibility_clickable_spans
                java.lang.Object r11 = r0.getTag(r1)
                android.util.SparseArray r11 = (android.util.SparseArray) r11
                if (r11 != 0) goto L_0x0173
                android.util.SparseArray r11 = new android.util.SparseArray
                r11.<init>()
                r0.setTag(r1, r11)
            L_0x0173:
                r1 = r8
            L_0x0174:
                int r12 = r9.length
                if (r1 >= r12) goto L_0x01eb
                r12 = r9[r1]
                r13 = r8
            L_0x017a:
                int r14 = r11.size()
                if (r13 >= r14) goto L_0x019a
                java.lang.Object r14 = r11.valueAt(r13)
                java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
                java.lang.Object r14 = r14.get()
                android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x0197
                int r12 = r11.keyAt(r13)
                goto L_0x01a0
            L_0x0197:
                int r13 = r13 + 1
                goto L_0x017a
            L_0x019a:
                int r12 = x1.f.f16861d
                int r13 = r12 + 1
                x1.f.f16861d = r13
            L_0x01a0:
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r14 = r9[r1]
                r13.<init>(r14)
                r11.put(r12, r13)
                r13 = r9[r1]
                r14 = r4
                android.text.Spanned r14 = (android.text.Spanned) r14
                java.util.ArrayList r15 = r3.c(r6)
                int r16 = r14.getSpanStart(r13)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
                r15.add(r8)
                java.util.ArrayList r8 = r3.c(r7)
                int r15 = r14.getSpanEnd(r13)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r8.add(r15)
                java.util.ArrayList r8 = r3.c(r10)
                int r13 = r14.getSpanFlags(r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r8.add(r13)
                java.util.ArrayList r8 = r3.c(r5)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r8.add(r12)
                int r1 = r1 + 1
                r8 = 0
                goto L_0x0174
            L_0x01eb:
                int r1 = androidx.core.R$id.tag_accessibility_actions
                java.lang.Object r0 = r0.getTag(r1)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x01f9
                java.util.List r0 = java.util.Collections.emptyList()
            L_0x01f9:
                r8 = 0
            L_0x01fa:
                int r1 = r0.size()
                if (r8 >= r1) goto L_0x020c
                java.lang.Object r1 = r0.get(r8)
                x1.f$a r1 = (x1.f.a) r1
                r3.b(r1)
                int r8 = r8 + 1
                goto L_0x01fa
            L_0x020c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.a.C0209a.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16282a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f16282a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f16282a.g(view, i10, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i10) {
            this.f16282a.h(view, i10);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f16282a.i(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f16279c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16280a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public g b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f16280a, view);
        if (a10 != null) {
            return new g(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f16280a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, f fVar) {
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f16280a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16280a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R$id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            f.a aVar = (f.a) list.get(i11);
            if (aVar.a() != i10) {
                i11++;
            } else if (aVar.f16879d != null) {
                Class<? extends j.a> cls = aVar.f16878c;
                if (cls != null) {
                    try {
                        ((j.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                    } catch (Exception unused) {
                    }
                }
                z10 = aVar.f16879d.a(view);
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f16280a, view, i10, bundle);
        }
        if (z10 || i10 != R$id.accessibility_action_clickable_span || bundle == null) {
            return z10;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i12)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i13])) {
                        z11 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            z11 = false;
            if (z11) {
                clickableSpan.onClick(view);
                z12 = true;
            }
        }
        return z12;
    }

    public void h(View view, int i10) {
        this.f16280a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f16280a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f16280a = accessibilityDelegate;
        this.f16281b = new C0209a(this);
    }
}

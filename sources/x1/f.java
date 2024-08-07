package x1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x1.j;

/* compiled from: AccessibilityNodeInfoCompat */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static int f16861d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f16862a;

    /* renamed from: b  reason: collision with root package name */
    public int f16863b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f16864c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f16865e = new a(1);

        /* renamed from: f  reason: collision with root package name */
        public static final a f16866f = new a(2);

        /* renamed from: g  reason: collision with root package name */
        public static final a f16867g = new a(16);

        /* renamed from: h  reason: collision with root package name */
        public static final a f16868h = new a(4096);

        /* renamed from: i  reason: collision with root package name */
        public static final a f16869i = new a(8192);

        /* renamed from: j  reason: collision with root package name */
        public static final a f16870j = new a(262144);

        /* renamed from: k  reason: collision with root package name */
        public static final a f16871k = new a(524288);

        /* renamed from: l  reason: collision with root package name */
        public static final a f16872l = new a(1048576);

        /* renamed from: m  reason: collision with root package name */
        public static final a f16873m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (j) null, (Class) null);

        /* renamed from: n  reason: collision with root package name */
        public static final a f16874n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (j) null, (Class) null);

        /* renamed from: o  reason: collision with root package name */
        public static final a f16875o;

        /* renamed from: a  reason: collision with root package name */
        public final Object f16876a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16877b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends j.a> f16878c;

        /* renamed from: d  reason: collision with root package name */
        public final j f16879d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            Class<j.c> cls = j.c.class;
            Class<j.b> cls2 = j.b.class;
            new a(4);
            new a(8);
            new a(32);
            new a(64);
            new a(128);
            new a(256, cls2);
            new a(512, cls2);
            new a(1024, cls);
            new a(2048, cls);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, j.g.class);
            new a(2097152, j.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (j) null, j.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (j) null, (Class) null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
            if (i10 >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, 16908358, (String) null, (j) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, 16908359, (String) null, (j) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, 16908360, (String) null, (j) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, 16908361, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (j) null, (Class) null);
            if (i10 >= 24) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction5 = null;
            }
            f16875o = new a(accessibilityAction5, 16908349, (String) null, (j) null, j.f.class);
            if (i10 >= 26) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, 16908354, (String) null, (j) null, j.d.class);
            if (i10 >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, 16908356, (String) null, (j) null, (Class) null);
            if (i10 >= 28) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, 16908357, (String) null, (j) null, (Class) null);
            if (i10 >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, 16908362, (String) null, (j) null, (Class) null);
            if (i10 >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction10 = null;
            }
            new a(accessibilityAction10, 16908372, (String) null, (j) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, 16908373, (String) null, (j) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, 16908374, (String) null, (j) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction13 = null;
            }
            new a(accessibilityAction13, 16908375, (String) null, (j) null, (Class) null);
            if (i10 >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            } else {
                accessibilityAction14 = null;
            }
            new a(accessibilityAction14, 16908376, (String) null, (j) null, (Class) null);
            if (i10 >= 34) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            }
            new a(accessibilityAction15, 16908382, (String) null, (j) null, (Class) null);
        }

        public a(int i10) {
            this((Object) null, i10, (String) null, (j) null, (Class) null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f16876a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f16876a;
            if (obj2 == null) {
                if (aVar.f16876a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f16876a)) {
                return false;
            } else {
                return true;
            }
        }

        public final int hashCode() {
            Object obj = this.f16876a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("AccessibilityActionCompat: ");
            String d10 = f.d(this.f16877b);
            if (d10.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) this.f16876a).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) this.f16876a).getLabel().toString();
            }
            q10.append(d10);
            return q10.toString();
        }

        public a(int i10, Class cls) {
            this((Object) null, i10, (String) null, (j) null, cls);
        }

        public a(Object obj, int i10, String str, j jVar, Class cls) {
            this.f16877b = i10;
            this.f16879d = jVar;
            if (obj == null) {
                this.f16876a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
            } else {
                this.f16876a = obj;
            }
            this.f16878c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {
        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static Object b(int i10, float f10, float f11, float f12) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
        }

        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class d {
        public static g a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static f b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return f.o(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static f f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return f.o(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class e {
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j10)));
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    /* renamed from: x1.f$f  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0220f {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16880a;

        public C0220f(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f16880a = collectionInfo;
        }

        public static C0220f a(int i10, int i11, int i12) {
            return new C0220f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16881a;

        public g(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f16881a = collectionItemInfo;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    @Deprecated
    public f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        this.f16862a = accessibilityNodeInfo;
    }

    public static String d(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static f o(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            return new f(accessibilityNodeInfo, 0);
        }
        return null;
    }

    public final void a(int i10) {
        this.f16862a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f16862a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f16876a);
    }

    public final ArrayList c(String str) {
        ArrayList<Integer> integerArrayList = b.c(this.f16862a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.c(this.f16862a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i10) {
        Bundle c10 = b.c(this.f16862a);
        if (c10 != null && (c10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f16862a;
        if (accessibilityNodeInfo == null) {
            if (fVar.f16862a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(fVar.f16862a)) {
            return false;
        }
        if (this.f16864c == fVar.f16864c && this.f16863b == fVar.f16863b) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final void f(Rect rect) {
        this.f16862a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        if (!(!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f16862a.getText();
        }
        ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f16862a.getText(), 0, this.f16862a.getText().length()));
        for (int i10 = 0; i10 < c10.size(); i10++) {
            spannableString.setSpan(new a(((Integer) c13.get(i10)).intValue(), this, b.c(this.f16862a).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
        }
        return spannableString;
    }

    public final void h(int i10, boolean z10) {
        Bundle c10 = b.c(this.f16862a);
        if (c10 != null) {
            int i11 = c10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            c10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f16862a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f16862a.setClassName(charSequence);
    }

    public final void j(g gVar) {
        this.f16862a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) gVar.f16881a);
    }

    public final void k(CharSequence charSequence) {
        this.f16862a.setContentDescription(charSequence);
    }

    public final void l(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16862a.setHintText(str);
        } else {
            b.c(this.f16862a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void m(boolean z10) {
        this.f16862a.setScrollable(z10);
    }

    public final void n(CharSequence charSequence) {
        this.f16862a.setText(charSequence);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f16862a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            e.a(this.f16862a, rect);
        } else {
            Rect rect2 = (Rect) b.c(this.f16862a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f16862a.getPackageName());
        sb2.append("; className: ");
        sb2.append(this.f16862a.getClassName());
        sb2.append("; text: ");
        sb2.append(g());
        sb2.append("; error: ");
        sb2.append(this.f16862a.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(this.f16862a.getMaxTextLength());
        sb2.append("; stateDescription: ");
        if (i10 >= 30) {
            charSequence = c.b(this.f16862a);
        } else {
            charSequence = b.c(this.f16862a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb2.append(charSequence);
        sb2.append("; contentDescription: ");
        sb2.append(this.f16862a.getContentDescription());
        sb2.append("; tooltipText: ");
        if (i10 >= 28) {
            charSequence2 = this.f16862a.getTooltipText();
        } else {
            charSequence2 = b.c(this.f16862a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb2.append(charSequence2);
        sb2.append("; viewIdResName: ");
        sb2.append(this.f16862a.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (i10 >= 33) {
            str = d.g(this.f16862a);
        } else {
            str = b.c(this.f16862a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(str);
        sb2.append("; checkable: ");
        sb2.append(this.f16862a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f16862a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f16862a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f16862a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f16862a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f16862a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f16862a.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(this.f16862a.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(this.f16862a.isEnabled());
        sb2.append("; password: ");
        sb2.append(this.f16862a.isPassword());
        sb2.append("; scrollable: " + this.f16862a.isScrollable());
        sb2.append("; containerTitle: ");
        if (i10 >= 34) {
            charSequence3 = e.b(this.f16862a);
        } else {
            charSequence3 = b.c(this.f16862a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb2.append(charSequence3);
        sb2.append("; granularScrollingSupported: ");
        sb2.append(e(67108864));
        sb2.append("; importantForAccessibility: ");
        if (i10 >= 24) {
            z10 = this.f16862a.isImportantForAccessibility();
        } else {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append("; visible: ");
        sb2.append(this.f16862a.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        if (i10 >= 33) {
            z11 = d.h(this.f16862a);
        } else {
            z11 = e(8388608);
        }
        sb2.append(z11);
        sb2.append("; accessibilityDataSensitive: ");
        if (i10 >= 34) {
            z12 = e.e(this.f16862a);
        } else {
            z12 = e(64);
        }
        sb2.append(z12);
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f16862a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(new a(actionList.get(i11), 0, (String) null, (j) null, (Class) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar = (a) arrayList.get(i12);
            String d10 = d(aVar.a());
            if (d10.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f16876a).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f16876a).getLabel().toString();
            }
            sb2.append(d10);
            if (i12 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f16862a = accessibilityNodeInfo;
    }
}

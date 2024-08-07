package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: CascadingMenuPopup */
public final class b extends m.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int I = R$layout.abc_cascading_menu_item_layout;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public j.a E;
    public ViewTreeObserver F;
    public PopupWindow.OnDismissListener G;
    public boolean H;

    /* renamed from: b  reason: collision with root package name */
    public final Context f571b;

    /* renamed from: c  reason: collision with root package name */
    public final int f572c;

    /* renamed from: d  reason: collision with root package name */
    public final int f573d;

    /* renamed from: e  reason: collision with root package name */
    public final int f574e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f575f;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f576n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f577o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f578p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final a f579q = new a();

    /* renamed from: r  reason: collision with root package name */
    public final C0010b f580r = new C0010b();

    /* renamed from: s  reason: collision with root package name */
    public final c f581s = new c();

    /* renamed from: t  reason: collision with root package name */
    public int f582t;

    /* renamed from: u  reason: collision with root package name */
    public int f583u;

    /* renamed from: v  reason: collision with root package name */
    public View f584v;

    /* renamed from: w  reason: collision with root package name */
    public View f585w;

    /* renamed from: x  reason: collision with root package name */
    public int f586x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f587y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f588z;

    /* compiled from: CascadingMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (b.this.a() && b.this.f578p.size() > 0 && !((d) b.this.f578p.get(0)).f592a.F) {
                View view = b.this.f585w;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                Iterator it = b.this.f578p.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f592a.b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    public class C0010b implements View.OnAttachStateChangeListener {
        public C0010b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.F = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.F.removeGlobalOnLayoutListener(bVar.f579q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class c implements c0 {
        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(androidx.appcompat.view.menu.f r6, androidx.appcompat.view.menu.h r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r0 = r0.f576n
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f578p
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r4 = r4.f578p
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
                androidx.appcompat.view.menu.f r4 = r4.f593b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f578p
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f578p
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            L_0x0041:
                androidx.appcompat.view.menu.c r0 = new androidx.appcompat.view.menu.c
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.b.this
                android.os.Handler r7 = r7.f576n
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.d(androidx.appcompat.view.menu.f, androidx.appcompat.view.menu.h):void");
        }

        public final void g(f fVar, MenuItem menuItem) {
            b.this.f576n.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f592a;

        /* renamed from: b  reason: collision with root package name */
        public final f f593b;

        /* renamed from: c  reason: collision with root package name */
        public final int f594c;

        public d(MenuPopupWindow menuPopupWindow, f fVar, int i10) {
            this.f592a = menuPopupWindow;
            this.f593b = fVar;
            this.f594c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f582t = 0;
        this.f583u = 0;
        this.f571b = context;
        this.f584v = view;
        this.f573d = i10;
        this.f574e = i11;
        this.f575f = z10;
        this.C = false;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        this.f586x = d0.e.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f572c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f576n = new Handler();
    }

    public final boolean a() {
        if (this.f578p.size() <= 0 || !((d) this.f578p.get(0)).f592a.a()) {
            return false;
        }
        return true;
    }

    public final void b() {
        boolean z10;
        if (!a()) {
            Iterator it = this.f577o.iterator();
            while (it.hasNext()) {
                x((f) it.next());
            }
            this.f577o.clear();
            View view = this.f584v;
            this.f585w = view;
            if (view != null) {
                if (this.F == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.F = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f579q);
                }
                this.f585w.addOnAttachStateChangeListener(this.f580r);
            }
        }
    }

    public final void c(f fVar, boolean z10) {
        int i10;
        int size = this.f578p.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (fVar == ((d) this.f578p.get(i11)).f593b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int i12 = i11 + 1;
            if (i12 < this.f578p.size()) {
                ((d) this.f578p.get(i12)).f593b.c(false);
            }
            d dVar = (d) this.f578p.remove(i11);
            dVar.f593b.r(this);
            if (this.H) {
                MenuPopupWindow.a.b(dVar.f592a.G, (Transition) null);
                dVar.f592a.G.setAnimationStyle(0);
            }
            dVar.f592a.dismiss();
            int size2 = this.f578p.size();
            if (size2 > 0) {
                this.f586x = ((d) this.f578p.get(size2 - 1)).f594c;
            } else {
                View view = this.f584v;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (d0.e.d(view) == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.f586x = i10;
            }
            if (size2 == 0) {
                dismiss();
                j.a aVar = this.E;
                if (aVar != null) {
                    aVar.c(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.F;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.F.removeGlobalOnLayoutListener(this.f579q);
                    }
                    this.F = null;
                }
                this.f585w.removeOnAttachStateChangeListener(this.f580r);
                this.G.onDismiss();
            } else if (z10) {
                ((d) this.f578p.get(0)).f593b.c(false);
            }
        }
    }

    public final void d(boolean z10) {
        Iterator it = this.f578p.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f592a.f894c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        int size = this.f578p.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f578p.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f592a.a()) {
                        dVar.f592a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.E = aVar;
    }

    public final void i(Parcelable parcelable) {
    }

    public final y j() {
        if (this.f578p.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f578p;
        return ((d) arrayList.get(arrayList.size() - 1)).f592a.f894c;
    }

    public final boolean k(m mVar) {
        Iterator it = this.f578p.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f593b) {
                dVar.f592a.f894c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.E;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    public final Parcelable l() {
        return null;
    }

    public final void n(f fVar) {
        fVar.b(this, this.f571b);
        if (a()) {
            x(fVar);
        } else {
            this.f577o.add(fVar);
        }
    }

    public final void onDismiss() {
        d dVar;
        int size = this.f578p.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f578p.get(i10);
            if (!dVar.f592a.a()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f593b.c(false);
        }
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(View view) {
        if (this.f584v != view) {
            this.f584v = view;
            int i10 = this.f582t;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            this.f583u = Gravity.getAbsoluteGravity(i10, d0.e.d(view));
        }
    }

    public final void q(boolean z10) {
        this.C = z10;
    }

    public final void r(int i10) {
        if (this.f582t != i10) {
            this.f582t = i10;
            View view = this.f584v;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            this.f583u = Gravity.getAbsoluteGravity(i10, d0.e.d(view));
        }
    }

    public final void s(int i10) {
        this.f587y = true;
        this.A = i10;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    public final void u(boolean z10) {
        this.D = z10;
    }

    public final void v(int i10) {
        this.f588z = true;
        this.B = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0141, code lost:
        if ((r11[0] - r4) < 0) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0145, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(androidx.appcompat.view.menu.f r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f571b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r3 = new androidx.appcompat.view.menu.e
            boolean r4 = r0.f575f
            int r5 = I
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.a()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.C
            if (r4 == 0) goto L_0x0021
            r3.f610c = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.a()
            if (r4 == 0) goto L_0x002d
            boolean r4 = m.d.w(r17)
            r3.f610c = r4
        L_0x002d:
            android.content.Context r4 = r0.f571b
            int r6 = r0.f572c
            int r4 = m.d.o(r3, r4, r6)
            androidx.appcompat.widget.MenuPopupWindow r6 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r7 = r0.f571b
            int r8 = r0.f573d
            int r9 = r0.f574e
            r6.<init>(r7, r8, r9)
            androidx.appcompat.view.menu.b$c r7 = r0.f581s
            r6.K = r7
            r6.f907w = r0
            android.widget.PopupWindow r7 = r6.G
            r7.setOnDismissListener(r0)
            android.view.View r7 = r0.f584v
            r6.f906v = r7
            int r7 = r0.f583u
            r6.f903s = r7
            r6.F = r5
            android.widget.PopupWindow r7 = r6.G
            r7.setFocusable(r5)
            android.widget.PopupWindow r7 = r6.G
            r8 = 2
            r7.setInputMethodMode(r8)
            r6.p(r3)
            r6.r(r4)
            int r3 = r0.f583u
            r6.f903s = r3
            java.util.ArrayList r3 = r0.f578p
            int r3 = r3.size()
            r7 = 0
            if (r3 <= 0) goto L_0x00e7
            java.util.ArrayList r3 = r0.f578p
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.b.d) r3
            androidx.appcompat.view.menu.f r10 = r3.f593b
            int r11 = r10.size()
            r12 = r7
        L_0x0087:
            if (r12 >= r11) goto L_0x009d
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x009a
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            int r12 = r12 + 1
            goto L_0x0087
        L_0x009d:
            r13 = 0
        L_0x009e:
            if (r13 != 0) goto L_0x00a1
            goto L_0x00e8
        L_0x00a1:
            androidx.appcompat.widget.MenuPopupWindow r10 = r3.f592a
            androidx.appcompat.widget.y r10 = r10.f894c
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00ba
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.e) r11
            goto L_0x00bd
        L_0x00ba:
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.e) r11
            r12 = r7
        L_0x00bd:
            int r14 = r11.getCount()
            r15 = r7
        L_0x00c2:
            r8 = -1
            if (r15 >= r14) goto L_0x00cf
            androidx.appcompat.view.menu.h r9 = r11.getItem(r15)
            if (r13 != r9) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            int r15 = r15 + 1
            goto L_0x00c2
        L_0x00cf:
            r15 = r8
        L_0x00d0:
            if (r15 != r8) goto L_0x00d3
            goto L_0x00e8
        L_0x00d3:
            int r15 = r15 + r12
            int r8 = r10.getFirstVisiblePosition()
            int r15 = r15 - r8
            if (r15 < 0) goto L_0x00e8
            int r8 = r10.getChildCount()
            if (r15 < r8) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            android.view.View r8 = r10.getChildAt(r15)
            goto L_0x00e9
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            r8 = 0
        L_0x00e9:
            if (r8 == 0) goto L_0x01ab
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0101
            java.lang.reflect.Method r9 = androidx.appcompat.widget.MenuPopupWindow.L
            if (r9 == 0) goto L_0x0106
            android.widget.PopupWindow r10 = r6.G     // Catch:{ Exception -> 0x0106 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0106 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0106 }
            r11[r7] = r12     // Catch:{ Exception -> 0x0106 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0106
        L_0x0101:
            android.widget.PopupWindow r9 = r6.G
            androidx.appcompat.widget.MenuPopupWindow.b.a(r9, r7)
        L_0x0106:
            android.widget.PopupWindow r9 = r6.G
            r10 = 0
            androidx.appcompat.widget.MenuPopupWindow.a.a(r9, r10)
            java.util.ArrayList r9 = r0.f578p
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.b.d) r9
            androidx.appcompat.widget.MenuPopupWindow r9 = r9.f592a
            androidx.appcompat.widget.y r9 = r9.f894c
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f585w
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f586x
            if (r12 != r5) goto L_0x013e
            r11 = r11[r7]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x0143
            goto L_0x0145
        L_0x013e:
            r9 = r11[r7]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0145
        L_0x0143:
            r9 = r5
            goto L_0x0146
        L_0x0145:
            r9 = r7
        L_0x0146:
            if (r9 != r5) goto L_0x014a
            r10 = r5
            goto L_0x014b
        L_0x014a:
            r10 = r7
        L_0x014b:
            r0.f586x = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0159
            r6.f906v = r8
            r9 = r7
            r13 = r9
            goto L_0x018a
        L_0x0159:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.f584v
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r8.getLocationOnScreen(r9)
            int r13 = r0.f583u
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0180
            r13 = r11[r7]
            android.view.View r14 = r0.f584v
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r7] = r14
            r13 = r9[r7]
            int r14 = r8.getWidth()
            int r14 = r14 + r13
            r9[r7] = r14
        L_0x0180:
            r13 = r9[r7]
            r14 = r11[r7]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x018a:
            int r11 = r0.f583u
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0198
            if (r10 == 0) goto L_0x0193
            int r13 = r13 + r4
            goto L_0x01a1
        L_0x0193:
            int r4 = r8.getWidth()
            goto L_0x01a0
        L_0x0198:
            if (r10 == 0) goto L_0x01a0
            int r4 = r8.getWidth()
            int r13 = r13 + r4
            goto L_0x01a1
        L_0x01a0:
            int r13 = r13 - r4
        L_0x01a1:
            r6.f897f = r13
            r6.f902r = r5
            r6.f901q = r5
            r6.l(r9)
            goto L_0x01c9
        L_0x01ab:
            boolean r4 = r0.f587y
            if (r4 == 0) goto L_0x01b3
            int r4 = r0.A
            r6.f897f = r4
        L_0x01b3:
            boolean r4 = r0.f588z
            if (r4 == 0) goto L_0x01bc
            int r4 = r0.B
            r6.l(r4)
        L_0x01bc:
            android.graphics.Rect r4 = r0.f13033a
            if (r4 == 0) goto L_0x01c6
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01c7
        L_0x01c6:
            r10 = 0
        L_0x01c7:
            r6.E = r10
        L_0x01c9:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f586x
            r4.<init>(r6, r1, r5)
            java.util.ArrayList r5 = r0.f578p
            r5.add(r4)
            r6.b()
            androidx.appcompat.widget.y r4 = r6.f894c
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0207
            boolean r3 = r0.D
            if (r3 == 0) goto L_0x0207
            java.lang.CharSequence r3 = r1.f627m
            if (r3 == 0) goto L_0x0207
            int r3 = androidx.appcompat.R$layout.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r7)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f627m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r7)
            r6.b()
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.x(androidx.appcompat.view.menu.f):void");
    }
}

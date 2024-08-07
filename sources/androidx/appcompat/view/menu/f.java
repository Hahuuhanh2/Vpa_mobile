package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.h0;

/* compiled from: MenuBuilder */
public class f implements q1.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f614y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f615a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f616b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f617c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f618d;

    /* renamed from: e  reason: collision with root package name */
    public a f619e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<h> f620f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<h> f621g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f622h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<h> f623i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<h> f624j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f625k;

    /* renamed from: l  reason: collision with root package name */
    public int f626l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f627m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f628n;

    /* renamed from: o  reason: collision with root package name */
    public View f629o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f630p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f631q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f632r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f633s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<h> f634t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<j>> f635u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public h f636v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f637w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f638x;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f615a = context;
        Resources resources = context.getResources();
        this.f616b = resources;
        this.f620f = new ArrayList<>();
        this.f621g = new ArrayList<>();
        this.f622h = true;
        this.f623i = new ArrayList<>();
        this.f624j = new ArrayList<>();
        this.f625k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = h0.f16322a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = h0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f618d = z11;
    }

    public h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = (-65536 & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f614y;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f626l);
                ArrayList<h> arrayList = this.f620f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f645d <= i15) {
                            i13 = size + 1;
                            break;
                        }
                    } else {
                        i13 = 0;
                        break;
                    }
                }
                arrayList.add(i13, hVar);
                p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f615a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            androidx.appcompat.view.menu.h r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f648g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f635u.add(new WeakReference(jVar));
        jVar.h(context, this);
        this.f625k = true;
    }

    public final void c(boolean z10) {
        if (!this.f633s) {
            this.f633s = true;
            Iterator<WeakReference<j>> it = this.f635u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f635u.remove(next);
                } else {
                    jVar.c(this, z10);
                }
            }
            this.f633s = false;
        }
    }

    public final void clear() {
        h hVar = this.f636v;
        if (hVar != null) {
            d(hVar);
        }
        this.f620f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f628n = null;
        this.f627m = null;
        this.f629o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        boolean z10 = false;
        if (!this.f635u.isEmpty() && this.f636v == hVar) {
            y();
            Iterator<WeakReference<j>> it = this.f635u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f635u.remove(next);
                } else {
                    z10 = jVar.g(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            x();
            if (z10) {
                this.f636v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f619e;
        if (aVar == null || !aVar.a(fVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(h hVar) {
        boolean z10 = false;
        if (this.f635u.isEmpty()) {
            return false;
        }
        y();
        Iterator<WeakReference<j>> it = this.f635u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.f635u.remove(next);
            } else {
                z10 = jVar.m(hVar);
                if (z10) {
                    break;
                }
            }
        }
        x();
        if (z10) {
            this.f636v = hVar;
        }
        return z10;
    }

    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f620f.get(i11);
            if (hVar.f642a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f656o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<h> arrayList = this.f634t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (n10) {
                c10 = hVar.f651j;
            } else {
                c10 = hVar.f649h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == 8 && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i10) {
        return this.f620f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f620f.size();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = this.f620f.get(i12);
                if (hVar.hasSubMenu()) {
                    hVar.f656o.h(arrayList, i10, keyEvent);
                }
                if (n10) {
                    c10 = hVar.f651j;
                } else {
                    c10 = hVar.f649h;
                }
                if (n10) {
                    i11 = hVar.f652k;
                } else {
                    i11 = hVar.f650i;
                }
                if ((modifiers & 69647) == (i11 & 69647)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == 8 && i10 == 67)) && hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f638x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f620f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<h> l10 = l();
        if (this.f625k) {
            Iterator<WeakReference<j>> it = this.f635u.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f635u.remove(next);
                } else {
                    z11 |= jVar.e();
                }
            }
            if (z11) {
                this.f623i.clear();
                this.f624j.clear();
                int size = l10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = l10.get(i10);
                    if ((hVar.f665x & 32) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f623i.add(hVar);
                    } else {
                        this.f624j.add(hVar);
                    }
                }
            } else {
                this.f623i.clear();
                this.f624j.clear();
                this.f624j.addAll(l());
            }
            this.f625k = false;
        }
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        if (!this.f622h) {
            return this.f621g;
        }
        this.f621g.clear();
        int size = this.f620f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f620f.get(i10);
            if (hVar.isVisible()) {
                this.f621g.add(hVar);
            }
        }
        this.f622h = false;
        this.f625k = true;
        return this.f621g;
    }

    public boolean m() {
        return this.f637w;
    }

    public boolean n() {
        return this.f617c;
    }

    public boolean o() {
        return this.f618d;
    }

    public void p(boolean z10) {
        if (!this.f630p) {
            if (z10) {
                this.f622h = true;
                this.f625k = true;
            }
            if (!this.f635u.isEmpty()) {
                y();
                Iterator<WeakReference<j>> it = this.f635u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        this.f635u.remove(next);
                    } else {
                        jVar.d(z10);
                    }
                }
                x();
                return;
            }
            return;
        }
        this.f631q = true;
        if (z10) {
            this.f632r = true;
        }
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), (j) null, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        h g2 = g(i10, keyEvent);
        if (g2 != null) {
            z10 = q(g2, (j) null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L_0x00ca
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00ca
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f657p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0019:
            androidx.appcompat.view.menu.f r1 = r7.f655n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0038
        L_0x0022:
            android.content.Intent r1 = r7.f648g
            if (r1 == 0) goto L_0x002e
            androidx.appcompat.view.menu.f r3 = r7.f655n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f615a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0038
        L_0x002e:
            w1.b r1 = r7.A
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            r1 = r2
            goto L_0x003b
        L_0x003a:
            r1 = r0
        L_0x003b:
            w1.b r3 = r7.A
            if (r3 == 0) goto L_0x0047
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x0048
        L_0x0047:
            r4 = r0
        L_0x0048:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x005a
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c9
            r6.c(r2)
            goto L_0x00c9
        L_0x005a:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006b
            if (r4 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c9
            r6.c(r2)
            goto L_0x00c9
        L_0x006b:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0072
            r6.c(r0)
        L_0x0072:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0086
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f615a
            r9.<init>(r5, r6, r7)
            r7.f656o = r9
            java.lang.CharSequence r5 = r7.f646e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0086:
            androidx.appcompat.view.menu.m r7 = r7.f656o
            if (r4 == 0) goto L_0x008d
            r3.f(r7)
        L_0x008d:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f635u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0096
            goto L_0x00c3
        L_0x0096:
            if (r8 == 0) goto L_0x009c
            boolean r0 = r8.k(r7)
        L_0x009c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r8 = r6.f635u
            java.util.Iterator r8 = r8.iterator()
        L_0x00a2:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c3
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.j r3 = (androidx.appcompat.view.menu.j) r3
            if (r3 != 0) goto L_0x00bc
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r3 = r6.f635u
            r3.remove(r9)
            goto L_0x00a2
        L_0x00bc:
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r3.k(r7)
            goto L_0x00a2
        L_0x00c3:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c9
            r6.c(r2)
        L_0x00c9:
            return r1
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        Iterator<WeakReference<j>> it = this.f635u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f635u.remove(next);
            }
        }
    }

    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (this.f620f.get(i12).f643b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = this.f620f.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || this.f620f.get(i12).f643b != i10) {
                    p(true);
                } else {
                    if (i12 >= 0 && i12 < this.f620f.size()) {
                        this.f620f.remove(i12);
                    }
                    i11 = i13;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f620f.get(i11).f642a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0 && i11 < this.f620f.size()) {
            this.f620f.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).s(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f620f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f620f.get(i11);
            if (hVar.f643b == i10) {
                hVar.f(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f637w = z10;
    }

    public final void setGroupEnabled(int i10, boolean z10) {
        int size = this.f620f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f620f.get(i11);
            if (hVar.f643b == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        int size = this.f620f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = this.f620f.get(i12);
            if (hVar.f643b == i10) {
                int i13 = hVar.f665x;
                int i14 = i13 & -9;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                hVar.f665x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f617c = z10;
        p(false);
    }

    public final int size() {
        return this.f620f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f635u.isEmpty()) {
            Iterator<WeakReference<j>> it = this.f635u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f635u.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        jVar.i(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable l10;
        if (!this.f635u.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<j>> it = this.f635u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f635u.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (l10 = jVar.l()) != null) {
                        sparseArray.put(id2, l10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final void w(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f616b;
        if (view != null) {
            this.f629o = view;
            this.f627m = null;
            this.f628n = null;
        } else {
            if (i10 > 0) {
                this.f627m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f627m = charSequence;
            }
            if (i11 > 0) {
                this.f628n = k1.a.getDrawable(this.f615a, i11);
            } else if (drawable != null) {
                this.f628n = drawable;
            }
            this.f629o = null;
        }
        p(false);
    }

    public final void x() {
        this.f630p = false;
        if (this.f631q) {
            this.f631q = false;
            p(this.f632r);
        }
    }

    public final void y() {
        if (!this.f630p) {
            this.f630p = true;
            this.f631q = false;
            this.f632r = false;
        }
    }

    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f616b.getString(i10));
    }

    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f616b.getString(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f615a, this, a10);
        a10.f656o = mVar;
        mVar.setHeaderTitle(a10.f646e);
        return mVar;
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f616b.getString(i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f616b.getString(i13));
    }
}

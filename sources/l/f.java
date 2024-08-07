package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.x;
import f0.b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m.c;
import org.xmlpull.v1.XmlPullParserException;
import w1.j;

/* compiled from: SupportMenuInflater */
public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f12583e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f12584f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f12585a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f12586b;

    /* renamed from: c  reason: collision with root package name */
    public Context f12587c;

    /* renamed from: d  reason: collision with root package name */
    public Object f12588d;

    /* compiled from: SupportMenuInflater */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f12589c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f12590a;

        /* renamed from: b  reason: collision with root package name */
        public Method f12591b;

        public a(Object obj, String str) {
            this.f12590a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f12591b = cls.getMethod(str, f12589c);
            } catch (Exception e10) {
                StringBuilder w9 = b0.w("Couldn't resolve menu item onClick handler ", str, " in class ");
                w9.append(cls.getName());
                InflateException inflateException = new InflateException(w9.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f12591b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f12591b.invoke(this.f12590a, new Object[]{menuItem})).booleanValue();
                }
                this.f12591b.invoke(this.f12590a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f12592a;

        /* renamed from: b  reason: collision with root package name */
        public int f12593b;

        /* renamed from: c  reason: collision with root package name */
        public int f12594c;

        /* renamed from: d  reason: collision with root package name */
        public int f12595d;

        /* renamed from: e  reason: collision with root package name */
        public int f12596e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12597f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12598g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12599h;

        /* renamed from: i  reason: collision with root package name */
        public int f12600i;

        /* renamed from: j  reason: collision with root package name */
        public int f12601j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f12602k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f12603l;

        /* renamed from: m  reason: collision with root package name */
        public int f12604m;

        /* renamed from: n  reason: collision with root package name */
        public char f12605n;

        /* renamed from: o  reason: collision with root package name */
        public int f12606o;

        /* renamed from: p  reason: collision with root package name */
        public char f12607p;

        /* renamed from: q  reason: collision with root package name */
        public int f12608q;

        /* renamed from: r  reason: collision with root package name */
        public int f12609r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f12610s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f12611t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f12612u;

        /* renamed from: v  reason: collision with root package name */
        public int f12613v;

        /* renamed from: w  reason: collision with root package name */
        public int f12614w;

        /* renamed from: x  reason: collision with root package name */
        public String f12615x;

        /* renamed from: y  reason: collision with root package name */
        public String f12616y;

        /* renamed from: z  reason: collision with root package name */
        public w1.b f12617z;

        public b(Menu menu) {
            this.f12592a = menu;
            this.f12593b = 0;
            this.f12594c = 0;
            this.f12595d = 0;
            this.f12596e = 0;
            this.f12597f = true;
            this.f12598g = true;
        }

        public final void a(MenuItem menuItem) {
            boolean z10;
            Object obj;
            MenuItem enabled = menuItem.setChecked(this.f12610s).setVisible(this.f12611t).setEnabled(this.f12612u);
            boolean z11 = true;
            if (this.f12609r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f12603l).setIcon(this.f12604m);
            int i10 = this.f12613v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f12616y != null) {
                if (!f.this.f12587c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f12588d == null) {
                        fVar.f12588d = f.a(fVar.f12587c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f12588d, this.f12616y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f12609r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).f(true);
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f13024e == null) {
                            cVar.f13024e = cVar.f13023d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f13024e.invoke(cVar.f13023d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f12615x;
            if (str != null) {
                Class<?>[] clsArr = f.f12583e;
                f fVar2 = f.this;
                Object[] objArr = fVar2.f12585a;
                try {
                    Constructor<?> constructor = Class.forName(str, false, fVar2.f12587c.getClassLoader()).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    obj = constructor.newInstance(objArr);
                } catch (Exception unused2) {
                    obj = null;
                }
                menuItem.setActionView((View) obj);
            } else {
                z11 = false;
            }
            int i11 = this.f12614w;
            if (i11 > 0 && !z11) {
                menuItem.setActionView(i11);
            }
            w1.b bVar = this.f12617z;
            if (bVar != null && (menuItem instanceof q1.b)) {
                ((q1.b) menuItem).a(bVar);
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof q1.b;
            if (z12) {
                ((q1.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((q1.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.m(menuItem, charSequence2);
            }
            char c10 = this.f12605n;
            int i12 = this.f12606o;
            if (z12) {
                ((q1.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.g(menuItem, c10, i12);
            }
            char c11 = this.f12607p;
            int i13 = this.f12608q;
            if (z12) {
                ((q1.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((q1.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    j.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z12) {
                ((q1.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f12583e = r0
            f12584f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.f12587c = context;
        Object[] objArr = {context};
        this.f12585a = objArr;
        this.f12586b = objArr;
    }

    public static Object a(Context context) {
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char c10;
        char c11;
        boolean z10;
        Object obj;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(b0.r("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            if (eventType != 1) {
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            str = null;
                            z12 = false;
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                        } else if (name2.equals("group")) {
                            bVar.f12593b = 0;
                            bVar.f12594c = 0;
                            bVar.f12595d = 0;
                            bVar.f12596e = 0;
                            bVar.f12597f = true;
                            bVar.f12598g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f12599h) {
                                w1.b bVar2 = bVar.f12617z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.f12599h = true;
                                    bVar.a(bVar.f12592a.add(bVar.f12593b, bVar.f12600i, bVar.f12601j, bVar.f12602k));
                                } else {
                                    bVar.f12599h = true;
                                    bVar.a(bVar.f12592a.addSubMenu(bVar.f12593b, bVar.f12600i, bVar.f12601j, bVar.f12602k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z11 = true;
                            eventType = xmlResourceParser.next();
                            i10 = 2;
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f12587c.obtainStyledAttributes(attributeSet2, R$styleable.MenuGroup);
                        bVar.f12593b = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
                        bVar.f12594c = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
                        bVar.f12595d = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
                        bVar.f12596e = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
                        bVar.f12597f = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
                        bVar.f12598g = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = f.this.f12587c;
                        n0 n0Var = new n0(context, context.obtainStyledAttributes(attributeSet2, R$styleable.MenuItem));
                        bVar.f12600i = n0Var.i(R$styleable.MenuItem_android_id, 0);
                        bVar.f12601j = (n0Var.h(R$styleable.MenuItem_android_menuCategory, bVar.f12594c) & -65536) | (n0Var.h(R$styleable.MenuItem_android_orderInCategory, bVar.f12595d) & 65535);
                        bVar.f12602k = n0Var.k(R$styleable.MenuItem_android_title);
                        bVar.f12603l = n0Var.k(R$styleable.MenuItem_android_titleCondensed);
                        bVar.f12604m = n0Var.i(R$styleable.MenuItem_android_icon, 0);
                        String j10 = n0Var.j(R$styleable.MenuItem_android_alphabeticShortcut);
                        if (j10 == null) {
                            c10 = 0;
                        } else {
                            c10 = j10.charAt(0);
                        }
                        bVar.f12605n = c10;
                        bVar.f12606o = n0Var.h(R$styleable.MenuItem_alphabeticModifiers, 4096);
                        String j11 = n0Var.j(R$styleable.MenuItem_android_numericShortcut);
                        if (j11 == null) {
                            c11 = 0;
                        } else {
                            c11 = j11.charAt(0);
                        }
                        bVar.f12607p = c11;
                        bVar.f12608q = n0Var.h(R$styleable.MenuItem_numericModifiers, 4096);
                        int i11 = R$styleable.MenuItem_android_checkable;
                        if (n0Var.l(i11)) {
                            bVar.f12609r = n0Var.a(i11, false) ? 1 : 0;
                        } else {
                            bVar.f12609r = bVar.f12596e;
                        }
                        bVar.f12610s = n0Var.a(R$styleable.MenuItem_android_checked, false);
                        bVar.f12611t = n0Var.a(R$styleable.MenuItem_android_visible, bVar.f12597f);
                        bVar.f12612u = n0Var.a(R$styleable.MenuItem_android_enabled, bVar.f12598g);
                        bVar.f12613v = n0Var.h(R$styleable.MenuItem_showAsAction, -1);
                        bVar.f12616y = n0Var.j(R$styleable.MenuItem_android_onClick);
                        bVar.f12614w = n0Var.i(R$styleable.MenuItem_actionLayout, 0);
                        bVar.f12615x = n0Var.j(R$styleable.MenuItem_actionViewClass);
                        String j12 = n0Var.j(R$styleable.MenuItem_actionProviderClass);
                        if (j12 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && bVar.f12614w == 0 && bVar.f12615x == null) {
                            Class<?>[] clsArr = f12584f;
                            f fVar = f.this;
                            Object[] objArr = fVar.f12586b;
                            try {
                                Constructor constructor = Class.forName(j12, false, fVar.f12587c.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            bVar.f12617z = (w1.b) obj;
                        } else {
                            bVar.f12617z = null;
                        }
                        bVar.A = n0Var.k(R$styleable.MenuItem_contentDescription);
                        bVar.B = n0Var.k(R$styleable.MenuItem_tooltipText);
                        int i12 = R$styleable.MenuItem_iconTintMode;
                        if (n0Var.l(i12)) {
                            bVar.D = x.c(n0Var.h(i12, -1), bVar.D);
                        } else {
                            bVar.D = null;
                        }
                        int i13 = R$styleable.MenuItem_iconTint;
                        if (n0Var.l(i13)) {
                            bVar.C = n0Var.b(i13);
                        } else {
                            bVar.C = null;
                        }
                        n0Var.n();
                        bVar.f12599h = false;
                    } else {
                        if (name3.equals("menu")) {
                            bVar.f12599h = true;
                            SubMenu addSubMenu = bVar.f12592a.addSubMenu(bVar.f12593b, bVar.f12600i, bVar.f12601j, bVar.f12602k);
                            bVar.a(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z12 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i10 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i10 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof q1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f12587c.getResources().getLayout(i10);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import androidx.core.widget.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView */
public class y extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1246a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f1247b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1248c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1249d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1250e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1251f;

    /* renamed from: n  reason: collision with root package name */
    public d f1252n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1253o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1254p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1255q;

    /* renamed from: r  reason: collision with root package name */
    public g f1256r;

    /* renamed from: s  reason: collision with root package name */
    public f f1257s;

    /* compiled from: DropDownListView */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static Method f1258a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f1259b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f1260c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1261d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1258a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1259b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1260c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView */
    public static class d extends i.c {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1262b = true;

        public d(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f1262b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f10, float f11) {
            if (this.f1262b) {
                super.setHotspot(f10, f11);
            }
        }

        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1262b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f1262b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1262b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1263a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1263a = field;
        }
    }

    /* compiled from: DropDownListView */
    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            y yVar = y.this;
            yVar.f1257s = null;
            yVar.drawableStateChanged();
        }
    }

    public y(Context context, boolean z10) {
        super(context, (AttributeSet) null, R$attr.dropDownListViewStyle);
        this.f1254p = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1252n;
        if (dVar != null) {
            dVar.f1262b = z10;
        }
    }

    public final int a(int i10, int i11) {
        int i12;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i13 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i13;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i14 = 0;
        View view = null;
        for (int i15 = 0; i15 < count; i15++) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            if (i16 > 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            } else {
                i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, i12);
            view.forceLayout();
            if (i15 > 0) {
                i13 += dividerHeight;
            }
            i13 += view.getMeasuredHeight();
            if (i13 >= i11) {
                return i11;
            }
        }
        return i13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x001e
            r0 = r5
            goto L_0x0143
        L_0x0015:
            r0 = r5
            goto L_0x0018
        L_0x0017:
            r0 = r4
        L_0x0018:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001e:
            r0 = r4
            goto L_0x0143
        L_0x0021:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            r4 = r5
            goto L_0x0143
        L_0x0035:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1255q = r5
            androidx.appcompat.widget.y.a.a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r5)
        L_0x004f:
            r16.layoutChildren()
            int r0 = r1.f1251f
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r4)
        L_0x006c:
            r1.f1251f = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            androidx.appcompat.widget.y.a.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r5)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = r5
            goto L_0x0093
        L_0x0092:
            r12 = r4
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r4, r4)
        L_0x0098:
            android.graphics.Rect r0 = r1.f1246a
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.f1247b
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.f1248c
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.f1249d
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.f1250e
            int r4 = r4 + r13
            r0.bottom = r4
            boolean r0 = s1.a.a()
            if (r0 == 0) goto L_0x00d4
            boolean r0 = androidx.appcompat.widget.y.c.a(r16)
            goto L_0x00e3
        L_0x00d4:
            java.lang.reflect.Field r0 = androidx.appcompat.widget.y.e.f1263a
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00dd }
            goto L_0x00e3
        L_0x00dd:
            r0 = move-exception
            r4 = r0
            r4.printStackTrace()
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            boolean r4 = r10.isEnabled()
            if (r4 == r0) goto L_0x0109
            r0 = r0 ^ r5
            boolean r4 = s1.a.a()
            if (r4 == 0) goto L_0x00f4
            androidx.appcompat.widget.y.c.b(r1, r0)
            goto L_0x0104
        L_0x00f4:
            java.lang.reflect.Field r4 = androidx.appcompat.widget.y.e.f1263a
            if (r4 == 0) goto L_0x0104
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0104:
            if (r8 == r9) goto L_0x0109
            r16.refreshDrawableState()
        L_0x0109:
            if (r12 == 0) goto L_0x0126
            android.graphics.Rect r0 = r1.f1246a
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x011d
            r12 = r5
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            r13 = 0
            r11.setVisible(r12, r13)
            o1.a.b.e(r11, r4, r0)
            goto L_0x0127
        L_0x0126:
            r13 = 0
        L_0x0127:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0132
            if (r8 == r9) goto L_0x0132
            o1.a.b.e(r0, r7, r6)
        L_0x0132:
            r1.setSelectorEnabled(r13)
            r16.refreshDrawableState()
            if (r3 != r5) goto L_0x0141
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0141:
            r0 = r5
            r4 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            if (r4 == 0) goto L_0x0160
        L_0x0147:
            r3 = 0
            r1.f1255q = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r4 = r1.f1251f
            int r6 = r16.getFirstVisiblePosition()
            int r4 = r4 - r6
            android.view.View r4 = r1.getChildAt(r4)
            if (r4 == 0) goto L_0x0160
            r4.setPressed(r3)
        L_0x0160:
            if (r0 == 0) goto L_0x0177
            androidx.core.widget.g r3 = r1.f1256r
            if (r3 != 0) goto L_0x016d
            androidx.core.widget.g r3 = new androidx.core.widget.g
            r3.<init>(r1)
            r1.f1256r = r3
        L_0x016d:
            androidx.core.widget.g r3 = r1.f1256r
            boolean r4 = r3.f2169w
            r3.f2169w = r5
            r3.onTouch(r1, r2)
            goto L_0x0185
        L_0x0177:
            androidx.core.widget.g r2 = r1.f1256r
            if (r2 == 0) goto L_0x0185
            boolean r3 = r2.f2169w
            if (r3 == 0) goto L_0x0182
            r2.d()
        L_0x0182:
            r3 = 0
            r2.f2169w = r3
        L_0x0185:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1246a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1246a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f1257s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.f1255q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f1254p || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f1254p || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f1254p || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f1254p || !this.f1253o) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.f1257s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1257s == null) {
            f fVar = new f();
            this.f1257s = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f1261d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1258a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            b.f1259b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            b.f1260c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1255q && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1251f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1257s;
        if (fVar != null) {
            y yVar = y.this;
            yVar.f1257s = null;
            yVar.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1253o = z10;
    }

    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.f1252n = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1247b = rect.left;
        this.f1248c = rect.top;
        this.f1249d = rect.right;
        this.f1250e = rect.bottom;
    }
}

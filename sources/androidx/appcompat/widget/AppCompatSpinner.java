package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f833p = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final d f834a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f835b;

    /* renamed from: c  reason: collision with root package name */
    public n f836c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f837d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f838e;

    /* renamed from: f  reason: collision with root package name */
    public h f839f;

    /* renamed from: n  reason: collision with root package name */
    public int f840n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f841o;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f842a;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f842a ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f842a = parcel.readByte() != 0;
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                appCompatSpinner.f839f.n(c.b(appCompatSpinner), c.a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!v1.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public class e implements h, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f844a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f845b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f846c;

        public e() {
        }

        public final boolean a() {
            androidx.appcompat.app.b bVar = this.f844a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public final int c() {
            return 0;
        }

        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f844a;
            if (bVar != null) {
                bVar.dismiss();
                this.f844a = null;
            }
        }

        public final void e(int i10) {
        }

        public final CharSequence f() {
            return this.f846c;
        }

        public final Drawable h() {
            return null;
        }

        public final void i(CharSequence charSequence) {
            this.f846c = charSequence;
        }

        public final void k(Drawable drawable) {
        }

        public final void l(int i10) {
        }

        public final void m(int i10) {
        }

        public final void n(int i10, int i11) {
            if (this.f845b != null) {
                b.a aVar = new b.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f846c;
                if (charSequence != null) {
                    aVar.f424a.f342d = charSequence;
                }
                ListAdapter listAdapter = this.f845b;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f424a;
                bVar.f347i = listAdapter;
                bVar.f348j = this;
                bVar.f351m = selectedItemPosition;
                bVar.f350l = true;
                androidx.appcompat.app.b a10 = aVar.a();
                this.f844a = a10;
                AlertController.RecycleListView recycleListView = a10.f423f.f315f;
                c.d(recycleListView, i10);
                c.c(recycleListView, i11);
                this.f844a.show();
            }
        }

        public final int o() {
            return 0;
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i10, this.f845b.getItemId(i10));
            }
            dismiss();
        }

        public final void p(ListAdapter listAdapter) {
            this.f845b = listAdapter;
        }
    }

    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public SpinnerAdapter f848a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f849b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f848a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f849b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof j0) {
                j0 j0Var = (j0) spinnerAdapter;
                if (j0Var.getDropDownViewTheme() == null) {
                    j0Var.a();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f849b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public final int getItemViewType(int i10) {
            return 0;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f849b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f848a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class g extends ListPopupWindow implements h {
        public CharSequence K;
        public ListAdapter L;
        public final Rect M = new Rect();
        public int N;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    AppCompatSpinner.this.performItemClick(view, i10, gVar.L.getItemId(i10));
                }
                g.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                gVar.getClass();
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (!d0.g.b(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(gVar.M)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    g.this.dismiss();
                    return;
                }
                g.this.s();
                g.this.b();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f852a;

            public c(b bVar) {
                this.f852a = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f852a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f906v = AppCompatSpinner.this;
            this.F = true;
            this.G.setFocusable(true);
            this.f907w = new a();
        }

        public final CharSequence f() {
            return this.K;
        }

        public final void i(CharSequence charSequence) {
            this.K = charSequence;
        }

        public final void m(int i10) {
            this.N = i10;
        }

        public final void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            s();
            this.G.setInputMethodMode(2);
            b();
            y yVar = this.f894c;
            yVar.setChoiceMode(1);
            c.d(yVar, i10);
            c.c(yVar, i11);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            y yVar2 = this.f894c;
            if (a() && yVar2 != null) {
                yVar2.setListSelectionHidden(false);
                yVar2.setSelection(selectedItemPosition);
                if (yVar2.getChoiceMode() != 0) {
                    yVar2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.G.setOnDismissListener(new c(bVar));
            }
        }

        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.L = listAdapter;
        }

        public final void s() {
            int i10;
            int i11;
            Drawable h10 = h();
            int i12 = 0;
            if (h10 != null) {
                h10.getPadding(AppCompatSpinner.this.f841o);
                if (u0.a(AppCompatSpinner.this)) {
                    i11 = AppCompatSpinner.this.f841o.right;
                } else {
                    i11 = -AppCompatSpinner.this.f841o.left;
                }
                i12 = i11;
            } else {
                Rect rect = AppCompatSpinner.this.f841o;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i13 = appCompatSpinner.f840n;
            if (i13 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.L, h());
                int i14 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f841o;
                int i15 = (i14 - rect2.left) - rect2.right;
                if (a10 > i15) {
                    a10 = i15;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i13 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i13);
            }
            if (u0.a(AppCompatSpinner.this)) {
                i10 = (((width - paddingRight) - this.f896e) - this.N) + i12;
            } else {
                i10 = paddingLeft + this.N + i12;
            }
            this.f897f = i10;
        }
    }

    public interface h {
        boolean a();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f841o);
        Rect rect = this.f841o;
        return i11 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f834a;
        if (dVar != null) {
            dVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        h hVar = this.f839f;
        if (hVar != null) {
            return hVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        h hVar = this.f839f;
        if (hVar != null) {
            return hVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f839f != null) {
            return this.f840n;
        }
        return super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f839f;
    }

    public Drawable getPopupBackground() {
        h hVar = this.f839f;
        if (hVar != null) {
            return hVar.h();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f835b;
    }

    public CharSequence getPrompt() {
        h hVar = this.f839f;
        if (hVar != null) {
            return hVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f834a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f834a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f839f;
        if (hVar != null && hVar.a()) {
            this.f839f.dismiss();
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f839f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f842a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        h hVar = this.f839f;
        if (hVar == null || !hVar.a()) {
            z10 = false;
        } else {
            z10 = true;
        }
        savedState.f842a = z10;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n nVar = this.f836c;
        if (nVar == null || !nVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        h hVar = this.f839f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        this.f839f.n(c.b(this), c.a(this));
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f834a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f834a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f839f;
        if (hVar != null) {
            hVar.m(i10);
            this.f839f.e(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f839f;
        if (hVar != null) {
            hVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f839f != null) {
            this.f840n = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f839f;
        if (hVar != null) {
            hVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(h.a.a(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f839f;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f834a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f834a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.spinnerStyle);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f838e) {
            this.f837d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f839f != null) {
            Context context = this.f835b;
            if (context == null) {
                context = getContext();
            }
            this.f839f.p(new f(spinnerAdapter, context.getTheme()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f841o = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.i0.a(r0, r8)
            int[] r0 = androidx.appcompat.R$styleable.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r8)
            r8.f834a = r2
            int r2 = androidx.appcompat.R$styleable.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002f
            l.c r3 = new l.c
            r3.<init>((android.content.Context) r9, (int) r2)
            r8.f835b = r3
            goto L_0x0031
        L_0x002f:
            r8.f835b = r9
        L_0x0031:
            r2 = 0
            r3 = -1
            int[] r4 = f833p     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            if (r5 == 0) goto L_0x0052
            int r1 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0050, all -> 0x0045 }
            r3 = r1
            goto L_0x0052
        L_0x0045:
            r9 = move-exception
            r2 = r4
            goto L_0x0049
        L_0x0048:
            r9 = move-exception
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.recycle()
        L_0x004e:
            throw r9
        L_0x004f:
            r4 = r2
        L_0x0050:
            if (r4 == 0) goto L_0x0055
        L_0x0052:
            r4.recycle()
        L_0x0055:
            r1 = 1
            if (r3 == 0) goto L_0x0093
            if (r3 == r1) goto L_0x005b
            goto L_0x00a2
        L_0x005b:
            androidx.appcompat.widget.AppCompatSpinner$g r3 = new androidx.appcompat.widget.AppCompatSpinner$g
            android.content.Context r4 = r8.f835b
            r3.<init>(r4, r10, r11)
            android.content.Context r4 = r8.f835b
            int[] r5 = androidx.appcompat.R$styleable.Spinner
            androidx.appcompat.widget.n0 r4 = androidx.appcompat.widget.n0.m(r4, r10, r5, r11)
            int r5 = androidx.appcompat.R$styleable.Spinner_android_dropDownWidth
            r6 = -2
            android.content.res.TypedArray r7 = r4.f1157b
            int r5 = r7.getLayoutDimension(r5, r6)
            r8.f840n = r5
            int r5 = androidx.appcompat.R$styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r4.e(r5)
            r3.k(r5)
            int r5 = androidx.appcompat.R$styleable.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.K = r5
            r4.n()
            r8.f839f = r3
            androidx.appcompat.widget.n r4 = new androidx.appcompat.widget.n
            r4.<init>(r8, r8, r3)
            r8.f836c = r4
            goto L_0x00a2
        L_0x0093:
            androidx.appcompat.widget.AppCompatSpinner$e r3 = new androidx.appcompat.widget.AppCompatSpinner$e
            r3.<init>()
            r8.f839f = r3
            int r4 = androidx.appcompat.R$styleable.Spinner_android_prompt
            java.lang.String r4 = r0.getString(r4)
            r3.f846c = r4
        L_0x00a2:
            int r3 = androidx.appcompat.R$styleable.Spinner_android_entries
            java.lang.CharSequence[] r3 = r0.getTextArray(r3)
            if (r3 == 0) goto L_0x00ba
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r9, r5, r3)
            int r9 = androidx.appcompat.R$layout.support_simple_spinner_dropdown_item
            r4.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r4)
        L_0x00ba:
            r0.recycle()
            r8.f838e = r1
            android.widget.SpinnerAdapter r9 = r8.f837d
            if (r9 == 0) goto L_0x00c8
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.f837d = r2
        L_0x00c8:
            androidx.appcompat.widget.d r9 = r8.f834a
            r9.d(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

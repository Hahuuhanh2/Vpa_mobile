package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import w1.b;
import w1.d0;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final f f777a;

    /* renamed from: b  reason: collision with root package name */
    public final g f778b;

    /* renamed from: c  reason: collision with root package name */
    public final View f779c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f780d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f781e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f782f;

    /* renamed from: n  reason: collision with root package name */
    public w1.b f783n;

    /* renamed from: o  reason: collision with root package name */
    public final b f784o;

    /* renamed from: p  reason: collision with root package name */
    public ListPopupWindow f785p;

    /* renamed from: q  reason: collision with root package name */
    public PopupWindow.OnDismissListener f786q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f787r;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f788a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Drawable drawable;
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f788a);
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable = h.a.a(context, resourceId);
            }
            setBackgroundDrawable(drawable);
            obtainStyledAttributes.recycle();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f777a.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f777a.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public final void onGlobalLayout() {
            b.a aVar;
            if (!ActivityChooserView.this.b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().b();
            w1.b bVar = ActivityChooserView.this.f783n;
            if (bVar != null && (aVar = bVar.f16283a) != null) {
                ((ActionMenuPresenter) aVar).n(true);
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    public class d extends a0 {
        public d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        public final m.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        public final boolean c() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.b() || !activityChooserView.f787r) {
                return true;
            }
            activityChooserView.f777a.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        public final boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f777a.getClass();
            throw null;
        }
    }

    public class f extends BaseAdapter {
        public f() {
        }

        public final int getCount() {
            throw null;
        }

        public final Object getItem(int i10) {
            throw null;
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final int getItemViewType(int i10) {
            return 0;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            getItemViewType(i10);
            if (view == null || view.getId() != R$id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R$layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(R$id.icon);
            getItem(i10);
            throw null;
        }

        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f782f) {
                activityChooserView.a();
                ActivityChooserView.this.f777a.getClass();
                throw null;
            } else if (view == activityChooserView.f780d) {
                activityChooserView.f777a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss() {
            b.a aVar;
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f786q;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            w1.b bVar = ActivityChooserView.this.f783n;
            if (bVar != null && (aVar = bVar.f16283a) != null) {
                ((ActionMenuPresenter) aVar).n(false);
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ((f) adapterView.getAdapter()).getClass();
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.getClass();
            activityChooserView.f777a.getClass();
            throw null;
        }

        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f782f) {
                activityChooserView.f777a.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f784o);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().a();
    }

    public c getDataModel() {
        this.f777a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f785p == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f785p = listPopupWindow;
            listPopupWindow.p(this.f777a);
            ListPopupWindow listPopupWindow2 = this.f785p;
            listPopupWindow2.f906v = this;
            listPopupWindow2.F = true;
            listPopupWindow2.G.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f785p;
            g gVar = this.f778b;
            listPopupWindow3.f907w = gVar;
            listPopupWindow3.G.setOnDismissListener(gVar);
        }
        return this.f785p;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f777a.getClass();
        this.f787r = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f777a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f784o);
        }
        if (b()) {
            a();
        }
        this.f787r = false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f779c.layout(0, 0, i12 - i10, i13 - i11);
        if (!b()) {
            a();
        }
    }

    public final void onMeasure(int i10, int i11) {
        View view = this.f779c;
        if (this.f782f.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(c cVar) {
        f fVar = this.f777a;
        ActivityChooserView.this.f777a.getClass();
        fVar.notifyDataSetChanged();
        if (b()) {
            a();
            if (!b() && this.f787r) {
                this.f777a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f781e.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f781e.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f786q = onDismissListener;
    }

    public void setProvider(w1.b bVar) {
        this.f783n = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new a();
        this.f784o = new b();
        int[] iArr = R$styleable.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        obtainStyledAttributes.getInt(R$styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R$layout.abc_activity_chooser_view, this, true);
        g gVar = new g();
        this.f778b = gVar;
        View findViewById = findViewById(R$id.activity_chooser_view_content);
        this.f779c = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.default_activity_button);
        this.f782f = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = R$id.image;
        ImageView imageView = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R$id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f780d = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(i11);
        this.f781e = imageView2;
        imageView2.setImageDrawable(drawable);
        f fVar = new f();
        this.f777a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
    }
}

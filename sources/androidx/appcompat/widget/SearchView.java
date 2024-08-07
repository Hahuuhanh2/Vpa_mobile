package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.d0;

public class SearchView extends LinearLayoutCompat implements l.b {

    /* renamed from: r0  reason: collision with root package name */
    public static final o f936r0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final View E;
    public p F;
    public Rect G;
    public Rect H;
    public int[] I;
    public int[] J;
    public final ImageView K;
    public final Drawable L;
    public final int M;
    public final int N;
    public final Intent O;
    public final Intent P;
    public final CharSequence Q;
    public m R;
    public View.OnFocusChangeListener S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public a2.a W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f937a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f938b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f939c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f940d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f941e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f942f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f943g0;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f944h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f945i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f946j0;

    /* renamed from: k0  reason: collision with root package name */
    public SearchableInfo f947k0;

    /* renamed from: l0  reason: collision with root package name */
    public Bundle f948l0;

    /* renamed from: m0  reason: collision with root package name */
    public final b f949m0;

    /* renamed from: n0  reason: collision with root package name */
    public c f950n0;

    /* renamed from: o0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f951o0;

    /* renamed from: p0  reason: collision with root package name */
    public g f952p0;

    /* renamed from: q0  reason: collision with root package name */
    public a f953q0;

    /* renamed from: w  reason: collision with root package name */
    public final SearchAutoComplete f954w;

    /* renamed from: x  reason: collision with root package name */
    public final View f955x;

    /* renamed from: y  reason: collision with root package name */
    public final View f956y;

    /* renamed from: z  reason: collision with root package name */
    public final View f957z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f958c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("SearchView.SavedState{");
            q10.append(Integer.toHexString(System.identityHashCode(this)));
            q10.append(" isIconified=");
            q10.append(this.f958c);
            q10.append("}");
            return q10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeValue(Boolean.valueOf(this.f958c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f958c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e  reason: collision with root package name */
        public int f959e;

        /* renamed from: f  reason: collision with root package name */
        public SearchView f960f;

        /* renamed from: n  reason: collision with root package name */
        public boolean f961n;

        /* renamed from: o  reason: collision with root package name */
        public final a f962o;

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f961n) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f961n = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return 192;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f936r0;
            oVar.getClass();
            o.a();
            Method method = oVar.f976c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            if (this.f959e <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f961n) {
                removeCallbacks(this.f962o);
                post(this.f962o);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f960f;
            searchView.w(searchView.V);
            searchView.post(searchView.f949m0);
            if (searchView.f954w.hasFocus()) {
                searchView.l();
            }
        }

        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f960f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f960f.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f961n = true;
                Context context = getContext();
                o oVar = SearchView.f936r0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f961n = false;
                removeCallbacks(this.f962o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f961n = false;
                removeCallbacks(this.f962o);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f961n = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f960f = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f959e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f962o = new a();
            this.f959e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f954w.getText();
            searchView.f944h0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f942f0 && !searchView.V && z11) {
                searchView.B.setVisibility(8);
                i13 = 0;
            }
            searchView.D.setVisibility(i13);
            searchView.r();
            searchView.u();
            if (searchView.R != null && !TextUtils.equals(charSequence, searchView.f943g0)) {
                searchView.R.a(charSequence.toString());
            }
            searchView.f943g0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.s();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            a2.a aVar = SearchView.this.W;
            if (aVar instanceof h0) {
                aVar.c((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            if (searchView.E.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f956y.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = u0.a(searchView);
                if (searchView.U) {
                    i18 = resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                searchView.f954w.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchView.f954w.setDropDownHorizontalOffset(i19);
                searchView.f954w.setDropDownWidth((((searchView.E.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.A) {
                searchView.w(false);
                searchView.f954w.requestFocus();
                searchView.f954w.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.T;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.C) {
                searchView.m();
            } else if (view == searchView.B) {
                searchView.q();
            } else if (view == searchView.D) {
                SearchableInfo searchableInfo = searchView.f947k0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.O);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.P, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchView.f954w) {
                searchView.l();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.f947k0 == null) {
                return false;
            }
            if (!searchView.f954w.isPopupShowing() || SearchView.this.f954w.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(SearchView.this.f954w.getText()) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.j("android.intent.action.SEARCH", (Uri) null, (String) null, searchView2.f954w.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f947k0 == null || searchView3.W == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView3.n(searchView3.f954w.getListSelection());
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = searchView3.f954w.length();
                }
                searchView3.f954w.setSelection(i11);
                searchView3.f954w.setListSelection(0);
                searchView3.f954w.clearListSelection();
                searchView3.f954w.a();
                return true;
            } else if (i10 != 19) {
                return false;
            } else {
                searchView3.f954w.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.n(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.o(i10);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        void a(String str);

        void b();
    }

    public interface n {
        boolean a();

        boolean b();
    }

    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public Method f974a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f975b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f976c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f974a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f975b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f976c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f977a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f978b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f979c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f980d;

        /* renamed from: e  reason: collision with root package name */
        public final int f981e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f982f;

        public p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f981e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f978b = rect3;
            Rect rect4 = new Rect();
            this.f980d = rect4;
            Rect rect5 = new Rect();
            this.f979c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f977a = searchAutoComplete;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f982f
                r8.f982f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f982f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f980d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f978b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f982f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x0061
                android.graphics.Rect r2 = r8.f979c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0061
                android.view.View r0 = r8.f977a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f977a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006e
            L_0x0061:
                android.graphics.Rect r2 = r8.f979c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r8.f977a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0074:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        f936r0 = oVar;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
    }

    public final void clearFocus() {
        this.f940d0 = true;
        super.clearFocus();
        this.f954w.clearFocus();
        this.f954w.setImeVisibility(false);
        this.f940d0 = false;
    }

    public int getImeOptions() {
        return this.f954w.getImeOptions();
    }

    public int getInputType() {
        return this.f954w.getInputType();
    }

    public int getMaxWidth() {
        return this.f941e0;
    }

    public CharSequence getQuery() {
        return this.f954w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f938b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f947k0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.Q;
        }
        return getContext().getText(this.f947k0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.N;
    }

    public int getSuggestionRowLayout() {
        return this.M;
    }

    public a2.a getSuggestionsAdapter() {
        return this.W;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f944h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f948l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f947k0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f948l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f954w);
            return;
        }
        o oVar = f936r0;
        SearchAutoComplete searchAutoComplete = this.f954w;
        oVar.getClass();
        o.a();
        Method method = oVar.f974a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f936r0;
        SearchAutoComplete searchAutoComplete2 = this.f954w;
        oVar2.getClass();
        o.a();
        Method method2 = oVar2.f975b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        if (!TextUtils.isEmpty(this.f954w.getText())) {
            this.f954w.setText("");
            this.f954w.requestFocus();
            this.f954w.setImeVisibility(true);
        } else if (this.U) {
            clearFocus();
            w(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r7) {
        /*
            r6 = this;
            r0 = 0
            a2.a r1 = r6.W
            android.database.Cursor r1 = r1.f68c
            if (r1 == 0) goto L_0x0090
            boolean r7 = r1.moveToPosition(r7)
            if (r7 == 0) goto L_0x0090
            r7 = 0
            java.lang.String r2 = "suggest_intent_action"
            int r3 = androidx.appcompat.widget.h0.E     // Catch:{ RuntimeException -> 0x007f }
            int r2 = r1.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r2 = androidx.appcompat.widget.h0.i(r1, r2)     // Catch:{ RuntimeException -> 0x007f }
            if (r2 != 0) goto L_0x0022
            android.app.SearchableInfo r2 = r6.f947k0     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x007f }
        L_0x0022:
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "android.intent.action.SEARCH"
        L_0x0026:
            java.lang.String r3 = "suggest_intent_data"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = androidx.appcompat.widget.h0.i(r1, r3)     // Catch:{ RuntimeException -> 0x007f }
            if (r3 != 0) goto L_0x0038
            android.app.SearchableInfo r3 = r6.f947k0     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x007f }
        L_0x0038:
            if (r3 == 0) goto L_0x005e
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r4 = androidx.appcompat.widget.h0.i(r1, r4)     // Catch:{ RuntimeException -> 0x007f }
            if (r4 == 0) goto L_0x005e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x007f }
            r5.<init>()     // Catch:{ RuntimeException -> 0x007f }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = android.net.Uri.encode(r4)     // Catch:{ RuntimeException -> 0x007f }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = r5.toString()     // Catch:{ RuntimeException -> 0x007f }
        L_0x005e:
            if (r3 != 0) goto L_0x0062
            r3 = r7
            goto L_0x0066
        L_0x0062:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ RuntimeException -> 0x007f }
        L_0x0066:
            java.lang.String r4 = "suggest_intent_query"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r4 = androidx.appcompat.widget.h0.i(r1, r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r5 = "suggest_intent_extra_data"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r5 = androidx.appcompat.widget.h0.i(r1, r5)     // Catch:{ RuntimeException -> 0x007f }
            android.content.Intent r7 = r6.j(r2, r3, r5, r4)     // Catch:{ RuntimeException -> 0x007f }
            goto L_0x0082
        L_0x007f:
            r1.getPosition()     // Catch:{ RuntimeException -> 0x0082 }
        L_0x0082:
            if (r7 != 0) goto L_0x0085
            goto L_0x0090
        L_0x0085:
            android.content.Context r1 = r6.getContext()     // Catch:{ RuntimeException -> 0x008d }
            r1.startActivity(r7)     // Catch:{ RuntimeException -> 0x008d }
            goto L_0x0090
        L_0x008d:
            r7.toString()
        L_0x0090:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f954w
            r7.setImeVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f954w
            r7.dismissDropDown()
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.n(int):boolean");
    }

    public final void o(int i10) {
        Editable text = this.f954w.getText();
        Cursor cursor = this.W.f68c;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String d10 = this.W.d(cursor);
                if (d10 != null) {
                    setQuery(d10);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        w(true);
        this.f954w.setImeOptions(this.f946j0);
        this.f945i0 = false;
    }

    public final void onActionViewExpanded() {
        if (!this.f945i0) {
            this.f945i0 = true;
            int imeOptions = this.f954w.getImeOptions();
            this.f946j0 = imeOptions;
            this.f954w.setImeOptions(imeOptions | 33554432);
            this.f954w.setText("");
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f949m0);
        post(this.f950n0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f954w;
            Rect rect = this.G;
            searchAutoComplete.getLocationInWindow(this.I);
            getLocationInWindow(this.J);
            int[] iArr = this.I;
            int i14 = iArr[1];
            int[] iArr2 = this.J;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.H;
            Rect rect3 = this.G;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            p pVar = this.F;
            if (pVar == null) {
                p pVar2 = new p(this.H, this.G, this.f954w);
                this.F = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            Rect rect4 = this.H;
            Rect rect5 = this.G;
            pVar.f978b.set(rect4);
            pVar.f980d.set(rect4);
            Rect rect6 = pVar.f980d;
            int i17 = -pVar.f981e;
            rect6.inset(i17, i17);
            pVar.f979c.set(rect5);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.V) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f941e0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f941e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f941e0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        w(savedState.f958c);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f958c = this.V;
        return savedState;
    }

    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f949m0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        Editable text = this.f954w.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.R;
            if (mVar != null) {
                text.toString();
                mVar.b();
                return;
            }
            if (this.f947k0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            this.f954w.setImeVisibility(false);
            this.f954w.dismissDropDown();
        }
    }

    public final void r() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f954w.getText());
        int i10 = 0;
        if (!z11 && (!this.U || this.f945i0)) {
            z10 = false;
        }
        ImageView imageView = this.C;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.C.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f940d0 || !isFocusable()) {
            return false;
        }
        if (this.V) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f954w.requestFocus(i10, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr;
        if (this.f954w.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f956y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f957z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f948l0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        this.f954w.requestFocus();
        this.f954w.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            w(z10);
            t();
        }
    }

    public void setImeOptions(int i10) {
        this.f954w.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f954w.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f941e0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.R = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQuery(CharSequence charSequence, boolean z10) {
        this.f954w.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f954w;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f944h0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            q();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f938b0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f939c0 = z10;
        a2.a aVar = this.W;
        if (aVar instanceof h0) {
            h0 h0Var = (h0) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            h0Var.f1121w = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f947k0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f954w
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f954w
            android.app.SearchableInfo r3 = r6.f947k0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f947k0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f947k0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f954w
            r3.setInputType(r7)
            a2.a r7 = r6.W
            if (r7 == 0) goto L_0x0042
            r7.c(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f947k0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.h0 r7 = new androidx.appcompat.widget.h0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f947k0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f951o0
            r7.<init>(r3, r6, r4, r5)
            r6.W = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f954w
            r3.setAdapter(r7)
            a2.a r7 = r6.W
            androidx.appcompat.widget.h0 r7 = (androidx.appcompat.widget.h0) r7
            boolean r3 = r6.f939c0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.f1121w = r3
        L_0x006b:
            r6.t()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f947k0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f947k0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.O
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f947k0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.P
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.f942f0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f954w
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.V
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f937a0 = z10;
        w(this.V);
    }

    public void setSuggestionsAdapter(a2.a aVar) {
        this.W = aVar;
        this.f954w.setAdapter(aVar);
    }

    public final void t() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f954w;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.U && this.L != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.L.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.L), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z10;
        int i10 = 0;
        if ((this.f937a0 || this.f942f0) && !this.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !(this.B.getVisibility() == 0 || this.D.getVisibility() == 0)) {
            i10 = 8;
        }
        this.f957z.setVisibility(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f942f0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f937a0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f942f0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.V
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f942f0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.B
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.V = z10;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f954w.getText());
        this.A.setVisibility(i10);
        v(z11);
        View view = this.f955x;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.K.getDrawable() == null || this.U) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.K.setVisibility(i12);
        r();
        boolean z12 = !z11;
        if (this.f942f0 && !this.V && z12) {
            this.B.setVisibility(8);
            i13 = 0;
        }
        this.D.setVisibility(i13);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new int[2];
        this.J = new int[2];
        this.f949m0 = new b();
        this.f950n0 = new c();
        this.f951o0 = new WeakHashMap<>();
        f fVar = new f();
        this.f952p0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f953q0 = new a();
        int[] iArr = R$styleable.SearchView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0 n0Var = new n0(context, obtainStyledAttributes);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(n0Var.i(R$styleable.SearchView_layout, R$layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R$id.search_src_text);
        this.f954w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f955x = findViewById(R$id.search_edit_frame);
        View findViewById = findViewById(R$id.search_plate);
        this.f956y = findViewById;
        View findViewById2 = findViewById(R$id.submit_area);
        this.f957z = findViewById2;
        ImageView imageView = (ImageView) findViewById(R$id.search_button);
        this.A = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.search_go_btn);
        this.B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R$id.search_close_btn);
        this.C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R$id.search_voice_btn);
        this.D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R$id.search_mag_icon);
        this.K = imageView5;
        d0.d.q(findViewById, n0Var.e(R$styleable.SearchView_queryBackground));
        d0.d.q(findViewById2, n0Var.e(R$styleable.SearchView_submitBackground));
        int i11 = R$styleable.SearchView_searchIcon;
        imageView.setImageDrawable(n0Var.e(i11));
        imageView2.setImageDrawable(n0Var.e(R$styleable.SearchView_goIcon));
        imageView3.setImageDrawable(n0Var.e(R$styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(n0Var.e(R$styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(n0Var.e(i11));
        this.L = n0Var.e(R$styleable.SearchView_searchHintIcon);
        q0.a(imageView, getResources().getString(R$string.abc_searchview_description_search));
        this.M = n0Var.i(R$styleable.SearchView_suggestionRowLayout, R$layout.abc_search_dropdown_item_icons_2line);
        this.N = n0Var.i(R$styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f953q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f952p0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(n0Var.a(R$styleable.SearchView_iconifiedByDefault, true));
        int d10 = n0Var.d(R$styleable.SearchView_android_maxWidth, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.Q = n0Var.k(R$styleable.SearchView_defaultQueryHint);
        this.f938b0 = n0Var.k(R$styleable.SearchView_queryHint);
        int h10 = n0Var.h(R$styleable.SearchView_android_imeOptions, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = n0Var.h(R$styleable.SearchView_android_inputType, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(n0Var.a(R$styleable.SearchView_android_focusable, true));
        n0Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.E = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.U);
        t();
    }

    private void setQuery(CharSequence charSequence) {
        this.f954w.setText(charSequence);
        this.f954w.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}

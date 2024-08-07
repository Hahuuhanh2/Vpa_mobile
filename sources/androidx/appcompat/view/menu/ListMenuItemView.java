package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.n0;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public h f545a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f546b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f547c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f548d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f549e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f550f;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f551n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f552o;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f553p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f554q;

    /* renamed from: r  reason: collision with root package name */
    public int f555r;

    /* renamed from: s  reason: collision with root package name */
    public Context f556s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f557t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f558u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f559v;

    /* renamed from: w  reason: collision with root package name */
    public LayoutInflater f560w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f561x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f560w == null) {
            this.f560w = LayoutInflater.from(getContext());
        }
        return this.f560w;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f551n;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f552o;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f552o.getLayoutParams();
            rect.top = this.f552o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void c(h hVar) {
        int i10;
        char c10;
        char c11;
        this.f545a = hVar;
        boolean z10 = false;
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setTitle(hVar.f646e);
        setCheckable(hVar.isCheckable());
        if (hVar.f655n.o()) {
            if (hVar.f655n.n()) {
                c11 = hVar.f651j;
            } else {
                c11 = hVar.f649h;
            }
            if (c11 != 0) {
                z10 = true;
            }
        }
        if (hVar.f655n.n()) {
            c10 = hVar.f651j;
        } else {
            c10 = hVar.f649h;
        }
        setShortcut(z10, c10);
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.f658q);
    }

    public h getItemData() {
        return this.f545a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f554q;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R$id.title);
        this.f548d = textView;
        int i10 = this.f555r;
        if (i10 != -1) {
            textView.setTextAppearance(this.f556s, i10);
        }
        this.f550f = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.f551n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f558u);
        }
        this.f552o = (ImageView) findViewById(R$id.group_divider);
        this.f553p = (LinearLayout) findViewById(R$id.content);
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f546b != null && this.f557t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f546b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f547c != null || this.f549e != null) {
            if ((this.f545a.f665x & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f547c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, this, false);
                    this.f547c = radioButton;
                    LinearLayout linearLayout = this.f553p;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f547c;
                view = this.f549e;
            } else {
                if (this.f549e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, this, false);
                    this.f549e = checkBox;
                    LinearLayout linearLayout2 = this.f553p;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f549e;
                view = this.f547c;
            }
            if (z10) {
                compoundButton.setChecked(this.f545a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f549e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f547c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f545a.f665x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f547c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, this, false);
                this.f547c = radioButton;
                LinearLayout linearLayout = this.f553p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f547c;
        } else {
            if (this.f549e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, this, false);
                this.f549e = checkBox;
                LinearLayout linearLayout2 = this.f553p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f549e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f561x = z10;
        this.f557t = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f552o;
        if (imageView != null) {
            if (this.f559v || !z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f545a.f655n.getClass();
        boolean z10 = this.f561x;
        if (z10 || this.f557t) {
            ImageView imageView = this.f546b;
            if (imageView != null || drawable != null || this.f557t) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, this, false);
                    this.f546b = imageView2;
                    LinearLayout linearLayout = this.f553p;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f557t) {
                    ImageView imageView3 = this.f546b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f546b.getVisibility() != 0) {
                        this.f546b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f546b.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r9 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShortcut(boolean r9, char r10) {
        /*
            r8 = this;
            r10 = 1
            r0 = 0
            r1 = 8
            if (r9 == 0) goto L_0x0025
            androidx.appcompat.view.menu.h r9 = r8.f545a
            androidx.appcompat.view.menu.f r2 = r9.f655n
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x0021
            androidx.appcompat.view.menu.f r2 = r9.f655n
            boolean r2 = r2.n()
            if (r2 == 0) goto L_0x001b
            char r9 = r9.f651j
            goto L_0x001d
        L_0x001b:
            char r9 = r9.f649h
        L_0x001d:
            if (r9 == 0) goto L_0x0021
            r9 = r10
            goto L_0x0022
        L_0x0021:
            r9 = r0
        L_0x0022:
            if (r9 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 != 0) goto L_0x00de
            android.widget.TextView r9 = r8.f550f
            androidx.appcompat.view.menu.h r2 = r8.f545a
            androidx.appcompat.view.menu.f r3 = r2.f655n
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x0037
            char r3 = r2.f651j
            goto L_0x0039
        L_0x0037:
            char r3 = r2.f649h
        L_0x0039:
            if (r3 != 0) goto L_0x003f
            java.lang.String r10 = ""
            goto L_0x00db
        L_0x003f:
            androidx.appcompat.view.menu.f r4 = r2.f655n
            android.content.Context r4 = r4.f615a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            androidx.appcompat.view.menu.f r6 = r2.f655n
            android.content.Context r6 = r6.f615a
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x0063
            int r6 = androidx.appcompat.R$string.abc_prepend_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            r5.append(r6)
        L_0x0063:
            androidx.appcompat.view.menu.f r6 = r2.f655n
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x006e
            int r2 = r2.f652k
            goto L_0x0070
        L_0x006e:
            int r2 = r2.f650i
        L_0x0070:
            r6 = 65536(0x10000, float:9.18355E-41)
            int r7 = androidx.appcompat.R$string.abc_menu_meta_shortcut_label
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.h.c(r2, r6, r7, r5)
            r6 = 4096(0x1000, float:5.74E-42)
            int r7 = androidx.appcompat.R$string.abc_menu_ctrl_shortcut_label
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.h.c(r2, r6, r7, r5)
            r6 = 2
            int r7 = androidx.appcompat.R$string.abc_menu_alt_shortcut_label
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.h.c(r2, r6, r7, r5)
            int r6 = androidx.appcompat.R$string.abc_menu_shift_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            androidx.appcompat.view.menu.h.c(r2, r10, r6, r5)
            r10 = 4
            int r6 = androidx.appcompat.R$string.abc_menu_sym_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            androidx.appcompat.view.menu.h.c(r2, r10, r6, r5)
            int r10 = androidx.appcompat.R$string.abc_menu_function_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            androidx.appcompat.view.menu.h.c(r2, r1, r10, r5)
            if (r3 == r1) goto L_0x00ce
            r10 = 10
            if (r3 == r10) goto L_0x00c4
            r10 = 32
            if (r3 == r10) goto L_0x00ba
            r5.append(r3)
            goto L_0x00d7
        L_0x00ba:
            int r10 = androidx.appcompat.R$string.abc_menu_space_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
            goto L_0x00d7
        L_0x00c4:
            int r10 = androidx.appcompat.R$string.abc_menu_enter_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
            goto L_0x00d7
        L_0x00ce:
            int r10 = androidx.appcompat.R$string.abc_menu_delete_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
        L_0x00d7:
            java.lang.String r10 = r5.toString()
        L_0x00db:
            r9.setText(r10)
        L_0x00de:
            android.widget.TextView r9 = r8.f550f
            int r9 = r9.getVisibility()
            if (r9 == r0) goto L_0x00eb
            android.widget.TextView r9 = r8.f550f
            r9.setVisibility(r0)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean, char):void");
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f548d.setText(charSequence);
            if (this.f548d.getVisibility() != 0) {
                this.f548d.setVisibility(0);
            }
        } else if (this.f548d.getVisibility() != 8) {
            this.f548d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        n0 m10 = n0.m(getContext(), attributeSet, R$styleable.MenuView, i10);
        this.f554q = m10.e(R$styleable.MenuView_android_itemBackground);
        this.f555r = m10.i(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.f557t = m10.a(R$styleable.MenuView_preserveIconSpacing, false);
        this.f556s = context;
        this.f558u = m10.e(R$styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R$attr.dropDownListViewStyle, 0);
        this.f559v = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;
import androidx.appcompat.widget.d0;
import n1.d;

/* compiled from: AppCompatDrawableManager */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1103b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static g f1104c;

    /* renamed from: a  reason: collision with root package name */
    public d0 f1105a;

    /* compiled from: AppCompatDrawableManager */
    public class a implements d0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1106a = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1107b = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1108c = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl, R$drawable.abc_text_select_handle_middle_mtrl, R$drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1109d = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1110e = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1111f = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c10 = i0.c(context, R$attr.colorControlHighlight);
            int b10 = i0.b(context, R$attr.colorButtonNormal);
            return new ColorStateList(new int[][]{i0.f1134b, i0.f1136d, i0.f1135c, i0.f1138f}, new int[]{b10, d.c(c10, i10), d.c(c10, i10), i10});
        }

        public static LayerDrawable c(d0 d0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f10 = d0Var.f(context, R$drawable.abc_star_black_48dp);
            Drawable f11 = d0Var.f(context, R$drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = x.f1237a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = g.f1103b;
            }
            mutate.setColorFilter(g.c(i10, mode));
        }

        public final ColorStateList d(Context context, int i10) {
            if (i10 == R$drawable.abc_edit_text_material) {
                return k1.a.getColorStateList(context, R$color.abc_tint_edittext);
            }
            if (i10 == R$drawable.abc_switch_track_mtrl_alpha) {
                return k1.a.getColorStateList(context, R$color.abc_tint_switch_track);
            }
            if (i10 == R$drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                int i11 = R$attr.colorSwitchThumbNormal;
                ColorStateList d10 = i0.d(context, i11);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = i0.f1134b;
                    iArr2[0] = i0.b(context, i11);
                    iArr[1] = i0.f1137e;
                    iArr2[1] = i0.c(context, R$attr.colorControlActivated);
                    iArr[2] = i0.f1138f;
                    iArr2[2] = i0.c(context, i11);
                } else {
                    int[] iArr3 = i0.f1134b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = i0.f1137e;
                    iArr2[1] = i0.c(context, R$attr.colorControlActivated);
                    iArr[2] = i0.f1138f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R$drawable.abc_btn_default_mtrl_shape) {
                return b(context, i0.c(context, R$attr.colorButtonNormal));
            } else {
                if (i10 == R$drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R$drawable.abc_btn_colored_material) {
                    return b(context, i0.c(context, R$attr.colorAccent));
                }
                if (i10 == R$drawable.abc_spinner_mtrl_am_alpha || i10 == R$drawable.abc_spinner_textfield_background_material) {
                    return k1.a.getColorStateList(context, R$color.abc_tint_spinner);
                }
                if (a(this.f1107b, i10)) {
                    return i0.d(context, R$attr.colorControlNormal);
                }
                if (a(this.f1110e, i10)) {
                    return k1.a.getColorStateList(context, R$color.abc_tint_default);
                }
                if (a(this.f1111f, i10)) {
                    return k1.a.getColorStateList(context, R$color.abc_tint_btn_checkable);
                }
                if (i10 == R$drawable.abc_seekbar_thumb_material) {
                    return k1.a.getColorStateList(context, R$color.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f1104c == null) {
                d();
            }
            gVar = f1104c;
        }
        return gVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (g.class) {
            h10 = d0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (g.class) {
            if (f1104c == null) {
                g gVar = new g();
                f1104c = gVar;
                gVar.f1105a = d0.d();
                d0 d0Var = f1104c.f1105a;
                a aVar = new a();
                synchronized (d0Var) {
                    d0Var.f1082g = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, l0 l0Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = d0.f1073h;
        int[] state = drawable.getState();
        int[] iArr2 = x.f1237a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z11 = l0Var.f1147d;
            if (z11 || l0Var.f1146c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z11) {
                    colorStateList = l0Var.f1144a;
                } else {
                    colorStateList = null;
                }
                if (l0Var.f1146c) {
                    mode = l0Var.f1145b;
                } else {
                    mode = d0.f1073h;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = d0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f1105a.f(context, i10);
    }
}

package com.ots.core;

import android.util.SparseIntArray;
import android.view.View;
import d2.d;
import d2.e;
import d2.l;
import f0.b0;
import hf.a0;
import hf.b;
import hf.c0;
import hf.e0;
import hf.f;
import hf.h;
import hf.j;
import hf.k;
import hf.m;
import hf.o;
import hf.q;
import hf.s;
import hf.u;
import hf.w;
import hf.y;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f8331a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(16);
        f8331a = sparseIntArray;
        sparseIntArray.put(R$layout.base_bottom_sheet_select_dialog, 1);
        sparseIntArray.put(R$layout.date_dialog, 2);
        sparseIntArray.put(R$layout.dialog_action_image, 3);
        sparseIntArray.put(R$layout.empty_state_layout, 4);
        sparseIntArray.put(R$layout.example, 5);
        sparseIntArray.put(R$layout.image_recycleview, 6);
        sparseIntArray.put(R$layout.image_view_layout, 7);
        sparseIntArray.put(R$layout.item_favorite_title, 8);
        sparseIntArray.put(R$layout.item_image_select, 9);
        sparseIntArray.put(R$layout.item_selection, 10);
        sparseIntArray.put(R$layout.picker_item, 11);
        sparseIntArray.put(R$layout.snackbar_base, 12);
        sparseIntArray.put(R$layout.time_dialog, 13);
        sparseIntArray.put(R$layout.widget_base_recycler_view, 14);
        sparseIntArray.put(R$layout.widget_form_input, 15);
        sparseIntArray.put(R$layout.widget_menu_item, 16);
    }

    public final List<d> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final l b(e eVar, View view, int i10) {
        int i11 = f8331a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i11) {
                case 1:
                    if ("layout/base_bottom_sheet_select_dialog_0".equals(tag)) {
                        return new b(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for base_bottom_sheet_select_dialog is invalid. Received: ", tag));
                case 2:
                    if ("layout/date_dialog_0".equals(tag)) {
                        return new hf.d(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for date_dialog is invalid. Received: ", tag));
                case 3:
                    if ("layout/dialog_action_image_0".equals(tag)) {
                        return new f(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for dialog_action_image is invalid. Received: ", tag));
                case 4:
                    if ("layout/empty_state_layout_0".equals(tag)) {
                        return new h(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for empty_state_layout is invalid. Received: ", tag));
                case 5:
                    if ("layout/example_0".equals(tag)) {
                        return new j(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for example is invalid. Received: ", tag));
                case 6:
                    if ("layout/image_recycleview_0".equals(tag)) {
                        return new k(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for image_recycleview is invalid. Received: ", tag));
                case 7:
                    if ("layout/image_view_layout_0".equals(tag)) {
                        return new m(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for image_view_layout is invalid. Received: ", tag));
                case 8:
                    if ("layout/item_favorite_title_0".equals(tag)) {
                        return new o(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for item_favorite_title is invalid. Received: ", tag));
                case 9:
                    if ("layout/item_image_select_0".equals(tag)) {
                        return new q(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for item_image_select is invalid. Received: ", tag));
                case 10:
                    if ("layout/item_selection_0".equals(tag)) {
                        return new s(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for item_selection is invalid. Received: ", tag));
                case 11:
                    if ("layout/picker_item_0".equals(tag)) {
                        return new u(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for picker_item is invalid. Received: ", tag));
                case 12:
                    if ("layout/snackbar_base_0".equals(tag)) {
                        return new w(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for snackbar_base is invalid. Received: ", tag));
                case 13:
                    if ("layout/time_dialog_0".equals(tag)) {
                        return new y(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for time_dialog is invalid. Received: ", tag));
                case 14:
                    if ("layout/widget_base_recycler_view_0".equals(tag)) {
                        return new a0(eVar, new View[]{view});
                    }
                    throw new IllegalArgumentException(b0.q("The tag for widget_base_recycler_view is invalid. Received: ", tag));
                case 15:
                    if ("layout/widget_form_input_0".equals(tag)) {
                        return new c0(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for widget_form_input is invalid. Received: ", tag));
                case 16:
                    if ("layout/widget_menu_item_0".equals(tag)) {
                        return new e0(eVar, view);
                    }
                    throw new IllegalArgumentException(b0.q("The tag for widget_menu_item is invalid. Received: ", tag));
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public final l c(e eVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr.length == 0 || (i11 = f8331a.get(i10)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i11 != 14) {
            return null;
        } else {
            if ("layout/widget_base_recycler_view_0".equals(tag)) {
                return new a0(eVar, viewArr);
            }
            throw new IllegalArgumentException(b0.q("The tag for widget_base_recycler_view is invalid. Received: ", tag));
        }
    }
}

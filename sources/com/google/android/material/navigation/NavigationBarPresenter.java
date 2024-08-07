package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.transition.AutoTransition;
import androidx.transition.h;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.a;
import com.google.android.material.internal.ParcelableSparseArray;

public final class NavigationBarPresenter implements j {

    /* renamed from: a  reason: collision with root package name */
    public NavigationBarMenuView f6573a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6574b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f6575c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f6576a;

        /* renamed from: b  reason: collision with root package name */
        public ParcelableSparseArray f6577b;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f6576a = parcel.readInt();
            this.f6577b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6576a);
            parcel.writeParcelable(this.f6577b, 0);
        }
    }

    public final void c(f fVar, boolean z10) {
    }

    public final void d(boolean z10) {
        AutoTransition autoTransition;
        if (!this.f6574b) {
            if (z10) {
                this.f6573a.a();
                return;
            }
            NavigationBarMenuView navigationBarMenuView = this.f6573a;
            f fVar = navigationBarMenuView.L;
            if (fVar != null && navigationBarMenuView.f6558f != null) {
                int size = fVar.size();
                if (size != navigationBarMenuView.f6558f.length) {
                    navigationBarMenuView.a();
                    return;
                }
                int i10 = navigationBarMenuView.f6559n;
                for (int i11 = 0; i11 < size; i11++) {
                    MenuItem item = navigationBarMenuView.L.getItem(i11);
                    if (item.isChecked()) {
                        navigationBarMenuView.f6559n = item.getItemId();
                        navigationBarMenuView.f6560o = i11;
                    }
                }
                if (!(i10 == navigationBarMenuView.f6559n || (autoTransition = navigationBarMenuView.f6553a) == null)) {
                    h.a(navigationBarMenuView, autoTransition);
                }
                boolean f10 = NavigationBarMenuView.f(navigationBarMenuView.f6557e, navigationBarMenuView.L.l().size());
                for (int i12 = 0; i12 < size; i12++) {
                    navigationBarMenuView.K.f6574b = true;
                    navigationBarMenuView.f6558f[i12].setLabelVisibilityMode(navigationBarMenuView.f6557e);
                    navigationBarMenuView.f6558f[i12].setShifting(f10);
                    navigationBarMenuView.f6558f[i12].c((androidx.appcompat.view.menu.h) navigationBarMenuView.L.getItem(i12));
                    navigationBarMenuView.K.f6574b = false;
                }
            }
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public final int getId() {
        return this.f6575c;
    }

    public final void h(Context context, f fVar) {
        this.f6573a.L = fVar;
    }

    public final void i(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f6573a;
            SavedState savedState = (SavedState) parcelable;
            int i10 = savedState.f6576a;
            int size = navigationBarMenuView.L.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = navigationBarMenuView.L.getItem(i11);
                if (i10 == item.getItemId()) {
                    navigationBarMenuView.f6559n = i10;
                    navigationBarMenuView.f6560o = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f6573a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f6577b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i12 = 0; i12 < parcelableSparseArray.size(); i12++) {
                int keyAt = parcelableSparseArray.keyAt(i12);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i12);
                a aVar = null;
                if (state != null) {
                    aVar = new a(context, state);
                }
                sparseArray.put(keyAt, aVar);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f6573a;
            navigationBarMenuView2.getClass();
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int keyAt2 = sparseArray.keyAt(i13);
                if (navigationBarMenuView2.f6571z.indexOfKey(keyAt2) < 0) {
                    navigationBarMenuView2.f6571z.append(keyAt2, (a) sparseArray.get(keyAt2));
                }
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f6558f;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    a aVar2 = navigationBarMenuView2.f6571z.get(navigationBarItemView.getId());
                    if (aVar2 != null) {
                        navigationBarItemView.setBadge(aVar2);
                    }
                }
            }
        }
    }

    public final boolean k(m mVar) {
        return false;
    }

    public final Parcelable l() {
        BadgeState.State state;
        SavedState savedState = new SavedState();
        savedState.f6576a = this.f6573a.getSelectedItemId();
        SparseArray<a> badgeDrawables = this.f6573a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                state = valueAt.f5711e.f5675a;
            } else {
                state = null;
            }
            parcelableSparseArray.put(keyAt, state);
        }
        savedState.f6577b = parcelableSparseArray;
        return savedState;
    }

    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }
}

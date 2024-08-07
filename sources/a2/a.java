package a2;

import a2.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f66a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67b = true;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f68c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f69d = -1;

    /* renamed from: e  reason: collision with root package name */
    public C0000a f70e = new C0000a();

    /* renamed from: f  reason: collision with root package name */
    public b f71f = new b();

    /* renamed from: n  reason: collision with root package name */
    public b f72n;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    public class C0000a extends ContentObserver {
        public C0000a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f67b && (cursor = aVar.f68c) != null && !cursor.isClosed()) {
                aVar.f66a = aVar.f68c.requery();
            }
        }
    }

    /* compiled from: CursorAdapter */
    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f66a = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f66a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f68c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0000a aVar = this.f70e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f71f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f68c = cursor;
            if (cursor != null) {
                C0000a aVar2 = this.f70e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f71f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f69d = cursor.getColumnIndexOrThrow("_id");
                this.f66a = true;
                notifyDataSetChanged();
            } else {
                this.f69d = -1;
                this.f66a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f66a || (cursor = this.f68c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f66a) {
            return null;
        }
        this.f68c.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f78q.inflate(cVar.f77p, viewGroup, false);
        }
        b(view, this.f68c);
        return view;
    }

    public final Filter getFilter() {
        if (this.f72n == null) {
            this.f72n = new b(this);
        }
        return this.f72n;
    }

    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f66a || (cursor = this.f68c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f68c;
    }

    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f66a || (cursor = this.f68c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f68c.getLong(this.f69d);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f66a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f68c.moveToPosition(i10)) {
            if (view == null) {
                view = e(viewGroup);
            }
            b(view, this.f68c);
            return view;
        } else {
            throw new IllegalStateException(android.support.v4.media.a.m("couldn't move cursor to position ", i10));
        }
    }
}

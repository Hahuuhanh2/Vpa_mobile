package com.luck.picture.lib.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f8140a;

    /* renamed from: b  reason: collision with root package name */
    public VideoSurfaceView f8141b;

    public static class VideoSurfaceView extends SurfaceView {

        /* renamed from: a  reason: collision with root package name */
        public int f8142a;

        /* renamed from: b  reason: collision with root package name */
        public int f8143b;

        public VideoSurfaceView(Context context) {
            this(context, (AttributeSet) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            if (r1 > r6) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f8142a
                int r0 = android.view.View.getDefaultSize(r0, r6)
                int r1 = r5.f8143b
                int r1 = android.view.View.getDefaultSize(r1, r7)
                int r2 = r5.f8142a
                if (r2 <= 0) goto L_0x007a
                int r2 = r5.f8143b
                if (r2 <= 0) goto L_0x007a
                int r0 = android.view.View.MeasureSpec.getMode(r6)
                int r6 = android.view.View.MeasureSpec.getSize(r6)
                int r1 = android.view.View.MeasureSpec.getMode(r7)
                int r7 = android.view.View.MeasureSpec.getSize(r7)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r0 != r2) goto L_0x0041
                if (r1 != r2) goto L_0x0041
                int r0 = r5.f8142a
                int r1 = r0 * r7
                int r2 = r5.f8143b
                int r3 = r6 * r2
                if (r1 >= r3) goto L_0x0037
                int r0 = r0 * r7
                int r0 = r0 / r2
                goto L_0x0062
            L_0x0037:
                int r1 = r0 * r7
                int r3 = r6 * r2
                if (r1 <= r3) goto L_0x005f
                int r2 = r2 * r6
                int r1 = r2 / r0
                goto L_0x0051
            L_0x0041:
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r2) goto L_0x0053
                int r0 = r5.f8143b
                int r0 = r0 * r6
                int r2 = r5.f8142a
                int r0 = r0 / r2
                if (r1 != r3) goto L_0x0050
                if (r0 <= r7) goto L_0x0050
                goto L_0x005f
            L_0x0050:
                r1 = r0
            L_0x0051:
                r0 = r6
                goto L_0x007a
            L_0x0053:
                if (r1 != r2) goto L_0x0064
                int r1 = r5.f8142a
                int r1 = r1 * r7
                int r2 = r5.f8143b
                int r1 = r1 / r2
                if (r0 != r3) goto L_0x0061
                if (r1 <= r6) goto L_0x0061
            L_0x005f:
                r0 = r6
                goto L_0x0062
            L_0x0061:
                r0 = r1
            L_0x0062:
                r1 = r7
                goto L_0x007a
            L_0x0064:
                int r2 = r5.f8142a
                int r4 = r5.f8143b
                if (r1 != r3) goto L_0x0070
                if (r4 <= r7) goto L_0x0070
                int r1 = r7 * r2
                int r1 = r1 / r4
                goto L_0x0072
            L_0x0070:
                r1 = r2
                r7 = r4
            L_0x0072:
                if (r0 != r3) goto L_0x0061
                if (r1 <= r6) goto L_0x0061
                int r4 = r4 * r6
                int r1 = r4 / r2
                goto L_0x0051
            L_0x007a:
                r5.setMeasuredDimension(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView.onMeasure(int, int):void");
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }
    }

    public MediaPlayerView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        this.f8141b = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f8141b.setLayoutParams(layoutParams);
        addView(this.f8141b);
        SurfaceHolder holder = this.f8141b.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public MediaPlayer getMediaPlayer() {
        return this.f8140a;
    }

    public VideoSurfaceView getSurfaceView() {
        return this.f8141b;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f8140a.setAudioStreamType(3);
        this.f8140a.setDisplay(surfaceHolder);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public MediaPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MediaPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}

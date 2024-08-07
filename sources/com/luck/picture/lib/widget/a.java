package com.luck.picture.lib.widget;

import android.media.MediaPlayer;
import com.luck.picture.lib.widget.MediaPlayerView;

/* compiled from: MediaPlayerView */
public final class a implements MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaPlayerView f8162a;

    public a(MediaPlayerView mediaPlayerView) {
        this.f8162a = mediaPlayerView;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        MediaPlayerView.VideoSurfaceView videoSurfaceView = this.f8162a.f8141b;
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.getClass();
        if (videoWidth != 0 && videoHeight != 0) {
            videoSurfaceView.f8142a = videoWidth;
            videoSurfaceView.f8143b = videoHeight;
            videoSurfaceView.getHolder().setFixedSize(videoWidth, videoHeight);
            videoSurfaceView.requestLayout();
        }
    }
}

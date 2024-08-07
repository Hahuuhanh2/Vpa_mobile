package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c;
import android.support.v4.media.session.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaControllerCompatApi21 */
public final class g<T extends f> extends MediaController.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final T f262a;

    public g(c.a aVar) {
        this.f262a = aVar;
    }

    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        T t10 = this.f262a;
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if (!((audioAttributes.getFlags() & 1) == 1 || (audioAttributes.getFlags() & 4) == 4)) {
            int usage = audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        c cVar = ((c.a) t10).f260a.get();
    }

    public final void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.a(bundle);
        c cVar = ((c.a) this.f262a).f260a.get();
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((c.a) this.f262a).f260a.get() != null) {
            Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                MediaMetadataCompat.CREATOR.createFromParcel(obtain).getClass();
            }
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        c cVar = ((c.a) this.f262a).f260a.get();
        if (cVar != null && cVar.f259a == null && playbackState != null) {
            List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
            if (customActions != null) {
                ArrayList arrayList2 = new ArrayList(customActions.size());
                for (PlaybackState.CustomAction next : customActions) {
                    if (next != null) {
                        PlaybackState.CustomAction customAction2 = next;
                        customAction = new PlaybackStateCompat.CustomAction(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), customAction2.getExtras());
                        customAction.f257e = next;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), playbackState.getExtras());
        }
    }

    public final void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((c.a) this.f262a).f260a.get() != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (MediaSession.QueueItem next : list) {
                if (next != null) {
                    MediaSession.QueueItem queueItem2 = next;
                    queueItem = new MediaSessionCompat.QueueItem(next, MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        c cVar = ((c.a) this.f262a).f260a.get();
    }

    public final void onSessionDestroyed() {
        c cVar = ((c.a) this.f262a).f260a.get();
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        c cVar = ((c.a) this.f262a).f260a.get();
    }
}

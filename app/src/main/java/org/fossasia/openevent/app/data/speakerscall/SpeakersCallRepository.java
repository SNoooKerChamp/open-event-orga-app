package org.fossasia.openevent.app.data.speakerscall;

import android.support.annotation.NonNull;

import io.reactivex.Observable;

public interface SpeakersCallRepository {

    Observable<SpeakersCall> getSpeakersCall(long id, boolean reload);

    Observable<SpeakersCall> createSpeakersCall(SpeakersCall speakersCall);

    @NonNull
    Observable<SpeakersCall> updateSpeakersCall(SpeakersCall speakersCall);
}

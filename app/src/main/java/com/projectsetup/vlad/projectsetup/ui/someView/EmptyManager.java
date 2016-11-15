package com.projectsetup.vlad.projectsetup.ui.someView;

import com.projectsetup.vlad.projectsetup.di.NetworkApi;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Vladimir on 11/14/2016.
 */

public class EmptyManager {

    NetworkApi api;

    @Inject
    public EmptyManager(NetworkApi api) {
        this.api = api;
    }


    public Observable<String> getStrings() {
        return Observable.just("Hi", "Hello", "Hey");
    }
}

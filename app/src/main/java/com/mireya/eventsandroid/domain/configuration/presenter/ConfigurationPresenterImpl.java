package com.mireya.eventsandroid.domain.configuration.presenter;

import com.mireya.eventsandroid.domain.configuration.interactor.ConfigurationInteractor;
import com.mireya.eventsandroid.domain.configuration.interactor.ConfigurationInteractorImpl;
import com.mireya.eventsandroid.domain.configuration.view.ConfigurationView;

public class ConfigurationPresenterImpl implements ConfigurationPresenter {
    public ConfigurationInteractor interactor;
    public ConfigurationView view;

    public ConfigurationPresenterImpl(ConfigurationView view) {
        this.view = view;
        this.interactor = new ConfigurationInteractorImpl(this);
    }
}

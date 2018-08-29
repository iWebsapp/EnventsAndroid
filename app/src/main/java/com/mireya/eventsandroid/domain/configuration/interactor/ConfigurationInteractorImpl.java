package com.mireya.eventsandroid.domain.configuration.interactor;

import com.mireya.eventsandroid.domain.configuration.presenter.ConfigurationPresenter;

public class ConfigurationInteractorImpl implements ConfigurationInteractor {
    public ConfigurationPresenter presenter;

    public ConfigurationInteractorImpl(ConfigurationPresenter presenter) {
        this.presenter = presenter;
    }
}

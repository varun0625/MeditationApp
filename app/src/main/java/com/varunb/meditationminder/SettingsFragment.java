package com.varunb.meditationminder;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by rajeevbansal on 5/27/15.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(com.varunb.meditationminder.R.layout.preferences);
    }
}

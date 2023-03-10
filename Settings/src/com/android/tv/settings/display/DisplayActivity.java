package com.android.tv.settings.display;

import androidx.fragment.app.Fragment;
import com.android.tv.settings.BaseSettingsFragment;
import com.android.tv.settings.TvSettingsActivity;

/**
 * @author GaoFei
 */
public class DisplayActivity extends TvSettingsActivity {
    @Override
    protected Fragment createSettingsFragment() {
        return DisplayFragment.newInstance();
    }

    public static class SettingsFragment extends BaseSettingsFragment {

        public static SettingsFragment newInstance() {
            return new SettingsFragment();
        }

        @Override
        public void onPreferenceStartInitialScreen() {
            final DisplayFragment fragment = DisplayFragment.newInstance();
            startPreferenceFragment(fragment);
        }
    }
}

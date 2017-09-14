package com.bignerdranch.android.criminalintentt;

import android.support.v4.app.Fragment;

/**
 * Created by PJ on 8/31/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}

package com.example.dayar_o52hdk4.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by dayar_o52hdk4 on 02.04.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

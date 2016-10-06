package com.example.android.airberlin_plus;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kiddie235 on 10/6/16.
 */

public class AirberlinAdapter extends FragmentPagerAdapter {
    private final int mNUM_OF_MAINACTIVITY_FRAGMENTS = 3;
    private Context mContext;

    public AirberlinAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AddFlightFragment();
            case 1:
                return new LoungeFragment();
            case 2:
                return new TSAWaitTimeFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNUM_OF_MAINACTIVITY_FRAGMENTS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_addflight);
            case 1:
                return mContext.getString(R.string.tab_lounge);
            case 2:
                return mContext.getString(R.string.tab_tsawait);
            default:
                return null;
        }
    }
}

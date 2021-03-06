package com.zeprofile.zeprofile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.zeprofile.zeprofile.Utils.ZeProfileUtils;

public class FragmentBankAccount extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bank_account, container, false);
        setHasOptionsMenu(true);
        return view;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            /*ViewPager mProfileRootViewPager = (ViewPager) getActivity().findViewById(R.id.profileRootViewPager);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            mProfileRootViewPager.setCurrentItem(0, false);*/
            ZeProfileUtils.loadViewPager(getActivity(),R.id.mainMenuViewPager,0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
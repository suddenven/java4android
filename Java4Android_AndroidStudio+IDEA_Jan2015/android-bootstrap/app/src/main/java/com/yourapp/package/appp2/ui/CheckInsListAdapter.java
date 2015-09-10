package com.yourapp.package.appp2.ui;

import android.view.LayoutInflater;

import com.yourapp.package.appp2.R;
import com.yourapp.package.appp2.core.CheckIn;

import java.util.List;


public class CheckInsListAdapter extends AlternatingColorListAdapter<CheckIn> {
    /**
     * @param inflater
     * @param items
     * @param selectable
     */
    public CheckInsListAdapter(final LayoutInflater inflater, final List<CheckIn> items,
                               final boolean selectable) {
        super(R.layout.checkin_list_item, inflater, items, selectable);
    }

    /**
     * @param inflater
     * @param items
     */
    public CheckInsListAdapter(final LayoutInflater inflater, final List<CheckIn> items) {
        super(R.layout.checkin_list_item, inflater, items);
    }

    @Override
    protected int[] getChildViewIds() {
        return new int[]{R.id.tv_name, R.id.tv_date};
    }

    @Override
    protected void update(final int position, final CheckIn item) {
        super.update(position, item);

        setText(0, item.getName());
    }
}
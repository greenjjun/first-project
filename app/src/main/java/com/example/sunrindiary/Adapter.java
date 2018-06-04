package com.example.sunrindiary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    ArrayList<String> items = new ArrayList<>();

    public Adapter(ArrayList<String> items) {
        this.items=items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        TextView diary = (TextView) v.findViewById(R.id.content);
        return v;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}

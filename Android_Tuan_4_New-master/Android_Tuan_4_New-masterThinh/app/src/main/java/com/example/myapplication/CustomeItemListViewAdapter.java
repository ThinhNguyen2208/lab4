package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomeItemListViewAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<ItemListView> arrayList;

    public CustomeItemListViewAdapter(Context ctx, int layoutItem, ArrayList<ItemListView> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).
                inflate(layoutItem, parent, false);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvShopName = convertView.findViewById(R.id.tvShopName);
        ImageView imgItemListView = convertView.findViewById(R.id.imgItemListView);

        tvName.setText(arrayList.get(position).getName());
        tvShopName.setText(arrayList.get(position).getShopName());
        imgItemListView.setImageResource(arrayList.get(position).getImageShopItem());
        return convertView;
    }
}

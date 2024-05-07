package com.example.gridview_dmytroiakymiuk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private String[] lngNames;
    private int[] icons;

    LayoutInflater inflater;
    public GridAdapter(String[] lngNames, int[] icons, Context context) {
        this.context = context;
        this.lngNames = lngNames;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return lngNames.length;
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
    public View getView(int position, View view, ViewGroup parent) {

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view == null){
            view = inflater.inflate(R.layout.grid_item, null);
        }
        ImageView imgView = (ImageView)view.findViewById(R.id.grid_img);
        TextView txtView = (TextView) view.findViewById(R.id.item_name);

        imgView.setImageResource(icons[position]);
        txtView.setText(lngNames[position]);

        return view;
    }
}

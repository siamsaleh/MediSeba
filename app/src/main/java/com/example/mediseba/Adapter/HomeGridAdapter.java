package com.example.mediseba.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mediseba.R;

public class HomeGridAdapter extends BaseAdapter {

    Context context;
    private String[] items;
    private int [] pics;
    LayoutInflater inflater;

    public HomeGridAdapter(Context context, String[] items, int[] pics) {
        this.context = context;
        this.pics = pics;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
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

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.home_sample_gridview, parent, false);
        }

        ImageView  imageView = convertView.findViewById(R.id.imageView_homeGridV);
        TextView textView = convertView.findViewById(R.id.textView_homeGridV);

        imageView.setImageResource(pics[position]);
        textView.setText(items[position]);

        return convertView;
    }
}

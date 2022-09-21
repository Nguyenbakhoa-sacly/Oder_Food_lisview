package com.example.oder_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class item_adapter_food extends BaseAdapter {
    private Context context;
    private int Layout;
    private List<item_food> item_foodlist;

    public item_adapter_food(Context context, int layout, List<item_food> item_foodlist) {
        this.context = context;
        Layout = layout;
        this.item_foodlist = item_foodlist;
    }

    @Override
    public int getCount() { //tra ve so dong hien thi tren list view
        return item_foodlist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //tao tung dong
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(Layout,null);

        //anh xa
        TextView title_food = (TextView) view.findViewById(R.id.title_food);
        TextView mota_food = (TextView) view.findViewById(R.id.mota_food);
        ImageView  img_food = (ImageView) view.findViewById(R.id.img_food);

        //gan gia tri
        item_food item_food = item_foodlist.get(i);

        title_food.setText(item_food.getTen());
        mota_food.setText(item_food.getMota());
        img_food.setImageResource(item_food.getImg());

        return view;
    }
}


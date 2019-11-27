package com.example.goldenshoe_project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListview extends ArrayAdapter<String> {

private String[] shoeName;
private String[] shoeDescription;
private Integer[] imgid;
private Activity context;

    public CustomListview(Activity context, String[] shoeName, String[] shoeDescription, Integer[] imgid) {
        super(context,R.layout.listview_layout,shoeName);

        this.context = context;
        this.shoeName = shoeName;
        this.shoeDescription = shoeDescription;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if (r==null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(shoeName[position]);
        viewHolder.tvw2.setText(shoeDescription[position]);



        return r;
    }

    class ViewHolder{
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.tvshoename);
            tvw2 = (TextView) v.findViewById(R.id.tvdescription);
            ivw = (ImageView) v.findViewById(R.id.imageView);

        }
    }
}

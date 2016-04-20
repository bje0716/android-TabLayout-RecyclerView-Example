package com.grapefruit.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grapefruit on 16. 4. 20.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    public List<RecyclerItem> items;

    public RecyclerAdapter() {
        super();
        items = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            items.add(new RecyclerItem("아이템1", "아이템2"));
        }
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        RecyclerItem item = items.get(position);
        holder.text1.setText(item.getItem());
        holder.text2.setText(item.getItem1());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.item1);
            text2 = (TextView) itemView.findViewById(R.id.item2);
        }
    }

    public class RecyclerItem {

        String item, item1;

        public RecyclerItem(String item, String item1) {
            this.item = item;
            this.item1 = item1;
        }

        public String getItem() {
            return this.item;
        }

        public String getItem1() {
            return this.item1;
        }
    }
}

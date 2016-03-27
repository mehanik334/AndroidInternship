
package com.example.denisenko.myproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private int[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView; //[Comment] Wrong visibility modifier

        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView) v.findViewById(R.id.tv_recycler_item);
        }
    }

    public RecyclerAdapter(int[] dataset) {
        mDataset = dataset;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mImageView.setImageResource(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
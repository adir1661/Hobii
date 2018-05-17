package com.hobii.controller;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hobii.R;
import com.hobii.model.entitiy.User;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adir on 5/16/2018.
 */
public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {
    private List<User> users;
    private int resId;
    private WeakReference<Activity> mActivity;

    TableAdapter(Activity activity, int resourceId, List<User> userList){
        resId = resourceId;
        users = new ArrayList<>(userList);
        mActivity = new WeakReference<Activity>(activity);


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mActivity.get())
                .inflate(resId, parent, false);
        return new TableAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = users.get(position);
        holder.tvName.setText(user.getName());
        holder.tvScore.setText(String.valueOf(user.getScore()));
        holder.tvRank.setText(String.valueOf(position+1));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank;
        TextView tvName;
        TextView tvScore;
        public ViewHolder(View itemView
        ) {
            super(itemView);
            tvRank=itemView.findViewById(R.id.tvRank);
            tvName=itemView.findViewById(R.id.tvName);
            tvScore =itemView.findViewById(R.id.tvScore);


        }
    }
}

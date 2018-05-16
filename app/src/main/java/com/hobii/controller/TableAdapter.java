package com.hobii.controller;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.hobii.model.entitiy.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adir on 5/16/2018.
 */
public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {
    private List<User> users;
    private int resId;

    TableAdapter(Activity activity, int resourceId, List<User> userList){
        resId = resourceId;
        users = new ArrayList<>(userList);


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}

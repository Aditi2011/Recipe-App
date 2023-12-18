package com.example.bonappetite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>
{
  ArrayList<Model> dataholder;

    public MyAdapter(ArrayList<Model> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        holder.drecname.setText(dataholder.get(position).getName());
        holder.drecdetails.setText(dataholder.get(position).getDetails());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView drecname,drecdetails;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            drecname=(TextView)itemView.findViewById(R.id.displayname);
            drecdetails=(TextView)itemView.findViewById(R.id.displaydetails);
        }
    }

}

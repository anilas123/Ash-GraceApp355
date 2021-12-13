package com.example.app355;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class FreewriteAdapter extends RecyclerView.Adapter<FreewriteAdapter.MyViewHolder> {

    Context context;
    Activity activity;
    List<NotesModel> notesList;

    public FreewriteAdapter(Context context, Activity activity, List<NotesModel> notesList) {
        this.context = context;
        this.activity = activity;
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fw_recyclerview_layout, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(notesList.get(position).getTitle());
        holder.description.setText(notesList.get(position).getDescription());

        holder.layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateNotesActivity.class);

                intent.putExtra("title", notesList.get(position).getTitle());
                intent.putExtra("description", notesList.get(position).getDescription());
                intent.putExtra("id", notesList.get(position).getId());

                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, description;
        RelativeLayout layout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.notes_title);
            description = itemView.findViewById(R.id.notes_description);
            layout = itemView.findViewById(R.id.note_layout);
        }
    }
}

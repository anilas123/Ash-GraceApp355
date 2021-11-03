package com.example.app355;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public final TextView dayOfMonth;
    private final CalendarAdapt.OnItemLister onItemLister;

    public CalendarViewHolder(@NonNull View itemView, CalendarAdapt.OnItemLister onItemLister) {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemLister = onItemLister;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onItemLister.onItemClick(getAdapterPosition(), (String) dayOfMonth.getText());
    }
}

package com.example.advit.submissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advit.R;

import java.util.List;

public class tasksAdapter extends RecyclerView.Adapter<tasksAdapter.tasksViewHolder> {

    private Context context;
    private List<tasksData> list;

    public tasksAdapter(Context context, List<tasksData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public tasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.tasksitemlayout, parent, false);
        return new tasksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tasksViewHolder holder, int position) {

        holder.name.setText(list.get(holder.getAdapterPosition()).getPdfName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tasksViewer.class);
                intent.putExtra("pdfTitle", list.get(holder.getAdapterPosition()).getPdfTitle());
                context.startActivity(intent);
            }
        });

        holder.dwnld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(list.get(holder.getAdapterPosition()).getPdfTitle()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tasksViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView dwnld;

        public tasksViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.taskName);
            dwnld = itemView.findViewById(R.id.taskDownload);
        }
    }
}

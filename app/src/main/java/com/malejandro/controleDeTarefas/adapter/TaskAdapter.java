package com.malejandro.controleDeTarefas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.malejandro.controleDeTarefas.R;
import com.malejandro.controleDeTarefas.model.Task;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View taskListItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_list_adapter, parent, false);

        return new MyViewHolder(taskListItem);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.MyViewHolder holder, int position) {

        Task task = taskList.get(position);
        holder.task.setText(task.getTaskName());
    }

    @Override
    public int getItemCount() {
        return this.taskList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView task;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            task = itemView.findViewById(R.id.textTaskName);
        }
    }

}

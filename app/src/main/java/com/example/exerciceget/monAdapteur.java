package com.example.exerciceget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class monAdapteur extends RecyclerView.Adapter<monAdapteur.ViewHolder> {

    public List<Repo> list;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNomRepo;
        public TextView tvIdRepo;


        public ViewHolder(LinearLayout v) {
            super(v);
            // Define click listener for the ViewHolder's View
   /*         tvNom =  v.findViewById(R.id.tvNom);
            tvDate =  v.findViewById(R.id.tvDate);
            tvNombre =  v.findViewById(R.id.tvNombre);


*/
           // tvNom = v.findViewById(R.id.tvNom);
            tvIdRepo = v.findViewById(R.id.repoId);
            tvNomRepo = v.findViewById(R.id.repoName);



        }

    /*    public TextView getTextView() {
            return textView;
        }*/
    }

    /**
     * Initialize the dataset of the Adapter.
     *

     * by RecyclerView.
     */
    public monAdapteur() {
        list = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        LinearLayout view = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.repo_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Repo repoCourante = list.get(position);
        viewHolder.tvNomRepo.setText("NAME : "+repoCourante.name);
        viewHolder.tvIdRepo.setText("ID : "+repoCourante.id);



    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return list.size();
    }
}

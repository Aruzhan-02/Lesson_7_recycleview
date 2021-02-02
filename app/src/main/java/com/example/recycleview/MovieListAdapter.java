package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MyTViewHolder> {
    private Context context;
    private List<Movie> movieList;

    public class MyTViewHolder extends RecyclerView.ViewHolder{
        public ImageView photo;
        public TextView title, desc, about;
        public RatingBar rating;

        public MyTViewHolder(View view){
            super(view);
            photo = view.findViewById(R.id.movie_photo);
            rating = view.findViewById(R.id.movie_rating);
            title = view.findViewById(R.id.movie_title);
            desc = view.findViewById(R.id.movie_year_country);
            about = view.findViewById(R.id.movie_about);

        }
    }

    public MovieListAdapter(Context context, List<Movie> movieList){
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);

        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder sborka, int position){
        Movie item = movieList.get(position);

        Glide.with(context.getApplicationContext())
                .load(item.getPhoto())
                .placeholder(R.drawable.ic_movie)
                .into(sborka.photo);
        sborka.rating.setRating(item.getRating());
        sborka.title.setText(item.getTitle());
        sborka.desc.setText(item.getDescription());
        sborka.about.setText(item.getAbout());
    }

    @Override
    public int getItemCount(){return movieList.size();}


}

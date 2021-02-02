package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_movie;
    MovieListAdapter MovieListAdapter;
    ArrayList<Movie> movieList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_movie = findViewById(R.id.recycleview);
        movieList = new ArrayList<>();

        movieList.add(new Movie("https://lumiere-a.akamaihd.net/v1/images/p_disney_soul_20263_eac955fc.jpeg", "Soul", 4.7f, "USA | 2020 | animation, adventure", "After landing the gig of a lifetime, a New York jazz pianist suddenly finds himself trapped in a strange land between Earth and the afterlife..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/thumb/4/47/The_Little_Things_poster.jpeg/220px-The_Little_Things_poster.jpeg", "The little things", 4f, "USA | 2021 | thriller, crime", "Two cops track down a serial killer..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/ru/0/01/Godzilla_vs._Kong_%28poster%29.jpg", "Godzilla vs Kong", 4.4f, "USA | 2021 | action, Sci-Fi, thriller", "History against one another - the fearsome Godzilla and the mighty Kong..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/1/14/Tenet_movie_poster.jpg", "Tenet", 4.4f, "USA, Great Britain | 2020 | action, Sci-Fi", "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/9/90/Bad_Boys_for_Life_poster.jpg", "Bad Boys for Life", 3.9f, "USA, Mexico | 2020 | action, thriller", "Miami detectives Mike Lowrey and Marcus Burnett must face off against a mother-and-son pair of drug lords..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/e/ea/Another_Round_%28film%29.jpg", "Another Round", 3.5f, "Denmark, Sweden | 2020 | comedy, drama", "Four friends, all high school teachers, test a theory that they will improve their lives..."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/c/c1/Sonic_the_Hedgehog_poster.jpg", "Sonic the Headgehog", 4.2f, "USA, Japan | 2020 | action, comedy", "After discovering a small, blue, fast hedgehog, a small-town police officer must help him..."));


        MovieListAdapter = new MovieListAdapter(this,movieList );

        linearLayoutManager = new LinearLayoutManager(this);

        rv_movie.setLayoutManager(linearLayoutManager);
        rv_movie.setAdapter(MovieListAdapter);
    }
}
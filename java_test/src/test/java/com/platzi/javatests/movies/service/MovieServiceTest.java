package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieServiceTest {

    private MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Dark Knigth",152,Genre.ACTION,"Kevin"),
                        new Movie(2,"Memento",119,Genre.THRILLER,"Itzel"),
                        new Movie(3,"Like Kids",112,Genre.COMEDY,"Dante"),
                        new Movie(4,"ANABELE",113,Genre.HORROR,"Dante"),
                        new Movie(5,"Home Alone",103,Genre.COMEDY,"Itzel"),
                        new Movie(6,"One punch Man",165,Genre.ACTION,"Kevin"),
                        new Movie(7,"One punch Man 2",150,Genre.ACTION,"Dante")

                )
        );

         movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        assertThat(getMovieIds(movies), is(Arrays.asList(3,5)));
    }

    @Test
    public void return_movies_by_length() {
        Collection<Movie> movies = movieService.finMoviesByLength(119);
        assertThat(getMovieIds(movies), is(Arrays.asList(2,3,4,5)));
    }



    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }


    @Test
    public void return_movies_by_action_genre_and_2_and_30_hours_length() {
        Collection<Movie> movies = movieService.findMoviesByTemplate(new Movie (null,150,Genre.ACTION));

        assertThat(movies, is(Arrays.asList(7)));
    }
}

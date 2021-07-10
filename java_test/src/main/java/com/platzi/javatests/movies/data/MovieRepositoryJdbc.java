package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Locale;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = { id };
        return jdbcTemplate.queryForObject("SELECT * FROM movies where id = ?", args,movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

        jdbcTemplate.update("INSERT INTO movies (name,minutes,genre,director) VALUES (?,?,?,?)",
                movie.getName(),
                movie.getMinutes(),
                movie.getGenre().toString(),
                movie.getDirector()
        );

    }

    @Override
    public Collection<Movie> findByName(String movieName) {

     return  jdbcTemplate.query("select * from movies where LOWER (name) LIKE'%"+ movieName +"%'", movieMapper);


    }

    @Override
    public Collection<Movie> findByDirector(String director) {
        return jdbcTemplate.query("select * from movies where LOWER (director) LIKE '%"+director+"%'",movieMapper);
    }

    @Override
    public Collection<Movie> findMoviesByTemplate(Movie template) {
        return null;
    }


    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre")),
                    rs.getString("director"));
}
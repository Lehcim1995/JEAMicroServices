package dao;

import domain.Genre;

import java.util.List;

public interface GenreDao
{
    Genre getGenre(int id);
    Genre getGenre(String genre);

    List<Genre> getGenres();

    Genre addGenre(Genre genre);
    Genre addGenre(String genre);


}

package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldGetFourMovies() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "action", "red");
        Movie second = new Movie(2, "Forward", "animation", "blue");
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", "coloured");
        Movie fourth = new Movie(4, "Gentlemen", "action", "white");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastTenMoviesOutOfTen() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "action", "red");
        Movie second = new Movie(2, "Forward", "animation", "blue");
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", "coloured");
        Movie fourth = new Movie(4, "Gentlemen", "action", "white");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "grey");
        Movie sixth = new Movie(6, "Trolls", "animation", "violet");
        Movie seventh = new Movie(7, "Number One", "comedy", "orange");
        Movie eighth = new Movie(8, "Eighth", "horror", "black");
        Movie ninth = new Movie(9, "Ninth", "comedy", "pink");
        Movie tenth = new Movie(10, "Tenth", "action", "blue");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastTenMoviesOutOfEleven() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "action", "red");
        Movie second = new Movie(2, "Forward", "animation", "blue");
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", "coloured");
        Movie fourth = new Movie(4, "Gentlemen", "action", "white");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "grey");
        Movie sixth = new Movie(6, "Trolls", "animation", "violet");
        Movie seventh = new Movie(7, "Number One", "comedy", "orange");
        Movie eighth = new Movie(8, "Eighth", "horror", "black");
        Movie ninth = new Movie(9, "Ninth", "comedy", "pink");
        Movie tenth = new Movie(10, "Tenth", "action", "blue");
        Movie eleventh = new Movie(11, "Eleventh", "animation", "purple");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSaveTheMovie() {
        MovieManager manager = new MovieManager();
        Movie fourth = new Movie(1, "Gentlemen", "action", "white");
        manager.save(fourth);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastSevenMoviesOutOfSeven() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "action", "red");
        Movie second = new Movie(2, "Forward", "animation", "blue");
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", "coloured");
        Movie fourth = new Movie(4, "Gentlemen", "action", "white");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "grey");
        Movie sixth = new Movie(6, "Trolls", "animation", "violet");
        Movie seventh = new Movie(7, "Number One", "comedy", "orange");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastSixMoviesOutOfSeven() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "action", "red");
        Movie second = new Movie(2, "Forward", "animation", "blue");
        Movie third = new Movie(3, "Hotel Belgrade", "comedy", "coloured");
        Movie fourth = new Movie(4, "Gentlemen", "action", "white");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "grey");
        Movie sixth = new Movie(6, "Trolls", "animation", "violet");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}
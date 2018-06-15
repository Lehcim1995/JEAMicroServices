package service;

import domain.DLC;
import domain.Game;
import domain.Genre;
import domain.User;
import rest.REstClient;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.GenericEntity;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class KafkaService
{
    private static final String IP = "http://localhost";
    private static final String PORT = "61274";
    private static final String BASEURL = IP + ":" + PORT + "/";
    private static final String GAMES = "Games/";
    private static final String DLC = "DLC/";
    private static final String USER = "User/";
    private static final String REST = "rest/";

    @Inject
    private REstClient client;

    public List<User> getInvitablePlayersKafka(Game game)
    {
        // Make kafka call to all services
        List<User> users = new ArrayList<>();
        return users;
    }

    public List<User> getInvitablePlayers(Game game)
    {

        // get game genres
        System.out.println(BASEURL + GAMES + REST + game.getId());
        Game game1 = client.getREstResponse(BASEURL + GAMES + REST + "game/" + game.getId(), Game.class);
        List<Genre> genres = game1.getGenres();

        // get games based on genres
        List<Game> games = new ArrayList<>();
        System.out.println(BASEURL + GAMES + REST + "genre/");
        genres.forEach(genre -> {
            List<Game> lol = client.getREstResponseList(BASEURL + GAMES + REST + "game/genre/" + genre.getName(), Game[].class);
            games.addAll(lol);
        });

        List<User> users = new ArrayList<>();
                // get owners of these games
        System.out.println(BASEURL + USER + REST + "user/games/");
        games.forEach( game2 -> {
            List<User> lol = client.getREstResponseList(BASEURL + USER + REST + "user/games/" + game2.getId() , User[].class);
            users.addAll(lol);
        });

        return users;
    }
}

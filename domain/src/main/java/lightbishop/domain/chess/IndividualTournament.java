package lightbishop.domain.chess;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndividualTournament extends Tournament {

    private List<Player> players;

    protected IndividualTournament(TournamentState tournamentState, TournamentType tournamentType){
        super();
        this.tournamentType = tournamentType;
        this.tournamentState = tournamentState;
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public List<Player> getStartList(){
        return Collections.unmodifiableList(players);
    }
}

package lightbishop.domain.chess;


import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndividualTournament extends Tournament {

    private List<Player> players;

    private static final List<PlayerSortingField> DEFAULT_SORTING_ORDER = Collections.singletonList(PlayerSortingField.SURNAME);

    @Setter
    private List<PlayerSortingField> startListSortingRules;

    IndividualTournament(TournamentState tournamentState, TournamentType tournamentType){
        super();
        this.tournamentType = tournamentType;
        this.tournamentState = tournamentState;
        players = new ArrayList<>();
        startListSortingRules = DEFAULT_SORTING_ORDER;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public List<Player> getStartList(){
        players.sort(ComparatorBuilder.comparatorFromFields(startListSortingRules));
        return Collections.unmodifiableList(players);
    }
}

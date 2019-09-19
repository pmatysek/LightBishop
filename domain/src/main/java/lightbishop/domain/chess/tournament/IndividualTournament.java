package lightbishop.domain.chess.tournament;


import lightbishop.domain.chess.common.ComparatorBuilder;
import lightbishop.domain.chess.player.Player;
import lightbishop.domain.chess.player.PlayerSortingField;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndividualTournament extends Tournament {

    private List<Player> players;

    private static final List<PlayerSortingField> DEFAULT_START_LIST_SORTING_ORDER = Collections.singletonList(PlayerSortingField.SURNAME);

    private static final List<PlayerSortingField> DEFAULT_RESULTS_SORTING_ORDER = Collections.singletonList(PlayerSortingField.SURNAME);

    @Setter
    private List<PlayerSortingField> startListSortingRules;

    @Setter
    private List<PlayerSortingField> resultsSortingRules;

    IndividualTournament(TournamentState tournamentState, TournamentType tournamentType){
        super();
        this.tournamentType = tournamentType;
        this.tournamentState = tournamentState;
        players = new ArrayList<>();
        startListSortingRules = DEFAULT_START_LIST_SORTING_ORDER;
        resultsSortingRules = DEFAULT_RESULTS_SORTING_ORDER;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public List<Player> getStartList(){
        players.sort(ComparatorBuilder.comparatorFromFields(startListSortingRules));
        return Collections.unmodifiableList(players);
    }

    public List<Player> getResults(){
        players.sort(ComparatorBuilder.comparatorFromFields(resultsSortingRules));
        return Collections.unmodifiableList(players);
    }
}

package lightbishop.domain.chess;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of", access = AccessLevel.PRIVATE)
public class Tournament {

    private TournamentState tournamentState;

    private TournamentType tournamentType;

    public static Tournament newRoundRobinTournamentOf(){
        return Tournament.of(TournamentState.CREATED, TournamentType.ROUND_ROBIN);
    }
}

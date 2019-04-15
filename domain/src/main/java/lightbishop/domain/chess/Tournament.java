package lightbishop.domain.chess;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Tournament {

    protected TournamentState tournamentState;

    protected TournamentType tournamentType;

    public static IndividualTournament newIndividualRoundRobinTournamentOf(){
        return new IndividualTournament(TournamentState.CREATED, TournamentType.ROUND_ROBIN);
    }

    public static IndividualTournament newIndividualSwissTournamentOf(){
        return new IndividualTournament(TournamentState.CREATED, TournamentType.SWISS);
    }

    public static TeamTournament newTeamRoundRobinTournamentOf(){
        return new TeamTournament(TournamentState.CREATED, TournamentType.ROUND_ROBIN);
    }

    public static TeamTournament newTeamSwissTournamentOf(){
        return new TeamTournament(TournamentState.CREATED, TournamentType.SWISS);
    }
}

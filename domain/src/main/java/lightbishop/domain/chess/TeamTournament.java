package lightbishop.domain.chess;


public class TeamTournament extends Tournament {

    protected TeamTournament(TournamentState tournamentState, TournamentType tournamentType){
        super();
        this.tournamentType = tournamentType;
        this.tournamentState = tournamentState;
    }
}

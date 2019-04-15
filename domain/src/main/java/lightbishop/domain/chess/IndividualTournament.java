package lightbishop.domain.chess;


public class IndividualTournament extends Tournament {

    protected IndividualTournament(TournamentState tournamentState, TournamentType tournamentType){
        super();
        this.tournamentType = tournamentType;
        this.tournamentState = tournamentState;
    }
}

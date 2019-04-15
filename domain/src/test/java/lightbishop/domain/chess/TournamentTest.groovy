package lightbishop.domain.chess

import spock.lang.Specification

class TournamentTest extends Specification {

    def "when new individual round-robin tournament is created it should has status CREATED and ROUND_ROBIN type"() {
        when:
        def tournament = Tournament.newIndividualRoundRobinTournamentOf()

        then:
        tournament instanceof IndividualTournament
        tournament.getTournamentType() == TournamentType.ROUND_ROBIN
        tournament.getTournamentState() == TournamentState.CREATED
    }

    def "when new individual swiss tournament is created it should has status CREATED and SWISS type"() {
        when:
        def tournament = Tournament.newIndividualSwissTournamentOf()

        then:
        tournament instanceof IndividualTournament
        tournament.getTournamentType() == TournamentType.SWISS
        tournament.getTournamentState() == TournamentState.CREATED
    }

    def "when new team round-robin tournament is created it should has status CREATED and ROUND_ROBIN type"() {
        when:
        def tournament = Tournament.newTeamRoundRobinTournamentOf()

        then:
        tournament instanceof TeamTournament
        tournament.getTournamentType() == TournamentType.ROUND_ROBIN
        tournament.getTournamentState() == TournamentState.CREATED
    }

    def "when new team swiss tournament is created it should has status CREATED and SWISS type"() {
        when:
        def tournament = Tournament.newTeamSwissTournamentOf()

        then:
        tournament instanceof TeamTournament
        tournament.getTournamentType() == TournamentType.SWISS
        tournament.getTournamentState() == TournamentState.CREATED
    }
}

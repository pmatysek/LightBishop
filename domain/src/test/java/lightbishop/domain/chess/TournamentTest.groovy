package lightbishop.domain.chess

import spock.lang.Specification

class TournamentTest extends Specification {

    def "when new round-robin tournament is created it should has status CREATED and ROUND_ROBIN type"() {
        when:
        def tournament = Tournament.newRoundRobinTournamentOf()

        then:
        tournament.getTournamentType() == TournamentType.ROUND_ROBIN
        tournament.getTournamentState() == TournamentState.CREATED
    }
}

package lightbishop.domain.chess

import spock.lang.Specification

import java.time.LocalDate

class IndividualTournamentTest extends Specification {
    def "wen player is added to tournament then tournament's players list should contain that player"() {
        when:
        def tournament = Tournament.newIndividualRoundRobinTournamentOf()
        def player = Player.of(PersonalData.of("Jan", "Kowalski", LocalDate.now()))
        tournament.addPlayer(player)

        then:
        tournament.getStartList().contains(player)
    }

}

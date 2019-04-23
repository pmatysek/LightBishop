package lightbishop.domain.chess

import spock.lang.Specification

import java.time.LocalDate

import static lightbishop.domain.chess.PlayerSortingField.*

class IndividualTournamentTest extends Specification {
    def "when player is added to tournament then tournament's players list should contain that player"() {
        given:
        def tournament = Tournament.newIndividualRoundRobinTournamentOf()
        def player = Player.of(PersonalData.of("Jan", "Kowalski", LocalDate.now()))
        when:
        tournament.addPlayer(player)

        then:
        tournament.getStartList().contains(player)
    }

    def "when sorting field is set then tournament's start list should be in proper order"(PlayerSortingField sortingField, String name) {
        given:
        def tournament = Tournament.newIndividualRoundRobinTournamentOf()
        tournament.addPlayer(Player.of(PersonalData.of("A", "C", LocalDate.of(2018, 1, 1))))
        tournament.addPlayer(Player.of(PersonalData.of("B", "B", LocalDate.of(2017, 1, 1))))
        tournament.addPlayer(Player.of(PersonalData.of("C", "A", LocalDate.of(2019, 1, 1))))
        tournament.setStartListSortingRules(Collections.singletonList(sortingField))
        List<Player> startList = tournament.getStartList()

        expect:
        startList.get(0).getPersonalData().getName() == name

        where:
        sortingField | name
        NAME         | "A"
        SURNAME      | "C"
        BIRTH_DATE   | "B"
    }

    def static p1 = Player.of(PersonalData.of("A", "B", LocalDate.of(2018, 1, 1)))
    def static p2 = Player.of(PersonalData.of("A", "A", LocalDate.of(2019, 1, 1)))
    def static p3 = Player.of(PersonalData.of("B", "A", LocalDate.of(2017, 1, 1)))
    def static p4 = Player.of(PersonalData.of("C", "C", LocalDate.of(2017, 1, 1)))

    def "when sorting field order is set then tournament's start list should be in proper order"(List<PlayerSortingField> sortingRules, List<Player> expectedStartList) {
        given:
        def tournament = Tournament.newIndividualRoundRobinTournamentOf()

        tournament.addPlayer(p1)
        tournament.addPlayer(p2)
        tournament.addPlayer(p3)
        tournament.addPlayer(p4)
        tournament.setStartListSortingRules(sortingRules)
        List<Player> startList = tournament.getStartList()

        expect:
        startList == expectedStartList

        where:
        sortingRules               | expectedStartList
        [NAME, SURNAME, BIRTH_DATE] | [p1, p1, p3, p4]
        [NAME, BIRTH_DATE, SURNAME] | [p1, p2, p3, p4]
        [SURNAME, NAME, BIRTH_DATE] | [p2, p3, p1, p4]
        [SURNAME, BIRTH_DATE, NAME] | [p3, p2, p1, p4]
        [BIRTH_DATE, NAME, SURNAME] | [p3, p4, p1, p2]
    }

}

package lightbishop.domain.chess.pairing;

import lightbishop.domain.chess.common.Game;

import java.util.List;

public interface Pairing {
    List<Game> getPairingForRound(int round);

    List<List<Game>> getPairingsForAllAvailableRounds();

    void pairAvailableRounds();
}
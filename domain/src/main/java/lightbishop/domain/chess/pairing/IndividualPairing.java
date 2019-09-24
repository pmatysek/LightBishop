package lightbishop.domain.chess.pairing;

import lightbishop.domain.chess.common.Game;
import lightbishop.domain.chess.player.Player;

import java.util.List;

public abstract class IndividualPairing {

    protected List<List<Game>> pairings;

    public List<Game> getPairingForRound(int round) throws PairingException {
        if(pairings == null || round <= 0 || round > pairings.size()){
            throw new PairingException("IndividualPairing not available for round: " + round + " !");
        }
        return pairings.get(round);
    }

    public List<List<Game>> getPairingsForAllAvailableRounds() {
        return pairings;
    }

    public abstract void pairAvailableRounds(List<Player> results);
}
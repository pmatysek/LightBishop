package lightbishop.domain.chess;

import java.util.Comparator;

public enum PlayerSortingField implements SortingField<Player>{
    NAME(Comparator.comparing((Player p) -> p.getPersonalData().getName())),
    SURNAME(Comparator.comparing((Player p) -> p.getPersonalData().getSurname())),
    BIRTH_DATE(Comparator.comparing((Player p) -> p.getPersonalData().getBirthDate()));

    private final Comparator<Player> comparingFunction;

    PlayerSortingField(Comparator<Player> comparingFunction) {
        this.comparingFunction = comparingFunction;
    }

    public Comparator<Player> getComparingFunction() {
        return this.comparingFunction;
    }
}
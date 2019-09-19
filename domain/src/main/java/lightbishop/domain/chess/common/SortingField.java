package lightbishop.domain.chess.common;

import java.util.Comparator;

public interface SortingField<T> {
    Comparator<T> getComparingFunction();
}

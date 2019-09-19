package lightbishop.domain.chess.common;

import java.util.Comparator;
import java.util.List;

public class ComparatorBuilder {
    public static <T> Comparator<T> comparatorFromFields(List<? extends SortingField<T>> sortingFields) {
        if (sortingFields == null || sortingFields.size() < 1) {
            throw new IllegalArgumentException("The sorting order is not defined!");
        }

        return sortingFields.stream()
                .map(SortingField::getComparingFunction)
                .reduce(Comparator::thenComparing)
                .get();
    }

}

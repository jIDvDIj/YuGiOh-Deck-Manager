package YuGiOh_Deck_Finder.repository;

import YuGiOh_Deck_Finder.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}

package YuGiOh_Deck_Finder.repository;

import YuGiOh_Deck_Finder.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Long> {
}
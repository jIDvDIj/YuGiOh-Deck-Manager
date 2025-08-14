package YuGiOh_Deck_Finder;

import YuGiOh_Deck_Finder.model.Card;
import YuGiOh_Deck_Finder.model.Deck;
import YuGiOh_Deck_Finder.repository.CardRepository;
import YuGiOh_Deck_Finder.repository.DeckRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class YuGiOhDeckFinderApplicationTests {

    @Autowired
    private DeckRepository deckRepository;

    @Autowired
    private CardRepository cardRepository;

    @Test
    void testPersistDeckWithCards() {
        Card card = new Card();
        card.setName("Blue-Eyes White Dragon");
        cardRepository.save(card);

        Deck deck = new Deck();
        deck.setName("Dragon Deck");
        deck.getCards().add(card);
        deckRepository.save(deck);

        Deck found = deckRepository.findById(deck.getId()).orElse(null);
        assertNotNull(found);
        assertEquals("Dragon Deck", found.getName());
        assertEquals(1, found.getCards().size());
    }
}
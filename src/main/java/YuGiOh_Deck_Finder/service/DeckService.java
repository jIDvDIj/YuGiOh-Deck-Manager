package YuGiOh_Deck_Finder.service;

import YuGiOh_Deck_Finder.model.Deck;
import YuGiOh_Deck_Finder.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class DeckService {

        @Autowired
        private DeckRepository deckRepository;

        public Deck save(Deck deck) {
            return deckRepository.save(deck);
        }

        public List<Deck> findAll() {
            return deckRepository.findAll();
        }

        public Optional<Deck> findById(Long id) {
            return deckRepository.findById(id);
        }

        public void deleteById(Long id) {
            deckRepository.deleteById(id);
        }

}

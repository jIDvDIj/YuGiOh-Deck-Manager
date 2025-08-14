package YuGiOh_Deck_Finder.service;


import YuGiOh_Deck_Finder.model.Card;
import YuGiOh_Deck_Finder.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CardService(CardRepository cardRepository) {

    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    public Card save(Card card) {
        return cardRepository.save(card);
    }

    public void delete(Long id) {
        cardRepository.deleteById(id);
    }


}

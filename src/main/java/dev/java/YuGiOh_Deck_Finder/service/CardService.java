package dev.java.YuGiOh_Deck_Finder.service;


import dev.java.YuGiOh_Deck_Finder.model.Card;
import dev.java.YuGiOh_Deck_Finder.repository.CardRepository;

import java.util.List;


public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getAll() {return cardRepository.findAll();}

    public Card save(Card card) {
        return cardRepository.save(card);
    }

    public void delete(Long Id){
        cardRepository.deleteById(Id);
    }


}

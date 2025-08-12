package dev.java.YuGiOh_Deck_Finder.controller;

import dev.java.YuGiOh_Deck_Finder.model.Card;
import dev.java.YuGiOh_Deck_Finder.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;


    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getAll() {
        return cardService.getAll();
    }

    @PostMapping
    public Card create(@RequestBody Card card){
        return cardService.save(card);
    }
}

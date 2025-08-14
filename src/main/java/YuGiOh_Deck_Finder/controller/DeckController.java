package YuGiOh_Deck_Finder.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deck")
public class DeckController {

    private final DeckService deckService;

    public DeckController(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping
    public List<Deck> getAll() {
        return deckService.getAll();
    }
    @PostMapping
    public Deck create(@RequestBody Deck deck) {
        return deckService.save(deck);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deckService.delete(id);}

    @PutMapping("/{id}")
    public Deck update(@PathVariable Long id, @RequestBody Deck deck) {
        deck.setId(id);
        return deckService.save(deck);
    }
    @GetMapping("/{id}")
    public Deck getById(@PathVariable Long id) {
        return deckService.getById(id);
    }

}

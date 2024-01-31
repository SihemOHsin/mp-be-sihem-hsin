package soa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import soa.entities.Categorie;
import soa.repository.CategorieRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/categories")
public class CategorieRESTController {

    @Autowired
    private CategorieRepository categorieRepos;

    @GetMapping(value = "/index")
    public String accueil() {
        return "Bienvenue au service Web REST 'categories'.....";
    }

    @GetMapping(
            value = "/",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public List<Categorie> getAllCategories() {
        return categorieRepos.findAll();
    }
}

    /*
    @GetMapping(
            value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public Categorie getCategorie(@PathVariable Long id) {
        Categorie c = categorieRepos.findById(id).get();
        return c;
    }

    @GetMapping(
            value = "/delete/{id}")
    public void deleteCategorie(@PathVariable Long id) {
        categorieRepos.deleteById(id);
    }

    @PostMapping(
            value = "/",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public Categorie saveCategorie(@RequestBody Categorie c) {
        return categorieRepos.save(c);
    }

    @PutMapping(
            value = "/",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public Categorie updateCategorie(@RequestBody Categorie c) {
        return categorieRepos.save(c);
    }

    @DeleteMapping(
            value = "/")
    public void deleteCategorie(@RequestBody Categorie c) {
        categorieRepos.delete(c);
    }
    */


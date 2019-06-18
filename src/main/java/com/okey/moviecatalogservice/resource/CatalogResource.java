package com.okey.moviecatalogservice.resource;

import com.okey.moviecatalogservice.model.MovieCatalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @GetMapping("/{userId}")
    public List<MovieCatalog> getCatalog(@PathVariable("userId") String userId  ) {
        return List.of(
                new MovieCatalog("Transformers",
                        "it is awesome movie", 4),
                new MovieCatalog("Titanic",
                        "This is iconic love Story.", 5));
    }

}

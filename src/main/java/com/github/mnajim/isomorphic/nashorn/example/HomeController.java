package com.github.mnajim.isomorphic.nashorn.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private MovieService service;

    private React react;

    private ObjectMapper mapper;

    @Autowired
    public HomeController(MovieService service) {
        this.service = service;
        this.react = new React();
        this.mapper = new ObjectMapper();
    }

    @RequestMapping("/")
    public String index(Map<String, Object> model, @RequestParam(value = "ssr", defaultValue = "true", required = false) Boolean ssr) throws Exception {
        List<Movie> movies = service.getMovies();
        String markup = (ssr) ? react.render(movies) : "";
        String data = mapper.writeValueAsString(movies);
        model.put("content", markup);
        model.put("data", data);
        return "index";
    }

}
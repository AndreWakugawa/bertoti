package com.andrewakugawa.firstserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class FirstserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstserverApplication.class, args);
	}

}

@RestController
@RequestMapping("/films")
class FirstserverAppController {
	private List<Film> films = new ArrayList<>();

	public FirstserverAppController() {
		films.addAll(List.of(
				new Film("Interestelar","Sci-fi",2014),
				new Film("Forrest Gump","Comédia Dramática", 1994),
				new Film("Matrix","Sci-fi",1999),
				new Film("O Senhor dos Anéis: A Sociedade do Anel", "Aventura", 2001)
		));
	}

	@GetMapping
	Iterable<Film> getFilms() {
		return films;
	}

	@GetMapping("/{id}")
	Optional<Film> getFilmbyID(@PathVariable String id) {
		for (Film f: films) {
			if (f.getId().equals(id)) {
				return Optional.of(f);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Film postFilm(@RequestBody Film film) {
		films.add(film);
		return film;
	}

	@PutMapping("/{id}")
	ResponseEntity<Film> putFilm(@PathVariable String id,
								 @RequestBody Film film) {
		int filmIndex = -1;

		for (Film f: films){
			if (f.getId().equals(id)) {
				filmIndex = films.indexOf(f);
				films.set(filmIndex, film);
			}
		}

		return (filmIndex == -1) ?
				new ResponseEntity<>(postFilm(film), HttpStatus.CREATED) :
				new ResponseEntity<>(film, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteFilm(@PathVariable String id) {
		films.removeIf(f -> f.getId().equals(id));
	}
}



class Film {
	private final String id;
	private String name;
	private String genero;
	private int ano;

	public Film(String name, String genero, int ano) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.genero = genero;
		this.ano = ano;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}


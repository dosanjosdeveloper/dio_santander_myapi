package br.com.dosanjosdeveloper.MyListGames.controller;

import br.com.dosanjosdeveloper.MyListGames.model.DataGames;
import br.com.dosanjosdeveloper.MyListGames.repository.GameDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Controller
public class GameControllerHome {

    @Autowired
    private GameDataRepository repository;

    @GetMapping("/")
    public String MyListGames(){return "index.html";}

    @PostMapping
    public ResponseEntity<DataGames> novoGame(@RequestBody DataGames games){
        try {
            DataGames savedGane = repository.save(games);
            return new ResponseEntity<>(savedGane, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/lista")
    public List<DataGames> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity gameDetail(@PathVariable Long id){
        var game = repository.findById(id);
        return ResponseEntity.ok(game);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable Long id){

        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
    }


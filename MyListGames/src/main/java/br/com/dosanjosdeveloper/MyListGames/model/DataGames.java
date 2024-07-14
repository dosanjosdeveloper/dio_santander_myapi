package br.com.dosanjosdeveloper.MyListGames.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Getter
@Setter
@Data
@Entity
public class DataGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nomeGame;
    @NotNull
    private String plataforma;
    @NotNull
    private String tipoMidia; // Digital ou Blue Ray Disc
    @NotNull
    private int anoLancamento;
    @NotNull
    private String sinopse;
    @NotNull
    private String genero;
    @NotNull
    private int faixaetaria;

    public void setId(int id) {
        this.id = id;
    }
}

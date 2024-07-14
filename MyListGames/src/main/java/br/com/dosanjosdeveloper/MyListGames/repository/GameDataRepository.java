package br.com.dosanjosdeveloper.MyListGames.repository;

import br.com.dosanjosdeveloper.MyListGames.model.DataGames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDataRepository  extends JpaRepository<DataGames, Long> {
}

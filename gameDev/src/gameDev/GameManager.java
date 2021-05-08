package gameDev;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
	private List<Game> gameList = new ArrayList<Game>();

	@Override
	public void add(Game game) {
		gameList.add(game);
		System.out.println(game.getName(game) + " Ba�ar�yla sat�� listesine eklendi");

	}

	@Override
	public void delete(Game game) {
		if (gameList.contains(game)) {
			gameList.remove(game);
			System.out.println(game.getName(game) + " Ba�ar�yla sat�� listesinden kald�r�ld�");
		} else {
			System.out.println("B�yle bir oyun bulunamad�");
		}

	}

	@Override
	public void update(int id, Game game) {
		Game gameToUpdate = null;
		
		for (Game loopGame : gameList) {
			if (loopGame.getId() == id) {
				gameToUpdate = loopGame;
				break;
			}
		}
		if (gameList.contains(gameToUpdate)) {
			gameList.remove(gameToUpdate);
			gameList.add(game);
			System.out.println(gameToUpdate.getName(gameToUpdate) + " Oyunu " + game.getName(game) + " olarak g�ncellendi");
		} else {
			System.out.println("B�yle bir oyun yok");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package gameDev;

import java.util.ArrayList;
import java.util.List;

public class GamerManager implements GamerService {
	private GamerCheckService gamerCheckService;

	private List<Gamer> gamerList = new ArrayList<Gamer>();

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			gamerList.add(gamer);
			System.out.println(gamer.getFirstName() + " baþarýyla eklendi");
		}
		else {
			System.out.println("kullanýcý doðrulanamadý");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		if (gamerList.contains(gamer)) {
			gamerList.remove(gamer);
			System.out.println(gamer.getFirstName() + " baþarýyla silindi");
		} else {
			System.out.println("Böyle bir gamer yok");
		}
	}

	@Override
	public void update(int id, Gamer gamer) {
		Gamer gamerUpdate = null;
		for (Gamer gamer1 : gamerList) {
			if (gamer1.getId() == id) {
				gamerUpdate = gamer1;
				break;
			}
		}
		if (gamerList.contains(gamerUpdate)) {
			gamerList.remove(gamerUpdate);
			gamerList.add(gamer);
			System.out.println(gamerUpdate.getFirstName() + " kullanýcýsý " + gamer.getFirstName()
					+ " kullanýcýsýna baþarýyla güncellendi");
		} else {
			System.out.println("gamer bulunamadý");
		}
	}

}

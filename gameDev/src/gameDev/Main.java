package gameDev;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Emmy", "Scoot", LocalDate.of(2020, 1, 1), "11111111111");
		Gamer gamer1 = new Gamer(1, "Fatih", "Scoot", LocalDate.of(2020, 1, 1), "11111111111");

		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
        gamerManager.add(gamer);
        gamerManager.update(1, gamer1);
        gamerManager.delete(gamer);
        gamerManager.delete(gamer1);
        
        System.out.println("------------------------------------------------------------------------------------");
        
        
        Game gtav = new Game(1, "GTA-V", "Rockstar Games", LocalDate.of(2013, 9, 17), 156.00, 0);
        Game pubg = new Game(2, "PUBG", "KRAFTON, Inc.", LocalDate.of(2017, 12, 21), 87.00, 0);
        
        
        
        GameManager gameManager = new GameManager();
        gameManager.add(pubg);
        gameManager.add(gtav);
        gameManager.update(1, pubg);
        gameManager.delete(pubg);
        
        
        System.out.println("------------------------------------------------------------------------------------");

        
        Campaign campaign = new Campaign(1, "Yaz", 10);
        Campaign campaign1 = new Campaign(2, "Kýþ", 50);

        
    
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(1, campaign1);
		campaignManager.delete(campaign);
		campaignManager.campaign(campaign1, pubg);
		

		
		

	}

}

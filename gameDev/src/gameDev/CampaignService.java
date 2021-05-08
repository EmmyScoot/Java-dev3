package gameDev;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
    void update(int id ,Campaign campaign);
    void campaign(Campaign campaign , Game game);
}

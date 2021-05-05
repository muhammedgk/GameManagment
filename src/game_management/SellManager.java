package game_management;

public class SellManager implements SellService{

	@Override
	public void sellCampaign(Campaign campaign) {
		System.out.println("Tebrikler! Satýn aldýðýnýz kampanya : "+campaign.getCampaignName());
		
	}

}

package game_management;

public class SellManager implements SellService{

	@Override
	public void sellCampaign(Campaign campaign) {
		System.out.println("Tebrikler! Sat�n ald���n�z kampanya : "+campaign.getCampaignName());
		
	}

}

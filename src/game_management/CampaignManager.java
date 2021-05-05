package game_management;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi : "+campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi : "+campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign,Campaign campaign2) {
		System.out.println("Mevcut Kampanyan�z "+campaign.getCampaignName()+", "+campaign2.getCampaignName()+" ile de�i�tirildi.");
		
	}

}

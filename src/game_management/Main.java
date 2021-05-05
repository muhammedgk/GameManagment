package game_management;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Gamer gamer = new Gamer(1, "Muhammed", "Gedük", 1999, "38401368160");

		Campaign student = new Campaign(1, "Öðrenci Kampanyasý");
		Campaign memur = new Campaign(2, "Memur Kampanyasý");
		Campaign emekli = new Campaign(2, "Emekli Kampanyasý");
		CampaignManager campaignManager = new CampaignManager();
		GamerManager gamerManager = new GamerManager();
		SellManager sellManager = new SellManager();

		campaignManager.addCampaign(student);
		campaignManager.updateCampaign(student, memur);
		campaignManager.deleteCampaign(student);
		gamerManager.add(gamer);
		sellManager.sellCampaign(student);
		campaignManager.updateCampaign(memur, emekli);

	}

}

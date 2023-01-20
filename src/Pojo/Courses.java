package Pojo;

import java.util.List;

public class Courses {
	private List<Webautomation> webautomation;
	private List<Apitesting> apitesting;
	private List<Manualtesting>  manualtesting;

	public List<Webautomation> getWebautomation() {
		return webautomation;
	}
	public void setWebautomation(List<Webautomation> webautomation) {
		this.webautomation = webautomation;
	}
	public List<Apitesting> getApitesting()  {
		return apitesting;
	}
	public void setApitesting(List<Apitesting> apitesting) {
		this.apitesting = apitesting;
	}
	public List<Manualtesting> getManualTestin() {
		return manualtesting;
	}
	public void setManualTestin(List<Manualtesting> manualTestin) {
		manualtesting = manualTestin;
	}


}

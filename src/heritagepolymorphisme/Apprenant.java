package heritagepolymorphisme;

public class Apprenant extends Personne {
	
	private String lieuDeTravail;
	public enum Os {INDEFINI, WINDOWS, MAC, LINUX};
	private Os system;
	
	public Apprenant(String firstName, int age, String lieuDeTravail, Os system) {
		super(firstName, age);
		this.lieuDeTravail = lieuDeTravail;
		this.system = system;
	}

	public String getLieuDeTravail() {
		return lieuDeTravail;
	}

	public void setLieuDeTravail(String lieuDeTravail) {
		this.lieuDeTravail = lieuDeTravail;
	}
	
	public Os getSystem() {
		return system;
	}

	public void setSystem(Os system) {
		this.system = system;
	}

	public void travailler() {
		System.out.println("Dur dur java !");
	}
	
	public void chomer() {
		System.out.println("Ah que j’aime les pauses café …");
	}
	
	public void bonjour() {
		StringBuilder message = new StringBuilder();
		super.bonjour();
		if (system == Os.INDEFINI) {
			message.append("Tu ne connais pas encore ton OS !");
		} else if (system == Os.WINDOWS) {
			message.append("Tu vas bosser sur Windows ! Super, comme en formation !");
		} else if (system == Os.LINUX) {
			message.append("Tu vas bosser sur Linux ! Tu aimes la liberté !");
		}else {
			message.append("Tu vas bosser sur Mac ! Ouille ! Mais bon, un linux se cache sous le capot…");
		}
		message.append("\nTon lieu de travail est à " + lieuDeTravail);
		System.out.println(message);
	}
}

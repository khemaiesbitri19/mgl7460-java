package ca.uqam.mgl7460.tp1.types.traitements.instances;

public class EtatProcessus {
	private final InstanceTache tacheCourante;
	private final EtatTraitement etatTraitement;

	public EtatProcessus(InstanceTache tacheCourante, EtatTraitement etatTraitement) {
		this.tacheCourante = tacheCourante;
		this.etatTraitement = etatTraitement;
	}

	public InstanceTache getTacheCourante() {
		return tacheCourante;
	}

	public EtatTraitement getEtatTraitement() {
		return etatTraitement;
	}

	// Compatibility methods (record-style accessors used elsewhere in the code)
	public InstanceTache tacheCourante() {
		return getTacheCourante();
	}

	public EtatTraitement etatTraitement() {
		return getEtatTraitement();
	}
}

package by.tc.task01.entity;

public class Appliance {
	String info;

	public Appliance() {
		
	}

	public Appliance(String parameters) {
		this.info = parameters;
	}

	public String getParameters() {
		return info;
	}

	public void setParameters(String parameters) {
		this.info = parameters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [info=" + info + "]";
	}
	
	
	
	
}

package uwoMaps;

public class regularPOI extends POI{
	
	private MetaData metadata;

	public regularPOI(String POIname, float Xposition, float Yposition, Floor floor, MetaData mt , Boolean vis) {
		super(POIname, Xposition, Yposition, floor, vis);
		setMetadata(mt);
		// TODO Auto-generated constructor stub
	}

	public MetaData getMetadata() {
		return metadata;
	}

	private void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
	
	
}

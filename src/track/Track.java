package track;

/**
 * Provides values for race tracks.
 * @author Spencer
 *
 */
public class Track {
	private double length;
	private String trackType;
	
	/**
	 * Constructor for Track. Creates a race track based off provided values.
	 * @param length. A double which determines the length of the track.
	 * @param trackType. A String informing what type of road the the track is composed of. Valid inputs "OnRoad" and "OffRoad"
	 * @throws Exception Will throw exception if an invalid track type is passed
	 */
	public Track(double length, String trackType) throws Exception {
		this.length = length;
		this.trackType = trackType;
		if(!(trackType == "OnRoad" || trackType == "OffRoad")) {
			throw new Exception("Invalid Track Type");
		}
	}

	/**
	 * Random Constructor for Track. Creates a track of random length. Track Type is based off of input.
	 * @param trackType A String informing what type of road the the track is composed of. Valid inputs "OnRoad" and "OffRoad"
	 * @throws Exception Will throw exception if an invalid track type is passed
	 */
	public Track( String trackType) throws Exception {
		this.length = Math.floor(Math.random() * (100 - 1 +1)) + 1; // Generates a random length for the track change the first value to change the max length.
		this.trackType = trackType;
		if(!(trackType == "OnRoad" || trackType == "OffRoad")) {
			throw new Exception("Invalid Track Type");
		}
	}

	/**
	 * 
	 * @return double length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * 
	 * @return String Track Type.
	 */
	public String getTrackType() {
		return trackType;
	}
	
	

}

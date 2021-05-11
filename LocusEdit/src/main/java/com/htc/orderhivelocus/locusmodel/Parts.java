/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Parts model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class Parts {

	Volume volume;
	Weight weight;
	public Parts() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the volume
	 */
	public Volume getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	/**
	 * @return the weight
	 */
	public Weight getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Parts [volume=" + volume + ", weight=" + weight + "]";
	}

	
}

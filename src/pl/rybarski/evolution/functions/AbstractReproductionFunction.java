package pl.rybarski.evolution.functions;

import pl.rybarski.evolution.Population;

public abstract class AbstractReproductionFunction {

	/**
	 * Reference to new population
	 */
	protected Population newPopulaton;
	/**
	 * Reference to new population
	 */
	protected Population oldPopulation;

	/**
	 * Return population after reproduction
	 * 
	 * @return Reference to population
	 * @see Population
	 */
	public Population getNewPopulation() {
		return this.newPopulaton;
	}

	/**
	 * Return population before reproduction
	 * 
	 * @return reference to population
	 * @see Population
	 */
	public Population getOldPopulation() {
		return this.oldPopulation;
	}

	/**
	 * Set Population which will be reproduct
	 * 
	 * @param oldPopulation Reference to population
	 */
	public void setOldPopulation(Population oldPopulation) {
		this.oldPopulation = oldPopulation;
	}
	
	public abstract void generateNewPopulation();

}
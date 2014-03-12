/*----------------------------------------------------------------------------------------------------------------
 * CupCarbon: OSM based Wireless Sensor Network design and simulation tool
 * www.cupcarbon.com
 * ----------------------------------------------------------------------------------------------------------------
 * Copyright (C) 2014 Ahcene Bounceur
 * ----------------------------------------------------------------------------------------------------------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *----------------------------------------------------------------------------------------------------------------*/

package wsn_simulation;

import org.jocl.cl_device_id;

/**
 * @author Ahcene Bounceur
 * @author Arezki Laga
 * @version 1.0
 */
public class GpuSimulation2 extends Thread {

	

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public GpuSimulation2() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void init() {
	
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void release() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void displayEnergy() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void getMin() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	private int getInt(cl_device_id device, int paramName) {
		return getInts(device, paramName, 1)[0];
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	private int[] getInts(cl_device_id device, int paramName, int numValues) {
		return null;
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public int getPlatform() {
		return 0;
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void createCommandeQueue() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public int createProgramNextInstruction() {
		return 0;
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public int createProgramConsumption() {
		return 0;
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public int createProgramStopCondition() {
		return 0;
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void createKernels() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void createBufferNextInstruction() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void setKernelNextInstructionArg() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void launchKernelNextInstruction() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void createBufferConsumption(Boolean first) {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void setKernelConsumptionArg(Boolean first) {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void launchKernelConsumption() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void createBufferFinal() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void setKernelStopConditionArg() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public void launchKernelFinal() {
	}

	// ------------------------------------------------------------
	// Run Simulation
	// ------------------------------------------------------------
	@Override
	public void run() {
	}

	// ------------------------------------------------------------
	//
	// ------------------------------------------------------------
	public boolean stopSimulation() {
		return false;
	}

}
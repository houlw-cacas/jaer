/**
 * 
 */
package ch.unizh.ini.jaer.projects.apsdvsfusion;

import net.sf.jaer.event.PolarityEvent;

/**
 * @author Dennis
 *
 */
public abstract class KernelProcessor implements SpikeHandler {

	boolean enabled = true;
	/**
	 * 
	 */
	public KernelProcessor() {
	}

	protected abstract void processSpike(int x, int y, int time, double value/*PolarityEvent.Polarity polarity*/);
	
	public void signalAt(int x, int y, int time, double value/*PolarityEvent.Polarity polarity*/) {
		if (enabled) {
			processSpike(x,y,time, value);
		}
	}

	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}

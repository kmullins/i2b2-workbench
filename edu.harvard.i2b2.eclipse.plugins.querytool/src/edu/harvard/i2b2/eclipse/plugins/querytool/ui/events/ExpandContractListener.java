package edu.harvard.i2b2.eclipse.plugins.querytool.ui.events;

import org.eclipse.swt.widgets.Control;

public interface ExpandContractListener 
{
	
	public void controlExpanded( Control control );
	public void controlContracted( Control control );
}

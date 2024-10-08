package org.osm2world.viewer.control.actions;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class HelpControlsAction extends AbstractAction {

	private static final long serialVersionUID = 9195787581575616092L; //generated serialVersionUID

	public HelpControlsAction() {
		super("Controls");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "OSM2World GUI Controls:\n"
				+ "* left mouse button moves the camera position\n"
				+ "* right mouse button rotates the camera direction\n"
				+ "* mouse wheel or touchpad zoom moves the camera closer to or away from the ground\n"
				+ "* various forms of keyboard input are supported",
				"About OSM2World", JOptionPane.INFORMATION_MESSAGE);
	}

}

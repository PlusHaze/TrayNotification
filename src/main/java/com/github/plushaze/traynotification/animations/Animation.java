package com.github.plushaze.traynotification.animations;

import com.github.plushaze.traynotification.models.CustomStage;
import javafx.util.Duration;

public interface Animation {

	/**
	 * Plays both the show and dismiss animation using a sequential transition object
	 *
	 * @param dismissDelay Amount of delay before starting the dismiss animation
	 */
	void playSequential(Duration dismissDelay);

	/**
	 * Plays the implemented show animation
	 */
	void playShowAnimation();

	/**
	 * Plays the implemented dismiss animation
	 */
	void playDismissAnimation();

	/**
	 * @return whether or not the tray is current showing
	 */
	boolean isShowing();

	/**
	 * @return The custom stage of the animation
	 */
	CustomStage getStage();

}

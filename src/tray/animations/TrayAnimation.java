package tray.animations;

import javafx.util.Duration;

//All tray animations must implement TrayAnimation
public interface TrayAnimation {

    /**
     * The type of animation this class plays
     * @return The type of animation this class plays
     */
    AnimationType getAnimationType();

    /**
     * Plays both the show and dismiss animation using a sequential transition object
     * @param dismissDelay How long to delay the start of the dismiss animation
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
     * Signifies if the tray is current showing
     * @return boolean resultant
     */
    boolean isShowing();
}
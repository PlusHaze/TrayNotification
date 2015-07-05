package tray.animations;

import javafx.animation.*;
import tray.models.CustomStage;
import javafx.util.Duration;

public class PopupAnimation implements TrayAnimation {

    private final Timeline showAnimation, dismissAnimation;
    private final SequentialTransition sq;
    private final CustomStage stage;
    private boolean trayIsShowing;

    public PopupAnimation(CustomStage s) {

        this.stage = s;

        showAnimation = setupShowAnimation();
        dismissAnimation = setupDismissAnimation();

        sq = new SequentialTransition(setupShowAnimation(), setupDismissAnimation());
    }

    private Timeline setupDismissAnimation() {

        Timeline tl = new Timeline();

        KeyValue kv1 = new KeyValue(stage.yLocationProperty(), stage.getY() + stage.getWidth());
        KeyFrame kf1 = new KeyFrame(Duration.millis(2000), kv1);

        KeyValue kv2 = new KeyValue(stage.opacityProperty(), 0.0);
        KeyFrame kf2 = new KeyFrame(Duration.millis(2000), kv2);

        tl.getKeyFrames().addAll(kf1, kf2);

        tl.setOnFinished(e -> {
            trayIsShowing = false;
            stage.close();
            stage.setLocation(stage.getBottomRight());
        });

        return tl;
    }

    private Timeline setupShowAnimation() {

        Timeline tl = new Timeline();

        KeyValue kv1 = new KeyValue(stage.yLocationProperty(), stage.getBottomRight().getY() + stage.getWidth());
        KeyFrame kf1 = new KeyFrame(Duration.ZERO, kv1);

        KeyValue kv2 = new KeyValue(stage.yLocationProperty(), stage.getBottomRight().getY());
        KeyFrame kf2 = new KeyFrame(Duration.millis(1000), kv2);

        KeyValue kv3 = new KeyValue(stage.opacityProperty(), 0.0);
        KeyFrame kf3 = new KeyFrame(Duration.ZERO, kv3);

        KeyValue kv4 = new KeyValue(stage.opacityProperty(), 1.0);
        KeyFrame kf4 = new KeyFrame(Duration.millis(2000), kv4);

        tl.getKeyFrames().addAll(kf1, kf2, kf3, kf4);

        tl.setOnFinished(e -> trayIsShowing = true);

        return tl;
    }

    /**
     * The type of animation this class plays
     *
     * @return The type of animation this class plays
     */
    @Override
    public AnimationType getAnimationType() {
        return AnimationType.POPUP;
    }

    /**
     * Plays both the show and dismiss animation using a sequential transition object
     *
     * @param dismissDelay How long to delay the start of the dismiss animation
     */
    @Override
    public void playSequential(Duration dismissDelay) {
        sq.getChildren().get(1).setDelay(dismissDelay);
        sq.play();
    }

    /**
     * Plays the implemented show animation
     */
    @Override
    public void playShowAnimation() {
        showAnimation.play();
    }

    /**
     * Plays the implemented dismiss animation
     */
    @Override
    public void playDismissAnimation() {
        dismissAnimation.play();
    }

    /**
     * Signifies if the tray is current showing
     *
     * @return boolean resultant
     */
    @Override
    public boolean isShowing() {
        return trayIsShowing;
    }
}
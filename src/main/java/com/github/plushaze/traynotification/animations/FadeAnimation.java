package com.github.plushaze.traynotification.animations;

import com.github.plushaze.traynotification.models.CustomStage;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.util.Duration;

final class FadeAnimation extends AbstractAnimation {

	FadeAnimation(CustomStage stage) {
		super(stage);
	}

	@Override
	protected Timeline setupShowAnimation() {
		Timeline tl = new Timeline();

		// Sets opacity to 0.0 instantly which is pretty much invisible
		KeyValue kvOpacity = new KeyValue(stage.opacityProperty(), 0.0);
		KeyFrame frame1 = new KeyFrame(Duration.ZERO, kvOpacity);

		// Sets opacity to 1.0 (fully visible) over the time of 3000 milliseconds.
		KeyValue kvOpacity2 = new KeyValue(stage.opacityProperty(), 1.0);
		KeyFrame frame2 = new KeyFrame(Duration.millis(3000), kvOpacity2);

		tl.getKeyFrames().addAll(frame1, frame2);

		tl.setOnFinished(e -> trayIsShowing = true);

		return tl;
	}

	@Override
	protected Timeline setupDismissAnimation() {
		Timeline tl = new Timeline();

		// At this stage the opacity is already at 1.0

		// Lowers the opacity to 0.0 within 2000 milliseconds
		KeyValue kv1 = new KeyValue(stage.opacityProperty(), 0.0);
		KeyFrame kf1 = new KeyFrame(Duration.millis(2000), kv1);

		tl.getKeyFrames().addAll(kf1);

		// Action to be performed when the animation has finished
		tl.setOnFinished(e -> {
			trayIsShowing = false;
			stage.close();
			stage.setLocation(stage.getBottomRight());
		});

		return tl;
	}

}

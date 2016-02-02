package com.github.plushaze.traynotification.animations;

import javafx.animation.*;
import com.github.plushaze.traynotification.models.CustomStage;
import javafx.util.Duration;

final class PopupAnimation extends AbstractAnimation {

	PopupAnimation(CustomStage stage) {
		super(stage);
	}

	@Override
	protected Timeline setupDismissAnimation() {
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

	@Override
	protected Timeline setupShowAnimation() {
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

}

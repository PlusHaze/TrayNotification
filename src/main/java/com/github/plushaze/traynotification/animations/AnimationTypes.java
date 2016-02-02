package com.github.plushaze.traynotification.animations;

import com.github.plushaze.traynotification.models.CustomStage;

import java.util.function.Function;

public enum AnimationTypes implements AnimationType {

	SLIDE(SlideAnimation::new),
	FADE(FadeAnimation::new),
	POPUP(PopupAnimation::new);

	private final Function<CustomStage, AnimationType> newInstance;

	AnimationTypes(Function<CustomStage, AnimationType> newInstance) {
		this.newInstance = newInstance;
	}

	@Override
	public AnimationType newInstance(CustomStage stage) {
		return newInstance.apply(stage);
	}

}

package com.github.plushaze.traynotification.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomStage extends Stage {

	private final Location bottomRight;

	public CustomStage(AnchorPane ap, StageStyle style) {
		initStyle(style);

		setSize(ap.getPrefWidth(), ap.getPrefHeight());

		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		double x = screenBounds.getMinX() + screenBounds.getWidth() - ap.getPrefWidth() - 2;
		double y = screenBounds.getMinY() + screenBounds.getHeight() - ap.getPrefHeight() - 2;

		bottomRight = Location.at(x, y);
	}

	public Location getBottomRight() {
		return bottomRight;
	}

	public void setSize(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	public Location getOffScreenBounds() {
		Location loc = getBottomRight();

		return Location.at(loc.getX() + this.getWidth(), loc.getY());
	}

	public void setLocation(Location loc) {
		setX(loc.getX());
		setY(loc.getY());
	}

	private SimpleDoubleProperty xLocationProperty = new SimpleDoubleProperty() {
		@Override
		public void set(double newValue) {
			setX(newValue);
		}

		@Override
		public double get() {
			return getX();
		}
	};

	public SimpleDoubleProperty xLocationProperty() {
		return xLocationProperty;
	}

	private SimpleDoubleProperty yLocationProperty = new SimpleDoubleProperty() {
		@Override
		public void set(double newValue) {
			setY(newValue);
		}

		@Override
		public double get() {
			return getY();
		}
	};

	public SimpleDoubleProperty yLocationProperty() {
		return yLocationProperty;
	}

}

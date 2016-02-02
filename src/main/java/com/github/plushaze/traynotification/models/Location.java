package com.github.plushaze.traynotification.models;

public final class Location {

	public static Location at(double x, double y) {
		return new Location(x, y);
	}

	private final double x, y;

	private Location(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("(%f, %f)", x, y);
	}

	@Override
	public int hashCode() {
		return Double.valueOf(x).hashCode() ^ Double.valueOf(y).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		else if (obj == null || !(obj instanceof Location)) return false;
		Location loc = (Location) obj;
		return x == loc.x && y == loc.y;
	}

}
